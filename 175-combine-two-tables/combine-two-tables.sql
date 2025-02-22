-- Write your PostgreSQL query statement below
select firstName as "firstName", lastName as "lastName", city, state from Person LEFT JOIN Address ON Person.personId = Address.personId;