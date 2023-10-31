SELECT s.score,
    (
        SELECT count(DISTINCT (d.score)) + 1
        FROM Scores d
        WHERE d.score > s.score
    ) AS 'rank'
FROM Scores s
ORDER BY s.score DESC;