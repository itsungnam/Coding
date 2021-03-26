SELECT NOW();
SELECT 8*9+3;

-- 새로운 데이터베이스 생성
CREATE DATABASE mydb;
-- 사용할 데이터베이스 선택
USE mydb;
-- 테이블 목록을 확인
SHOW TABLES;

-- 테이블 작성
CREATE TABLE Reservation(ID INT, Name VARCHAR(30), ReserveDate DATE, RoomNum INT);
CREATE TABLE Customer (ID INT, Name VARCHAR(30), Age INT, Address VARCHAR(20));

-- 테이블 목록을 확인
SHOW TABLES;

-- 데이터 넣기
INSERT INTO Reservation(ID, Name, ReserveDate, RoomNum) VALUES(1, '홍길동', '2016-01-05', 2014);
INSERT INTO Reservation(ID, Name, ReserveDate, RoomNum) VALUES(2, '임꺽정', '2016-02-12', 918);
INSERT INTO Reservation(ID, Name, ReserveDate, RoomNum) VALUES(3, '장길산', '2016-01-16', 1208);
INSERT INTO Reservation(ID, Name, ReserveDate, RoomNum) VALUES(4, '홍길동', '2016-03-17', 504);

INSERT INTO Customer (ID, Name, Age, Address) VALUES (1, '홍길동', 17, '서울');
INSERT INTO Customer (ID, Name, Age, Address) VALUES (2, '임꺽정', 11, '인천');
INSERT INTO Customer (ID, Name, Age, Address) VALUES (3, '장길산', 13, '서울');
INSERT INTO Customer (ID, Name, Age, Address) VALUES (4, '전우치', 17, '수원');

-- 데이터 확인
SELECT * FROM reservation;
SELECT * FROM customer;

/*
데이터베이스 생성
CREATE DATABASE 문은 새로운 데이터베이스를 생성해 줍니다.
문법
CREATE DATABASE 데이터베이스이름
*/
CREATE DATABASE sample;
-- 데이터베이스 목록을 확인
SHOW DATABASES;
/*
데이터베이스의 선택
데이터베이스를 생성한 후에, 해당 데이터베이스를 사용하기 위해서는 우선 데이터베이스를 선택해야 합니다.
MySQL에서는 USE 문을 사용하여 데이터베이스를 선택할 수 있습니다.

문법
USE 데이터베이스이름
*/
USE sample
SHOW TABLES;
USE mydb;
SHOW TABLES;

/*
테이블 생성
데이터베이스는 하나 이상의 테이블로 구성되며, 이러한 테이블에 데이터를 저장하여 관리할 수 있습니다.
CREATE TABLE 문은 새로운 테이블을 생성해 줍니다.
문법
CREATE TABLE 테이블이름(
   필드이름1 필드타입1,
   필드이름2 필드타입2,
   ...
)
테이블을 생성하기 위해서는 테이블 이름, 필드(field) 목록과 각 필드의 타입을 명시해야 합니다.
필드의 타입이란 해당 필드에 저장될 데이터가 가질 수 있는 타입을 의미합니다.
*/

CREATE TABLE Test(
    ID INT,
    Name VARCHAR(30),
    ReserveDate DATE,
    RoomNum INT
);
-- 테이블 구조 확인
-- desc 테이블명;
DESC test;
CREATE TABLE person(
	idx INT PRIMARY KEY AUTO_INCREMENT,
	NAME VARCHAR(30) NOT NULL,
	nickName VARCHAR(20)
);
DESC person;
-- 데이터 삽입
-- insert into 테이블명 (필드명....) values (데이터....);
INSERT INTO person (NAME) VALUES ('한사람');
-- 데이터 확인
-- select 필드명... from 테이블명 where 조건 .....
SELECT * FROM  person;

INSERT INTO person (nickname) VALUES ('멍청이'); -- 에러 : name이 필수이기때문
INSERT INTO person (idx, NAME, nickname) VALUES (1,'두사람','멍청이'); -- 에러 : 기본키 중복!!

INSERT INTO person (idx, NAME, nickname) VALUES (0,'두사람','멍청이'); // AUTO_INCREMENT에 0넣으면 무시
INSERT INTO person  VALUES (0,'세사람','바보'); -- 순서대로 모두 입력시는 필드명 생략 가능
SELECT * FROM  person;
INSERT INTO person ( nickname, NAME) VALUES ('철부지','박문수');
SELECT * FROM  person;

-- 테이블 삭제
-- drop table 테이블명
DROP TABLE test2;
CREATE TABLE test2(
    ID INT  PRIMARY KEY AUTO_INCREMENT,
    Name VARCHAR(30),
    ReserveDate DATETIME DEFAULT NOW(),
    RoomNum INT DEFAULT 0
);

SELECT * FROM test2;
INSERT INTO test2 (NAME) VALUES ('정주영');
SELECT * FROM test2;

-- 데이터베이스나 테이블 수정
-- alter database
-- alter table
/*
테이블 수정
ALTER TABLE 문은 테이블에 필드를 추가, 삭제하거나 필드의 타입을 변경할 수 있게 해줍니다.
1. ADD
2. DROP
3. MODIFY COLUMN
*/
USE mysql;
DESC USER;
SELECT HOST, User, PASSWORD FROM user;
SELECT PASSWORD('1234');

--- 여기부터는 JSPUSER작업!!!!

CREATE DATABASE jspdb;





