create database attendance_db;
use attendance_db;
create table Employee(emp_id int,emp_name varchar(50),department varchar(30));
create table Attendence (attendance_id int,emp_id int,attendance_date date,is_present boolean);
insert into Employee values(4455,'Dipak Jadhav','Testing Dept'),(4455,'Abhijit Holey','IT Dept');
insert into Employee values(7545,'Kshitij','Software Dept'),(5855,'Nayan Wankhade','Hardware Dept');
insert into Attendence values (101,4455,'2026-01-13',true),(102,4455,'2026-01-13',false),(103,7545,'2026-01-13',true),(104,5855,'2026-01-13',false);
select*from Attendence;
select*from Employee;

