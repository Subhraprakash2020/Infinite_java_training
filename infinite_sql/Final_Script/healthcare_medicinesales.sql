-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: localhost    Database: healthcare
-- ------------------------------------------------------
-- Server version	8.0.34

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `medicinesales`
--

DROP TABLE IF EXISTS `medicinesales`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `medicinesales` (
  `SaleId` varchar(255) NOT NULL,
  `pharm_id` varchar(255) DEFAULT NULL,
  `EntryId` int DEFAULT NULL,
  `MedId` varchar(255) DEFAULT NULL,
  `MedName` varchar(255) DEFAULT NULL,
  `SaleDate` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `Quantity` int NOT NULL,
  `Price` decimal(10,2) DEFAULT NULL,
  `TotalPrice` decimal(10,2) DEFAULT NULL,
  `ProviderId` varchar(200) DEFAULT NULL,
  `UHID` varchar(255) DEFAULT NULL,
  `prescription_Id` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`SaleId`),
  KEY `pharm_id` (`pharm_id`),
  KEY `UHID` (`UHID`),
  KEY `ProviderId` (`ProviderId`),
  KEY `EntryId` (`EntryId`),
  KEY `prescription_Id` (`prescription_Id`),
  CONSTRAINT `medicinesales_ibfk_1` FOREIGN KEY (`pharm_id`) REFERENCES `pharmacy` (`pharm_id`),
  CONSTRAINT `medicinesales_ibfk_2` FOREIGN KEY (`UHID`) REFERENCES `patient_enrollment` (`UHID`),
  CONSTRAINT `medicinesales_ibfk_3` FOREIGN KEY (`ProviderId`) REFERENCES `provider_details` (`providerid`),
  CONSTRAINT `medicinesales_ibfk_4` FOREIGN KEY (`EntryId`) REFERENCES `medicines` (`EntryId`),
  CONSTRAINT `medicinesales_ibfk_5` FOREIGN KEY (`prescription_Id`) REFERENCES `prescription` (`prescription_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `medicinesales`
--

LOCK TABLES `medicinesales` WRITE;
/*!40000 ALTER TABLE `medicinesales` DISABLE KEYS */;
/*!40000 ALTER TABLE `medicinesales` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-11-02 17:25:04
