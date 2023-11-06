use Insurance;
create table Insurance_plan(
  planid int auto_increment primary key,
  Insurance_id int,
  Premium_amount DECIMAL(10, 2),
  Coverage_amount DECIMAL(10, 2)
  );
  
ALTER TABLE insurance_plan
DROP COLUMN initialamoutn;

ALTER TABLE Insurance_plan
ADD paymode VARCHAR(255),
ADD initialamout DECIMAL(10, 2);
  
  INSERT INTO Insurance_plan (planid, Insurance_id, Premium_amount, Coverage_amount) VALUES
(1, 1, '15000.00 ', '500000.00 '),
(2, 1, '20000.00 ', '750000.00 '),
(3, 1, '12000.00', '400000.00 '),
(4, 1, '18000.00 ', '600000.00 '),
(5, 1, '25000.00 ', '100000.00 ');

INSERT INTO Insurance_plan (planid, Insurance_id, Premium_amount, Coverage_amount) VALUES
(6, 2, '15000.00', '55000.00'),
(7, 2, '20000.00', '80000.00'),
(8, 2, '13000.00', '42000.00'),
(9, 2, '19000.00', '63000.00'),
(10, 2, '26000.00', '105000.00');
	