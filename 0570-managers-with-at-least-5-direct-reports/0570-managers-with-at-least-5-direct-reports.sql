# Write your MySQL query statement below
SELECT e.name 
FROM Employee e
JOIN Employee s
ON e.id=s.managerId
GROUP BY e.id,e.name
HAVING COUNT(e.id)>=5;

-- Synced seamlessly with LeetHub Pro
-- Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
-- Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna