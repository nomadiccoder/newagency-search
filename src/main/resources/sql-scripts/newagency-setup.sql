drop database if exists newsagency;
create database newsagency;
create user 'newsagency-user'@'localhost' identified by 'newsagency';
grant all privileges on 'newsagency'.* to 'newsagency'@'localhost';
FLUSH PRIVILEGES;

use newsagency;
--drop table scripts
drop table if exists User;
drop table if exists Article;
drop table if exists Customer;
drop 
--Create table scripts
create table if not exists User( id BIGINT not null AUTO_INCREMENT primary key,fname varchar(100),lname varchar(100),email varchar(200),password varchar(100));
create table if not exists Articl(id BIGINT not null AUTO_INCREMENT primary key,title varchar(100),content varchar(500),author varchar(100),
publishedDate DATETIME DEFAULT CURRENT_TIMESTAMP,createdOn DATETIME DEFAULT CURRENT_TIMESTAMP,updatedOn DATETIME ON UPDATE CURRENT_TIMESTAMP);
