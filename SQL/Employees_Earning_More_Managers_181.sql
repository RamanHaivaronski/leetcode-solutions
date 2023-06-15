-- select workers that earn more than their managers

SELECT Name AS Employee FROM Employee e
WHERE salary > (
    SELECT salary FROM Employee f
    Where  f.id = e.managerId
);