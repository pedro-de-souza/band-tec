create database ads;
use ads; 

create table Aluno (
	ra int primary key not null,
    nome varchar(55) not null,
    bairro varchar(55)
);

select * from Aluno;
insert into Aluno values
	(01192055, 'Rafael', 'rua dos imaculados');
insert into Aluno values
	(01192124, 'Roberto', 'Jardim Primavera'),
	(01192123, 'Ranyery', 'Jardim Audir'),
	(01192053, 'Naomi', 'Vila Leopoldina'),
	(01192089, 'Ricardo', 'Jardim Alzira');

select nome from Aluno;
select nome, bairro from Aluno;
select bairro, ra from Aluno;
select * from Aluno where ra = 1192089; -- traz um só
select * from Aluno where ra >= 1192089; -- traz ele e maiores que ele
select * from Aluno where ra <> 1192089; -- traz todos diferente dele
select * from Aluno where ra != 1192089; -- traz todos diferente dele
select * from Aluno where nome like 'R%'; -- traz alunos com a letra R
select * from Aluno where bairro like 'Vila%'; -- traz bairros com a palavra Villa
select * from Aluno where nome like '%o'; -- traz alunos que termina com a letra o
select * from Aluno where nome like '_i&'; -- traz alunos que termina com a segunda letra i
select * from Aluno where bairro like '%m %'; -- traz alguma palavra terminada em m
select * from Aluno where bairro like '%e__'; -- traz alunos que o bairro tenha a letra e como a 3º letra de trás pra frente
select * from Aluno order by nome; -- ordena nomes por ordem crescente
insert into Aluno values
	(01192109, 'Natanael', 'Vila Leopoldina');
select * from Aluno order by bairro desc, nome desc; -- aluno e bairro em forma descrecente

update Aluno set nome = 'Roberto Volpe'
	where ra = 01192124; -- alterar o aluno com ra tal //
    
update Aluno set ra = 01192666, bairro = 'Marechal Deodoro'
	where ra = 01192109; -- alterar o ra com ra tal 
    
delete from Aluno where ra = 1192666; -- exclui o natanael

select * from Aluno where ra between 1192060 and 1192120; -- ra entre 60 e 120

-- drop database ads;
