create database Hospital_management;

use Hospital_management;
create table doctor_master(
  doctor_id varchar(15) primary key not null,
  doctor_name varchar(15) not null,
  dept varchar(15) not null
  
);

describe doctor_master;

insert into doctor_master(doctor_id, doctor_name, dept) values
('D0001','Ram','ENT'),
  ('D0002','Rajan','ENT'),
  ('D0003','Smita','EYE'),
  ('D0004','Bhavan','Surgery'),
  ('D0005','Sheela','Surgery'),
  ('D0006','Nethra','Surgery'
);

select * from doctor_master;