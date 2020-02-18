create database funcionario;
use funcionario;

create table funcionario(
	idFunc int primary key auto_increment,
    nome varchar(40),
    sexo char(1),
    check (sexo = 'm' or sexo ='f' or sexo='n'),
	salario decimal(7.2),
    check(salario > 0),
    fkSupervisor int,
    foreign key (fkSupervisor) references Funcionario(idFunc)
) auto_increment=1000;

select * from  Funcionario;
desc Funcionario;

insert into  Funcionario values (null,'Deus','N',99999,null);
insert into  Funcionario values (null,'Maria Aparecida','F',15000,1000);
insert into  Funcionario values (null,'José Desaparecido','M',6000,1001);
insert into  Funcionario values (null,'Jesus Cristo','M',7000,1000);

select * from Funcionario F , Funcionario S  where F.fkSupervisor = S.idFunc;