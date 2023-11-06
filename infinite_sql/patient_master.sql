use hospital_management;

create table PATIENT_MASTER(
 pid varchar(15) primary key,
 name varchar(15) not null,
 age int(15) not null,
 weight int(15) not null,
 Gender varchar(10) not null,
 Address varchar(50) not null,
 phoneno varchar(10) not null,
 Disease varchar(50) not null,
 doctor_id VARCHAR(5),
  FOREIGN KEY (doctor_id) REFERENCES doctor_master(doctor_id)
);
describe PATIENT_MASTER;


INSERT INTO PATIENT_MASTER (pid, name, age, weight, gender, address, phoneno, disease, doctor_id)
VALUES
('P0001', 'Gita', 35, 65, 'F', 'Chennai', '9867145678', 'Eye Infection', 'D0003'),
('P0002', 'Ashish', 40, 70, 'M', 'D', '9845675678', 'Asthma', 'D0003'),
('P0003', 'Radha', 25, 60, 'F', 'Chennai', '9867166678', 'Pain in heart', 'D0005'),
('P0004', 'Chandra', 28, 55, 'F', 'Bangalore', '9978675567', 'Asthma', 'D0001'),
('P0005', 'Goyal', 42, 65, 'M', 'Delhi', '8967533223', 'Pain in Stomach', 'D0004');

select * from PATIENT_MASTER;