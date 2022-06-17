-- 6. The genres of "The Wizard of Oz" (3 rows)

SELECT
	genre_name
FROM
	genre AS G
	JOIN movie_genre AS mg ON G.genre_id = mg.genre_id
	JOIN movie AS M ON mg.movie_id = M.movie_id

WHERE
	title = 'The Wizard of Oz';
