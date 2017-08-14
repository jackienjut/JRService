package utils;


import com.google.gdata.client.finance.FinanceService;
import com.google.gdata.client.finance.FinanceUtilities;
import com.google.gdata.data.DateTime;
import com.google.gdata.data.extensions.Money;
import com.google.gdata.data.finance.PositionData;
import com.google.gdata.data.finance.PositionEntry;
import com.google.gdata.data.finance.TransactionEntry;
import com.google.gdata.util.AuthenticationException;
import com.google.gdata.util.ServiceException;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.EnumMap;

/**
 * Created by luhaiming on 2017/6/29 0029.
 */
public class GoogleFinanceTest {
    private static String server = "http://finance.google.com";
    private static String basePath = "/finance/feeds/";
    private static String baseUrl = server + basePath + "default";


    private static final String PORTFOLIO_FEED_URL_SUFFIX = "/portfolios";
    private static final String POSITION_FEED_URL_SUFFIX = "/positions";
    private static final String TRANSACTION_FEED_URL_SUFFIX = "/transactions";
    private static final String POSITION_TICKER_SHA = "SHA:";
    private static final String POSITION_TICKER_SHE = "SHE:";
    private FinanceService service = new FinanceService(
            "Google-PortfoliosDemo-1.0");

    private enum Columns {
        CODE, PRICE, PERCENTGAIN, GAIN,LASTUPDATE
    }

    // private final String

    public String getWholeTicker(String code) {
        if (code.startsWith("6")) {
            return POSITION_TICKER_SHA + code;
        } else
            return POSITION_TICKER_SHE + code;
    }

    public void login() {
        String userEmail = "luhaiming86@gmail.com";
        String userPassword = "lhm202729";
        if (!loginUser(userEmail, userPassword))
            System.exit(0);
    }

    public void addPosition(String shareCode) throws IOException, IOException,
            ServiceException {

        String requestUrl = baseUrl + PORTFOLIO_FEED_URL_SUFFIX;
        System.out.println("Enter portfolio ID");

        System.out.println("Enter ticker (<exchange>:<ticker>) ");
        String tickerProperty = getWholeTicker(shareCode);

        requestUrl += "1" + POSITION_FEED_URL_SUFFIX + "/" + tickerProperty
                + TRANSACTION_FEED_URL_SUFFIX;

        TransactionEntry entry = FinanceUtilities.makeTransactionEntry("Buy",
                "2010-03-08", "100", "1.00", "0.0", "CNY", "ysh");
        insertTransactionEntry(requestUrl, entry);

    }

    public EnumMap<Columns, String>  getCurrentShareData(String code) throws MalformedURLException,
            IOException, ServiceException {

        String requestUrl = baseUrl + PORTFOLIO_FEED_URL_SUFFIX + "/1";
        String tickerProperty = getWholeTicker(code);
        requestUrl += POSITION_FEED_URL_SUFFIX + "/" + tickerProperty;
        return queryPositionEntry(code, requestUrl);

    }

    private EnumMap<Columns, String>  queryPositionEntry(String code, String entryUrl)
            throws IOException, MalformedURLException, ServiceException {
//System.out.println("Requesting Entry at location " + entryUrl);
        PositionEntry positionEntry = service.getEntry(new URL(entryUrl),
                PositionEntry.class);
        return getPositionData(code, positionEntry);
    }

    private EnumMap<Columns, String> getPositionData(String code,
                                                     PositionEntry positionEntry) {
// System.out.println("nPosition Entryn--------------");
// printBasicEntryDetails(positionEntry);
        positionEntry.getUpdated();

        EnumMap<Columns, String> sd = new EnumMap<Columns, String>(Columns.class);
        DateTime lastUpdate=positionEntry.getUpdated();
        lastUpdate.setTzShift(480);
        sd.put(Columns.LASTUPDATE, lastUpdate.toString());
        sd.put(Columns.CODE, code);
// System.out.println("tFeed Link: "
// + positionEntry.getFeedLink().getHref());
        if (positionEntry.getFeedLink().getFeed() == null) {
            System.out.println("tNo inlined feed.");
        } else {
            System.out
                    .println("********** Beginning of inline feed ***************");

            System.out
                    .println("************* End of inlined feed *****************");
        }

        PositionData positionData = positionEntry.getPositionData();

        Double yesterDay = 0.0;
        Double daysGain;
        DecimalFormat df=new DecimalFormat("#####0.00");

        if (positionData.getMarketValue() == null) {
            System.out.println("ttMarket Value not specified");
        } else {
            for (int i = 0; i < positionData.getMarketValue().getMoney().size(); i++) {
                Money m = positionData.getMarketValue().getMoney().get(i);
                yesterDay = m.getAmount();
// System.out.printf(
// "ttThis position per share is worth yesterday %.2f %s.n", m
// .getAmount() / positionData.getShares(), m.getCurrencyCode());


            }
        }

        if (positionData.getDaysGain() == null) {
            System.out.println("ttDay's Gain not specified");
        } else {
            for (int i = 0; i < positionData.getDaysGain().getMoney().size(); i++) {
                Money m = positionData.getDaysGain().getMoney().get(i);
                daysGain = m.getAmount();
                Double price=(m.getAmount()+yesterDay) / positionData.getShares();
                Double c_price=Double.valueOf(price);
                sd.put(Columns.PRICE, df.format(price));
// System.out.printf("ttThis position made %.2f %s today.n", m
// .getAmount(), m.getCurrencyCode());
                String gain=df.format(m.getAmount() / positionData.getShares());
                sd.put(Columns.GAIN, gain);
                String pergain=
                        sd.put(Columns.PERCENTGAIN, df.format(100*(daysGain
                                / yesterDay))
                                + "%");

            }
        }

        return sd;
    }

    private void insertTransactionEntry(String feedUrl, TransactionEntry entry)
            throws IOException, MalformedURLException, ServiceException {
//System.out.println("Inserting Entry at location: " + feedUrl);
        service.insert(new URL(feedUrl), entry);
    }

    private Boolean loginUser(String userID, String userPassword) {
        try {
            service.setUserCredentials(userID, userPassword);
        } catch (AuthenticationException e) {
            System.err.println("Invalid Credentials!");
            e.printStackTrace();
            return false;
        }
        return true;
    }
    public static void main(String args[]){
        GoogleFinanceTest gft=new GoogleFinanceTest();
        long t1=System.currentTimeMillis();
        gft.login();
        try {
            EnumMap<Columns, String> shareResult= gft.getCurrentShareData("601318");
            System.out.println(shareResult.get(Columns.CODE));
            System.out.println(" current value is ");
            System.out.println(shareResult.get(Columns.PRICE));
            System.out.println("  ");
            System.out.println(shareResult.get(Columns.GAIN));
            System.out.println("  ");
            System.out.println(shareResult.get(Columns.PERCENTGAIN));
            System.out.println(" last update ");
            System.out.println(shareResult.get(Columns.LASTUPDATE));

        } catch (MalformedURLException e) {
// TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
// TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ServiceException e) {
// TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(" time:"+(System.currentTimeMillis()-t1));
    }

}
