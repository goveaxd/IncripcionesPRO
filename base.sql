-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: localhost    Database: inscripciones
-- ------------------------------------------------------
-- Server version	8.0.19

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
-- Table structure for table `alumnos`
--

DROP TABLE IF EXISTS `alumnos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `alumnos` (
  `idAlumno` int NOT NULL AUTO_INCREMENT,
  `idcarrera` smallint NOT NULL,
  `Nombre` varchar(45) NOT NULL,
  `Apellidos` varchar(45) NOT NULL,
  `NoControl` varchar(45) NOT NULL,
  `Correo` varchar(45) NOT NULL,
  `Contraseña` varchar(45) NOT NULL,
  PRIMARY KEY (`idAlumno`),
  KEY `idcarrera` (`idcarrera`),
  CONSTRAINT `alumnos_ibfk_1` FOREIGN KEY (`idcarrera`) REFERENCES `carreras` (`idcarrera`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `alumnos`
--

LOCK TABLES `alumnos` WRITE;
/*!40000 ALTER TABLE `alumnos` DISABLE KEYS */;
INSERT INTO `alumnos` VALUES (1,1,'daniel','belmonte diaz','16640099','daniel@gmail.com','1234'),(2,1,'cecilia','alanis cazares','16640098','ceci@gmail.com','1234'),(3,1,'miguel','hernandez reyes','16640100','mike@gmail.com','1234'),(4,3,'luis','govea magaña','16640095','luis@gmail.com','1234'),(5,4,'chuy','gonzales ruiz','16640091','chuy@gmail.com','1234'),(6,2,'julieta','alatorre cazares','16640093','chuy@gmail.com','1234'),(7,2,'miguel','porras moreno','16640094','chuy@gmail.com','1234'),(8,3,'gabriela','maravillas lopez','16640291','chuy@gmail.com','1234'),(9,4,'jesus','ruiz pacheco','16640077','chuy@gmail.com','1234'),(10,4,'guillermo','guzman espinosa','16648791','chuy@gmail.com','1234');
/*!40000 ALTER TABLE `alumnos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `carreras`
--

