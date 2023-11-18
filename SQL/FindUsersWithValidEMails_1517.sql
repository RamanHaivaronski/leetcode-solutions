--mysql
SELECT *
FROM Users
WHERE mail REGEXP '^[a-zA-Z][a-zAZ0-9_.-]*@leetcode[.]com'

--posgres/oracle
select *
from Users
where regexp_like(mail,'^[A-Za-z]{1}[A-Za-z0-9_.-]*@leetcode[.]com$');