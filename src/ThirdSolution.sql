-- Даны две таблицы, employee(id/name/dep_id) и department(id/name)
-- 1. Вывести данные "Название департамента - Имя сотрудников этого департамента"
-- 2. Вывести айди тех департаментов, в которых работает больше трех сотрудников


-- 1
SELECT d.name, string_agg(e.name, ', ')
FROM department d
         LEFT JOIN employee e ON d.id = e.dep_id
GROUP BY d.name


-- 2
SELECT dep_id
FROM employee
WHERE dep_id IN (SELECT dep_id
                 FROM employee
                 GROUP BY dep_id
                 HAVING COUNT(*) > 3)
GROUP BY dep_id


