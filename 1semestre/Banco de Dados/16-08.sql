CREATE DATABASE ALUNOS;
USE ALUNOS;

create table aluno (
ra int primary key not null,
nome varchar(55) not null,
bairro varchar(55)
);

-- Insert
insert into aluno values (01192051, 'Pedro Lopes', 'Jaraguá');
insert into aluno values
	(01192124, 'Roberto', 'Jardim Primavera'),
	(01192123, 'Ranyery', 'Jardim Audir'),
	(01192053, 'Naomi', 'Vila Leopoldina'),
	(01192089, 'Ricardo', 'Jardim Alzira');

-- Selects básico
select * from aluno;
select nome from aluno;
select nome, bairro from aluno;
select bairro, ra from aluno;
select nome, bairro, ra from aluno;

-- Selects where
select * from aluno where ra = 1192051; -- somente esse RA
select * from aluno where ra >= 1192089; -- maiores que esse RA
select * from aluno where ra <> 1192089; -- somente RA diferente de 1192089
select * from aluno where ra != 1192089; -- mesma coisa que o de cima
select * from aluno where nome like 'R%'; --  Perceba que deve ser “LIKE” (parecido com)
select * from aluno where bairro like 'Vila%'; -- Utiliza-se a cláusula / operador LIKE quando se deseja fazer uma busca a um caracter
select * from aluno where nome like '_i%'; -- % Que é equivalente qualquer valor independente da quantidade de caracteres;
select * from aluno where bairro like '%e__' or '%m %'; -- ou = or  _ Que é equivalente a apenas um caractere qualquer.
select * from aluno order by nome; -- ordernar por padrão asc crescente 
select * from aluno order by bairro desc, nome desc;  -- desc decrescente
select * from aluno where ra between 1192060 and 1192120; -- selecionar intervalos de dados ao retornar os resultados de uma consulta.

-- Update
update aluno set nome = 'Roberto Volpe' where ra = 01192124; 
update Aluno set ra = 01192666, bairro = 'Marechal Deodoro' where ra = 01192109; 
    
-- Delete
delete from aluno where ra = 1192666; 



-- DROP TABLE ALUNOS;
