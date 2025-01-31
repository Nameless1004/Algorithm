
SELECT A.PRODUCT_CODE, SUM(B.SALES_AMOUNT * A.PRICE) AS SALES
FROM PRODUCT A
LEFT JOIN OFFLINE_SALE B
ON A.PRODUCT_ID = B.PRODUCT_ID
WHERE SALES_DATE
GROUP BY A.PRODUCT_ID
ORDER BY SALES DESC, A.PRODUCT_CODE