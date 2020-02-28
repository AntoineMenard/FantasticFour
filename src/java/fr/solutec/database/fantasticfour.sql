-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le :  ven. 28 fév. 2020 à 15:17
-- Version du serveur :  5.7.26
-- Version de PHP :  7.2.18

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `fantasticfour`
--
CREATE DATABASE IF NOT EXISTS `fantasticfour` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
USE `fantasticfour`;

-- --------------------------------------------------------

--
-- Structure de la table `actionadmin`
--

DROP TABLE IF EXISTS `actionadmin`;
CREATE TABLE IF NOT EXISTS `actionadmin` (
  `idactionAdmin` int(11) NOT NULL AUTO_INCREMENT,
  `action` varchar(45) NOT NULL,
  `date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `conseiller_idconseiller` int(11) NOT NULL,
  `admin_idadmin` int(11) NOT NULL,
  PRIMARY KEY (`idactionAdmin`),
  KEY `fk_actionAdmin_conseiller1_idx` (`conseiller_idconseiller`),
  KEY `fk_actionAdmin_admin1_idx` (`admin_idadmin`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `activitecompte`
--

DROP TABLE IF EXISTS `activitecompte`;
CREATE TABLE IF NOT EXISTS `activitecompte` (
  `idactiviteCompte` int(11) NOT NULL AUTO_INCREMENT,
  `modificationSolde` double NOT NULL,
  `date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `compte_idcompte` int(11) NOT NULL,
  `compte_idcompte1` int(11) NOT NULL,
  PRIMARY KEY (`idactiviteCompte`),
  KEY `fk_activiteCompte_compte1_idx` (`compte_idcompte1`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `admin`
--

DROP TABLE IF EXISTS `admin`;
CREATE TABLE IF NOT EXISTS `admin` (
  `idadmin` int(11) NOT NULL AUTO_INCREMENT,
  `mdp` varchar(45) NOT NULL,
  `nom` varchar(45) NOT NULL,
  `prenom` varchar(45) NOT NULL,
  `login` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idadmin`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `admin`
--

INSERT INTO `admin` (`idadmin`, `mdp`, `nom`, `prenom`, `login`) VALUES
(1, 'antoine', 'dev19', 'antoine', 'Ad1'),
(2, 'maryne', 'dev19maryne', 'maryne', 'Ad2');

--
-- Déclencheurs `admin`
--
DROP TRIGGER IF EXISTS `after_insert_admin`;
DELIMITER $$
CREATE TRIGGER `after_insert_admin` BEFORE INSERT ON `admin` FOR EACH ROW BEGIN
	  SET new.login = CONCAT('Cl', (SELECT idadmin FROM admin ORDER BY idadmin DESC LIMIT 1) + 1);
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Structure de la table `carte`
--

DROP TABLE IF EXISTS `carte`;
CREATE TABLE IF NOT EXISTS `carte` (
  `idcarte` int(11) NOT NULL AUTO_INCREMENT,
  `compte_idcompte` int(11) NOT NULL,
  `statutCarte` int(11) NOT NULL DEFAULT '1',
  PRIMARY KEY (`idcarte`),
  KEY `fk_carte_compte1_idx` (`compte_idcompte`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `client`
--

DROP TABLE IF EXISTS `client`;
CREATE TABLE IF NOT EXISTS `client` (
  `idclient` int(11) NOT NULL AUTO_INCREMENT,
  `mdp` varchar(45) NOT NULL,
  `nom` varchar(45) NOT NULL,
  `prenom` varchar(45) NOT NULL,
  `mail` varchar(45) NOT NULL,
  `adresse` varchar(150) DEFAULT NULL,
  `tel` varchar(45) NOT NULL,
  `photo` varchar(45) DEFAULT NULL,
  `conseiller_idconseiller` int(11) NOT NULL,
  `login` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idclient`),
  UNIQUE KEY `mail_UNIQUE` (`mail`),
  KEY `fk_client_conseiller1_idx` (`conseiller_idconseiller`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `client`
--

INSERT INTO `client` (`idclient`, `mdp`, `nom`, `prenom`, `mail`, `adresse`, `tel`, `photo`, `conseiller_idconseiller`, `login`) VALUES
(1, 'tanguy', 'dev19', 'tanguy', 'tanguymail', 'tanguyadresse', 'tanguytel', NULL, 1, 'Cl1');

--
-- Déclencheurs `client`
--
DROP TRIGGER IF EXISTS `after_insert_client`;
DELIMITER $$
CREATE TRIGGER `after_insert_client` BEFORE INSERT ON `client` FOR EACH ROW BEGIN
	  SET new.login = CONCAT('Cl', (SELECT idclient FROM client ORDER BY idclient DESC LIMIT 1) + 1);
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Structure de la table `compte`
--

DROP TABLE IF EXISTS `compte`;
CREATE TABLE IF NOT EXISTS `compte` (
  `idcompte` int(11) NOT NULL AUTO_INCREMENT,
  `solde` decimal(10,0) NOT NULL,
  `statutCarte` int(11) NOT NULL DEFAULT '1',
  `decouvert` decimal(10,0) NOT NULL DEFAULT '0',
  `client_idclient` int(11) NOT NULL,
  PRIMARY KEY (`idcompte`),
  KEY `fk_compte_client1_idx` (`client_idclient`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `conseiller`
--

DROP TABLE IF EXISTS `conseiller`;
CREATE TABLE IF NOT EXISTS `conseiller` (
  `idconseiller` int(11) NOT NULL AUTO_INCREMENT,
  `mdp` varchar(45) NOT NULL,
  `nom` varchar(45) NOT NULL,
  `prenom` varchar(45) NOT NULL,
  `mail` varchar(45) NOT NULL,
  `statut` tinyint(4) NOT NULL DEFAULT '1',
  `photo` varchar(45) DEFAULT NULL,
  `login` varchar(45) NOT NULL,
  PRIMARY KEY (`idconseiller`),
  UNIQUE KEY `mail_UNIQUE` (`mail`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `conseiller`
--

INSERT INTO `conseiller` (`idconseiller`, `mdp`, `nom`, `prenom`, `mail`, `statut`, `photo`, `login`) VALUES
(1, 'cyril', 'dev19', 'cyril', 'cyrilmail', 1, NULL, 'Cl1');

--
-- Déclencheurs `conseiller`
--
DROP TRIGGER IF EXISTS `after_insert_conseiller`;
DELIMITER $$
CREATE TRIGGER `after_insert_conseiller` BEFORE INSERT ON `conseiller` FOR EACH ROW BEGIN
	  SET new.login = CONCAT('Co', (SELECT idconseiller FROM conseiller ORDER BY idconseiller DESC LIMIT 1) + 1);
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Structure de la table `demandeinscription`
--

DROP TABLE IF EXISTS `demandeinscription`;
CREATE TABLE IF NOT EXISTS `demandeinscription` (
  `iddemandeInscription` int(11) NOT NULL AUTO_INCREMENT,
  `mail` varchar(45) NOT NULL,
  `nom` varchar(45) NOT NULL,
  `prenom` varchar(45) NOT NULL,
  `adresse` varchar(150) NOT NULL,
  `tel` varchar(45) NOT NULL,
  PRIMARY KEY (`iddemandeInscription`),
  UNIQUE KEY `mail_UNIQUE` (`mail`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `historiqueconnexion`
--

DROP TABLE IF EXISTS `historiqueconnexion`;
CREATE TABLE IF NOT EXISTS `historiqueconnexion` (
  `idhistoriqueConnexion` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(45) NOT NULL,
  `prenom` varchar(45) NOT NULL,
  `date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `client_idclient` int(11) NOT NULL,
  PRIMARY KEY (`idhistoriqueConnexion`),
  KEY `fk_historiqueConnexion_client1_idx` (`client_idclient`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `message`
--

DROP TABLE IF EXISTS `message`;
CREATE TABLE IF NOT EXISTS `message` (
  `idmessage` int(11) NOT NULL AUTO_INCREMENT,
  `date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `message` varchar(1000) NOT NULL,
  `client_idclient` int(11) NOT NULL,
  `conseiller_idconseiller` int(11) NOT NULL,
  PRIMARY KEY (`idmessage`),
  KEY `fk_message_client1_idx` (`client_idclient`),
  KEY `fk_message_conseiller1_idx` (`conseiller_idconseiller`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `test`
--

DROP TABLE IF EXISTS `test`;
CREATE TABLE IF NOT EXISTS `test` (
  `idtest` int(11) NOT NULL AUTO_INCREMENT,
  `test` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idtest`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `test`
--

INSERT INTO `test` (`idtest`, `test`) VALUES
(1, 'ukyèukyuk'),
(2, 'test'),
(3, 'test'),
(4, '8');

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `actionadmin`
--
ALTER TABLE `actionadmin`
  ADD CONSTRAINT `fk_actionAdmin_admin1` FOREIGN KEY (`admin_idadmin`) REFERENCES `admin` (`idadmin`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_actionAdmin_conseiller1` FOREIGN KEY (`conseiller_idconseiller`) REFERENCES `conseiller` (`idconseiller`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Contraintes pour la table `activitecompte`
--
ALTER TABLE `activitecompte`
  ADD CONSTRAINT `fk_activiteCompte_compte1` FOREIGN KEY (`compte_idcompte1`) REFERENCES `compte` (`idcompte`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Contraintes pour la table `carte`
--
ALTER TABLE `carte`
  ADD CONSTRAINT `fk_carte_compte1` FOREIGN KEY (`compte_idcompte`) REFERENCES `compte` (`idcompte`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Contraintes pour la table `client`
--
ALTER TABLE `client`
  ADD CONSTRAINT `fk_client_conseiller1` FOREIGN KEY (`conseiller_idconseiller`) REFERENCES `conseiller` (`idconseiller`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Contraintes pour la table `compte`
--
ALTER TABLE `compte`
  ADD CONSTRAINT `fk_compte_client1` FOREIGN KEY (`client_idclient`) REFERENCES `client` (`idclient`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Contraintes pour la table `historiqueconnexion`
--
ALTER TABLE `historiqueconnexion`
  ADD CONSTRAINT `fk_historiqueConnexion_client1` FOREIGN KEY (`client_idclient`) REFERENCES `client` (`idclient`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Contraintes pour la table `message`
--
ALTER TABLE `message`
  ADD CONSTRAINT `fk_message_client1` FOREIGN KEY (`client_idclient`) REFERENCES `client` (`idclient`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_message_conseiller1` FOREIGN KEY (`conseiller_idconseiller`) REFERENCES `conseiller` (`idconseiller`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
