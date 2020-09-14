CREATE TABLE `emp03` (
  `sabun` int NOT NULL AUTO_INCREMENT,
  `name` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `nalja` timestamp NOT NULL,
  `deptno` int NOT NULL,
  `pay` int NOT NULL,
  PRIMARY KEY (`sabun`),
  KEY `deptno_idx` (`deptno`),
  CONSTRAINT `deptno` FOREIGN KEY (`deptno`) REFERENCES `dept03` (`deptno`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci