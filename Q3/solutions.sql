SELECT article.owner_id, owner.owner_name, COUNT ( DISTINCT category_id ) AS "different_category_count"
FROM article
INNER JOIN category_article_mapping
ON category_article_mapping.article_id = article.article_id
INNER JOIN owners
ON article.owner_id=owners.owner_id
GROUP BY owner_id;
