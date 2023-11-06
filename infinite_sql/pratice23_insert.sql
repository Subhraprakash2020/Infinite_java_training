use pratice23;

Insert into Department(Deptno, Dname, Loc)
values(101, 'Dotnet','Hyderbad'),
(102,'Java','Bangolore'),
(103,'Sql','Chennai'),
(104,'Tasting','Delhi');


delete from Employ;
Insert into Employ(Empno,Deptno,EmpName,city,Gender)
values(300,101,'Satyaprakash','Delhi','MALE'),
(301,102,'Subhraprakash','Hydrebad','MALE'),
(302,103,'Shirisha','Hydrabad','FEMALE'),
(303,101,'Jitendra','Agra','MALE'),
(304,103,'Sonali','Pune','FEMALE'),
(305,102,'Unmesha','Agra','FEMALE');


delete from project;

insert into project(Projcode,Empno,Hours,ProjName) 
values(101,300,100,'ZC'),
	(102,300,90,'City Bank'),
    (101,303,190,'ZC');
