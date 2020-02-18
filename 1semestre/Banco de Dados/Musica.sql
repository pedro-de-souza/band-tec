CREATE DATABASE MUSICAS;
USE MUSICAS;

CREATE TABLE MUSICA(
ID_MUSCIA INT AUTO_INCREMENT PRIMARY KEY,
TITULO VARCHAR(40),
ARTISTA VARCHAR(40),
GENERO VARCHAR(40) 
);

insert into Musica values 
	(null,'Sambinha', 'O Grilo', 'Rock'),
	(null, 'One More Light', 'Linkin Park', 'Rock'),
	(null, 'Mirrors', 'Justin Timberlake', 'Pop'),
	(null, 'Como tudo de ser', 'Charlie Brown Jr', 'Rock'),
	(null, 'Oh Chuva', 'Falamansa', 'Forró'),
	(null, 'Africa Unite', 'Bob Marley', 'Reggea'),
	(null, 'On the Brightside', 'Linkin Park', 'Idie'),
	(null, 'Levanta e Anda', 'Emicida', 'Rap'),
    (null, 'What I ve done', 'Linkin Park', 'Rock');
    
select * from Musica;
select titulo, artista from musica; 
select * from musica where genero = 'Rock'; 
select * from musica where artista = 'Linkin Park'; 
select * from musica order by titulo; 
select * from musica order by artista desc; 
select * from musica where titulo like 'O%';
select * from musica where artista like '%a'; 
select * from musica where genero like '_e%';
select * from musica where titulo like '%e_'; 

update musica set genero = 'Alternativo' where id = 1 ; 
alter table musica modify titulo varchar(50); 

describe musica; 

alter table musica add column ano int; 

    
update musica set ano = 2018 where idMusica = 1;
update musica set ano = 1996 where idMusica = 2;
update musica set ano = 1999 where idMusica = 3;
update musica set ano = 2000 where idMusica = 4;   
update musica set ano = 2002 where idMusica = 5;
update musica set ano = 2001 where idMusica = 6;
update musica set ano = 1997 where idMusica = 7;
update musica set ano = 1975 where idMusica = 8;

select * from musica;

alter table musica add column pais varchar(30);

describe musica; 

delete from musica where idMusica = 3;
    
alter table musica drop pais;

drop table musica;
