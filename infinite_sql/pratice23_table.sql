create database pratice23;
use pratice23;

create table department
(
   DeptNo int,
   Dname varchar(30),
   loc varchar(30),
   primary key(deptno)
);

create table employ
(
  Empno int,
  DeptNo Int,
  EmpName varchar(30),
  Gender enum('MALE', 'FEMALE'),
  city varchar(30),
  primary key(Empno),
  foreign key(DeptNo) references department(Deptno)
);

create table project
(
  projCode int,
  Empno int,
  Hours int,
  projName varchar(30),
  foreign key(Empno) references Employ(Empno),
  primary key(Empno, ProjCode)
);