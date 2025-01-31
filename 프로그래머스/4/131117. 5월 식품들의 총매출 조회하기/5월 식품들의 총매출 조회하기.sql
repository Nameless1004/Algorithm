SELECT A.PRODUCT_ID, A.PRODUCT_NAME, A.PRICE * B.TOTAL_AMT AS TOTAL_SALES
FROM FOOD_PRODUCT A INNER JOIN (
    SELECT PRODUCE_DATE, PRODUCT_ID, SUM(AMOUNT) TOTAL_AMT
    FROM FOOD_ORDER
    WHERE PRODUCE_DATE LIKE "2022-05%"
    GROUP BY PRODUCT_ID
) B ON A.PRODUCT_ID = B.PRODUCT_ID
ORDER BY TOTAL_SALES DESC, PRODUCT_ID ASC