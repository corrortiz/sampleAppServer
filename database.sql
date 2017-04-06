-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema sampleDB
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `sampleDB` ;

-- -----------------------------------------------------
-- Schema sampleDB
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `sampleDB` DEFAULT CHARACTER SET utf8 ;
USE `sampleDB` ;

-- -----------------------------------------------------
-- Table `sampleDB`.`user_hospital`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `sampleDB`.`user_hospital` ;

CREATE TABLE IF NOT EXISTS `sampleDB`.`user_hospital` (
  `id_user` INT(11) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(80) NOT NULL,
  `id_card` VARCHAR(20) NOT NULL,
  `home_clinic` VARCHAR(300) NOT NULL,
  `phone` VARCHAR(10) NULL DEFAULT NULL,
  `mail` VARCHAR(40) NULL DEFAULT NULL,
  PRIMARY KEY (`id_user`))
  ENGINE = InnoDB
  AUTO_INCREMENT = 78
  DEFAULT CHARACTER SET = utf8;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

INSERT INTO `user_hospital` (`id_user`,`name`,`id_card`,`home_clinic`,`phone`,`mail`) VALUES (30,'Alberto Perez Pende','MOCA-870607/1','Coatzacoalcos','2292545665','corrortiz@outlook.com');
INSERT INTO `user_hospital` (`id_user`,`name`,`id_card`,`home_clinic`,`phone`,`mail`) VALUES (61,'Laion Share','PAPA-4885544/1','Coatzacoalcos','4478855665','mecos_live@gmail.com');
INSERT INTO `user_hospital` (`id_user`,`name`,`id_card`,`home_clinic`,`phone`,`mail`) VALUES (64,'Fire Punch','LOCO-8705995','Veracruz','334412354','a.ortizcrr@gmail.com');
INSERT INTO `user_hospital` (`id_user`,`name`,`id_card`,`home_clinic`,`phone`,`mail`) VALUES (65,'Chica Bonita','Comercial','Adobe','2299020825','a.ortizcrr@gmail.com');
INSERT INTO `user_hospital` (`id_user`,`name`,`id_card`,`home_clinic`,`phone`,`mail`) VALUES (69,'Tigerrman','Goldfrapp','Gringos','229905085','a');
INSERT INTO `user_hospital` (`id_user`,`name`,`id_card`,`home_clinic`,`phone`,`mail`) VALUES (71,'Alberto Kiki','KUJO-8455699','Veracruz','2299458848','a@a.com');
INSERT INTO `user_hospital` (`id_user`,`name`,`id_card`,`home_clinic`,`phone`,`mail`) VALUES (72,'Generic H2 (Embedded)','asas','Mina','5588998565','a.ortizcrr@gmail.com');
INSERT INTO `user_hospital` (`id_user`,`name`,`id_card`,`home_clinic`,`phone`,`mail`) VALUES (73,'Sprey the world','CUMP-854545/1','Coatzacoalcos','2255487545','corrortiz@outlook.com');
INSERT INTO `user_hospital` (`id_user`,`name`,`id_card`,`home_clinic`,`phone`,`mail`) VALUES (74,'Alfredo Ortiz Muñoz','OIMA-870312/1','El Floresta','789954777','a.ortizcrr@gmail.com');
INSERT INTO `user_hospital` (`id_user`,`name`,`id_card`,`home_clinic`,`phone`,`mail`) VALUES (75,'Akino','LOCO-8705995','Veracruz','998855577','a.ortizcrr@gmail.com');
INSERT INTO `user_hospital` (`id_user`,`name`,`id_card`,`home_clinic`,`phone`,`mail`) VALUES (76,'Alejandro Ortiz','OICA-840706','Marte','2299020825','a.ortizcrr@gmail.com');
INSERT INTO `user_hospital` (`id_user`,`name`,`id_card`,`home_clinic`,`phone`,`mail`) VALUES (77,'Internet Exporer','Ñera que culera','Ñiña','2299020525','ani.corro@gmail.com');
