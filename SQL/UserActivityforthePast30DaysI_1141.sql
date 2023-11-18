SELECT activity_date as day, count(DISTINCT(user_id)) as active_users
FROM Activity
GROUP BY day
HAVING day BETWEEN '2019-06-28' AND '2019-07-27';