USE COLLEGE_SYSTEM;

CREATE TABLE PAYMENTS (
    ROLLNO INT(5),
    DP DATE,
    AMOUNT INT(5)
);
-- Inserting payment data
INSERT INTO PAYMENTS (ROLLNO, DP, AMOUNT) 
VALUES 
  (1, '2023-09-20', 1000),
  (2, '2023-09-21', 1500),
  (3, '2023-09-22', 1200),
  (4, '2023-09-23', 800),
  (5, '2023-09-24', 2000);
  
  INSERT INTO PAYMENTS (ROLLNO, DP, AMOUNT) 
VALUES 
 (1, '2023-09-25', 4000),
  (5, '2023-09-25', 3000);

