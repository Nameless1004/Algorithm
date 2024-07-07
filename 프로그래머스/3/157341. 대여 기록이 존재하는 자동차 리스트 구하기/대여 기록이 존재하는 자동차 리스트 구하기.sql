SELECT a.CAR_ID
from CAR_RENTAL_COMPANY_CAR a inner join CAR_RENTAL_COMPANY_RENTAL_HISTORY b
on a.CAR_ID = b.CAR_ID
where a.CAR_TYPE = '세단' AND DATE_FORMAT(b.START_DATE, '%m') = 10
group by a.CAR_ID
order by a.CAR_ID desc