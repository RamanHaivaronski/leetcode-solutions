-- find the customer_number for the customer who has placed the largest number of orders

SELECT customer_number
FROM orders
GROUP BY customer_number
ORDER BY COUNT(*) DESC
LIMIT 1;