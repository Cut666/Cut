										-- câu 1
-- drop table if exists Customers, Orders;
-- create table Customers (
-- 	customer_id int primary key auto_increment,
--     firt_name varchar(50)
-- );
-- create table Orders (
-- 	order_id int primary key auto_increment,
--     amount int,
--     customer int
-- );

										-- câu 2
-- insert customers (firt_name)values ('John'),('Robert'),('David'),('John'),('Betty');
-- insert orders (amount,customer) values (200,10),(500,3),(300,6),(800,5),(150,8);

										-- câu 3
-- select customer_id, firt_name, amount 
-- from customers left join orders 
-- on customers.customer_id = orders.customer;

										-- câu 4
-- select customer, firt_name, amount 
-- from  customers right join orders
-- on customers.customer_id = orders.customer

										-- câu 5
-- select * 
-- from customers right join orders
-- on customers.customer_id = orders.customer
-- where firt_name is null
-- union
-- select * 
-- from customers left join orders
-- on customers.customer_id = orders.customer

										-- câu 6
-- drop table if exists customers;
-- create table customers (
-- 	customer_id int primary key auto_increment,
--     first_name varchar (100),
--     last_name varchar(100),
--     age tinyint,
--     country varchar(100)
-- );

									-- câu 7
-- insert into customers (first_name, last_name, age, country) values 
-- ('John','Doe',31,'USA'),
-- ('Robert', 'Luna', 22, 'USA'),
-- ('David', 'Robinson',22,'UK'),
-- ('John','Reinhardt',25,'UK'),
-- ('Betty','Doe',28,'UAE')

									-- câu 8
-- select * 
-- from customers
-- where age = (select min(age)from customers)

									-- câu 9
-- drop table if exists paintings;
-- create table paintings (
-- 	id int primary key,
--     name varchar (50),
--     artist_id int,
--     listed_price int
-- );

									-- câu 10
-- insert into paintings (id, name, artist_id,listed_price) values 
-- (11, 'Mirache',1,300),
-- (12,'Sunshine',1,700),
-- (13,'Pretty woman',2,2800),
-- (14,'Handsome man',2,2300),
-- (15,'Barbie',3,250),
-- (16,'Cool painting',3,5000),
-- (17,'Black square#1000',3,50),
-- (18,'Mountains',4,1300);

									-- câu 11
                                   
-- select * 
-- from paintings
-- where paintings.listed_price > (select avg(listed_price) from paintings)