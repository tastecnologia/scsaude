
CREATE TABLE `saudesc`.`ficha` (
  `id` int PRIMARY KEY,
  `dtCadastro` timestamp NULL DEFAULT NULL,
  `status` char(1) DEFAULT NULL,
  `observacao` text
) ENGINE=innodb;

INSERT INTO `ficha` (`id`, `dtCadastro`, `status`, `observacao`) VALUES ('1', '2018-07-27 00:00:00', '1', 'ficha 1'); 
INSERT INTO `ficha` (`id`, `dtCadastro`, `status`, `observacao`) VALUES ('2', '2018-07-26 00:00:00', '0', 'ficha 2'); 
INSERT INTO `ficha` (`id`, `dtCadastro`, `status`, `observacao`) VALUES ('3', '2018-07-25 00:00:00', '1', 'ficha tres'); 
INSERT INTO `ficha` (`id`, `dtCadastro`, `status`, `observacao`) VALUES ('4', '2018-07-24 00:00:00', '0', 'ficha quatro'); 

