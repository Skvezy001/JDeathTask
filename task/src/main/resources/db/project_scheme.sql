CREATE TABLE `users` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `sureName` varchar(45) NOT NULL
  PRIMARY KEY (`id`),
) ENGINE=InnoDB DEFAULT CHARSET=utf8

CREATE TABLE `account` (
  `id` int NOT NULL AUTO_INCREMENT,
  `account` int NOT NULL,
  `userid` int NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `usersaccount` FOREIGN KEY (`userid`) REFERENCES `users` (`id`),
) ENGINE=InnoDB DEFAULT CHARSET=utf8

