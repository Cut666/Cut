										-- Quan hệ 1-1
-- create table account (
-- 	id int primary key auto_increment,
--     username varchar(250), 
--     full_name varchar(250), 
--     phone varchar(250), 
--     email varchar(250), 
--     created_date date
-- );

-- create table address (
-- 	id int primary key auto_increment, 
--     address varchar(250), 
--     created_date date,
--     account_id int unique,
--     foreign key (account_id) references account (id)
-- );

-- insert into quan_ly_kho.account (username, full_name, phone, email, created_date) values 
-- ('thai1','phạm1','0123456789', 'phamthai123@gmail.com', '2020-02-20'), 
-- ('thai2','phạm2','0123456789', 'phamthai123@gmail.com', '2020-02-20'),
-- ('thai3','phạm3','0123456789', 'phamthai123@gmail.com', '2020-02-20'),
-- ('thai4','phạm4','0123456789', 'phamthai123@gmail.com', '2020-02-20'),
-- ('thai5','phạm5','0123456789', 'phamthai123@gmail.com', '2020-02-20'),
-- ('thai6','phạm6','0123456789', 'phamthai123@gmail.com', '2020-02-20'),
-- ('thai7','phạm7','0123456789', 'phamthai123@gmail.com', '2020-02-20'),
-- ('thai8','phạm8','0123456789', 'phamthai123@gmail.com', '2020-02-20'),
-- ('thai9','phạm9','0123456789', 'phamthai123@gmail.com', '2020-02-20'),
-- ('thai10','phạm10','0123456789', 'phamthai123@gmail.com', '2020-02-20');
-- insert into address (address, created_date,account_id ) values
-- ('HN1','2021-12-21',1),
-- ('HN2','2021-12-21',3),
-- ('HN3','2021-12-21',5),
-- ('HN4','2021-12-21',2),
-- ('HN5','2021-12-21',4),
-- ('HN6','2021-12-21',10),
-- ('HN7','2021-12-21',8),
-- ('HN8','2021-12-21',9),
-- ('HN9','2021-12-21',6),
-- ('HN10','2021-12-21',7);

-- select account.id, username, full_name, phone, email, account.created_date, address from account join address 
-- on account.id = address.account_id;

-- drop table account, address;

										-- Quan hệ 1-N
-- create table account (
-- 	id int primary key auto_increment,
--     username varchar(250), 
--     full_name varchar(250), 
--     phone varchar(250), 
--     email varchar(250), 
--     created_date date
-- );

-- create table address (
-- 	id int primary key auto_increment, 
--     address varchar(250), 
--     created_date date,
--     account_id int,
--     foreign key (account_id) references account (id)
-- );

-- insert into quan_ly_kho.account (username, full_name, phone, email, created_date) values 
-- ('thai1','phạm1','0123456789', 'phamthai123@gmail.com', '2020-02-20'), 
-- ('thai2','phạm2','0123456789', 'phamthai123@gmail.com', '2020-02-20'),
-- ('thai3','phạm3','0123456789', 'phamthai123@gmail.com', '2020-02-20'),
-- ('thai4','phạm4','0123456789', 'phamthai123@gmail.com', '2020-02-20'),
-- ('thai5','phạm5','0123456789', 'phamthai123@gmail.com', '2020-02-20'),
-- ('thai6','phạm6','0123456789', 'phamthai123@gmail.com', '2020-02-20'),
-- ('thai7','phạm7','0123456789', 'phamthai123@gmail.com', '2020-02-20'),
-- ('thai8','phạm8','0123456789', 'phamthai123@gmail.com', '2020-02-20'),
-- ('thai9','phạm9','0123456789', 'phamthai123@gmail.com', '2020-02-20'),
-- ('thai10','phạm10','0123456789', 'phamthai123@gmail.com', '2020-02-20');
-- insert into address (address, created_date,account_id ) values
-- ('HN1','2021-12-21',1),
-- ('HN2','2021-12-21',2),
-- ('HN3','2021-12-21',2),
-- ('HN4','2021-12-21',4),
-- ('HN5','2021-12-21',4),
-- ('HN6','2021-12-21',10),
-- ('HN7','2021-12-21',10),
-- ('HN8','2021-12-21',7),
-- ('HN9','2021-12-21',6),
-- ('HN10','2021-12-21',7);

