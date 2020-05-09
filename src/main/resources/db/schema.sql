Create database test;
use test;
CREATE TABLE User(
  id int not null primary key ,
  name varchar(20) null,
  age int null
);

alter table user modify id int auto_increment ;