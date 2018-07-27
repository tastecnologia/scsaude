CREATE TABLE `saudesc`.`animal` ( `id` int PRIMARY KEY, `nome` varchar(50) DEFAULT NULL, `idficha` int DEFAULT NULL ) ENGINE=innodb;
ALTER TABLE `animal` ADD CONSTRAINT `fk_ficha` FOREIGN KEY ( `idficha` ) REFERENCES `ficha` ( `id` ) ;
INSERT INTO animal VALUES('1', 'cavalo','1');
INSERT INTO animal VALUES('2', 'coelho','1');
INSERT INTO animal VALUES('3', 'galinha','2');
INSERT INTO animal VALUES('4', 'ganso','3');