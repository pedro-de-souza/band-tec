create database AlunoDisciplina;
use AlunoDisciplina;

	create table Aluno(
		ra int primary key auto_increment,
        nomeAluno varchar(45),
        bairro varchar(45)
    )auto_increment=50000;
    
    create table Disciplina(
		idDisc int primary key auto_increment,
        nomeDisc varchar(45)
    )auto_increment=100;
    
    insert into Aluno values
		(null,'Maria Oliveira', 'Paraiso'),
        (null,'José Silva', 'Itaquera'),
        (null,'Claudia Souza', 'Jabaquara'),
        (null,'Mario Bros', 'São Mateus');
        
	insert into Disciplina values
		(null,'Algoritmos'),
        (null,'Banco de Dados'),
        (null,'Arquitetura'),
        (null,'Pesquisa e inovação');
        
	 create table AlunoDisciplina(
		fkAluno int,
        fkDisc int,
        perLetivo int,
        media decimal(4,2),
        qtdFaltas int,
        foreign key(fkAluno) references Aluno(RA),
        foreign key(fkDisc) references Disciplina(idDisc),
        primary key (fkAluno,fkDisc,perLetivo)
    );
    
    create table Curso(
		idCurso int primary key,
        nomeCurso varchar(10),
        coordenador varchar(40)
    );
    
    insert into AlunoDisciplina values
		(50000,100,20192,7,0),(50000,101,20192,5,4),
        (50001,101,20192,6,8),(50001,102,20192,9,2),
        (50002,102,20192,4,0),(50002,103,20192,6.5,3),

        (50003,100,20192,10,0),(50003,101,20192,10,0),
        (50003,102,20192,10,0),(50003,103,20192,10,0);
        
	insert into Curso values
		(1000,'ADS', 'Gerson'),
        (1001,'CCO', 'Marise'),
        (1002,'BD', 'Leo'),
        (1003,'Redes', 'Alex');
        
	insert into Aluno values
		(null,'Luis Fernando', 'Guarapiranga', null),
        (null,'Felipe de Barros', 'Liverpool', null);
        
select * from Aluno;
select * from Disciplina;
select * from Curso;

alter table Aluno add fkCurso int, add foreign key(fkCurso)  references Curso(idCurso);

update Aluno  set fkCurso =1000 where ra =50000;
update Aluno  set fkCurso =1001 where ra>=50001 and ra<=50002;
update Aluno  set fkCurso =1002 where ra=50003;

select * from Aluno,Curso
	where fkCurso=idCurso;
    
-- Idem ao comando anterior usando Join
select * from Aluno join Curso
	on fkCurso=idCurso;
    
-- Idem ao comando anterior usando inner Join
select * from Aluno inner join Curso
	on fkCurso=idCurso;
    
select * from Aluno left join Curso
	on fkCurso=idCurso;

select * from Aluno right join Curso
	on fkCurso=idCurso;

select * from Aluno join Curso
	on fkCurso=idCurso where nomeCurso='CCO'; -- where ou add
    
select * from Aluno,Disciplina,AlunoDisciplina
	where fkAluno=RA and fkDisc=idDisc;

select * from Aluno,Disciplina,AlunoDisciplina
	where fkAluno=RA and fkDisc=idDisc and nomeDisc='Algoritmos';

select * from Aluno,Disciplina,AlunoDisciplina
	where fkAluno=RA and fkDisc=idDisc and nomeAluno='Mario Bros';
    
select sum(media), sum(qtdFaltas) from AlunoDisciplina;

select avg(media) 'Média da média' from AlunoDisciplina;

select round(avg(media),2) as 'Média da média' from AlunoDisciplina;

select nomeAluno,nomeDisc,max(qtdFaltas),nomeAluno,nomeDisc,min(qtdFaltas)  from Aluno,Disciplina,AlunoDisciplina where fkAluno=RA and fkDisc=idDisc;

select fkDisc, max(media),min(media) from AlunoDisciplina,Disciplina group by fkDisc;

select * from  Aluno  join AlunoDisciplina on fkAluno=RA 
					  join Disciplina on  fkDisc=idDisc;
                      
select * from  Aluno  join AlunoDisciplina on fkAluno=RA 
					  join Disciplina on  fkDisc=idDisc where nomeDisc ='Algoritmos';
                      
select * from  Aluno  join AlunoDisciplina on fkAluno=RA 
					  join Disciplina on  fkDisc=idDisc where nomeAluno like'Mario%';

select * from  Curso;

start transaction;
delete from Curso where idCurso=1003;
rollback;