drop database if exists sampledb_take;
create database sampledb_take;
use sampledb_take;

create table sample_table(
No int,name varchar(50),age int,Mail varchar(50));

insert into sample_table values(1,"Yamada",21,"xxx@yahoo.co.jp");
insert into sample_table values(2,"Sato",39,"yyy@google.com");
insert into sample_table values(3,"Harada",44,"zzz@yahoo.co.jp");