-- use quan_ly_kho;
-- drop table if exists product, supplier, product_type, customer, promotion,comment,product_comment;
-- create table supplier (
-- 	id int primary key auto_increment,
--     name varchar(50)
-- );
-- create table product_type(
-- 	id int primary key auto_increment,
--     name varchar(50)
-- );
-- create table promotion(
-- 	id int primary key auto_increment,
--     name varchar(100),
--     sales int,
--     unit varchar(50),
--     date_start date,
--     date_stop date
-- );
-- create table product (
-- 	id int primary key auto_increment,
--     name varchar(50),
--     price long,
--     supplier_id int,
--     foreign key (supplier_id) references supplier(id),
--     product_type_id int,
--     foreign key (product_type_id) references product_type(id),
--     promotion_id int,
--     foreign key (promotion_id) references promotion(id)
-- );
-- create table customer(
-- 	id int primary key auto_increment,
--     name varchar(50)
-- ); 
-- create table comment (
-- 	id int primary key auto_increment,
--     content text,
--     customer_id int,
--     foreign key (customer_id) references customer(id)
-- );
-- create table product_comment(
-- 	id int primary key auto_increment,
--     product_id int,
--     comment_id int,
--     foreign key (product_id) references product(id),
--     foreign key (comment_id) references comment(id)
-- );
-- insert supplier (name) values ('NCC1'), ('NCC2');
-- insert product_type (name) values ('quần áo thu đông'), ('quần áo xuân hạ');
-- insert promotion (name, sales, unit, date_start, date_stop) 
-- 		values  ('KM chào xuân',20,'%','2022-01-01','2022-01-15'),
--                 ('KM chào hạ',20,'%','2022-04-01','2022-04-15'),
--                 ('KM chào thu',20,'%','2022-07-01','2022-07-15'),
--                 ('KM chào đông',20,'%','2022-10-01','2022-10-15');
-- insert product (name,price,supplier_id,product_type_id,promotion_id) 
-- 		values  ('áo phông',200000,1,2,1), 
-- 				('áo polo',250000,1,2,2), 
--                 ('áo ba lỗ',180000,1,2,3), 
--                 ('áo len',300000,2,1,4),
--                 ('áo khoác',500000,2,1,4);
-- insert customer (name) values ('Nguyễn Văn A'),('Nguyễn Văn B');
-- insert comment (content,customer_id) 
-- 		values 	('mình mặc áo len vào mùa hè cực kỳ nóng, các bạn cân nhắc không nên mua áo len để mặc mùa hè nhé',1),
-- 				('áo ba lỗ tuy rất thoáng nhưng nếu muốn mặc vào mùa đồng thì nhà bạn phải có điều hòa 2 chiều và đóng tiền điện đầy đủ hàng tháng nhé',2),
--                 ('cảm giác mặc áo polo mùa đông giống như ăn kem mùa đông vậy, tuy rất lạnh nhưng được cái không nóng',1),
--                 ('áo polo đẹp',2);
-- insert comment(customer_id) values (2);
-- insert product_comment (product_id,comment_id) values (4,1),(3,2),(2,3),(2,4),(5,5);


					-- thông tin sản phẩm, người mua và bình luận
-- select product.id,product.name as 'tên sp',product_type.name,supplier.name,customer.name,content 
-- from product 
-- join product_comment on  product.id = product_comment.product_id
-- join comment on comment.id =product_comment.comment_id
-- join customer on customer.id = comment.customer_id
-- join product_type on product_type.id = product.product_type_id
-- join supplier on supplier.id = product.supplier_id


						-- thông tin khuyến mại 
-- select id, name,date_start,date_stop,price,price - (price * sales/100) as 'giá sau KM' from
-- (select product.id,product.name,price,date_start,date_stop,sales
-- from product 
-- join promotion on product.promotion_id = promotion.id) as t1;


							-- bài tập 2
						
