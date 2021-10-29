drop schema ims;

CREATE SCHEMA IF NOT EXISTS `ims`;

USE `ims` ;

CREATE TABLE IF NOT EXISTS `ims`.`customers` (
    `id` INT(11) NOT NULL AUTO_INCREMENT,
    `first_name` VARCHAR(40) DEFAULT NULL,
    `surname` VARCHAR(40) DEFAULT NULL,
    PRIMARY KEY (`id`)
);

CREATE database IMS;
DROP TABLE IF EXISTS `customers`;

CREATE TABLE IF NOT EXISTS `customers` (
    `id` INT(11) NOT NULL AUTO_INCREMENT,
    `first_name` VARCHAR(40) DEFAULT NULL,
    `surname` VARCHAR(40) DEFAULT NULL,
    PRIMARY KEY (`id`)
);

CREATE TABLE IF NOT EXISTS `products`(
	`product_id` INT NOT NULL auto_increment,
    `product_name` VARCHAR(50) NOT NULL,
    `product_value` DECIMAL NOT NULL,
    PRIMARY KEY (`product_id`)
);

CREATE TABLE IF NOT EXISTS`orders`(
`order_id` INT NOT NULL auto_increment,
`customer_id` INT NOT NULL,
`customer_name` VARCHAR(40),
`order_date` DATE
); 

CREATE TABLE IF NOT EXISTS `order_lines`(
`orderline_id` INT NOT NULL auto_increment,
`order_id` INT,
`quantity` INT,
`product_id` INT,
`price` DECIMAL(10,0),
PRIMARY KEY(orderline_id),
FOREIGN KEY(order_id) references orders(order_id),
FOREIGN KEY(product_id) references products(product_id)
);
