create table Instituicao(
	idInst int primary key identity(1, 1),
	nome varchar(40),
	bairro varchar(40)
);

create table Empresa(
	idEmpresa int primary key identity(1, 1),
	nome varchar(40),
	representante varchar(40)
);

create table Aluno1(
	ra varchar(8) primary key,
	nome varchar(40),
	telefone varchar(15),
	email varchar(50),
	fk_instituicao int,
	fk_empresa int,
	foreign key (fk_instituicao) references Instituicao(idInst),
	foreign key (fk_empresa) references Empresa(idEmpresa)
);

insert into Instituicao values 
	('ETEC Jaraguá', 'Jaraguá'),
	('ETEC Albert Einstein', 'Casa Verde'),
	('SENAI Ary Torres', 'Santo Amaro');

insert into Empresa values
	('C6 Bank', 'Paixão'),
	('Valid', 'Roberto'),
	('Logicalis', 'Erica'),
	('Fderivs', 'Bruno'),
	('Stefanini', 'Eduardo');

insert into Aluno1 values
	('01192021', 'Manoel de Souza Almeida', '(11)93743-5823', 'manoel.almeida@bandtec.com.br', 1, 1),
	('01192055', 'Rafael Barros Reis', '(11)93726-7234', 'rafael.reis@bandtec.com.br', 1, 1),
	('01192023', 'Pedro Lopes de Souza', '(11)95827-9423', 'pedro.souza@bandtec.com.br', 1, 3),
	('01192024', 'Pedro Henrique', '(11)93523-7826', 'pedro.henrique@bandtec.com.br', 2, 5),
	('01192025', 'Bruno Chang ', '(11)93612-3172', 'bruno.chang@bandtec.com.br', null, 4),
	('01192026', 'Socorro Jesus', '(11)98471-1234', 'socorro.jesus@bandtec.com.br', 2, 3),
	('01192027', 'Matheus Oliveira', '(11)97461-8471', 'matheus.oliveira@bandtec.com.br', 3, 2);

select ra, Aluno1.nome, telefone, email, Empresa.nome as empresa, representante, inst.nome, bairro from Aluno1, Empresa, Instituicao as inst where fk_empresa = idEmpresa and fk_instituicao = idInst;
select ra, Aluno1.nome, telefone, email, Empresa.nome as empresa, representante, inst.nome, bairro from Aluno1, Empresa, Instituicao as inst where fk_empresa = idEmpresa and fk_instituicao = idInst and Empresa.nome = 'Logicalis';
select ra, Aluno1.nome, telefone, email, Empresa.nome as empresa, representante, inst.nome, bairro from Aluno1, Empresa, Instituicao as inst where fk_empresa = idEmpresa and fk_instituicao = idInst and inst.nome = 'ETEC Jaraguá';