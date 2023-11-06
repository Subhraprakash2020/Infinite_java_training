use hospital_management;

create table room_master(
  room_no varchar(15) primary key not null,
  room_type varchar(15) not null,
  status varchar(15) not null
  
);


describe room_master;

insert into room_master(room_no, room_type, status) values
('R0001','AC','occupied'),
  ('R0002','Suite','vacant'),
  ('R0003','NonAC','vacant'),
  ('R0004','NonAC','occupied'),
  ('R0005','AC','vacant'),
  ('R0006','AC','occupied'
);

select * from room_master;