DROP database INSURANCE;
CREATE database INSURANCE;
use INSURANCE;

 

CREATE TABLE Insurance_Details (
    Insurance_id INT AUTO_INCREMENT PRIMARY KEY,
    Insurance_Name VARCHAR(255),
    Type VARCHAR(255) ,
    PremiumStart DATE ,
    PremiumEnd DATE,
    MinPeriod INT ,
    MaxPeriod INT,
    LaunchDate DATE ,
    Status VARCHAR(255) 
);

 

 

INSERT INTO Insurance_Details (Insurance_Name, Type, PremiumStart, PremiumEnd, MinPeriod, MaxPeriod, LaunchDate, Status)
VALUES
    ('Health Insurance', 'Medical','2023-03-15', '2029-07-15',7,60, '2023-01-15', 'Active'),
    ('Auto Insurance', 'Vehicle', '2023-04-16', '2035-09-16', 6, 36, '2023-02-10', 'Active'),
    ('Home Insurance', 'Property', '2023-05-17', '2029-07-17', 12, 120, '2023-03-20', 'Inactive');


    CREATE TABLE Customer_Details (
    Cust_ID INT AUTO_INCREMENT PRIMARY KEY,
    FirstName VARCHAR(255),
    LastName VARCHAR(255),
    Gender ENUM('Male', 'Female', 'Other'),
    DateOfBirth DATE,
    UserName VARCHAR(255) ,
    PassCode VARCHAR(255) ,
    Status ENUM('Active', 'Inactive') 
);

alter table Customer_Details
add column email varchar(50);

 

INSERT INTO Customer_Details (FirstName, LastName, Gender, DateOfBirth, UserName, PassCode, Status)
VALUES ('John', 'Doe', 'Male', '1990-03-15', 'johndoe', 'password123', 'Active'),
('Jane', 'Smith', 'Female', '1995-07-22', 'janesmith', 'securepass', 'Active'),
('Michael', 'Johnson', 'Male', '1988-11-05', 'michaelj', 'mysecretpw', 'Inactive'),
('Emily', 'Williams', 'Female', '1992-04-30', 'emilyw', 'pass1234', 'Active'),
('David', 'Brown', 'Male', '1998-09-10', 'davidbrown', 'p@ssw0rd', 'Active');

ALTER TABLE Customer_Details
ADD INDEX idx_cust_id (Cust_ID),
ADD INDEX idx_username (UserName);

use insurance;
alter table Customer_Authorization modify otp varchar(20);
drop table Customer_Authorization;
CREATE TABLE Customer_Authorization (
    Auth_ID INT AUTO_INCREMENT PRIMARY KEY,
    Cust_ID INT,
    UserName varchar(250),
    passcode varchar(250),
    Otp int(60),
    Status VARCHAR(300)
  
);

 

INSERT INTO Customer_Authorization (Cust_ID, Otp, Status) VALUES
(1, '123456', 'Approved'),
(2, '987654', 'Pending'),
(3, '567890', 'Rejected'),
(4, '456789', 'Pending'),
(5, '321654', 'Approved');

 

CREATE TABLE Customer_Policy (
    PolicyId INT AUTO_INCREMENT  PRIMARY KEY,
    Cust_Id INT REFERENCES Customer,
    Insurance_id INT REFERENCES Insurance,
    InsuranceAmount DECIMAL(10, 2), -- Adjust precision and scale as needed
    PayMode ENUM('MONTHLY', 'QUARTERLY', 'HALFYEARLY', 'YEARLY'),
    InitialAmount DECIMAL(10, 2), -- Adjust precision and scale as needed
    RegisterDate DATE

);

 

INSERT INTO Customer_Policy (Cust_Id, Insurance_id, InsuranceAmount, PayMode, InitialAmount, RegisterDate)
VALUES (1, 101, 1500.00, 'MONTHLY', 200.00, '2023-10-20'),
(2, 102, 2500.00, 'QUARTERLY', 400.00, '2023-10-21'),
(3, 103, 3500.00, 'HALFYEARLY', 600.00, '2023-10-22'),
(4, 104, 4500.00, 'YEARLY', 800.00, '2023-10-23'),
(5, 105, 5500.00, 'MONTHLY', 1000.00, '2023-10-24');