DROP TABLE IF EXISTS `carreras`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `carreras` (
  `idcarrera` smallint NOT NULL AUTO_INCREMENT,
  `codigo` varchar(15) NOT NULL,
  `nombre` varchar(60) NOT NULL,
  `creditosTotales` int NOT NULL,
  PRIMARY KEY (`idcarrera`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `carreras`
--

LOCK TABLES `carreras` WRITE;
/*!40000 ALTER TABLE `carreras` DISABLE KEYS */;
INSERT INTO `carreras` VALUES (1,'hfjks','Tecnologias de la Informacion y comunicaciones',9),(2,'hfjks','Sistemas Computacionales',9),(3,'lslldl','Gestion Empresarial',8),(4,'34fff','Administracion',7),(5,'dsdsfs','Mecatronica',10),(6,'lijdsflj','Bioquimica',5);
/*!40000 ALTER TABLE `carreras` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cursada`
--

DROP TABLE IF EXISTS `cursada`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cursada` (
  `idcursa` int NOT NULL AUTO_INCREMENT,
  `calificacion` double NOT NULL,
  `alumnos_idAlumno` int NOT NULL,
  `materias_idmaterias` int NOT NULL,
  PRIMARY KEY (`idcursa`),
  KEY `fk_cursa_alumnos1_idx` (`alumnos_idAlumno`),
  KEY `fk_cursa_materias1_idx` (`materias_idmaterias`),
  CONSTRAINT `fk_cursa_alumnos1` FOREIGN KEY (`alumnos_idAlumno`) REFERENCES `alumnos` (`idAlumno`),
  CONSTRAINT `fk_cursa_materias1` FOREIGN KEY (`materias_idmaterias`) REFERENCES `materias` (`idmaterias`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cursada`
--

LOCK TABLES `cursada` WRITE;
/*!40000 ALTER TABLE `cursada` DISABLE KEYS */;
INSERT INTO `cursada` VALUES (1,80,1,1),(2,90,1,2),(3,90,1,3),(4,70,1,4),(5,70,1,5),(6,95,6,6);
/*!40000 ALTER TABLE `cursada` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `departamento`
--

DROP TABLE IF EXISTS `departamento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `departamento` (
  `iddepartamento` int unsigned NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  PRIMARY KEY (`iddepartamento`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `departamento`
--

LOCK TABLES `departamento` WRITE;
/*!40000 ALTER TABLE `departamento` DISABLE KEYS */;
INSERT INTO `departamento` VALUES (1,'ciencias basicas'),(2,'electronica y mecatronica'),(3,'quimica y bioquimica'),(4,'sistemas y computacion'),(5,'ingenieria industrial'),(6,'ciencias economico administrativas'),(7,'desarrollo academico'),(8,'divicion de estudios profesional');
/*!40000 ALTER TABLE `departamento` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `docentes`
--

DROP TABLE IF EXISTS `docentes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `docentes` (
  `iddocente` int unsigned NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  `apellido` varchar(45) NOT NULL,
  `RFC` varchar(12) NOT NULL,
  `mail` varchar(45) NOT NULL,
  `departamento_iddepartamento` int unsigned NOT NULL,
  PRIMARY KEY (`iddocente`),
  KEY `fk_docentes_departamento1_idx` (`departamento_iddepartamento`),
  CONSTRAINT `fk_docentes_departamento1` FOREIGN KEY (`departamento_iddepartamento`) REFERENCES `departamento` (`iddepartamento`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `docentes`
--

LOCK TABLES `docentes` WRITE;
/*!40000 ALTER TABLE `docentes` DISABLE KEYS */;
INSERT INTO `docentes` VALUES (1,'Heris','Flores','BY123J1','elheris@gmail.com',1),(2,'Teresa','Pichardo','JD7DS01','tere@gmail.com',2),(3,'Estela','Romero','F8D7D6F','estela@gmail.com',3),(4,'Jose','Perez','AD5D4F3','juan@gmail.com',4),(5,'Nicolas','Jasso','AS7D65F','nico@gmail.com',5);
/*!40000 ALTER TABLE `docentes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `grupo`
--

DROP TABLE IF EXISTS `grupo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `grupo` (
  `idgrupo` int unsigned NOT NULL AUTO_INCREMENT,
  `grupo` varchar(45) NOT NULL,
  `carreras_idcarrera` smallint NOT NULL,
  PRIMARY KEY (`idgrupo`),
  KEY `fk_grupo_carreras1_idx` (`carreras_idcarrera`),
  CONSTRAINT `fk_grupo_carreras1` FOREIGN KEY (`carreras_idcarrera`) REFERENCES `carreras` (`idcarrera`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `grupo`
--

LOCK TABLES `grupo` WRITE;
/*!40000 ALTER TABLE `grupo` DISABLE KEYS */;
INSERT INTO `grupo` VALUES (1,'H',1),(2,'C',2),(3,'G',3),(4,'G',3),(5,'B',6),(6,'H',1);
/*!40000 ALTER TABLE `grupo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `horario`
--

DROP TABLE IF EXISTS `horario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `horario` (
  `idhorario` int NOT NULL AUTO_INCREMENT,
  `alumnos_idAlumno` int NOT NULL,
  `materias_idmaterias` int NOT NULL,
  PRIMARY KEY (`idhorario`),
  KEY `fk_kardex_alumnos1_idx` (`alumnos_idAlumno`),
  KEY `fk_kardex_materias1_idx` (`materias_idmaterias`),
  CONSTRAINT `fk_kardex_alumnos1` FOREIGN KEY (`alumnos_idAlumno`) REFERENCES `alumnos` (`idAlumno`),
  CONSTRAINT `fk_kardex_materias1` FOREIGN KEY (`materias_idmaterias`) REFERENCES `materias` (`idmaterias`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `horario`
--

LOCK TABLES `horario` WRITE;
/*!40000 ALTER TABLE `horario` DISABLE KEYS */;
INSERT INTO `horario` VALUES (1,1,1),(2,1,2),(3,1,3),(4,1,4),(5,1,5);
/*!40000 ALTER TABLE `horario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `horariosnose`
--

DROP TABLE IF EXISTS `horariosnose`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `horariosnose` (
  `idhorarios` int unsigned NOT NULL AUTO_INCREMENT,
  `semestre_idsemestre` int NOT NULL,
  PRIMARY KEY (`idhorarios`),
  KEY `fk_horarios_semestre1_idx` (`semestre_idsemestre`),
  CONSTRAINT `fk_horarios_semestre1` FOREIGN KEY (`semestre_idsemestre`) REFERENCES `semestre` (`idsemestre`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `horariosnose`
--

LOCK TABLES `horariosnose` WRITE;
/*!40000 ALTER TABLE `horariosnose` DISABLE KEYS */;
INSERT INTO `horariosnose` VALUES (1,1),(2,2),(3,3),(4,4),(5,5),(6,6);
/*!40000 ALTER TABLE `horariosnose` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `horas`
--

DROP TABLE IF EXISTS `horas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `horas` (
  `idhoras` int unsigned NOT NULL AUTO_INCREMENT,
  `hora` time NOT NULL,
  `dia` varchar(45) NOT NULL,
  `horarios_idhorarios` int unsigned NOT NULL,
  `materias_idmaterias` int NOT NULL,
  PRIMARY KEY (`idhoras`),
  KEY `fk_horas_horarios1_idx` (`horarios_idhorarios`),
  KEY `fk_horas_materias1_idx` (`materias_idmaterias`),
  CONSTRAINT `fk_horas_horarios1` FOREIGN KEY (`horarios_idhorarios`) REFERENCES `horariosnose` (`idhorarios`),
  CONSTRAINT `fk_horas_materias1` FOREIGN KEY (`materias_idmaterias`) REFERENCES `materias` (`idmaterias`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `horas`
--

LOCK TABLES `horas` WRITE;
/*!40000 ALTER TABLE `horas` DISABLE KEYS */;
INSERT INTO `horas` VALUES (1,'07:00:00','lunes',1,1),(2,'08:00:00','lunes',2,2),(3,'07:00:00','martes',3,3),(4,'08:00:00','martes',4,4),(5,'09:00:00','lunes',5,5),(6,'09:00:00','martes',6,6);
/*!40000 ALTER TABLE `horas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `imparte`
--

DROP TABLE IF EXISTS `imparte`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `imparte` (
  `idimparte` int NOT NULL AUTO_INCREMENT,
  `materias_idmaterias` int NOT NULL,
  `docentes_iddocente` int unsigned NOT NULL,
  PRIMARY KEY (`idimparte`),
  KEY `fk_imparte_materias1_idx` (`materias_idmaterias`),
  KEY `fk_imparte_docentes1_idx` (`docentes_iddocente`),
  CONSTRAINT `fk_imparte_docentes1` FOREIGN KEY (`docentes_iddocente`) REFERENCES `docentes` (`iddocente`),
  CONSTRAINT `fk_imparte_materias1` FOREIGN KEY (`materias_idmaterias`) REFERENCES `materias` (`idmaterias`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `imparte`
--

LOCK TABLES `imparte` WRITE;
/*!40000 ALTER TABLE `imparte` DISABLE KEYS */;
INSERT INTO `imparte` VALUES (1,1,1),(2,2,3),(3,3,5),(4,4,2),(5,5,1),(6,6,5),(7,7,4),(8,8,4),(9,9,5),(10,10,3);
/*!40000 ALTER TABLE `imparte` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `materias`
--

DROP TABLE IF EXISTS `materias`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `materias` (
  `idmaterias` int NOT NULL AUTO_INCREMENT,
  `nombre_materia` varchar(60) NOT NULL,
  `codigo_materia` varchar(45) NOT NULL,
  `creditos` int NOT NULL,
  `idcarrera` smallint NOT NULL,
  PRIMARY KEY (`idmaterias`),
  KEY `idcarrera` (`idcarrera`),
  CONSTRAINT `materias_ibfk_1` FOREIGN KEY (`idcarrera`) REFERENCES `carreras` (`idcarrera`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `materias`
--

LOCK TABLES `materias` WRITE;
/*!40000 ALTER TABLE `materias` DISABLE KEYS */;
INSERT INTO `materias` VALUES (1,'Gestion de Proyectos de Software','GPS63618',5,1),(2,'Base de Datos','bs726383',4,1),(3,'Redes emergentes','RE522288',5,1),(4,'Telecomunicaiones','T5273929',4,1),(5,'DevOps','DO97732',5,1),(6,'Lenguajes Automatas','LA6682',5,2),(7,'Calculo Vectorial','CV1632',5,2),(8,'Graficacion','DO97732',5,2),(9,'Contabilidad II','DO97732',5,3),(10,'Investigacion','DO97732',5,3);
/*!40000 ALTER TABLE `materias` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pago`
--

DROP TABLE IF EXISTS `pago`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pago` (
  `idpago` int unsigned NOT NULL AUTO_INCREMENT,
  `estado` varchar(45) NOT NULL,
  `semestre_idsemestre` int NOT NULL,
  `alumnos_idAlumno` int NOT NULL,
  PRIMARY KEY (`idpago`),
  KEY `fk_pago_semestre1_idx` (`semestre_idsemestre`),
  KEY `fk_pago_alumnos1_idx` (`alumnos_idAlumno`),
  CONSTRAINT `fk_pago_alumnos1` FOREIGN KEY (`alumnos_idAlumno`) REFERENCES `alumnos` (`idAlumno`),
  CONSTRAINT `fk_pago_semestre1` FOREIGN KEY (`semestre_idsemestre`) REFERENCES `semestre` (`idsemestre`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pago`
--

LOCK TABLES `pago` WRITE;
/*!40000 ALTER TABLE `pago` DISABLE KEYS */;
INSERT INTO `pago` VALUES (1,'activo',1,1),(2,'activo',2,2),(3,'activo',3,3),(4,'activo',4,4),(5,'activo',5,5),(6,'activo',6,6);
/*!40000 ALTER TABLE `pago` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `semestre`
--

DROP TABLE IF EXISTS `semestre`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `semestre` (
  `idsemestre` int NOT NULL AUTO_INCREMENT,
  `numero_semestre` varchar(45) NOT NULL,
  `grupo_idgrupo` int unsigned NOT NULL,
  PRIMARY KEY (`idsemestre`),
  KEY `fk_semestre_grupo1_idx` (`grupo_idgrupo`),
  CONSTRAINT `fk_semestre_grupo1` FOREIGN KEY (`grupo_idgrupo`) REFERENCES `grupo` (`idgrupo`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `semestre`
--

LOCK TABLES `semestre` WRITE;
/*!40000 ALTER TABLE `semestre` DISABLE KEYS */;
INSERT INTO `semestre` VALUES (1,'1',1),(2,'3',2),(3,'5',3),(4,'7',4),(5,'3',5),(6,'7',6);
/*!40000 ALTER TABLE `semestre` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-05-07  8:55:16


CREATE TABLE IF NOT EXISTS `inscripciones`.`carga_academica` (
  `idcarga_academica` INT NOT NULL AUTO_INCREMENT,
  `semestre_idsemestre` INT(11) NOT NULL,
  `materias_idmaterias` INT(11) NOT NULL,
  `alumnos_idAlumno` INT(11) NOT NULL,
  PRIMARY KEY (`idcarga_academica`),
  INDEX `fk_carga_academica_semestre1_idx` (`semestre_idsemestre` ASC) VISIBLE,
  INDEX `fk_carga_academica_materias1_idx` (`materias_idmaterias` ASC) VISIBLE,
  INDEX `fk_carga_academica_alumnos1_idx` (`alumnos_idAlumno` ASC) VISIBLE,
  CONSTRAINT `fk_carga_academica_semestre1`
    FOREIGN KEY (`semestre_idsemestre`)
    REFERENCES `inscripciones`.`semestre` (`idsemestre`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_carga_academica_materias1`
    FOREIGN KEY (`materias_idmaterias`)
    REFERENCES `inscripciones`.`materias` (`idmaterias`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_carga_academica_alumnos1`
    FOREIGN KEY (`alumnos_idAlumno`)
    REFERENCES `inscripciones`.`alumnos` (`idAlumno`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;
