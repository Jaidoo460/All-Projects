-- 5. The titles and release dates of all the movies that are in the Comedy genre. Order the results by release date, earliest to latest. (220 rows)

SELECT
	title, release_date
FROM
	movie AS M
	JOIN movie_genre AS mg ON M.movie_id = mg.movie_id
	JOIN genre AS G ON mg.genre_id = G.genre_id
WHERE
	genre_name = 'Comedy'
ORDER BY
	release_date;

