SELECT author_id as id
FROM Views
WHERE author_id = viewer_id
GROUP BY author_id
HAVING COUNT(author_id) >= 1
ORDER BY id ASC;