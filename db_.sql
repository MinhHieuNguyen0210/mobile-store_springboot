-- Host: localhost    Database: web_assginment
-- ------------------------------------------------------
-- Server version	8.0.24

-- Table structure for table `product`

DROP TABLE IF EXISTS `product`;

CREATE TABLE `product` (
  `id` int NOT NULL AUTO_INCREMENT,
  `product_name` varchar(45) DEFAULT NULL,
  `unit_price` double DEFAULT NULL,
  `unit_in_stock` int DEFAULT NULL,
  `description` text,
  `manufacturer` varchar(45) DEFAULT NULL,
  `conditions` varchar(45) DEFAULT NULL,
  `image_url` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
