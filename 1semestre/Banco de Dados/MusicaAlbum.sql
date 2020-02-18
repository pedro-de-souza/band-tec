CREATE DATABASE MUSICAS;
  USE MUSICAS;

CREATE TABLE ALBUM(
ID_ALBUM INT PRIMARY KEY AUTO_INCREMENT,
NOME VARCHAR(40),
GRAVADORA VARCHAR(40)
);

CREATE TABLE MUSICA(
ID_MUSCIA INT PRIMARY KEY AUTO_INCREMENT,
TITULO VARCHAR(40),
ARTISTA VARCHAR(40),
GENERO VARCHAR(40),
FK_ALBUM INT,
FOREIGN KEY (FK_ALBUM)REFERENCES ALBUM(ID_ALBUM)
);

 INSERT INTO ALBUM VAlUES
 (1, 'Walls and Bridges','Apple Records' ),
 (2, 'One More Light','Warner Bros. Records' ),
 (3, 'Ha 10 Mil Anos Atras','Philips Records'),
 (4, 'Bad','Epic Records'),
 (5, 'Back to Black','Island Records');
  
 

  INSERT INTO MUSICA VAlUES
 (NULL, 'Going down on Love','John Lennon','Rock',1),
 (NULL, 'Old dirt Road','John Lennon','Rock',1),
 (NULL, 'Bless you','John Lennon','Rock',1),
 (NULL, 'One More Light','Linkin Park','Rock',2),
 (NULL, 'Good Goodbye','Linkin Park','Rock',2),
 (NULL, 'Heavy','Linkin Park','Rock',2),
 (NULL, 'Meu amigo Pedro','Raul Seixas','Rock Nacional',3),
 (NULL, 'Eu Nasci ha 10 Mil anos Atras','Raul Seixas','Rock Nacional',3),
 (NULL, 'O homem','Raul Seixas','Rock Nacional',3),
 (NULL, 'Bad','Michael Jackson','Pop',4),
 (NULL, 'Man in the Mirror','Michael Jackson','Pop',4),
 (NULL, 'Dirty Diana','Michael Jackson','Pop',4),
 (NULL, 'Wake Up Alone','Amy Winehouse','Jazz',5),
 (NULL, 'Just Friends','Amy Winehouse','Jazz',5),
 (NULL, 'Back to Black','Amy Winehouse','Jazz',5);
 
 select * from album;
  SELECT * FROM musica;

select * from musica, ALBUM where FK_ALBUM=ID_ALBUM;
SELECT M.* , A.NOME, A.GRAVADORA  FROM MUSICA M,ALBUM A where  FK_ALBUM=ID_ALBUM AND A.NOME='One More Light';
SELECT * FROM MUSICA,ALBUM where  FK_ALBUM=ID_ALBUM AND album.GRAVADORA='Epic Records';
