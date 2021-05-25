# Grootan

create table if not exists
CREATE TABLE `details`.`login` (
  `id` INT NOT NULL,
  `first_name` VARCHAR(45) NOT NULL,
  `last_name` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  `age` INT NOT NULL,
  `dob` INT NOT NULL,
  `username` VARCHAR(45) NOT NULL,
  `address1` VARCHAR(45) NOT NULL,
  `address2` VARCHAR(45) NOT NULL,
  `address3` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`));
