# Write your MySQL query statement below
SELECT p.product_name,SUM(o.unit) AS 'unit'
FROM Products p
JOIN Orders o ON p.product_id = o.product_id
WHERE o.order_date LIKE "2020-02-%"
GROUP BY p.product_name
HAVING SUM(o.unit)>=100;

-- Synced seamlessly with LeetHub Pro
-- Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
-- Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna