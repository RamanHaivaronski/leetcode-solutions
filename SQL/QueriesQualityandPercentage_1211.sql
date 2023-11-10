SELECT  query_name,
        ROUND(SUM(rating / position) / COUNT(query_name), 2) as quality,
        ROUND(AVG(rating < 3) * 100, 2) as poor_query_percentage
FROM Queries
GROUP BY query_name;