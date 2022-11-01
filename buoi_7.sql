drop database if exists quan_ly_kho;
create database quan_ly_kho;
use quan_ly_kho;
create table categories (
	id bigint primary key auto_increment,
    category_code varchar(100) not null,
    category_name varchar(100) not null,
    created_date date not null,
    updated_date date not null
);

create table suppliers(
	id bigint primary key auto_increment,
    supplier_code varchar(100)not null,
    supplier_name varchar(100) not null,
    image varchar(100),
    created_date date not null,
    updated_date date not null
);

create table product_discounts(
	id bigint primary key auto_increment,
    discount_name varchar(100) not null,
    discount_amount int not null,
    start_date date not null,
    end_date date not null
);
create table products (
	id bigint primary key auto_increment,
    product_code varchar(100) not null ,
    product_name varchar(100) not null,
    image binary,
    description varchar(100),
    standard_cost int,
    quantity int,
    from_country varchar(100),
	product_unit enum('cái','bộ','quyển','kg') ,
    is_new enum('new','not_new'),
    price int,
    created_date date not null,
    updated_date date not null,
    product_discounts_id bigint,
    categories_id bigint,
    suppliers_id bigint,
    foreign key (suppliers_id) references suppliers(id),
    foreign key (product_discounts_id) references product_discounts (id),
     foreign key ( categories_id) references  categories(id)
);

 create table customers(
	id int primary key auto_increment,
    username varchar(100) not null,
    password varchar(100) not null,
    first_name varchar(100) not null,
    last_name varchar(100) not null,
    gender enum('Male','Female'),
    email varchar(100),
    birthday date,
    avartar varchar(100),
    address varchar(100),
    customers_status varchar(50),
    created_date date not null,
    updated_date date not null
 );

create table product_reviews(
	id int primary key auto_increment,
    rating int not null, 
    comment text not null,
    created_date date not null,
    updated_date date not null,
    customers_id int,
     product_id bigint,
     foreign key (product_id) references products(id),
     foreign key (customers_id) references customers(id)
);

create table orders (
	id int primary key auto_increment,
    quantity int not null,
    price int,
    paid_date date not null,
    customers_id int,
    foreign key (customers_id) references customers(id)
);

create table product_orders (
    product_id bigint,
    orders_id int,
    foreign key (orders_id) references orders (id),
    foreign key (product_id) references products(id)
);

insert into categories (id, category_code, category_name, created_date, updated_date) values (1, '61380-311', 'áo', '2022-11-04', '2022/08/23');
insert into categories (id, category_code, category_name, created_date, updated_date) values (2, '59779-008', 'quần', '2022-11-02', '2022/08/28');
insert into categories (id, category_code, category_name, created_date, updated_date) values (3, '63418-0001', 'váy', '2022-11-02', '2021/11/23');
insert into categories (id, category_code, category_name, created_date, updated_date) values (4, '0781-1446', 'tất', '2022-11-01', '2022/9/10');
insert into categories (id, category_code, category_name, created_date, updated_date) values (5, '68437-010', 'giày', '2022-11-04', '2022/5/24');
insert into categories (id, category_code, category_name, created_date, updated_date) values (6, '67877-170', 'dép', '2022-11-01', '2021/12/24');

insert into suppliers (id, supplier_code, supplier_name, created_date, updated_date) values (1, '65585-508', 'NCC 1', '2022-11-04', '2022/10/8');
insert into suppliers (id, supplier_code, supplier_name, created_date, updated_date) values (2, '0135-0201', 'NCC 2', '2022-11-04', '2022/9/19');
insert into suppliers (id, supplier_code, supplier_name, created_date, updated_date) values (3, '0363-0211', 'NCC 3', '2022-11-01', '2022/2/28');
insert into suppliers (id, supplier_code, supplier_name, created_date, updated_date) values (4, '58118-7927', 'NCC 4', '2022-11-04', '2022/5/26');
insert into suppliers (id, supplier_code, supplier_name, created_date, updated_date) values (5, '67938-1094', 'NCC 5', '2022-11-04', '2022/5/25');
insert into suppliers (id, supplier_code, supplier_name, created_date, updated_date) values (6, '21695-032', 'NCC5', '2022-11-03', '2022/8/23');

insert into product_discounts (id, discount_name, discount_amount, start_date, end_date) values (1, 'KM 1', 34, '2022-11-04', '2022-05-30');
insert into product_discounts (id, discount_name, discount_amount, start_date, end_date) values (2, 'KM 2', 53, '2022-11-03', '2022-04-23');
insert into product_discounts (id, discount_name, discount_amount, start_date, end_date) values (3, 'KM 3', 56, '2022-11-04', '2022-04-17');
insert into product_discounts (id, discount_name, discount_amount, start_date, end_date) values (4, 'KM 4', 53, '2022-11-01', '2022-06-01');
insert into product_discounts (id, discount_name, discount_amount, start_date, end_date) values (5, 'KM 5', 92, '2022-11-01', '2022-02-23');


