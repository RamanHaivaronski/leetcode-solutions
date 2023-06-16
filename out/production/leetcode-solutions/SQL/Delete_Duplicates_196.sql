-- delete all the duplicate emails, keeping only one unique email with the smallest id.

DELETE FROM Person
WHERE ID NOT IN
(
    SELECT MIN(ID) AS MaxRecordID
    FROM Person
    GROUP BY email
);

-- MySQL doesn't allow update and select in the same statement