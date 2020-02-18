create database Familia;
use Familia;
 create table Pessoa(
	idPessoa int primary key,
    Nome varchar(50),
    Profissao varchar(25),
    Data_de_Nascimento date
 );
 
 create table Gastos(
	idGastos int primary key,
	Data_Gasto date,
    valor decimal(8,2),
    Descricao varchar(50)
   -- fkPessoa int,
   -- foreign key (fkPessoa) references Pessoa(idPessoa)
 );
 
 insert into Pessoa values
 (1,'Pedro','Desenvolvedor','1972-02-06'),
 (2,'Janete','Vendedora','2001-08-10'),
 (3,'André','nenhum','2001-08-10'),
 (4,'Joanne','nenhum','1999-09-23'),
 (5,'Julia','nenhum','2001-08-10');
 
 insert into Gastos values
 (1,'2019-06-03',890.00,'Celular Azus'),
 (2,'2019-09-19',1014.00,'Celular Xiomi'),
 (3,'2019-08-04',100.00, 'Dinheiro'),
 (4,'2019-05-27',200.00, 'Papel'),
 (5,'2019-07-09',500.00, 'Óculos');
 
 alter table Gastos add column fkPessoa int, add foreign key (fkPessoa) references Pessoa(idPessoa);
 
 update Gastos set fkPessoa = 4 where idGastos = 1;
 update Gastos set fkPessoa = 1 where idGastos = 2;
 update Gastos set fkPessoa = 2 where idGastos = 3;
 update Gastos set fkPessoa = 3 where idGastos = 4;
 update Gastos set fkPessoa = 5 where idGastos = 5;
 
 select P. *, G.data_gasto,G.valor,G.descricao from Pessoa P, Gastos G where idPessoa=fkPessoa;
 
--  Drop database familia;
 