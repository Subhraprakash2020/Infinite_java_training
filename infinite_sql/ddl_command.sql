drop database if exists infinite_august23;

create database infinite_auguest23;
use  infinite_auguest23;

drop table if exists Employ;

create table Employ
(
   Empno int primary key,
   Name varchar(20),
   Gender enum('MALE','FEMALE'),
   Dept varchar(30),
   Desig varchar(30),
   Basic numeric(9,2)
);

describe Employ;