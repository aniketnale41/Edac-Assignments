
/************* Titan Assignment **************/

/* Question 1  */

select locations.location_id, street_address, city, state_province, countries.country_name
from departments,countries, locations
where departments.LOCATION_ID = locations.LOCATION_ID
And locations.COUNTRY_ID = countries.COUNTRY_ID;

/* question 2 */

select CONCAT(first_name, CONCAT(' ', last_name)) AS NAME, DEPARTMENT_ID from employees ;

/* question 3 */

select CONCAT(first_name, CONCAT(' ', last_name)) AS NAME,Jobs.job_title, employees.department_id 
from employees,jobs,departments,locations
where employees.JOB_ID = jobs.JOB_ID 
and employees.DEPARTMENT_ID = departments.DEPARTMENT_ID
and departments.LOCATION_ID = locations.LOCATION_ID 
and locations.CITY = 'London';

/* question 4 */

SELECT EMPLOYEE_ID, FIRST_NAME, MANAGER_ID, LAST_NAME
FROM EMPLOYEES;

/* question 5 */

select CONCAT(first_name, CONCAT(' ', last_name)) AS NAME, HIRE_DATE from employees 
where hire_date > ( select hire_date from employees where last_name = 'Jones' or First_name = 'Jones') 
order by hire_date;

/* question 6 */

select department_name,  count(employees.employee_id) as 'count' from departments,employees 
where departments.DEPARTMENT_ID = employees.DEPARTMENT_ID
group by DEPARTMENT_NAME order by 1; 

/* question 7  */

select employees.employee_id, jobs.job_title, datediff(end_date,start_date) as days 
from employees,jobs,job_history
where job_history.DEPARTMENT_ID = 90
and jobs.job_id = job_history.job_id
and employees.JOB_ID = job_history.JOB_ID;

/* question 8 */

select  departments.department_id,first_name from departments,employees
where employees.EMPLOYEE_ID = departments.MANAGER_ID
AND employees.DEPARTMENT_ID = departments.DEPARTMENT_ID;

/* question 9 */

select department_name, first_name, last_name, city 
from employees, departments, locations
where employees.DEPARTMENT_ID = departments.DEPARTMENT_ID
and locations.LOCATION_ID = departments.LOCATION_ID
and employees.EMPLOYEE_ID = departments.MANAGER_ID;

/* question 10 */

select job_title, avg (salary) as average
from employees, jobs
where employees.JOB_ID = jobs.JOB_ID
group by job_title;

/* question 11 */

select job_title, first_name, last_name, abs(min_salary-salary)
as difference from employees, jobs
where employees.JOB_ID = jobs.JOB_ID;

/* question  12 */

select employees.FIRST_NAME, employees.SALARY, job_history.EMPLOYEE_ID,job_history.START_DATE, job_history.END_DATE, job_history.JOB_ID, job_history.department_id
from job_history, employees
where employees.EMPLOYEE_ID = job_history.EMPLOYEE_ID
and employees.SALARY > 10000;

/* question  13 */

select department_name , first_name, last_name, hire_date, salary 
from departments, employees 
where departments.DEPARTMENT_ID = employees.DEPARTMENT_ID 
and employees.EMPLOYEE_ID = departments.MANAGER_ID
and (datediff(sysdate(), hire_date)/ 365 ) > 15;