drop database if exists quan_ly_thuc_tap;
create database quan_ly_thuc_tap;
use quan_ly_thuc_tap;
drop table if exists khoa,sinh_vien,giang_vien,de_tai,tt_huong_dan;
create table khoa (
	id int primary key auto_increment,
    ma_khoa varchar(100) unique,
    ten_khoa varchar(100),
    so_dt varchar(50)
);

create table sinh_vien (
    ma_sv int primary key auto_increment,
    ho_ten varchar(50),
    khoa_id varchar(50),
    foreign key (khoa_id) references khoa(ma_khoa),
    nam_sinh year,
    que varchar(100)
);

create table giang_vien (
	id int primary key auto_increment,
    ma_gv int unique,
    ho_ten varchar(50),
    khoa_id varchar(50),
    foreign key (khoa_id) references khoa(ma_khoa),
    luong long
);

create table de_tai (
	id int primary key auto_increment,
    ma_dt varchar(50) unique,
    ten_dt varchar(50),
    kinh_phi int,
    noi_tp varchar(150)    
);

create table tt_huong_dan (
    sinh_vien_id int,
    de_tai_id varchar(100),
    giang_vien_id int,
    ket_qua int,
    foreign key (sinh_vien_id) references sinh_vien(ma_sv),
    foreign key (de_tai_id) references de_tai(ma_dt),
    foreign key (giang_vien_id) references giang_vien (ma_gv)
);

insert khoa (ma_khoa,ten_khoa,so_dt) values 
	('Geo', 'Dia ly va QLTN', 3855413), 
	('Math', 'Toan', 3855411), 
	('Bio', 'Cong nghe Sinh hoc', 3855412);
insert giang_vien (ma_gv,ho_ten,luong,khoa_id) values 
	(11, 'Thanh Xuan', 700, 'Geo'), 
	(12, 'Thu Minh', 500, 'Math'), 
	(13, 'Chu Tuan', 650, 'Geo'), 
	(14, 'Le Thi Lan', 500, 'Bio'), 
	(15, 'Tran Xoay', 900, 'Math');
insert sinh_vien (ma_sv,ho_ten,khoa_id,nam_sinh,que) values 
	(1, 'Le Van Sao', 'Bio', 1990, 'Nghe An'), 
	(2, 'Nguyen Thi My', 'Geo', 1990, 'Thanh Hoa'), 
	(3, 'Bui Xuan Duc', 'Math', 1992, 'Ha Noi'), 
	(4, 'Nguyen Van Tung', 'Bio', null, 'Ha Tinh'), 
	(5, 'Le Khanh Linh', 'Bio', 1989, 'Ha Nam'), 
	(6, 'Tran Khac Trong', 'Geo', 1991, 'Thanh Hoa'), 
	(7, 'Le Thi Van', 'Math', null, 'null'), 
	(8, 'Hoang Van Duc', 'Bio', 1992, 'Nghe An');
insert de_tai (ma_dt,ten_dt,kinh_phi,noi_tp) values 
	('Dt01', 'GIS', 100, 'Nghe An'),
	('Dt02', 'ARC GIS', 500, 'Nam Dinh'),
	('Dt03', 'Spatial DB', 100, 'Ha Tinh'),
	('Dt04', 'MAP', 300, 'Quang Binh');
insert tt_huong_dan ( sinh_vien_id, de_tai_id,giang_vien_id, ket_qua ) values 
	(1, 'Dt01', 13, 8),
	(2, 'Dt03', 14, 0),
	(3, 'Dt03', 12, 10),
	(5, 'Dt04', 14, 7),
	(6, 'Dt01', 13, Null),
	(7, 'Dt04', 11, 10),
	(8, 'Dt03', 15, 6);

-- select ma_gv, giang_vien.ho_ten, ten_khoa 
-- from giang_vien join khoa on giang_vien.khoa_id = khoa.ma_khoa


-- select *,count(khoa_id) from sinh_vien group by khoa_id 
-- having count(khoa_id) >=3

-- select * from 
-- sinh_vien join tt_huong_dan on tt_huong_dan.sinh_vien_id = sinh_vien.ma_sv
-- where ket_qua is null