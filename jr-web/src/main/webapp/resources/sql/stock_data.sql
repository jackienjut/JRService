CREATE TABLE `nous`.`stock_data` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `stockid` VARCHAR(45) NULL,
  `date` DATE NULL,
  `open` VARCHAR(45) NULL,
  `high` VARCHAR(45) NULL,
  `low` VARCHAR(45) NULL,
  `close` VARCHAR(45) NULL,
  `fclose` VARCHAR(45) NULL,
  `change_amount` VARCHAR(45) NULL,
  `price_change_amount` VARCHAR(45) NULL,
  `turnover_rate` VARCHAR(45) NULL,
  `volume` VARCHAR(45) NULL,
  `volume_amount` VARCHAR(45) NULL,
  `total_market_capitalization` VARCHAR(45) NULL,
  `circulation_market_value` VARCHAR(45) NULL,
  `number_of_transactions` VARCHAR(45) NULL,
  PRIMARY KEY (`id`)) ENGINE=MyISAM DEFAULT CHARSET=utf8;


日期,股票代码,名称,收盘价,最高价,最低价,开盘价,前收盘,涨跌额,涨跌幅,换手率,成交量,成交金额,总市值,流通市值,成交笔数