use  infinite_auguest23;

drop table if exists LeaveDetails;
drop table if exists Employee;
create table Employee
(
  EmpId int primary key,
  EmpName varchar(20),
  EmpEmail varchar(30),
  MobileNo varchar(30),
  DateofJoin Date,
  managerId int,
  LeaveAvail Int
);

create table LeaveDetails
(
   LeaveId INT primary key auto_increment,
   EmpId Int,
   LeaveStartDate Date,
   leaveEndDate Date,
   noofdaya Int,
   leavetype ENUM('EL','PL','ML'),
   leaveStatus enum('PENDING','ACCEPTED','REJECTED') default 'PENDING',
   leaveReason varchar(30),
   appliedOn timestamp default current_timestamp,
   foreign key(empid) references employee(empid)
);