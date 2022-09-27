	CREATE DATABASE ASSIGNMENT_DB CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci';
	USE ASSIGNMENT_DB;

	CREATE TABLE `USER` (
		id VARCHAR(40) NOT NULL PRIMARY KEY,
		fullname VARCHAR(40),
		email VARCHAR(50),
		pswd VARCHAR(50) DEFAULT '1',
		roles VARCHAR(40)
	) ENGINE=INNODB;


	CREATE TABLE INVOICE (
		id VARCHAR(40) NOT NULL PRIMARY KEY,
		employee_id VARCHAR(40),
		customer_id VARCHAR(40),
		detailProduct VARCHAR(40),
		totalPrice INT,
		`status` VARCHAR(30)
	) ENGINE=INNODB;


	ALTER TABLE INVOICE ADD CONSTRAINT INVOICE_EMPLOYEE_FK FOREIGN KEY(employee_id) REFERENCES `USER`(id);
	ALTER TABLE INVOICE ADD CONSTRAINT INVOICE_CUSTOMER_FK FOREIGN KEY(customer_id) REFERENCES `USER`(id);

	-- insert dummy data for employee table

	INSERT INTO `USER` (id, fullname, email, pswd, roles)
	VALUES ('692877f4-c173-44a0-bf78-471c4e061179',
			'Employee A',
			'employeeA@gmail.com',
			'1',
			'ROLE_EMPLOYEE');
	INSERT INTO `USER` (id, fullname, email, pswd, roles)
	VALUES ('2dd03211-11fb-465a-9fea-690811322f1b',
			'Employee B',
			'employeeB@gmail.com',
			'1',
			'ROLE_EMPLOYEE');
	INSERT INTO `USER` (id, fullname, email, pswd, roles)
	VALUES ('f90d3caf-10fd-4382-9935-a31a8e79568a',
			'Employee C',
			'employeeC@gmail.com',
			'1',
			'ROLE_EMPLOYEE');
			
	-- insert dummy data for customer table
	INSERT INTO `USER` (id, fullname, email, pswd, roles)
	VALUES ('e5bc4dcb-af74-41e4-8f88-cb37af75ed98',
			'Customer A',
			'customerA@gmail.com',
			'1',
			'ROLE_CUSTOMER');
	INSERT INTO `USER` (id, fullname, email, pswd, roles)
	VALUES ('d951675a-18b3-4112-bff6-cbcc7290448b',
			'Customer B',
			'customerB@gmail.com',
			'1',
			'ROLE_CUSTOMER');
			
	-- inser dummy data for invoice table
	INSERT INTO INVOICE (id, employee_id, customer_id, detailProduct, totalPrice, `status`)
	VALUES ('32470453-8948-436f-ad17-820554ac9034',
			'692877f4-c173-44a0-bf78-471c4e061179',
			'e5bc4dcb-af74-41e4-8f88-cb37af75ed98',
			'1 product A, 2 product B, 3 product C',
			450789,
			'Deliveried');
	INSERT INTO INVOICE (id, employee_id, customer_id, detailProduct, totalPrice, `status`)
	VALUES ('7b977e6d-0dfb-472d-87dc-f7d1233b765c',
			'2dd03211-11fb-465a-9fea-690811322f1b',
			'd951675a-18b3-4112-bff6-cbcc7290448b',
			'2 product A, 2 product C, 4 product D',
			1230000,
			'In Handling');
	INSERT INTO INVOICE (id, employee_id, customer_id, detailProduct, totalPrice, `status`)
	VALUES ('a09d55d8-ffc7-4f9d-8b89-72a8839cb849',
			'2dd03211-11fb-465a-9fea-690811322f1b',
			'd951675a-18b3-4112-bff6-cbcc7290448b',
			'1 product A, 3 product B',
			670000,
			'Shipping');
DELIMITER $	
CREATE PROCEDURE GET_ALL_USERS()
BEGIN
	SELECT * FROM `USER`;
END $
DELIMITER ;
    

                