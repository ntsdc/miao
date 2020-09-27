
use mybatis_demo;

create table student(
                        sid int primary key auto_increment,
                        sname varchar(50) not null,
                        sage int,
                        semail varchar(50) not null,
                        saddress varchar(200)
);
create table course(
                       cid int primary key auto_increment,
                       cname varchar(50) not null
);
create table student_course(
                               id int primary key auto_increment,
                               sid int,
                               cid int,
                               constraint fk_sid foreign key (sid) references student(sid),
                               constraint fk_cid foreign key (cid) references course(cid)
);
insert into student(sname, sage, semail, saddress)
values('tom',30,'tom@163.com','⻄安'),
      ('张浩楠',20,'zhagnhaonan@163.com','河北'),
      ('武⽂涛',20,'wwt@163.com','⻄安'),
      ('王鑫',20,'wangxin@163.com','⼴⻄');
insert into course(cname)
values('mybatis'),('mysql');
insert into student_course(sid,cid)
values(1,1),
      (2,1),
      (2,2),
      (3,2),
      (4,1),
      (4,2);