-- 7. The genres of movies that Christopher Lloyd has appeared in (8 rows)
-- Hint: DISTINCT will prevent duplicate values in your query results.

SELECT Distinct 
	genre_name, person_name 
FROM 
	genre
	JOIN movie_genre ON genre.genre_id = movie_genre.genre_id 
	JOIN movie ON movie_genre.movie_id = movie.movie_id 
	JOIN person ON movie.director_id = person.person_id 
WHERE person_name = 'Christopher Lloyd';