CREATE TABLE `nous`.`historystockinfo` (
  `stockid` INT NOT NULL,
  `date` DATE NULL,
  `open` DOUBLE NULL,
  `high` DOUBLE NULL,
  `low` DOUBLE NULL,
  `close` DOUBLE NULL,
  `volume` INT NULL,
  `adjclose` DOUBLE NULL,
  PRIMARY KEY (`stockid`)) ENGINE=MyISAM DEFAULT CHARSET=utf8;
