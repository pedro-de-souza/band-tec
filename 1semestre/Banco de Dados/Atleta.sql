create database Atleta;
use Atleta;

create table Atleta(
idAtleta int auto_increment primary key,
nome varchar(40),
modalidade varchar(40),
qtdMedalha int
);

insert into Atleta values
("Rodrigo", "Natação", 1),
("Roberto", "Basquete", 3),
("Ramon", "Futebol", 2),
("Ramones", "Tênis de Mesa", 4),
("Luis", "Vôlei", 5),
("André", "Xadrez", 6);