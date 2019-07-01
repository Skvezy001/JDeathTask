create database taskdb;
use taskdb;

CREATE TABLE `users` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `sureName` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `account` (
  `id` int NOT NULL AUTO_INCREMENT,
  `account` int NOT NULL,
  `userid` int NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `users_account` FOREIGN KEY (`userid`) REFERENCES `users` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8

insert into users (name, sureName) values ('Nikita', 'Ershov');
insert into users (name, sureName) values ('Nikita1', 'Ershov1');
insert into users (name, sureName) values ('Nikita2', 'Ershov2');
insert into users (name, sureName) values ('Nikita3', 'Ershov3');

insert into account (account, userid) values (12345, 1);
insert into account (account, userid) values (12346, 2);
insert into account (account, userid) values (12347, 3);
insert into account (account, userid) values (12348, 4);