insert into products (id, product_name, product_code,price,from_country,quantity, created_date, updated_date, product_discounts_id, categories_id, suppliers_id) values (1, 'áo 1', '0268-6403',100000,'VN',50, '2022-11-04', '2021-12-17', 4, 1, 4);
insert into products (id, product_name, product_code,price,from_country,quantity, created_date, updated_date, product_discounts_id, categories_id, suppliers_id) values (2, 'áo 2', '68745-2031', 200000,'VN',50,'2022-11-04', '2022-01-11', 5, 1, 3);
insert into products (id, product_name, product_code,price,from_country,quantity, created_date, updated_date, product_discounts_id, categories_id, suppliers_id) values (3, 'áo 3', '43353-414', 300000,'VN',50,'2022-11-04', '2022-07-13', 3, 1, 6);
insert into products (id, product_name, product_code,price,from_country,quantity, created_date, updated_date, product_discounts_id, categories_id, suppliers_id) values (4, 'quần 1', '0338-0409', 400000,'TQ',50,'2022-11-03', '2022-04-16', 3, 2, 4);
insert into products (id, product_name, product_code,price,from_country,quantity, created_date, updated_date, product_discounts_id, categories_id, suppliers_id) values (5, 'quần 2', '57520-0497', 400000,'TQ',100,'2022-11-04', '2021-11-06', 1, 2, 4);
insert into products (id, product_name, product_code,price,from_country,quantity, created_date, updated_date, product_discounts_id, categories_id, suppliers_id) values (6, 'quần 3', '21695-597', 200000,'TQ',100,'2022-11-02', '2022-06-11', 3, 2, 4);
insert into products (id, product_name, product_code,price,from_country,quantity, created_date, updated_date, product_discounts_id, categories_id, suppliers_id) values (7, 'váy 1', '58468-0124', 200000,'TQ',70,'2022-11-03', '2022-03-11', 2, 3, 4);
insert into products (id, product_name, product_code,price,from_country,quantity, created_date, updated_date, product_discounts_id, categories_id, suppliers_id) values (8, 'váy 2', '16590-143', 300000,'TQ',80,'2022-11-04', '2022-08-01', 2, 3, 2);
insert into products (id, product_name, product_code,price,from_country,quantity, created_date, updated_date, product_discounts_id, categories_id, suppliers_id) values (9, 'váy 3', '55319-554', 500000,'TQ',60,'2022-11-03', '2022-01-23', 2, 3, 3);
insert into products (id, product_name, product_code,price,from_country,quantity, created_date, updated_date, product_discounts_id, categories_id, suppliers_id) values (10, 'tất 1', '69124-002', 10000,'TQ',30,'2022-11-02', '2021-11-30', 2, 4, 6);

insert into customers (id, username, password, first_name, last_name,customers_status,created_date, updated_date) values (1, 'tsieve0', '1QLnaW8DVa', 'Tate', 'Sieve', 'guest','2022-01-03', '2022-06-02');
insert into customers (id, username, password, first_name, last_name, customers_status,created_date, updated_date) values (2, 'msharper1', 'EXwqj2xlP', 'Minna', 'Sharper','guest' ,'2022-01-04', '2022-10-08');
insert into customers (id, username, password, first_name, last_name, customers_status,created_date, updated_date) values (3, 'allewellen2', 'NvWPcfd', 'Ade', 'Llewellen', 'member','2022-01-04', '2022-08-23');
insert into customers (id, username, password, first_name, last_name, customers_status,created_date, updated_date) values (4, 'gmatiebe3', 'zO8Zn9WRSWlS', 'Gawen', 'Matiebe','member', '2022-01-04', '2021-12-03');
insert into customers (id, username, password, first_name, last_name,customers_status,created_date, updated_date) values (5, 'gsillis4', 'IIl2cbFQ', 'Genna', 'Sillis', 'member','2022-01-03', '2022-10-11');

insert into product_reviews (id, rating, comment, created_date, updated_date, customers_id,  product_id) values (1, 5, 'Restrict of R Hypogast Vein with Extralum Dev, Perc Approach', '2022-01-01', '2022-06-20', 2, 10);
insert into product_reviews (id, rating, comment, created_date, updated_date, customers_id,  product_id) values (2, 1, 'Drainage of Descend Colon with Drain Dev, Perc Endo Approach', '2022-01-03', '2022-06-19', 2, 9);
insert into product_reviews (id, rating, comment, created_date, updated_date, customers_id,  product_id) values (3, 5, 'Supplement Trigem Nrv with Autol Sub, Perc Endo Approach', '2022-01-02', '2022-07-06', 5, 3);
insert into product_reviews (id, rating, comment, created_date, updated_date, customers_id,  product_id) values (4, 3, 'Excision of Lower Vein, Percutaneous Approach', '2022-01-03', '2022-03-14', 3, 8);
insert into product_reviews (id, rating, comment, created_date, updated_date, customers_id,  product_id) values (5, 1, 'Excision of Left Hip Tendon, Open Approach, Diagnostic', '2022-01-03', '2022-04-01', 1, 1);

