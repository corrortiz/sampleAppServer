# CRUD APP sample in ReactJs and Java

## Table of Contents

- [Description](#description)
    - [Stack](#stack)
- [Installation](#installation)

## Description

This is the server part of a CRUD APP sample made in Java

## Stack
* [Java 8](http://www.oracle.com/technetwork/java/javase/overview/java8-2100321.html)
* [Spring Boot](http://projects.spring.io/spring-boot/)
* [Spring Data](https://docs.spring.io/spring-data/jpa/docs/current/reference/html/)
* [Spring Web](https://spring.io/guides/gs/serving-web-content/)
* [HikariCP](https://spring.io/guides/gs/serving-web-content/)
* [Maven](https://maven.apache.org/)



## Installation
There are two ways to use the application:

### First method: running the already compiled jar
    
Using the jar file: 

`mini-services-0.0.1-SNAPSHOT.jar`
 
Once you start the service you can enter your browser in <https://localhost:3001> 
This jar connect directly to the sample database make for the app in AWS RDS

In this same jar is embedded the client to be able to perform tests entering the address mentioned above should be given a view like this:

![Image of sample](http://i.imgur.com/r1gL5Ga.png)

If you want to test the endpoints the base address is this:

``` js
ROOT_URL = `https://localhost:3001/api/usersHospital`;
```

### Second method: Providing our own Database

The first step is to create instance in our preferred database provider

Here is a schema for MySQL the structure of the data should be the same for other providers

```sql
CREATE SCHEMA IF NOT EXISTS `sampleDB` DEFAULT CHARACTER SET utf8 ;

USE `sampleDB` ;

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

```
Once created insert a data, once again this example is in MySQL

```sql
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
```

Once the database is created it is time to connect to it we do this through the archive

`src > main > resources > application.properties`

Here we find the following parameters which we have to configure depending on our database:

```properties
spring.jpa.database-platform=org.hibernate.dialect.myDBDialect
spring.datasource.url=jdbc:mysql://myDBdirection/sampleDB?&useSSL=false
spring.datasource.username=myUser
spring.datasource.password=myPassword
```

Once this is done we can run the app
