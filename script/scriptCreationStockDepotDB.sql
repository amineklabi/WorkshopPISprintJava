-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.0.27-community-nt


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema stockdepot
--

CREATE DATABASE IF NOT EXISTS stockdepot;
USE stockdepot;

--
-- Definition of table `t_article`
--

DROP TABLE IF EXISTS `t_article`;
CREATE TABLE `t_article` (
  `id` int(10) unsigned NOT NULL auto_increment,
  `quantite` int(10) unsigned NOT NULL,
  `fk_id_client` int(10) unsigned default NULL,
  `fk_id_stock` int(10) unsigned default NULL,
  PRIMARY KEY  (`id`),
  KEY `FK_t_article_1` (`fk_id_client`),
  KEY `FK_t_article_2` (`fk_id_stock`),
  CONSTRAINT `FK_t_article_1` FOREIGN KEY (`fk_id_client`) REFERENCES `t_client` (`cin`),
  CONSTRAINT `FK_t_article_2` FOREIGN KEY (`fk_id_stock`) REFERENCES `t_stock` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `t_article`
--

/*!40000 ALTER TABLE `t_article` DISABLE KEYS */;
INSERT INTO `t_article` (`id`,`quantite`,`fk_id_client`,`fk_id_stock`) VALUES 
 (1,2,7126390,1),
 (2,3,7126390,2);
/*!40000 ALTER TABLE `t_article` ENABLE KEYS */;


--
-- Definition of table `t_client`
--

DROP TABLE IF EXISTS `t_client`;
CREATE TABLE `t_client` (
  `cin` int(10) unsigned NOT NULL auto_increment,
  `nom` varchar(45) NOT NULL,
  `prenom` varchar(45) NOT NULL,
  `adresse` varchar(45) NOT NULL,
  PRIMARY KEY  (`cin`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `t_client`
--

/*!40000 ALTER TABLE `t_client` DISABLE KEYS */;
INSERT INTO `t_client` (`cin`,`nom`,`prenom`,`adresse`) VALUES 
 (4887569,'Ahmed','Ouanness','Ariana'),
 (5548579,'Ben Yahia','Hamed','Tunis'),
 (7126390,'KLABI','Amine','Ariana');
/*!40000 ALTER TABLE `t_client` ENABLE KEYS */;


--
-- Definition of table `t_depot`
--

DROP TABLE IF EXISTS `t_depot`;
CREATE TABLE `t_depot` (
  `id` int(10) unsigned NOT NULL auto_increment,
  `adresse` varchar(45) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `t_depot`
--

/*!40000 ALTER TABLE `t_depot` DISABLE KEYS */;
INSERT INTO `t_depot` (`id`,`adresse`) VALUES 
 (1,'Ariana'),
 (2,'Tunis'),
 (3,'Ben Arous'),
 (4,'Sfax');
/*!40000 ALTER TABLE `t_depot` ENABLE KEYS */;


--
-- Definition of table `t_stock`
--

DROP TABLE IF EXISTS `t_stock`;
CREATE TABLE `t_stock` (
  `id` int(10) unsigned NOT NULL auto_increment,
  `libelle` varchar(45) NOT NULL,
  `type` varchar(45) NOT NULL,
  `nbrestock` int(10) unsigned NOT NULL,
  `prix` float NOT NULL,
  `fk_id_depot` int(10) unsigned default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `t_stock`
--

/*!40000 ALTER TABLE `t_stock` DISABLE KEYS */;
INSERT INTO `t_stock` (`id`,`libelle`,`type`,`nbrestock`,`prix`,`fk_id_depot`) VALUES 
 (1,'Polo','Homme',20,120.5,2),
 (2,'Tee Shirt','Homme',8,190.5,1),
 (3,'Pantalon','Homme',20,21.5,1),
 (4,'Robe','Femme',150,220,4);
/*!40000 ALTER TABLE `t_stock` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