insert into orders (id, quantity,  price, paid_date, customers_id) values (1, 10, 20000, '2022-01-04', 1);
insert into orders (id, quantity,  price, paid_date, customers_id) values (2, 6, 40000, '2022-01-04', 4);
insert into orders (id, quantity,  price, paid_date, customers_id) values (3, 4, 300000, '2022-01-02', 2);
insert into orders (id, quantity,  price, paid_date, customers_id) values (4, 10, 1000000, '2022-01-01', 3);
insert into orders (id, quantity,  price, paid_date, customers_id) values (5, 4, 800000, '2022-01-02', 5);
insert into orders (id, quantity,  price, paid_date, customers_id) values (6, 7, 900000, '2022-01-02', 2);

insert into product_orders ( product_id,  orders_id) values (1, 3);
insert into product_orders ( product_id,  orders_id) values (6, 5);
insert into product_orders ( product_id,  orders_id) values (9, 4);
insert into product_orders ( product_id,  orders_id) values (2, 4);
insert into product_orders ( product_id,  orders_id) values (9, 6);
insert into product_orders ( product_id,  orders_id) values (8, 6);
insert into product_orders ( product_id,  orders_id) values (6, 6);
insert into product_orders ( product_id,  orders_id) values (6, 3);
insert into product_orders ( product_id,  orders_id) values (3, 4);
insert into product_orders ( product_id,  orders_id) values (10, 4);
insert into product_orders ( product_id,  orders_id) values (4, 6);
insert into product_orders ( product_id,  orders_id) values (6, 3);
insert into product_orders ( product_id,  orders_id) values (2, 2);
insert into product_orders ( product_id,  orders_id) values (5, 5);
insert into product_orders ( product_id,  orders_id) values (5, 5);

			-- Tìm số hóa đơn đã mua tất cả các sản phẩm do Singapore sản xuất.

-- select orders_id, product_name, supplier_name 
-- 	from  products 
-- 		join suppliers on products.suppliers_id = suppliers_id 
-- 		join product_orders on products.id = product_orders.product_id 
-- where supplier_name = 'Singapore'

			-- Có bao nhiêu hóa đơn không phải của khách hàng đăng ký thành viên mua?
            
-- select count(customers_status) from orders left join customers on orders.customers_id = customers.id
-- where customers_status = 'guest'

			-- Có bao nhiêu sản phẩm khác nhau được bán ra trong năm 2006.	
-- select count(t1.product_id) from
-- (select product_id from product_orders join orders on orders.id = product_orders.orders_id
-- where paid_date between '2006-01-01' and '2006-10-31'
-- group by product_id)as t1


 -- where paid_date between '2006-01-01' and '2006-12-31'

			-- Cho biết trị giá hóa đơn cao nhất, thấp nhất là bao nhiêu ?
            
-- select max(price,from_country), min(price,from_country) from orders 

			-- Trị giá trung bình của tất cả các hóa đơn được bán ra trong năm 2006 là bao nhiêu?

-- select avg(price,from_country) from orders
-- where paid_date between '2006-01-01' and '2006-12-31'

			-- Tính doanh thu bán hàng trong năm 2006.
            
-- select sum(price,from_country) from orders
-- where paid_date between '2006-01-01' and '2006-12-31'

			-- Tìm số hóa đơn có trị giá cao nhất trong năm 2006.
-- select id from orders where price,from_country in
-- (select max(price,from_country) from orders) and paid_date between '2006-01-01' and '2006-12-31'

			-- Tìm họ tên khách hàng đã mua hóa đơn có trị giá cao nhất trong năm 2006.
-- select first_name, last_name from orders left join customers on orders.customers_id = customers.id
-- where price,from_country in
-- (select max(price,from_country) from orders) and paid_date between '2006-01-01' and '2006-12-31' 		
			-- Tính tổng số sản phẩm của từng nước sản xuất.

-- select  from_country,sum(quantity) from products
-- group by from_country		

			-- Với từng nước sản xuất, tìm giá bán cao nhất, thấp nhất, trung bình của các sản phẩm.
-- select  from_country,max(price), min(price), avg(price) from products
-- group by from_country

			-- Tính doanh thu bán hàng mỗi ngày.
-- select *, sum(price*quantity) from orders
-- group by paid_date

			-- Tính tổng số lượng của từng sản phẩm bán ra trong tháng 10/2006.
-- select product_id, count(product_id)as 'số lượng của từng sản phẩm' from product_orders
-- group by product_id

			-- Tìm hóa đơn có mua ít nhất 4 sản phẩm khác nhau.

