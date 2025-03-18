CREATE TABLE `cardgenerator`.`card` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `title` VARCHAR(255) NOT NULL,
  `description` VARCHAR(255) NOT NULL,
  `creation_date` DATETIME NOT NULL,
  `end_date` DATETIME NOT NULL,
  `situation` TINYINT NOT NULL,
  PRIMARY KEY (`id`));

