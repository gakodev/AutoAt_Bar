-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 28/09/2023 às 16:43
-- Versão do servidor: 10.4.28-MariaDB
-- Versão do PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `bd_atbar`
--

-- --------------------------------------------------------

--
-- Estrutura para tabela `admin`
--

CREATE TABLE `admin` (
  `idAdmin` int(11) NOT NULL,
  `user` varchar(45) DEFAULT NULL,
  `senha` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Despejando dados para a tabela `admin`
--

INSERT INTO `admin` (`idAdmin`, `user`, `senha`) VALUES
(1, 'Adm', '12345');

-- --------------------------------------------------------

--
-- Estrutura para tabela `pedido`
--

CREATE TABLE `pedido` (
  `idPedido` int(11) NOT NULL,
  `valorTotal` float DEFAULT NULL,
  `formaPagamento` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Despejando dados para a tabela `pedido`
--

INSERT INTO `pedido` (`idPedido`, `valorTotal`, `formaPagamento`) VALUES
(1, 6.99, 0),
(2, 6.99, 0),
(3, 6.99, 0),
(4, 8.99, 0),
(5, 8.99, 0),
(6, 17.98, 1),
(7, 8.99, 2),
(8, 19.98, 1),
(9, 13.98, 1),
(10, 13.98, 2),
(11, 13.98, 1),
(12, 13.98, 3),
(13, 17.98, 2),
(14, 6.99, 1),
(15, 13.98, 2),
(16, 13.98, 1),
(17, 13.98, 1),
(18, 13.98, 1),
(19, 6.99, 2),
(20, 6.99, 1),
(21, 6.99, 1),
(22, 6.99, 2),
(23, 6.99, 2),
(24, 6.99, 2),
(25, 8.99, 1),
(26, 9.99, 2),
(27, 6.99, 2),
(28, 6.99, 1),
(29, 13.98, 2),
(30, 6.99, 2),
(31, 17.98, 2),
(32, 6.99, 3),
(33, 71.78, 2),
(34, 37.96, 2),
(35, 13.98, 3),
(36, 26.97, 2),
(37, 17.98, 3),
(38, 26.97, 1),
(39, 26.97, 1),
(40, 0, 1),
(41, 0, 1),
(42, 13.98, 1),
(43, 13.98, 1),
(44, 35.96, 1),
(45, 26.97, 1),
(46, 17.98, 1),
(47, 17.98, 1),
(48, 19.98, 1),
(49, 28.88, 2),
(50, 20.97, 2),
(51, 25.97, 2),
(52, 25.97, 2),
(53, 25.97, 2),
(54, 25.97, 1),
(55, 25.97, 1),
(56, 25.97, 2),
(57, 25.97, 2),
(58, 25.97, 1),
(59, 38.87, 1),
(60, 28.8, 2),
(61, 25.97, 1),
(62, 51.94, 1),
(63, 51.94, 1),
(64, 51.94, 2),
(65, 51.94, 1),
(66, 32.96, 2),
(67, 53.77, 2),
(68, 29.97, 1),
(69, 107.88, 2),
(70, 51.94, 1),
(71, 51.94, 2),
(72, 61.93, 2),
(73, 132.52, 2),
(74, 91.99, 1),
(75, 40.7, 2),
(76, 51.94, 1),
(77, 124.49, 2),
(78, 51.94, 1),
(79, 6.99, 1),
(80, 20.97, 1),
(81, 6.99, 2),
(82, 13.98, 1),
(83, 13.98, 1);

-- --------------------------------------------------------

--
-- Estrutura para tabela `pedido_has_produto`
--

CREATE TABLE `pedido_has_produto` (
  `idPedido_has_Produto` int(11) NOT NULL,
  `Pedido_idPedido` int(11) NOT NULL,
  `Produto_idProduto` int(11) NOT NULL,
  `quantidade` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Despejando dados para a tabela `pedido_has_produto`
--

INSERT INTO `pedido_has_produto` (`idPedido_has_Produto`, `Pedido_idPedido`, `Produto_idProduto`, `quantidade`) VALUES
(9, 1, 1, 1),
(11, 30, 1, 1),
(12, 33, 3, 1),
(13, 33, 7, 2),
(14, 33, 10, 1),
(15, 34, 2, 2),
(16, 34, 3, 2),
(17, 35, 1, 2),
(18, 36, 2, 3),
(19, 37, 2, 2),
(20, 38, 2, 3),
(21, 39, 2, 3),
(22, 42, 1, 2),
(23, 43, 1, 2),
(24, 44, 2, 4),
(25, 45, 2, 3),
(26, 46, 2, 2),
(27, 47, 2, 2),
(28, 48, 3, 2),
(29, 49, 1, 1),
(30, 49, 2, 1),
(31, 49, 4, 1),
(32, 50, 1, 3),
(33, 51, 1, 1),
(34, 51, 2, 1),
(35, 51, 3, 1),
(36, 52, 1, 1),
(37, 52, 2, 1),
(38, 52, 3, 1),
(39, 53, 1, 1),
(40, 53, 2, 1),
(41, 53, 3, 1),
(42, 54, 1, 1),
(43, 54, 2, 1),
(44, 54, 3, 1),
(45, 55, 1, 1),
(46, 55, 2, 1),
(47, 55, 3, 1),
(48, 56, 1, 1),
(49, 56, 2, 1),
(50, 56, 3, 1),
(51, 57, 1, 1),
(52, 57, 2, 1),
(53, 57, 3, 1),
(54, 58, 1, 1),
(55, 58, 2, 1),
(56, 58, 3, 1),
(57, 59, 1, 1),
(58, 59, 2, 1),
(59, 59, 3, 1),
(60, 59, 4, 1),
(61, 60, 6, 1),
(62, 60, 7, 1),
(63, 61, 1, 1),
(64, 61, 2, 1),
(65, 61, 3, 1),
(66, 62, 1, 2),
(67, 62, 2, 2),
(68, 62, 3, 2),
(69, 63, 1, 2),
(70, 63, 2, 2),
(71, 63, 3, 2),
(72, 64, 1, 2),
(73, 64, 2, 2),
(74, 64, 3, 2),
(75, 65, 1, 2),
(76, 65, 2, 2),
(77, 65, 3, 2),
(78, 66, 1, 2),
(79, 66, 2, 1),
(80, 66, 3, 1),
(81, 67, 1, 1),
(82, 67, 2, 1),
(83, 67, 3, 1),
(84, 67, 5, 1),
(85, 67, 6, 1),
(86, 68, 3, 3),
(87, 69, 1, 3),
(88, 69, 2, 3),
(89, 69, 3, 6),
(90, 70, 1, 2),
(91, 70, 2, 2),
(92, 70, 3, 2),
(93, 71, 1, 2),
(94, 71, 2, 2),
(95, 71, 3, 2),
(96, 72, 1, 2),
(97, 72, 2, 2),
(98, 72, 3, 3),
(99, 73, 1, 2),
(100, 73, 2, 3),
(101, 73, 3, 3),
(102, 73, 5, 2),
(103, 73, 7, 2),
(104, 74, 10, 1),
(105, 74, 11, 1),
(106, 74, 12, 1),
(107, 75, 4, 1),
(108, 75, 5, 1),
(109, 75, 6, 1),
(110, 76, 1, 2),
(111, 76, 2, 2),
(112, 76, 3, 2),
(113, 77, 10, 1),
(114, 77, 11, 1),
(115, 77, 12, 2),
(116, 78, 1, 2),
(117, 78, 2, 2),
(118, 78, 3, 2),
(119, 79, 1, 1),
(120, 80, 1, 3),
(121, 81, 1, 1),
(122, 82, 1, 2),
(123, 83, 1, 2);

-- --------------------------------------------------------

--
-- Estrutura para tabela `produto`
--

CREATE TABLE `produto` (
  `idProduto` int(11) NOT NULL,
  `tipo` int(11) NOT NULL,
  `nome` varchar(45) DEFAULT NULL,
  `descricao` varchar(45) DEFAULT NULL,
  `valor` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Despejando dados para a tabela `produto`
--

INSERT INTO `produto` (`idProduto`, `tipo`, `nome`, `descricao`, `valor`) VALUES
(1, 0, 'Água mineral', 'Com ou sem gás. 500ml', 6.99),
(2, 0, 'Suco natural', 'Laranja, abacaxi, uva. 500ml', 8.99),
(3, 0, 'Monster', 'Mango loko, Paradise, Green. 473ml', 9.99),
(4, 2, 'Corona Long Neck', 'Cerveja Mexicana. 330ml', 12.9),
(5, 2, 'Patagônia IPA Long Neck', 'Cerveja Argentina. 330ml', 14.9),
(6, 2, 'Heineken Long Neck', 'Cerveja holandesa. 330ml', 12.9),
(7, 3, 'Chopp Stella Artois', 'Pilsen. 500ml', 15.9),
(8, 3, 'Chopp Patagônia ', 'Weiss. 500ml', 17.9),
(9, 3, 'Chopp Brahma', 'Pilsen. 500ml', 15.5),
(10, 1, 'Negroni', 'Gin, campari, vermoth rosso', 29.99),
(11, 1, 'Mojito', 'Rum, xarope de limão, hortelã, água com gás', 29.5),
(12, 1, 'Moscow Mule', 'Vodka, limão, gengibre, espuma de gengibre', 32.5);

--
-- Índices para tabelas despejadas
--

--
-- Índices de tabela `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`idAdmin`);

--
-- Índices de tabela `pedido`
--
ALTER TABLE `pedido`
  ADD PRIMARY KEY (`idPedido`);

--
-- Índices de tabela `pedido_has_produto`
--
ALTER TABLE `pedido_has_produto`
  ADD PRIMARY KEY (`idPedido_has_Produto`),
  ADD KEY `fk_Pedido_has_Produto_Produto1_idx` (`Produto_idProduto`),
  ADD KEY `fk_Pedido_has_Produto_Pedido1_idx` (`Pedido_idPedido`);

--
-- Índices de tabela `produto`
--
ALTER TABLE `produto`
  ADD PRIMARY KEY (`idProduto`);

--
-- AUTO_INCREMENT para tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `admin`
--
ALTER TABLE `admin`
  MODIFY `idAdmin` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de tabela `pedido`
--
ALTER TABLE `pedido`
  MODIFY `idPedido` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=84;

--
-- AUTO_INCREMENT de tabela `pedido_has_produto`
--
ALTER TABLE `pedido_has_produto`
  MODIFY `idPedido_has_Produto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=124;

--
-- AUTO_INCREMENT de tabela `produto`
--
ALTER TABLE `produto`
  MODIFY `idProduto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- Restrições para tabelas despejadas
--

--
-- Restrições para tabelas `pedido_has_produto`
--
ALTER TABLE `pedido_has_produto`
  ADD CONSTRAINT `fk_Pedido_has_Produto_Pedido1` FOREIGN KEY (`Pedido_idPedido`) REFERENCES `pedido` (`idPedido`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_Pedido_has_Produto_Produto1` FOREIGN KEY (`Produto_idProduto`) REFERENCES `produto` (`idProduto`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
