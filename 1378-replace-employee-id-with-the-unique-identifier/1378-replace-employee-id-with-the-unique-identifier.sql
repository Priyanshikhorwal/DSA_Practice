select ue.unique_id ,e.name from
Employees as e Left join EmployeeUNI as ue
on e.id= ue.id
