-- Update command : Used to update the data in table

select * from student;

update Student set total = sub1+sub2+sub3,
aveg = (sub1+sub2+sub3)/3;

-- Change value as 'Tanya aroara' for empno 8
select * from employ;
Update employ set name = 'Tanya arora' where empno = 7; 

-- change values as name as 'smriti' gender 'female' dept 'sap' desig 'manager' basic 99999 for empno = 5
update employ set name = 'smriti', gender = 'FEMALE', dept = 'sap', desig = 'manager', basic= 999999 where empno = 5; 

-- Change name as 'Sonali saho0' dept as 'sql' desig as 'Expert' basic as 090909 for empno 3
update employ set name = 'sonali sahoo', dept = 'sql', desig = 'expert', basic = 99998 where empno = 3;

-- add 1000 to basic for all sql dept employees

update employ set basic=basic+1000 where dept='sql';

update employ set basic = case dept
  when 'sql' then basic + 1000
  when 'java' then basic + 5000
  when 'Dotnet' then basic + 7000
end;

select empId from Employee where managerId = 1001;

update Employee set EmpName = upper(EmpName) where empId in 
(select empId from leaveDetails where empId = 1000);

select * from Employee;


-- Delete : Used to delete table record
-- Delte from table_ name where condition

delete from Employ where empno = 3;
select * from Bank;