-- 2. The names and birthdays of actors in "The Fifth Element" (15 rows)

SELECT 
	person_name, birthday
FROM
	person AS P
	JOIN movie_actor AS ma ON P.person_id = ma.actor_id
	JOIN movie AS m ON ma.movie_id = M.movie_id
WHERE
	title = 'The Fifth Element';
