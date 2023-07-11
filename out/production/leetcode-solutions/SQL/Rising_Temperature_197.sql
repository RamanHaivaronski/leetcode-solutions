-- Write an SQL query to find all dates' Id with higher temperatures
-- compared to its previous dates (yesterday).

-- pass for sorted table
SELECT w.id FROM Weather w, Weather s
WHERE w.temperature > s.temperature AND w.id = s.id + 1;

SELECT w.id AS Id FROM Weather w, Weather s
WHERE w.temperature > s.temperature AND DATEDIFF(w.recordDate, s.recordDate) = 1;