-- 11. The titles of the movies in the "Star Wars Collection" ordered by release date, most recent to earliest (9 rows)

SELECT 
	M.title 
FROM 
	movie M 
	JOIN collection C ON m.collection_id = C.collection_id 
WHERE 
	C.collection_name = 'Star Wars Collection' 
ORDER BY 
	M.release_date DESC;