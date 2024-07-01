SELECT ORDER_ID, PRODUCT_ID, DATE_FORMAT(OUT_DATE,"%Y-%m-%d") as OUT_DATE, CASE when DATE_FORMAT(out_date, '2022-%m-%d') <= "2022-05-01" THEN '출고완료' when DATE_FORMAT(out_date, '2022-%m-%d') >= "2022-05-02" then '출고대기' when OUT_DATE IS NULL THEN '출고미정' End AS '출고여부'
FROM FOOD_ORDER
ORDER BY ORDER_ID