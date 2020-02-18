create database startup;
use startup;

create table empresa(
	idEmpresa int primary key auto_increment,
    nomeEmpresa varchar(50),
    bairro varchar(50)
)auto_increment=1;

create table funcionario(
	idFunc int primary key auto_increment,
    nomeFunc varchar(50),
    salario decimal(8.2),
    dataNasc date
)auto_increment=100;

alter table funcionario add fkEmpresa int, add foreign key (fkEmpresa) references empresa(idEmpresa);

insert into empresa values
	(null, 'Deloite','Augustas'),
    (null, 'C6Bank','Vila dos Sonhos'),
    (null, 'EasyTec','Pirituba'),
    (null, 'RepTec','Frios'),
    (null, 'BladMarket','Ladrões'),
    (null, 'BMTH','Rocha'),
    (null, 'Joke','piada');
    
insert into funcionario values
	(null, 'Pedro',2000.00,'2001-08-10',2),
    (null, 'Rafael',2000.00,'2000-11-13',4),
    (null, 'Manoel',2000.00,'2000-11-23',5),
    (null, 'Celia',5000.00,'1980-05-15',1),
    (null, 'Yoshi',5000.00,'1990-07-09',1),
    (null, 'Sara',3000.00,'2002-08-12',3),
    (null, 'Naruto',8000.00,'1999-09-09',3),
    (null, 'Sasuke',7999.00,'1999-06-03',3),
    (null, 'Batman',4500.00,'1985-04-11',7),
    (null, 'Oliver',4500.00,'1987-09-11',6),
    (null, 'Rogerio',1000.00,'1666-06-06',7);
    
select * from empresa;
select * from funcionario;

select * from empresa order by nomeEmpresa;
select * from funcionario order by salario desc;
select * from empresa,funcionario where fkEmpresa= idEmpresa;
select * from empresa,funcionario where fkEmpresa= idEmpresa and nomeEmpresa = 'EasyTec';

delete from funcionario where idFunc=100;




