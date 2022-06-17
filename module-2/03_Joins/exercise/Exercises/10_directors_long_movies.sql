-- 10. The names of directors who have directed a movie over 3 hours [180 minutes] (15 rows)

SELECT DISTINCT
	person_name
FROM
	movie AS M
	JOIN person AS P ON M.director_id = P.person_id
WHERE
	length_minutes > 180;