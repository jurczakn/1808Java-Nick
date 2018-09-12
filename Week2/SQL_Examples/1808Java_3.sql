CREATE OR REPLACE FUNCTION my_sum(val_a bigint, val_b INTEGER)
RETURNS INTEGER AS $$ -- <--DELIMITER
  BEGIN
    RETURN  val_a + val_b;
  END;
$$ LANGUAGE 'plpgsql';
/

Select my_sum((Select count(*) from "Employee"), 8);

CREATE OR REPLACE FUNCTION new_stored_proc(out ret_val bigint)
AS $$
  BEGIN
    SELECT count(*) INTO ret_val FROM "Employee";
  END;
$$ LANGUAGE 'plpgsql';
/

DO $$
DECLARE
out_val bigint;
BEGIN
  new_stored_proc(out_val);
  INSERT INTO test_table VALUES(out_val, 'works');
  SELECT * FROM test_table;
END; $$
LANGUAGE 'plpgsql';
/
select count(*) from "Employee";

CREATE OR REPLACE FUNCTION change_employee(e_id int, fname varchar, lname varchar)
RETURNS VOID AS $$
BEGIN
  insert into "Employee" VALUES(e_id, lname, fname);
END;
$$ LANGUAGE 'plpgsql';
/
SELECT change_employee(34, 'new2', 'emp2');
SELECT * FROM "Employee";

CREATE OR REPLACE FUNCTION get_emps_pg(e_id int)
RETURNS refcursor AS $$
  DECLARE
   curs refcursor;
  BEGIN
    OPEN curs FOR SELECT "LastName", "FirstName" FROM "Employee" WHERE "EmployeeId" < e_id;
    RETURN curs;
  END;
$$ LANGUAGE 'plpgsql';
/