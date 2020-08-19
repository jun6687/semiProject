create table orderCheck(

indexi number(4),
Timei varchar2(20),
pizzaName varchar2(130),
Address varchar2(30),
delCheck varchar2(20),
price number(7)
);



select * from orderCheck;
delete 
drop table orderCheck purge;

create sequence orderCheck_seq
start with 1 increment by 1;

drop sequence orderCheck_seq;