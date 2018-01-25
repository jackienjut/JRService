CREATE TABLE `nous`.`stock_data_163` (
  `date` DATETIME NOT NULL  COMMENT '日期',
  `code` VARCHAR(45) NOT NULL COMMENT '股票代码',
  `name` VARCHAR(45) NOT NULL COMMENT '名称',
  `tclose` VARCHAR(45) NOT NULL COMMENT '收盘价',
  `high` VARCHAR(45) NOT NULL COMMENT '最高价',
  `low` VARCHAR(45) NOT NULL COMMENT '最低价',
  `topen` VARCHAR(45) NOT NULL COMMENT '开盘价',
  `lclose` VARCHAR(45) NOT NULL COMMENT '前收盘',
  `chg` VARCHAR(45) NOT NULL COMMENT '涨跌额',
  `pchg` VARCHAR(45) NOT NULL COMMENT '涨跌幅',
  `turnoverrate` VARCHAR(45) NOT NULL COMMENT '换手率',
  `voturnover` VARCHAR(45) NOT NULL COMMENT '成交量',
  `vaturnover` VARCHAR(45) NOT NULL COMMENT '成交金额',
  `totalmarketvalue` VARCHAR(45) NOT NULL COMMENT '总市值',
  `marketvalueofcirculation` VARCHAR(45) NOT NULL COMMENT '流通市值',
  `numberoftransactionpens` VARCHAR(45) NOT NULL COMMENT '成交笔数',
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_bin;


日期,股票代码,名称,收盘价,最高价,最低价,开盘价,前收盘,涨跌额,涨跌幅,换手率,成交量,成交金额,总市值,流通市值,成交笔数