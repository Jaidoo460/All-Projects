-- 3. For all actors with the last name of "Jones", display the actor's name and movie titles they appeared in. Order the results by the actor names (A-Z). (48 rows)

SELECT 
	person_name, M.title

FROM
	person AS P
	JOIN movie_actor AS ma ON P.person_id = ma.actor_id
	INNER JOIN movie AS M ON ma.movie_id = M.movie_id
WHERE
	person_name LIKE '%_Jones' AND person_name NOT LIKE '%-Jones'
GROUP BY
	person_name, M.title
ORDER BY
	person_name, M.title;
