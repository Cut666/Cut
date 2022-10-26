use quan_ly_kho;
drop table if exists users,roles,users_roles,permissions,roles_permissions;
create table users (
	id bigint primary key auto_increment,
    username varchar(100) not null,
    password varchar(100) not null,
	first_name varchar(100) ,
    last_name varchar(100),
    gender enum ('male','female'),
    email varchar(100) not null,
    birth_day date,
    avartar varchar(100),
    phone varchar(100),
    address varchar(100),
    city varchar(100),
    country varchar(100),
    code_active varchar(100) not null,
    status enum('enable','disable') not null,
    created_date date not null,
    updated_date date not null
);

create table roles (
	id int primary key auto_increment,
    role_name varchar (100) not null,
    created_date date not null,
    updated_date date not null
);

create table users_roles (
	id int primary key auto_increment,
    users_id bigint,
    roles_id int,
    foreign key (users_id) references users(id),
    foreign key (roles_id) references roles(id)
);

create table permissions (
	id int primary key auto_increment,
    permission_name varchar(100),
    created_date date not null,
    updated_date date not null
);

create table roles_permissions (
	id int primary key auto_increment,
    roles_id int,
    permissions_id int,
    foreign key (roles_id) references roles(id),
    foreign key (permissions_id) references permissions(id)
);

insert into users (id, username, PASSWORD, first_name, last_name, gender, email, birth_day, avartar, phone, address, city, country, code_active, STATUS , created_date, updated_date) values (1, 'cwagge0', 'qZtZPTNlHqU', 'Cloe', 'Wagge', 'Female', 'cwagge0@microsoft.com', '1977-07-06', 'Aliquam.xls', '795-206-5885', '8 North Avenue', 'Neebing', 'Canada', 'P7L','ENABLE', '2015-07-02', '2022-08-02');
insert into users (id, username, PASSWORD, first_name, last_name, gender, email, birth_day, avartar, phone, address, city, country, code_active, STATUS , created_date, updated_date) values (2, 'egeorger1', 'GHlkn8lM6', 'Ewan', 'Georger', 'Male', 'egeorger1@artisteer.com', '1947-02-05', 'PosuereFelis.png', '134-808-6456', '8 Ramsey Point', 'Yeping', 'China', '122-255', 'DISABLE' ,'2020-12-09', '2022-08-15');
insert into users (id, username, PASSWORD, first_name, last_name, gender, email, birth_day, avartar, phone, address, city, country, code_active, STATUS , created_date, updated_date) values (3, 'hcritchell2', 'JiUHh3', 'Hurlee', 'Critchell', 'Male', 'hcritchell2@yahoo.com', '1922-01-14', 'QuisOrci.ppt', '346-375-9917', '08 Fremont Park', 'Pucheng', 'China', '122-255', 'ENABLE','2014-06-05', '2022-04-20');
insert into users (id, username, PASSWORD, first_name, last_name, gender, email, birth_day, avartar, phone, address, city, country, code_active,  STATUS, created_date, updated_date) values (4, 'fwike3', 'y8acus0vZSa', 'Fowler', 'Wike', 'Male', 'fwike3@last.fm', '1968-12-29', 'Sed.jpeg', '283-217-4265', '94 Armistice Junction', 'Shah Alam', 'Malaysia', '40460','DISABLE' , '2015-03-22', '2022-08-08');
insert into users (id, username, PASSWORD, first_name, last_name, gender, email, birth_day, avartar, phone, address, city, country, code_active, STATUS, created_date, updated_date) values (5, 'tdulake4', 'tagOnxc91ud', 'Theodoric', 'Dulake', 'Male', 'tdulake4@printfriendly.com', '1921-04-29', 'MaurisSitAmet.avi', '522-122-3441', '63726 Continental Hill', 'Bystrytsya', 'Ukraine', '121-25','ENABLE', '2014-03-01', '2022-01-20');
insert into users (id, username, PASSWORD, first_name, last_name, gender, email, birth_day, avartar, phone, address, city, country, code_active, STATUS, created_date, updated_date) values (6, 'eparlott5', 'AFmLgoC', 'Elden', 'Parlott', 'Male', 'eparlott5@geocities.jp', '1909-10-01', 'Luctus.mpeg', '148-390-7617', '5 Annamark Crossing', 'Mautapaga Bawah', 'Indonesia', '247-963','ENABLE', '2020-08-14', '2022-05-20');
insert into users (id, username, PASSWORD, first_name, last_name, gender, email, birth_day, avartar, phone, address, city, country, code_active, STATUS, created_date, updated_date) values (7, 'jgrzesiewicz6', 'SHI9bZFhc', 'Jobyna', 'Grzesiewicz', 'Female', 'jgrzesiewicz6@360.cn', '1973-09-17', 'NonLectus.doc', '268-396-8780', '212 Sycamore Terrace', 'Selaphum', 'Thailand', '33150','DISABLE' , '2013-03-01', '2022-09-11');

