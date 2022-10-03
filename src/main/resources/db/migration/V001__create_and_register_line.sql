CREATE TABLE line (
	id_line BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	nm_line VARCHAR(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO line (nm_line) values('ELECTRONICS');
INSERT INTO line (nm_line) values('FOOD');
INSERT INTO line (nm_line) values('CLOTHES');
INSERT INTO line (nm_line) values('CLEAN');
INSERT INTO line (nm_line) values('HEALTH');

