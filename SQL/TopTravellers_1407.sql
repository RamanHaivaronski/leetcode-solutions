SELECT u.name, if(sum(distance), sum(distance), 0) AS travelled_distance
FROM Users u
LEFT JOIN Rides r ON u.id = r.user_id
GROUP BY u.id
ORDER BY travelled_distance DESC, u.name ASC;

SELECT name,COALESCE(SUM(distance),0) AS travelled_distance
FROM Users U
LEFT JOIN rides R ON U.id=R.user_id
GROUP BY R.user_id, name
ORDER BY travelled_distance DESC, name ASC