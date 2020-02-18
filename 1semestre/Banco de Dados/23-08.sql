create database tabelas;
use tabelas;

create table filmes(
idFilme int auto_increment primary key,
titulo varchar(40),
genero varchar(30),
diretor varchar(40)
);

insert into filmes values (1,'Vingadores','Ação','Anthony e Joel Russo');
insert into filmes (idFilme,titulo) values (2,'Big Hero 6');
insert into filmes (idFilme,titulo) values 
	(3,'Tarzan'),
	(4,'Shrek'),
	(5,'Cidade de Deus');
insert into filmes (idFilme,titulo) values (6,'Shrek para sempre');
update filmes set genero = 'Animação', diretor = 'Andrew Adamson' where idFilme in (4,6); 
update filmes set genero = 'Documentario', diretor = 'Rambo' where idFilme in (2,3); 
update filmes set genero = 'Drama', diretor = 'Fernando Meirelles' where idFilme = 6; 
select * from filmes;
drop table pessoas;

create table pessoas(
idPesssoa int auto_increment primary key not null,
nome varchar(40),
dataNasc date 
);

insert into pessoas values
	(null, 'Maria Oliveita','2000-05-10');
insert into pessoas values
	(3, 'Antonio Fagundes','1958-04-18');
select * from pessoas;

desc pessoas; 
describe filmes; --  tipo de dado utilizado
alter table pessoas add bairro varchar (30);
alter table pessoas add column bairro varchar (30);
alter table pessoas modify bairro varchar (40);
alter table pessoas drop bairro;
alter table pessoas auto_increment = 50;
insert into pessoas values
	(null, 'Minnie','1998-03-12','Disney');
    
create table comida(
idComida int primary key auto_increment,
nome varchar(40)
)auto_increment=50;
insert into comida values
	(null, 'Pizza com borda de chedar');
select * from comida;