-- select address.id, username, full_name, phone, email, account.created_date, address from account join address 
-- on account.id = address.account_id;

-- drop table account, address;


										-- quan hệ N-N
-- create table account (
-- 	id int primary key auto_increment,
--     username varchar(250), 
--     full_name varchar(250), 
--     phone varchar(250), 
--     email varchar(250), 
--     created_date date
-- );

-- create table address (
-- 	id int primary key auto_increment, 
--     address varchar(250), 
--     created_date date,
--     account_id int
-- );

-- create table account_address(
-- 	account_id int,
--     address_id int,
--     foreign key (account_id)  references account(id),
--     foreign key (address_id) references address(id)
-- );

-- insert into quan_ly_kho.account (username, full_name, phone, email, created_date) values 
-- ('thai1','phạm1','0123456789', 'phamthai123@gmail.com', '2020-02-20'), 
-- ('thai2','phạm2','0123456789', 'phamthai123@gmail.com', '2020-02-20'),
-- ('thai3','phạm3','0123456789', 'phamthai123@gmail.com', '2020-02-20'),
-- ('thai4','phạm4','0123456789', 'phamthai123@gmail.com', '2020-02-20'),
-- ('thai5','phạm5','0123456789', 'phamthai123@gmail.com', '2020-02-20'),
-- ('thai6','phạm6','0123456789', 'phamthai123@gmail.com', '2020-02-20'),
-- ('thai7','phạm7','0123456789', 'phamthai123@gmail.com', '2020-02-20'),
-- ('thai8','phạm8','0123456789', 'phamthai123@gmail.com', '2020-02-20'),
-- ('thai9','phạm9','0123456789', 'phamthai123@gmail.com', '2020-02-20'),
-- ('thai10','phạm10','0123456789', 'phamthai123@gmail.com', '2020-02-20');
-- insert into address (address, created_date) values
-- ('HN1','2021-12-21'),
-- ('HN2','2021-12-21'),
-- ('HN3','2021-12-21'),
-- ('HN4','2021-12-21'),
-- ('HN5','2021-12-21'),
-- ('HN6','2021-12-21'),
-- ('HN7','2021-12-21'),
-- ('HN8','2021-12-21'),
-- ('HN9','2021-12-21'),
-- ('HN10','2021-12-21');
-- insert into account_address (account_id, address_id) values 
-- (1,1),
-- (1,2),
-- (1,3),
-- (2,3),
-- (2,1),
-- (3,3),
-- (3,2),
-- (4,5),
-- (4,8),
-- (5,8),
-- (6,10),
-- (7,10),
-- (8,8),
-- (9,9),
-- (8,9);


-- select address.id, username, full_name, phone, email, account.created_date, address 
-- from account 
-- join account_address 
-- on account.id = account_address.account_id
-- join address
-- on address.id = account_address.address_id;

-- drop table account_address, account,address;


												-- CASCADE 
-- create table account (
-- 	id int primary key auto_increment,
--     username varchar(250), 
--     full_name varchar(250), 
--     phone varchar(250), 
--     email varchar(250), 
--     created_date date
-- );

-- create table address (
-- 	id int primary key auto_increment, 
--     address varchar(250), 
--     created_date date,
--     account_id int unique,
--     foreign key (account_id) references account (id) on delete cascade  on update cascade
-- );

-- insert into quan_ly_kho.account (username, full_name, phone, email, created_date) values 
-- ('thai1','phạm1','0123456789', 'phamthai123@gmail.com', '2020-02-20');
-- insert into address (address, created_date,account_id) values
-- ('HN1','2021-12-21',2);

-- delete from account where account.id=1
-- update account set id=5
-- where id=2;

 





