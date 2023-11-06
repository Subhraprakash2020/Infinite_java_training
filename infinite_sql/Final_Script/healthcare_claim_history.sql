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
-- Table structure for table `claim_history`
--

DROP TABLE IF EXISTS `claim_history`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `claim_history` (
  `ClaimHistoryId` int NOT NULL AUTO_INCREMENT,
  `Claim_Id` int DEFAULT NULL,
  `providerid` varchar(50) DEFAULT NULL,
  `Plan_id` int DEFAULT NULL,
  `UHID` varchar(100) DEFAULT NULL,
  `fromDate` date DEFAULT NULL,
  `toDate` date DEFAULT NULL,
  `claimAmount` decimal(9,2) DEFAULT NULL,
  `status` enum('ACCEPTED','REJECTED','PENDING') DEFAULT 'PENDING',
  `Comments` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`ClaimHistoryId`),
  KEY `Claim_Id` (`Claim_Id`),
  KEY `providerid` (`providerid`),
  KEY `Plan_id` (`Plan_id`),
  KEY `UHID` (`UHID`),
  CONSTRAINT `claim_history_ibfk_1` FOREIGN KEY (`Claim_Id`) REFERENCES `insurance_claim` (`Claim_Id`),
  CONSTRAINT `claim_history_ibfk_2` FOREIGN KEY (`providerid`) REFERENCES `provider_details` (`providerid`),
  CONSTRAINT `claim_history_ibfk_3` FOREIGN KEY (`Plan_id`) REFERENCES `insurance_plans` (`Plan_id`),
  CONSTRAINT `claim_history_ibfk_4` FOREIGN KEY (`UHID`) REFERENCES `patient_enrollment` (`UHID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `claim_history`
--

LOCK TABLES `claim_history` WRITE;
/*!40000 ALTER TABLE `claim_history` DISABLE KEYS */;
/*!40000 ALTER TABLE `claim_history` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-11-02 17:25:02
