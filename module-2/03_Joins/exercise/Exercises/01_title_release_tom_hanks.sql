-- 1. The titles and release dates of movies that Tom Hanks has appeared in (47 rows)

SELECT 
	title, release_date
FROM 
	movie AS M
	JOIN movie_actor AS ma ON M.movie_id = ma.movie_id
	JOIN person AS P ON P.person_id = ma.actor_id
WHERE
	person_name LIKE 'Tom Hanks';