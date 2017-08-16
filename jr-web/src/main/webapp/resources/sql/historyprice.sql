CREATE TABLE `nous`.`stock_data` (
 `id` INT NOT NULL AUTO_INCREMENT,
  `stockid` BIGINT NOT NULL,
  `date` DATE NULL,
  `open` DOUBLE NULL,
  `high` DOUBLE NULL,
  `low` DOUBLE NULL,
  `close` DOUBLE NULL,
  `volume` BIGINT NULL,
  `adjclose` DOUBLE NULL,
  PRIMARY KEY (`id`)) ENGINE=MyISAM DEFAULT CHARSET=utf8;
