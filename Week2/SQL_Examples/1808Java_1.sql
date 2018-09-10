select * from "Employee";
select "FirstName", "LastName" from "Employee";
select "FirstName", "LastName" from "Employee" where "FirstName" = 'Nancy';
insert into "Employee" ("EmployeeId", "LastName", "FirstName" ,"Email")
Values (12, 'Seniors', 'Nancy', 'nancy.seniors@gmail.com');
delete from "Employee" where "EmployeeId" = 12;
update "Employee" set "Email" = 'nancy.juniors@gmail.com' where "EmployeeId" = 10;
select * from "Employee" order by "EmployeeId" asc;
select * from "Employee" order by "FirstName", "LastName" asc;
select "EmployeeId" from "Employee" where "FirstName" = 'Andrew';
select concat("FirstName", concat(' ', "LastName")) as "FullName" from "Employee" where "ReportsTo" = 
(select "EmployeeId" from "Employee" where "FirstName" = 'Andrew');
select upper(concat("FirstName", concat(' ', "LastName"))) as "FullName" from "Employee";
select count("EmployeeId") from "Employee";
create sequence EMPLOYEE_ID_SEQ start 12;
insert into "Employee" values((select nextval('EMPLOYEE_ID_SEQ')), 'Jurczak', 'Nick');
