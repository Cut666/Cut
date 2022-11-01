drop database if exists quan_ly_sinh_vien;
create database quan_ly_sinh_vien;
use quan_ly_sinh_vien;
create table sinh_vien(
	ma_sv int primary key auto_increment,
    lop varchar (50),
    ngay_sinh date,
    gioi_tinh varchar(50)
);
create table mon_hoc (
	ma_mh int primary key auto_increment,
    ten_mh varchar(50)
);

create table diem_thi(
	ma_sv_id int,
    ma_mh_id int,
    lan_thi int,
    diem int check(diem>=0 and diem<=10),
    foreign key (ma_sv_id) references sinh_vien(ma_sv),
    foreign key (ma_mh_id) references mon_hoc(ma_mh)
);


insert into sinh_vien (ma_sv, lop, ngay_sinh, gioi_tinh) values (1, 'Lauryn', '2022-02-23', 'Female');
insert into sinh_vien (ma_sv, lop, ngay_sinh, gioi_tinh) values (2, 'Zack', '2022-07-21', 'Male');
insert into sinh_vien (ma_sv, lop, ngay_sinh, gioi_tinh) values (3, 'Renaldo', '2022-04-03', 'Male');
insert into sinh_vien (ma_sv, lop, ngay_sinh, gioi_tinh) values (4, 'Dreddy', '2022-04-12', 'Female');
insert into sinh_vien (ma_sv, lop, ngay_sinh, gioi_tinh) values (5, 'Gilbert', '2022-10-11', 'Male');
insert into sinh_vien (ma_sv, lop, ngay_sinh, gioi_tinh) values (6, 'Blondy', '2022-09-01', 'Female');
insert into sinh_vien (ma_sv, lop, ngay_sinh, gioi_tinh) values (7, 'Maxine', '2022-02-09', 'Genderfluid');
insert into sinh_vien (ma_sv, lop, ngay_sinh, gioi_tinh) values (8, 'Elvin', '2022-03-12', 'Male');
insert into sinh_vien (ma_sv, lop, ngay_sinh, gioi_tinh) values (9, 'Upton', '2022-06-09', 'Male');
insert into sinh_vien (ma_sv, lop, ngay_sinh, gioi_tinh) values (10, 'Dominick', '2022-09-27', 'Male');
insert into sinh_vien (ma_sv, lop, ngay_sinh, gioi_tinh) values (11, 'Leonora', '2022-09-13', 'Female');
insert into sinh_vien (ma_sv, lop, ngay_sinh, gioi_tinh) values (12, 'Rosene', '2021-12-29', 'Female');
insert into sinh_vien (ma_sv, lop, ngay_sinh, gioi_tinh) values (13, 'Meredith', '2022-02-15', 'Male');
insert into sinh_vien (ma_sv, lop, ngay_sinh, gioi_tinh) values (14, 'Mufi', '2022-07-11', 'Female');
insert into sinh_vien (ma_sv, lop, ngay_sinh, gioi_tinh) values (15, 'Carine', '2022-09-12', 'Female');

insert mon_hoc (ten_mh) values ('toan'),('ly'),('sinh'),('anh');

insert diem_thi (ma_sv_id,ma_mh_id,lan_thi,diem) values 
		(1,1,1,10),
		(2,1,1,2),
        (2,1,2,9),
        (3,1,1,10),
        (4,2,1,8),
        (5,2,1,7),
        (6,3,1,6),
        (6,2,1,7),
        (7,3,1,1),
        (7,3,2,5),
        (7,3,3,7),
        (8,4,1,10),
        (9,4,1,10),
        (10,4,1,10),
        (11,4,1,10),
        (12,4,1,10);

-- Lấy danh sách lần thi cuối cùng của các sinh viên gồm: Mã số sinh viên, mã số môn học, lần thi cuối cùng của môn học, điểm thi 
-- select diem_thi.ma_sv_id, diem_thi.ma_mh_id, diem_thi.lan_thi,diem from diem_thi join
-- (select ma_sv_id, ma_mh_id,max(lan_thi)as'lan_thi' from diem_thi 
-- group by ma_sv_id,ma_mh_id)as t1 
-- on diem_thi.ma_sv_id = t1.ma_sv_id and
-- diem_thi.ma_mh_id = t1.ma_mh_id and
-- diem_thi.lan_thi = t1.lan_thi;

-- Viết thủ tục procedure để lấy thông tin điểm thi của 1 sinh viên theo mã sinh viên
-- select * from sinh_vien 
-- left join diem_thi on sinh_vien.ma_sv = diem_thi.ma_sv_id

												-- đề 02

