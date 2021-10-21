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

--CREATE TABLE IF NOT EXISTS `orders`(
	--`order_id` INT NOT NULL auto_increment,
    --need to complete
--);

--to do create tables for orders and order-items table