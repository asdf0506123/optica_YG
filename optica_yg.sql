-- MySQL dump 10.13  Distrib 8.0.41, for Win64 (x86_64)
--
-- Host: localhost    Database: optica_yg
-- ------------------------------------------------------
-- Server version	8.0.41

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cliente` (
  `idcliente` int NOT NULL AUTO_INCREMENT,
  `nombreCompleto` varchar(120) NOT NULL,
  `calle` varchar(20) NOT NULL,
  `numero` int DEFAULT NULL,
  `ciudad` varchar(20) NOT NULL,
  `referencia` varchar(40) DEFAULT NULL,
  `contacto` varchar(13) DEFAULT NULL,
  `rfc` varchar(13) DEFAULT NULL,
  PRIMARY KEY (`idcliente`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES (3,'Juan Pérez López','Av. Reforma',123,'Ciudad de México','Frente al parque','981130222','PELJ890123XYZ'),(4,'María Gómez Ruiz','Calle Juárez',456,'Guadalajara','A un lado de un poste','5552345678','GOMR901231ABC'),(5,'Luis Díaz','Blvd. Central',789,'Monterrey','Cerca del oxxo','55534','MADL850101DEF'),(6,'Ana Torres Ramirez','Calle Hidalgo',32,'Puebla','Entre farmacias guadalara','12345','TOVA921010GHI'),(7,'Pedro Sánchez Mora','Av. Insurgentes',654,'Toluca','Frente al banco','5555678901','SANP880505JKL'),(8,'Laura Ramírez Solís','Calle Morelos',987,'Querétaro','A espaldas del mercado','5556789012','RASL930315MNO'),(9,'Ricardo Vázquez Gilberto','Circuito Norte',741,'Mérida','Esquina con primaria','5557890123','VAGR820720PQR'),(10,'Carolina Ríos Chávez','Calle Pino Suárez',85,'León','Cerca de la iglesia','5558901234','RICC950220STU'),(11,'Jorge Mendoza Cruz','Av. Las Flores',369,'Guadalajara','Junto a gasolinera','5559012345','MECJ870412VWX'),(12,'Sofía Herrera Núñez','Calle Independencia',1,'Cancún','Enfrente del cine','5550123456','HENS940618YZA'),(17,'Cesar Ricardo cen ','hector P mtz',0,'sta lucia ','tienda alado','9818183718','CEPC910107FI1'),(19,'Leylani Yael Jimenez','123',2,'campeche','cerca del ites','9811763845',''),(20,'Ana Patricia Dominguez Ovalle','123',1,'Campeche','China','123456789','');
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `producto`
--

DROP TABLE IF EXISTS `producto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `producto` (
  `idproducto` int NOT NULL AUTO_INCREMENT,
  `nombreProducto` varchar(70) DEFAULT NULL,
  `precioUnitario` int DEFAULT NULL,
  `precioMayoreo` int DEFAULT NULL,
  `cantidadMayoreo` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`idproducto`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `producto`
--

LOCK TABLES `producto` WRITE;
/*!40000 ALTER TABLE `producto` DISABLE KEYS */;
INSERT INTO `producto` VALUES (7,'Lentes oftálmicos monofocales',500,350,'15 piezas'),(8,'Lentes oftálmicos bifocales',680,490,'15 piezas'),(9,'Lentes oftálmicos progresivos',950,750,'15 piezas'),(10,'Lentes oftálmicos fotocromáticos',1100,850,'15 piezas'),(11,'Lentes oftálmicos con filtro de luz azul',850,620,'15 piezas'),(12,'Lentes de sol UV básicos',600,450,'20 piezas'),(13,'Lentes de sol con graduacion',1200,950,'20 piezas'),(14,'Lentes de contacto diarios (caja 30pz)',250,180,'30 cajas'),(15,'Lentes de contacto mensuales (caja 6 pz)',650,480,'30 cajas'),(16,'Lentes de contacto tóricos (astigmatismo, caja 6 pz)',900,700,'30 cajas'),(17,'Lentes de contacto multifocales (caja 6 piezas)',1200,950,'30 cajas'),(18,'Estuches para lentes (varios modelos)',150,100,'50 piezas'),(19,'Soluciones limpiadoras para lentes (botella 120ml)',120,90,'50 piezas');
/*!40000 ALTER TABLE `producto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `proveedor`
--

DROP TABLE IF EXISTS `proveedor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `proveedor` (
  `idproveedor` int NOT NULL AUTO_INCREMENT,
  `nombreProveedor` varchar(50) NOT NULL,
  `calle` varchar(20) NOT NULL,
  `numero` int DEFAULT NULL,
  `ciudad` varchar(20) NOT NULL,
  `referencia` varchar(40) DEFAULT NULL,
  `contacto` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`idproveedor`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `proveedor`
--

LOCK TABLES `proveedor` WRITE;
/*!40000 ALTER TABLE `proveedor` DISABLE KEYS */;
INSERT INTO `proveedor` VALUES (3,'Lentes y Óptica Profesional S.A. de C.V','Calle Vista Clara',456,'Guadalajara, Jalisco','Colonia Centro',' +523398765432'),(4,'Óptica Visión Total S.A. de C.V.','Av. Central',123,'Ciudad de México','Colonia del Valle','+525512345678'),(5,'Lentes y Más S.A. de C.V.','Calle Juárez',102,'Guadalajara, Jalisco','A un costado de Plaza del Sol','33 8765 4321'),(6,'Óptica Brillo Visuales',' Av. Insurgentes Sur',220,'Nuevo León','Cerca del Tecnológico de Monterrey  ','81 9988 7766');
/*!40000 ALTER TABLE `proveedor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `servicio`
--

DROP TABLE IF EXISTS `servicio`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `servicio` (
  `idservicio` int NOT NULL AUTO_INCREMENT,
  `nombreServicio` varchar(35) NOT NULL,
  `precio` int DEFAULT NULL,
  PRIMARY KEY (`idservicio`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `servicio`
--

LOCK TABLES `servicio` WRITE;
/*!40000 ALTER TABLE `servicio` DISABLE KEYS */;
INSERT INTO `servicio` VALUES (4,'Examen de la vista computarizado',200),(5,'Adaptacion de lentes de contacto',270),(6,'Reparacion y ajuste de armazones',120),(7,'Cambio de micas oftalmicas',370),(8,'Asesoria personalizada',0);
/*!40000 ALTER TABLE `servicio` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ventaproducto`
--

DROP TABLE IF EXISTS `ventaproducto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ventaproducto` (
  `idventaProd` int NOT NULL AUTO_INCREMENT,
  `cliente` varchar(40) DEFAULT NULL,
  `cantidad` int NOT NULL,
  `material` varchar(80) DEFAULT NULL,
  `montoFinal` int NOT NULL,
  `metodoPago` varchar(20) NOT NULL,
  `fechaVenta` date NOT NULL,
  `noFactura` int DEFAULT NULL,
  PRIMARY KEY (`idventaProd`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ventaproducto`
--

LOCK TABLES `ventaproducto` WRITE;
/*!40000 ALTER TABLE `ventaproducto` DISABLE KEYS */;
INSERT INTO `ventaproducto` VALUES (1,'Melanie Alcocer Esquivel',1,'Lentes oftálmicos monofocales de plastico',500,'EFECTIVO','2025-03-12',123453),(11,'Daniela Gómez Pérez',1,'Lentes oftálmicos monofocales (plástico)',550,'EFECTIVO','2025-04-02',123463),(12,'Fernando López Ríos',1,'Lentes de sol polarizados (policarbonato)',850,'TARJETA','2025-04-03',123464),(13,'Isabela Martínez Torres',1,'Lentes de contacto diarios (hidrogel, caja 30 piezas)',250,'TRANSFERENCIA','2025-04-04',123465),(14,'José Ramírez Morales',2,'Lentes de contacto multifocales (silicona hidrogel, caja 6 piezas)',1200,'EFECTIVO','2025-04-05',123466),(15,'Carolina Herrera Domínguez',1,'Estuches para lentes (plástico rígido, varios modelos)',150,'TARJETA','2025-04-06',123467),(16,'Alejandro Castro Vega',1,'Soluciones limpiadoras para lentes (líquido desinfectante, botella 120ml)',120,'EFECTIVO','2025-04-07',123468),(17,'Patricia Morales Sánchez',1,'Lentes oftálmicos fotocromáticos (vidrio)',1100,'TRANSFERENCIA','2025-04-08',123469),(18,'Ricardo Sánchez Gutiérrez',1,'Lentes de sol UV básicos (policarbonato)',600,'TARJETA','2025-04-09',123470),(19,'Sofía Méndez Pardo',1,'Lentes oftálmicos progresivos (cristal)',950,'EFECTIVO','2025-04-10',123471),(20,'Emilio Torres Castillo',1,'Lentes de contacto tóricos (silicona hidrogel, caja 6 piezas)',900,'TRANSFERENCIA','2025-04-11',123472);
/*!40000 ALTER TABLE `ventaproducto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ventaservicio`
--

DROP TABLE IF EXISTS `ventaservicio`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ventaservicio` (
  `idventaSer` int NOT NULL AUTO_INCREMENT,
  `cliente` varchar(40) DEFAULT NULL,
  `descripcion` varchar(80) DEFAULT NULL,
  `montoFinal` int NOT NULL,
  `metodoPago` varchar(20) NOT NULL,
  `fechaVenta` date NOT NULL,
  `noFactura` int DEFAULT NULL,
  PRIMARY KEY (`idventaSer`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ventaservicio`
--

LOCK TABLES `ventaservicio` WRITE;
/*!40000 ALTER TABLE `ventaservicio` DISABLE KEYS */;
INSERT INTO `ventaservicio` VALUES (1,'Juan Pérez López','Adaptacion de lentes de contacto',270,'EFECTIVO','2025-03-25',2025000123),(2,'María González Torres','Examen de la vista computarizado',200,'TARJETA','2025-03-25',2025000124),(3,'Carlos Ramírez Soto','Adaptación de lentes de contacto',270,'EFECTIVO','2025-03-11',2025000125),(4,'Ana López Méndez','Reparación y ajuste de armazones',120,'TRANSFERENCIA','2025-03-10',2025000126),(5,'Pedro Sánchez Ruiz','Cambio de micas oftalmicas',370,'EFECTIVO','2025-03-20',2025000127),(6,'Laura Fernández Vega','Asesoria Personalizada',0,'No aplica','2025-03-23',2025000128),(7,'Javier Herrera Díaz','Examen de la vista computarizado',200,'TRANSFERENCIA','2025-03-01',2025000129),(8,'Sofía Morales Castro','Cambio de micas oftalmicas',370,'EFECTIVO','2025-03-11',2025000130),(9,'Roberto Jiménez Pardo','Asesoria Personalizada',0,'No aplica','2025-03-24',2025000131),(10,'Fernanda Castillo Núñez','Reparación y ajuste de armazon',120,'EFECTIVO','2025-03-12',2025000132);
/*!40000 ALTER TABLE `ventaservicio` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-03-27  8:10:47
