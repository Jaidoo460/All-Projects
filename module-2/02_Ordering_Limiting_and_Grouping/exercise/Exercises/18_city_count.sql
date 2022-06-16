-- 18. The count of the number of cities (name column 'num_cities') and the state abbreviation for each state and territory (exclude state abbreviation DC).
-- Order the results by state abbreviation.
-- (55 rows)
SELECT COUNT(city_name) state_abbreviation FROM state WHERE state_abbreviation != LIKE '%DC' ORDER BY state_abbreviation 

