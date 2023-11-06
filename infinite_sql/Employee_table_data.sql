use  infinite_auguest23;

insert into Employee(EmpId, EmpName, EmpEmail, MobileNo,DateOfJoin, ManagerId, LeaveAvail)
values(1000,'sagar','sagar@gmail.com','788898343','2023-10-08',null,12),
(1002,'abhishek','abhishek@gmail.com','9899989898','2023-11-09',1000,12),
(1003,'kaushik','kaushik@gmail.com','6565898989','2022-10-007',1000,15),
(1004,'Prakash','kaushik@gmail.com','7888985676','2023-10-08',1001,14),
(1005,'Harsh','harsh@gmail.com','9878989898','2023-11-09',1001,17),
(1006,'shivangi','shivangi@gmail.com','9090876545','2023-10-11',1001,10),
(1007,'rajesh','rajesh@gmail.com','9878987878','2023-12-19',1001,10);

insert into LeaveDetails(EmpId, leaveStartDate, leaveEndDate, LeaveType, leaveReason)
values(1000,'2023-10-10','2023-10-10','EL','going home'),
(1005,'2023-12-12','2023-10-10','EL','function'),
(1006,'2023-12-25','2023-12-31','PL','marriage');

SELECT * FROM infinite_auguest23.leavedetails;