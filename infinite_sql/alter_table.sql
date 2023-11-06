use pratice23;

drop table if exists EmpTest;
create table EmpTest
(
  Empno int,
  name varchar(10),
  sal int
);

-- change the fiels name size to 30 char
alter table emptest modify name varchar(30);
desc emptest;

-- Add new field gender to the particular table
alter table Emptest add gender enum ('MALE','FEMALE');

-- add primary key on empno field
alter table emptest add primary key(empno);
desc emptest;