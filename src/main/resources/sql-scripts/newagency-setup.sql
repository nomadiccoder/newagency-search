drop database if exists newsagency;
drop user 'newsagency-user'@'localhost';
create database newsagency;
create user 'newsagency-user'@'localhost' identified by 'newsagency';
grant all privileges on `newsagency`.* to 'newsagency-user'@'localhost';
FLUSH PRIVILEGES;

use newsagency;
--drop table scripts
drop table if exists NewsAdmin;
drop table if exists Article;
drop table if exists Customer;

--Create table scripts
create table if not exists NewsAdmin( id BIGINT not null AUTO_INCREMENT primary key,fname varchar(100),lname varchar(100),email varchar(200),password varchar(100));
create table if not exists Article(id BIGINT not null AUTO_INCREMENT primary key,title varchar(5000),content varchar(10000),author varchar(500),linkUri varchar(5000),
category varchar(50),fullContentUri varchar(200),publishedDate DATETIME DEFAULT CURRENT_TIMESTAMP,
createdOn DATETIME DEFAULT CURRENT_TIMESTAMP,updatedOn DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP);