insert into roles (id, role_name, created_date, updated_date) values (1, 'Surveyor', '2013-03-25', '2022-01-14');
insert into roles (id, role_name, created_date, updated_date) values (2, 'Estimator', '2016-02-09', '2021-12-16');
insert into roles (id, role_name, created_date, updated_date) values (3, 'Construction Foreman', '2011-12-26', '2021-11-13');
insert into roles (id, role_name, created_date, updated_date) values (4, 'Construction Worker', '2017-02-26', '2021-12-10');
insert into roles (id, role_name, created_date, updated_date) values (5, 'Architect', '2017-01-09', '2022-06-28');
insert into roles (id, role_name, created_date, updated_date) values (6, 'Electrician', '2020-06-10', '2022-07-16');
insert into roles (id, role_name, created_date, updated_date) values (7, 'Supervisor', '2013-01-02', '2022-10-06');

insert into permissions (id,permission_name, created_date, updated_date) values (1,'Internet', '2013-08-15', '2022-07-24');
insert into permissions (id,permission_name, created_date, updated_date) values (2, 'read_phone_state','2012-12-23', '2022-10-07');
insert into permissions (id,permission_name, created_date, updated_date) values (3, 'access_network_state','2011-10-22', '2022-01-17');
insert into permissions (id,permission_name, created_date, updated_date) values (4,'Internet', '2018-07-01', '2022-07-24');
insert into permissions (id,permission_name, created_date, updated_date) values (5, 'read_phone_state','2017-06-16', '2021-10-31');
insert into permissions (id,permission_name, created_date, updated_date) values (6, 'access_network_state','2012-04-12', '2022-10-04');
insert into permissions (id,permission_name, created_date, updated_date) values (7,'Internet', '2016-05-07', '2022-05-03');

insert into users_roles (id, users_id, roles_id) values (1, 2,2);
insert into users_roles (id, users_id, roles_id) values (2, 2, 2);
insert into users_roles (id, users_id, roles_id) values (3, 3, 2);
insert into users_roles (id, users_id, roles_id) values (4, 5,6);
insert into users_roles (id, users_id, roles_id) values (5, 6, 6);
insert into users_roles (id, users_id, roles_id) values (6, 5, 5);
insert into users_roles (id, users_id, roles_id) values (7,7, 7);

insert into roles_permissions (id, permissions_id, roles_id) values (1, 2,2);
insert into roles_permissions (id, permissions_id, roles_id) values (2, 2, 2);
insert into roles_permissions (id, permissions_id, roles_id) values (3, 3, 2);
insert into roles_permissions (id, permissions_id, roles_id) values (4, 5,6);
insert into roles_permissions (id, permissions_id, roles_id) values (5, 6, 6);
insert into roles_permissions (id, permissions_id, roles_id) values (6, 6, 6);
insert into roles_permissions (id, permissions_id, roles_id) values (7, 7, 7);
