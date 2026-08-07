# Write your MySQL query statement below
SELECT (SELECT DISTINCT salary from Employee  order by salary DESC limit 1 OFFSET 1)as SecondHighestSalary 

-- Synced seamlessly with LeetHub Pro
-- Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
-- Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna