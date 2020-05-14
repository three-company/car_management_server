-- MySQL dump 10.13  Distrib 8.0.16, for macos10.14 (x86_64)
--
-- Host: 127.0.0.1    Database: car
-- ------------------------------------------------------
-- Server version	8.0.16

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8mb4 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `car`
--

DROP TABLE IF EXISTS `car`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `car` (
  `id` varchar(32) NOT NULL,
  `car_num` varchar(20) NOT NULL COMMENT '车牌号',
  `check_start_time` timestamp NOT NULL COMMENT '检车开始时间',
  `check_end_time` timestamp NOT NULL COMMENT '检车到期时间',
  `insurance_start_time` timestamp NOT NULL COMMENT '保险开始时间',
  `insurance_end_time` timestamp NOT NULL COMMENT '保险到期时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `car_car_num_uindex` (`car_num`),
  UNIQUE KEY `car_id_uindex` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='大车信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `car`
--

LOCK TABLES `car` WRITE;
/*!40000 ALTER TABLE `car` DISABLE KEYS */;
/*!40000 ALTER TABLE `car` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `driver`
--

DROP TABLE IF EXISTS `driver`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `driver` (
  `id` varchar(32) NOT NULL,
  `name` varchar(20) NOT NULL COMMENT '司机姓名',
  `mobile` varchar(11) NOT NULL COMMENT '司机手机号',
  `age` varchar(20) NOT NULL COMMENT '司机年龄',
  `card_num` varchar(18) NOT NULL COMMENT '身份证号',
  `sex` varchar(2) NOT NULL COMMENT '性别',
  `driving_years` varchar(20) DEFAULT NULL COMMENT '驾龄',
  `driving_license_type` varchar(3) DEFAULT NULL COMMENT '驾照类型',
  `entry_time` timestamp NOT NULL COMMENT '入职时间',
  `leave_time` timestamp NULL DEFAULT NULL COMMENT '离职时间',
  `salary` varchar(255) NOT NULL COMMENT '薪资',
  `user_id` varchar(32) DEFAULT NULL COMMENT '用户id',
  PRIMARY KEY (`id`),
  UNIQUE KEY `driver_card_num_uindex` (`card_num`),
  UNIQUE KEY `driver_id_uindex` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='司机信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `driver`
--

LOCK TABLES `driver` WRITE;
/*!40000 ALTER TABLE `driver` DISABLE KEYS */;
/*!40000 ALTER TABLE `driver` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `driver_car`
--

DROP TABLE IF EXISTS `driver_car`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `driver_car` (
  `id` varchar(32) NOT NULL,
  `car_id` varchar(32) NOT NULL COMMENT '大车id',
  `driver_id_one` varchar(32) DEFAULT NULL COMMENT '主驾',
  `driver_id_two` varchar(32) DEFAULT NULL COMMENT '副驾',
  PRIMARY KEY (`id`),
  UNIQUE KEY `driver_car_id_uindex` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='司机与大车';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `driver_car`
--

LOCK TABLES `driver_car` WRITE;
/*!40000 ALTER TABLE `driver_car` DISABLE KEYS */;
/*!40000 ALTER TABLE `driver_car` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mess_total`
--

DROP TABLE IF EXISTS `mess_total`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `mess_total` (
  `id` varchar(32) NOT NULL,
  `message_id` varchar(32) NOT NULL COMMENT '信息表id',
  `carry_money` varchar(20) NOT NULL DEFAULT '0' COMMENT '带现金',
  `freight` varchar(20) NOT NULL COMMENT '每吨运费(保留字段)',
  `hand_in` varchar(20) NOT NULL DEFAULT '0' COMMENT '交回',
  `total_income` varchar(255) NOT NULL COMMENT '总收入',
  `money` varchar(20) DEFAULT NULL COMMENT '收支金额',
  `total_pay` varchar(255) NOT NULL COMMENT '总开销',
  `return` varchar(255) NOT NULL COMMENT '利润',
  UNIQUE KEY `mess_total_id_uindex` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='每趟车计算';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mess_total`
--

LOCK TABLES `mess_total` WRITE;
/*!40000 ALTER TABLE `mess_total` DISABLE KEYS */;
/*!40000 ALTER TABLE `mess_total` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `message`
--

DROP TABLE IF EXISTS `message`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `message` (
  `id` varchar(32) NOT NULL,
  `start_time` timestamp NOT NULL COMMENT '出车时间',
  `end_time` timestamp NOT NULL COMMENT '出车结束时间',
  `car_id` varchar(32) NOT NULL COMMENT '车id（车牌号）',
  `driver_id` varchar(32) NOT NULL COMMENT '司机id（登记信息司机）',
  `siteMes_id` varchar(32) NOT NULL COMMENT '行驶地点id1',
  `fuel_charge` varchar(255) NOT NULL DEFAULT '0' COMMENT '燃油费',
  `toll` varchar(20) NOT NULL DEFAULT '0' COMMENT '过路费',
  `fine` varchar(20) NOT NULL DEFAULT '0' COMMENT '罚款',
  `eat_money` varchar(20) NOT NULL DEFAULT '0' COMMENT '饭费',
  `hotel_money` varchar(20) NOT NULL DEFAULT '0' COMMENT '住宿费',
  `message_money` varchar(20) NOT NULL DEFAULT '0' COMMENT '信息费',
  `coal_money` varchar(20) NOT NULL DEFAULT '0' COMMENT '煤管费',
  `hand_money` varchar(20) NOT NULL DEFAULT '0' COMMENT '装卸费',
  `repair_car_money` varchar(20) NOT NULL DEFAULT '0' COMMENT '修车费',
  `else_cost` varchar(20) NOT NULL DEFAULT '0' COMMENT '其他开销',
  `image` varchar(255) DEFAULT NULL COMMENT '拍照',
  `comment` varchar(255) DEFAULT NULL COMMENT '备注各种详细信息',
  PRIMARY KEY (`id`),
  UNIQUE KEY `message_id_uindex` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='出车信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `message`
--

LOCK TABLES `message` WRITE;
/*!40000 ALTER TABLE `message` DISABLE KEYS */;
/*!40000 ALTER TABLE `message` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `salary`
--

DROP TABLE IF EXISTS `salary`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `salary` (
  `id` varchar(32) NOT NULL,
  `user_id` varchar(32) DEFAULT NULL COMMENT '用户id',
  `driver_id` varchar(32) DEFAULT NULL COMMENT '司机id',
  `actual_pay_salary` varchar(255) DEFAULT NULL COMMENT '实际结算',
  `pay_time` timestamp NOT NULL COMMENT '结算日期',
  `advance` varchar(255) DEFAULT NULL COMMENT '预支',
  `advance_time` timestamp NOT NULL COMMENT '预支日期',
  PRIMARY KEY (`id`),
  UNIQUE KEY `salary_id_uindex` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='结算薪资';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `salary`
--

LOCK TABLES `salary` WRITE;
/*!40000 ALTER TABLE `salary` DISABLE KEYS */;
/*!40000 ALTER TABLE `salary` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `site_mess`
--

DROP TABLE IF EXISTS `site_mess`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `site_mess` (
  `id` varchar(32) NOT NULL,
  `start_site_one` varchar(20) NOT NULL COMMENT '起始地点',
  `end_site_one` varchar(20) NOT NULL COMMENT '目的地',
  `matter_name_one` varchar(20) NOT NULL COMMENT '物质名称',
  `weight_one` varchar(20) NOT NULL COMMENT '重量',
  `freight_total_one` varchar(255) DEFAULT NULL COMMENT '运费总额',
  `received_money_one` varchar(255) NOT NULL COMMENT '实收金额',
  `debt_money_one` varchar(20) NOT NULL DEFAULT '0' COMMENT '欠款',
  `freight_one` varchar(20) NOT NULL COMMENT '每吨运费',
  `start_site_two` varchar(20) DEFAULT NULL,
  `end_site_two` varchar(20) DEFAULT NULL,
  `matter_name_two` varchar(20) DEFAULT NULL,
  `weight_two` varchar(20) DEFAULT NULL,
  `freight_total_two` varchar(20) DEFAULT NULL,
  `received_money_two` varchar(255) DEFAULT NULL,
  `debt_money_two` varchar(20) DEFAULT '0',
  `freight_two` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `site_mess_id_uindex` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='行驶地点';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `site_mess`
--

LOCK TABLES `site_mess` WRITE;
/*!40000 ALTER TABLE `site_mess` DISABLE KEYS */;
/*!40000 ALTER TABLE `site_mess` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `user` (
  `id` varchar(32) NOT NULL,
  `name` varchar(20) NOT NULL COMMENT '姓名',
  `mobile` varchar(11) NOT NULL COMMENT '手机号',
  `password` varchar(255) NOT NULL COMMENT '密码',
  `register_time` timestamp NOT NULL COMMENT '注册时间',
  `end_time` timestamp NOT NULL COMMENT '到期时间',
  `status` varchar(2) DEFAULT NULL COMMENT '状态',
  PRIMARY KEY (`id`),
  UNIQUE KEY `user_id_uindex` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='用户信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-05-14  9:45:38
