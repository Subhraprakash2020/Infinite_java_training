use hospital_management;

SELECT pm.*
FROM PATIENT_MASTER pm
JOIN ROOM_ALLOCATION ra ON pm.pid = ra.pid
WHERE YEAR(ra.admission_date) = 2017 AND MONTH(ra.admission_date) = 1;

SELECT *
FROM PATIENT_MASTER
WHERE Gender = 'F' AND Disease <> 'Asthma';

SELECT Gender, COUNT(*) AS TotalPatients
FROM PATIENT_MASTER
GROUP BY Gender;

SELECT pm.pid AS patient_id,pm.name AS patient_name,pm.doctor_id AS doctor_id,dm.doctor_name AS doctor_name,ra.room_no AS room_no,
    rm.room_type AS room_type,
    ra.admission_date AS admission_date
FROM PATIENT_MASTER pm
INNER JOIN ROOM_ALLOCATION ra ON pm.pid = ra.pid
INNER JOIN doctor_master dm ON pm.doctor_id = dm.doctor_id
INNER JOIN room_master rm ON ra.room_no = rm.room_no;


SELECT room_no FROM ROOM_MASTER 
WHERE room_no = any (SELECT room_no FROM ROOM_ALLOCATION);

SELECT room_no
FROM ROOM_ALLOCATION
GROUP BY room_no
HAVING COUNT(*) > 1;



