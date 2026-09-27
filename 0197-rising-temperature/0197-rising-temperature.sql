select b.id from Weather as a
join Weather as b
on DATEDIFF(b.recordDate, a.recordDate) =1
AND b.temperature > a.temperature