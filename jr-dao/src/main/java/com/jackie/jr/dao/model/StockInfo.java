package com.jackie.jr.dao.model;

/**
 * Created by luhaiming on 2017/11/10 0010.
 */
public class StockInfo {
    private int id;
    private String code;
    private String symbol;
    private String name;
    private String price;
    private String percent;
    private String number;
    private String title;
    private String time;
    private String type;
    private String type_color;

    public StockInfo(String code, String symbol, String name, String price, String percent, String number, String title, String time, String type, String type_color) {
        this.code = code;
        this.symbol = symbol;
        this.name = name;
        this.price = price;
        this.percent = percent;
        this.number = number;
        this.title = title;
        this.time = time;
        this.type = type;
        this.type_color = type_color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPercent() {
        return percent;
    }

    public void setPercent(String percent) {
        this.percent = percent;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType_color() {
        return type_color;
    }

    public void setType_color(String type_color) {
        this.type_color = type_color;
    }
}
