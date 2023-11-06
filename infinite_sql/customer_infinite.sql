create database customer_details;

use customer_details;

create table customer(
  cust_ID int(5) primary key auto_increment,
  customer_firstname varchar(30),
  customer_lastname varchar(30),
  customer_UserName varchar(30),
  customer_password varchar(200),
  customer_Email varchar(30),
  customer_PhoneNo varchar(15),
  Customer_Status varchar(20),
  Customer_ActivatedOn Date
);

create table otp(
   otp_id int(5) primary key auto_increment,
   Cust_ID int(5),
   customer_UserName varchar(30),
   OtpCode varchar(10),
   GeneratedOn date,
   foreign key(cust_id) references customer(cust_id)
);

CREATE TABLE reset_password_requests (
    request_id INT AUTO_INCREMENT PRIMARY KEY,
    customer_id INT,
    request_code VARCHAR(10),
    request_timestamp TIMESTAMP,
    FOREIGN KEY (customer_id) REFERENCES customer(cust_id)
);


select * from customer;