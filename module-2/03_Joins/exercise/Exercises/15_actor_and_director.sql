-- 15. The title of the movie and the name of director for movies where the director was also an actor in the same movie (73 rows)

SELECT
	title, person_name
FROM
	movie AS M
	JOIN movie_actor AS ma ON M.movie_id = ma.movie_id
	JOIN person AS P ON ma.actor_id = P.person_id
WHERE 
	actor_id = director_id;
