SELECT DISTINCT num AS ConsecutiveNums
FROM Logs s
WHERE num = (SELECT num
            FROM Logs t
            WHERE s.id = t.id + 1
            AND t.num = (SELECT num
                        FROM Logs q
                        WHERE s.id = q.id +2 AND t.id = q.id + 1));