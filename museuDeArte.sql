CREATE DATABASE museu;

USE museu;

CREATE TABLE artista(
idArtista INTEGER PRIMARY KEY AUTO_INCREMENT,
nomeCompleto VARCHAR(50) NOT NULL,
nomeArtistico VARCHAR(30) NOT NULL,
dataNasc DATE NOT NULL,
localNasc VARCHAR(30) NOT NULL,
telefone VARCHAR(15) NOT NULL,
email VARCHAR(30) NOT NULL,
endereco VARCHAR(10) NOT NULL,
cep INTEGER NOT NULL,
cidade VARCHAR(30) NOT NULL,
estado VARCHAR(30) NOT NULL,
pais VARCHAR(30) NOT NULL,
tecnicasPrincipais VARCHAR(50) NOT NULL
);

INSERT INTO artista VALUES (NULL,  "Bernadete de Lourdes Guerreiro Reale", "Berna Reale", "1965-12-12", "Belém-PA", "55779945612371", "berna.reale@email.com.br", "Rua das Orquídeas, 71, Boa Viagem", 67000000,"Bélem", "PA", "Brasil", "Performance e Instalação");
INSERT INTO artista VALUES (NULL, "José Benedito Fonteles", "Bené Fonteles", "1953-03-21", "Bragança-PA", "5577999562567", "jose.fonteles@email.com.br", "Rua das Oliveiras, 583, Boa Vista", 67800000,"Brasília", "PA", "Brasil", "instalações e esculturas");
INSERT INTO artista VALUES (NULL, "Marina Abramović" "Marina Abramović", "1946-30-11",  "Belgrado, Sérvia",  "38181945632189", "marina.abramovich@email.com.br", "Street Light of Nature, 77, Aquamarine", 11090, "Belgrado", "Belgrado", "Sérvia", "performance");

CREATE TABLE obraDeArte(
idObra INTEGER PRIMARY KEY AUTO_INCREMENT,
titulo VARCHAR(50) NOT NULL,
ano INTEGER NOT NULL,
descricao VARCHAR(500) NOT NULL,
dimensoes VARCHAR(30) NOT NULL,
tecnica VARCHAR(50) NOT NULL,
idArtista INTEGER NOT NULL,
FOREIGN KEY (idArtista) REFERENCES artista(idArtista)
);

INSERT INTO obraDeArte VALUES (NULL, "Viagem no tempo", "2001", "instalação sobre fundo vermelho", "1.30 X 70 cm", "instalação", 1);
INSERT INTO obraDeArte VALUES (NULL, "Saudade", "2022", "escultura em argila", "dimensões variadas", "escultura", 2);
INSERT INTO obraDeArte VALUES (NULL, "Sem título", "1998", "video performance", "performance", 3);
INSERT INTO obraDeArte VALUES (NULL, "Como é bom te ver viva!", "2021", "pintura sobre tela", "1.20m x 2m", "pintura", 1);

CREATE TABLE galeria(
idGaleria INTEGER PRIMARY KEY AUTO_INCREMENT,
nomeGaleria VARCHAR (30) NOT NULL,
nomeDaExposicao VARCHAR (100), 
dataDeInicio DATE NOT NULL, 
dataDeEncerramento DATE NOT NULL, 
endereco VARCHAR(100),
cep VARCHAR(20), 
cidade VARCHAR(20), 
estado VARCHAR(20),
pais VARCHAR(20),
FOREIGN KEY (idArtista) REFERENCES artista(idArtista),
FOREIGN KEY (idObra) REFERENCES obraDeArte(idObra)
);

INSERT INTO galeria VALUES(NULL, "Museu de Arte de São Paulo", "Renascentistas da nova era", 2022-11-25, 2023-02-04, "Av. Paulista, 1578 - Bela Vista","01310200", "São Paulo", "SP", "Brasil", 1);
INSERT INTO galeria VALUES(NULL, "Pinacote da UFPB", "Um dia eu te encontro por aí", 2021-06-23, 2022-09-7, "2º Andar - Biblioteca Central - Campus I - Conj. Pres. Castelo Branco III", "58050085", "João Pessoa", "Paraíba", "Brasiç", 2);

UPDATE artista
SET telefone = 5599999999
WHERE id = 2;

UPDATE obraDeArte
SET ano = 2020
WHERE id = 1;

DELETE FROM obraDeArte
WHERE id = 3;

DELETE FROM obraDeArte
WHERE id = 2;

SELECT * FROM artista;
SELECT * FROM obraDeArte;
SELECT * FROM galeria;

SELECT nomeArtistico FROM artista WHERE idArtista = 2;
SELECT pais FROM artista WHERE idArtista = 1;

SELECT * FROM galeria WHERE dataDeEncerramento < 2023-11-11;
SELECT * FROM obraDeArte WHERE ano > 2000;

SELECT * FROM artista
	INNER JOIN obraDeArte
    ON artista.idArtista = obraDeArte.idObra;

SELECT nome, pais 
FROM artista
	INNER JOIN obraDeArte
    ON artista.idArtista = obraDeArte.idObra;