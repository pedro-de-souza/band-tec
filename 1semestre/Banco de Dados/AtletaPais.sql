create table Atleta (
	idAtleta int primary key,
    nome varchar(40),
    modalidade varchar(40),
    qtdMedalha int
);

insert into Atleta values
	(1, 'Cristiano Ronaldo', 'Futebol', 0),
    (2, 'LeBron James', 'Basquetebol', 3),
    (3, 'Roger Federer', 'Tênis', 2),
    (4, 'David Beckham', 'Futebol', 0),
    (5, 'Rafael Nadal', 'Tênis', 2),
    (6, 'Kevin Durant', 'Basquetebol', 3),
    (7, 'Floyd Mayweather Jr.', 'Boxe', 1),
    (8, 'Robson Conceição', 'Boxe', 2);

create table Pais(
	idPais int primary key identity(1,1),
	nome varchar(40),
	capital varchar(40)
);

insert into Pais values
	('Portugal', 'Lisboa'),
	('Estados Unidos', 'Washington, D.C.'),
	('Suiça', 'Berna'),
	('Inglaterra', 'Londres'),
	('Espanha', 'Madri'),
	('Brasil', 'Brasília'),
	('Alemanha', 'Berlin');

alter table Atleta add fkPais int foreign key references Pais(idPais);

update Atleta set fkPais = 1 where idAtleta = 1;
update Atleta set fkPais = 2 where idAtleta in (2, 6, 7);
update Atleta set fkPais = 3 where idAtleta = 3;
update Atleta set fkPais = 4 where idAtleta = 4;
update Atleta set fkPais = 5 where idAtleta = 5;
update Atleta set fkPais = 6 where idAtleta = 8;

select Atleta.*, Pais.nome, capital from Atleta, Pais where fkPais = idPais;
select Atleta.*, Pais.nome, capital from Atleta, Pais where fkPais = idPais and Pais.nome = 'Estados Unidos';