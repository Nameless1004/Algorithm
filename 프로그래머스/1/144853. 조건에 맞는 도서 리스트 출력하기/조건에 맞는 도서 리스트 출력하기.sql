-- 코드를 입력하세요
SELECT BOOK_ID, DATE_FORMAT(PUBLISHED_DATE, "%Y-%m-%d") as PUBLISHED_DATE
FROM BOOK
WHERE (CATEGORY IN ("인문") AND PUBLISHED_DATE LIKE("2021%"))