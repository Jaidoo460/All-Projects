-- 12. The titles of the movies in the "Star Wars Collection" that weren't directed by George Lucas (5 rows)

SELECT 
	M.title 
FROM 
	collection AS C 
	JOIN movie AS M ON C.collection_id = M.collection_id 
	JOIN person AS P ON M.director_id = P.person_id 
WHERE 
	C.collection_name = 'Star Wars Collection' AND 
	P.person_name != 'George Lucas';