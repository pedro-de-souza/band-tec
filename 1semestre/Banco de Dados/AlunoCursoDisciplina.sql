create database adsa;

use adsa;
create table Aluno (
  ra int primary key,  -- ra é a chave primária da tabela Aluno
  nome varchar(40),
  bairro varchar(40)
 ); 
 -- drop table aluno;
alter table aluno add fkcurso int; 

 insert into Aluno values 
    (01192027,'Wellington','Vila Brasilandia'); 
       
 insert into Aluno values
    (01192124,'Roberto','Jardim Primavera'),
    (01192123,'Ranyery','Jardim Audir'),
    (01192053,'Naomi','Vila Leopoldina'),
    (01192089,'Ricardo','Jardim Alzira');
    
select * from Aluno;
create table curso (
idCurso int primary key,
nome varchar(50),
cord varchar(50)
 );
 
 alter table aluno add foreign key (fkcurso) references curso(idcurso);

insert into curso values
(100,'ADS','Gerson'),
(101,'BD','Marise'),
(102,'Redes','Alex');

update aluno set fkcurso = 100 where ra in (1192027,1192089);
update aluno set fkcurso = 101 where ra in (01192053,01192124);
update aluno set fkcurso = 102 where ra = 01192123;
			
 select * from aluno,curso;           
 
 select * from aluno, curso where fkcurso=idcurso;
 
 select * from aluno, curso where fkcurso=idcurso and idcurso=100;
 
select * from aluno, curso where fkcurso=idcurso and curso.nome='ads';

select a.* ,c.nome,cord from aluno as a , curso as c where fkcurso=idcurso;

select a.* ,c.nome 'Nome do Curso',cord from aluno as a , curso as c where fkcurso=idcurso;

update aluno set fkcurso = 105 where ra = 1192123; 
   
 alter table aluno add fkcurso int, add foreign key (fkcurso) references curso(idcurso);
 
 create table disciplina(
 iddisc int primary key,
 nome varchar(40),
 qtdaula int,
 fkcurso int,
 foreign key(fkcurso) references curso(idcurso)
 );
 
 insert into disciplina values
 (1000,'Algoritimo',7,100),
 (1001,'Modelagem de banco',4,101),
 (1002,'Configuração de rede',5,102),
 (1003,'Análise de sistemas',5,100),
 (1004,'Segurança de dados',4,102);
 
 select d.*,curso.nome, cord from disciplina d, curso where fkcurso=idcurso;
 select * from aluno a, disciplina d, curso c where d.fkcurso=idcurso and a.fkcurso=idcurso;
  desc Aluno; --  exec sp_help Aluno --Sql Server
  
 alter table aluno add fkcurso int, add foreign key (fkcurso) references curso(idcurso);
 --  alter table aluno add fkcurso int foreign key (fkcurso) references curso(idcurso); --Sql Server
 set @@auto_increment_increment=(100,1) -- indentity(100,1) --Sql Server
  
 