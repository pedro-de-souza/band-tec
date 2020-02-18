create database Faculdade;
use Faculdade;

create table Aluno(
	RA int primary key auto_increment,
    Nome varchar(50),
    telefone int
);

create table Projeto(
	idProjeto int primary key auto_increment,
	Nome varchar(50),
    Descricao text
);

create table Acompanhante(
	idAcomp int,
	Nome varchar(50),
	Relacao varchar(25),
    fkAluno int,
    foreign key(fkAluno) references Aluno(RA),
    primary key(idAcomp,fkAluno)
);