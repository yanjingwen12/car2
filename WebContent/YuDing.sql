
/* Drop Tables */
create database YuDing;

DROP TABLE YUDING;

use YuDing;


/* Create Tables */

CREATE TABLE YUDING
(
	USERID INT NOT NULL,
	NAME VARCHAR(0) NOT NULL,
	SEX VARCHAR(0) NOT NULL,
	CARID INT NOT NULL,
	DIANHUA INT NOT NULL,
	-- QQ
	QQ INT COMMENT 'QQ',
	WEIXIN INT,
	DIZHI VARCHAR(0) NOT NULL,
	PRIMARY KEY (USERID)
);



