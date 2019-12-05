-- --------------------------------------------------------
-- Servidor:                     127.0.0.1
-- Versão do servidor:           8.0.16 - MySQL Community Server - GPL
-- OS do Servidor:               Win64
-- HeidiSQL Versão:              10.2.0.5599
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Copiando estrutura do banco de dados para livraria
CREATE DATABASE IF NOT EXISTS `livraria` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `livraria`;

-- Copiando estrutura para tabela livraria.livro
CREATE TABLE IF NOT EXISTS `livro` (
  `Id_livro` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(30) NOT NULL,
  `autor` varchar(30) NOT NULL,
  `isbn` varchar(13) NOT NULL,
  `genero` varchar(30) NOT NULL,
  PRIMARY KEY (`Id_livro`,`isbn`),
  UNIQUE KEY `isbn` (`isbn`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Copiando dados para a tabela livraria.livro: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `livro` DISABLE KEYS */;
/*!40000 ALTER TABLE `livro` ENABLE KEYS */;

-- Copiando estrutura para tabela livraria.reserva
CREATE TABLE IF NOT EXISTS `reserva` (
  `Id_reserva` int(11) NOT NULL AUTO_INCREMENT,
  `data_retirada` date NOT NULL,
  `data_devolucao` date NOT NULL,
  `isbn` varchar(13) NOT NULL,
  `id_livro` int(11) NOT NULL DEFAULT '0',
  `id_usuario` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`Id_reserva`),
  KEY `FK_reserva_livro` (`isbn`),
  KEY `FK_reserva_livro_2` (`id_livro`),
  KEY `FK_reserva_usuario` (`id_usuario`),
  CONSTRAINT `FK_reserva_livro` FOREIGN KEY (`isbn`) REFERENCES `livro` (`isbn`),
  CONSTRAINT `FK_reserva_livro_2` FOREIGN KEY (`id_livro`) REFERENCES `livro` (`Id_livro`),
  CONSTRAINT `FK_reserva_usuario` FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`Id_usuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Copiando dados para a tabela livraria.reserva: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `reserva` DISABLE KEYS */;
/*!40000 ALTER TABLE `reserva` ENABLE KEYS */;

-- Copiando estrutura para tabela livraria.usuario
CREATE TABLE IF NOT EXISTS `usuario` (
  `Id_usuario` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(30) NOT NULL,
  `data_nasc` date DEFAULT NULL,
  `email` varchar(30) NOT NULL,
  `telefone` varchar(12) DEFAULT NULL,
  `endereco` varchar(50) NOT NULL,
  PRIMARY KEY (`Id_usuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Copiando dados para a tabela livraria.usuario: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
