-- ORDERING RESULTS

-- Populations of all states from largest to smallest.
SELECT
	stste_name, population
FROM

-- States sorted alphabetically (A-Z) within their census region. The census regions are sorted in reverse alphabetical (Z-A) order.


-- The biggest park by area

--THE DIRECT APPROACH
SELECT * FROM park ORDER BY area DESC LIMIT 1;

--AGRREGATE -GENERATES A SINGLE (SCALAR ) VALUE
SELECT MAX(area) FROM park;

--USING A SUB-QUERY IN PLACE OF A VALUE
SELECT
	*
FROM
	park
WHERE
	area = (SELECT MAX(area) FROM park);


-- LIMITING RESULTS

-- The 10 largest cities by populations

SELECT
	*
FROM
	city
ORDER BY
	population DESC
LIMIT 10;

-- The 20 oldest parks from oldest to youngest in years, sorted alphabetically by name.
SELECT 
	* 
FROM 
	park
ORDER BY
	date_established, park_name
LIMIT 20;



-- CONCATENATING OUTPUTS

-- All city names and their state abbreviation.

SELECT 
	city_name || ', ' || state_abbreviation AS city_state
FROM
	city;

-- The all parks by name and date established.

SELECT 
	park_name || ' - ' || dtae_established AS park_date
FROM
	park;

-- The census region and state name of all states in the West & Midwest sorted in ascending order.

SELECT
	census_region || ' ' || state_name AS census_state
FROM
	state
WHERE
	census_region IN ('West', 'Midwest')
ORDER BY
	census_region, state_name;
	
-- AGGREGATE FUNCTIONS

-- Average population across all the states. Note the use of alias, common with aggregated values.
SELECT
	AVG(population) AS avg_state_population
FROM
	state;

-- Total population in the West and South census regions
SELECT
	SUM(population) AS west_south_population
FROM
	state
WHERE
	census_region IN ('West', 'South');
	--census_region = 'West' OR census_region ='South';
	

-- The number of cities with populations greater than 1 million
SELECT
	COUNT(population) AS million_city_count
FROM
	city
WHERE
	population > 1000000;


-- The number of state nicknames.

SELECT
	COUNT(state_nickname) AS name_count, COUNT(*) AS row_count
FROM
	state;

-- The area of the smallest and largest parks.
SELECT
	MIN(area) AS smallest_area, MAX(area) AS largest_area
FROM
	park
WHERE
	area = (SELECT MIN(area) FROM park)
	OR
	area = (SELECT MAX(area) FROM park);
	



-- GROUP BY

-- Count the number of cities in each state, ordered from most cities to least.
SELECT
	state_abbreviation, count(city_name) AS city_count
FROM
	city
GROUP BY
	state_abbreviation
ORDER BY
	city_count DESC;

-- Determine the average park area depending upon whether parks allow camping or not.

SELECT
	has_camping AS camping_allowed, AVG(area) AS park_area
FROM
	park
GROUP BY
	has_camping;

-- Sum of the population of cities in each state ordered by state abbreviation.

SELECT
	state_abbreviation, SUM(population) AS state_population
FROM
	city
GROUP BY
	state_abbreviation
ORDER BY
	state_abbreviation;

-- The smallest city population in each state ordered by city population.
SELECT
	state_abbreviation, MIN(population) AS smallest_city_pop
FROM
	city
GROUP BY
	state_abbreviation
ORDER BY
	smallest_city_pop;


-- Miscelleneous

-- While you can use LIMIT to limit the number of results returned by a query,
-- it's recommended to use OFFSET and FETCH if you want to get
-- "pages" of results.
-- For instance, to get the first 10 rows in the city table
-- ordered by the name, you could use the following query.
-- (Skip 0 rows, and return only the first 10 rows from the sorted result set.)

SELECT city_name, population FROM city ORDER BY city_name
LIMIT 10;

SELECT city_name, population FROM city ORDER BY city_name
OFFSET (10 * 2) ROWS FETCH NEXT 10 ROWS ONLY;

-- SUBQUERIES (optional)

-- Include state name rather than the state abbreviation while counting the number of cities in each state,

---SHOW ME THE CENSUS_REGION THAT HAVE CITIES WITH MORE THAN 1,000,000 PEOPLE

SELECT census_region FROM state WHERE state_abbreviation IN ('ak', 'pa', 'tx')

SELECT state_abbreviation FROM city WHERE population > 1000000;

SELECT DISTINCT census_region FROM state WHERE state_abbreviation IN (SELECT state_abbreviation FROM city WHERE population > 1000000);


-- Include the names of the smallest and largest parks


-- List the capital cities for the states in the Northeast census region.

