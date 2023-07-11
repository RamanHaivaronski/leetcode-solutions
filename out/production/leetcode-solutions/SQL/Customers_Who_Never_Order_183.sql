-- Write an SQL query to report all customers who never order anything.

SELECT c.name AS Customers FROM Customers c
WHERE c.id NOT IN (SELECT o.customerId FROM Orders o);

SELECT Name AS Customers FROM CUSTOMERS
LEFT JOIN ORDERS
ON ORDERS.CustomerID = Customers.Id
WHERE Orders.CustomerID IS NULL;