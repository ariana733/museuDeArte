# Museu De Arte
**Atividade de Modelagem de Banco de Dados no MySQL e POO em JAVA para o bootcamp da SoulCodeAcademy.**

O objetivo desta atividade era de escolher uma temática e criar um diagrama de Entidade-Relacionamento, desenvolver as tabelas na linguagem SQL e construir as classes com seus respectivos construtores, E bom uso de Getter e Setter no Java de cada entidade.

Escolhi o tema de Museu De Arte, ou Galeria de Arte, fiz de uma forma simplidicada mas pensando de forma técnica a cardialidade das 3 entidades. 

![Diagrama-ER-MuseuDeArte drawio](https://user-images.githubusercontent.com/113555552/200097877-48631777-7fd1-46e8-a0ae-33ac6653c602.jpg)

## Sentenças:

Um artista PODE ESTAR criando UMA ou MAIS obras de arte.

Uma ou mais obras de arte DEVEM SER criadas por UM e APENAS UM artista.

Várias obras de arte DEVEM estar expostas em UMA e APENAS UMA galeria.

Uma galeria de arte DEVE ESTAR expondo VÁRIAS obras de arte.

## Modelo Relacional:

Artista (PK idArtista, nomeCompleto, nomeArtistico, dataNascimento, localNascimento, telefone,  email, endereco,  cep, cidade, estado, pais, tecnicasPrincipais)

Obra_De_Arte (PK idObra,  titulo,  ano,  descricao, tecnica, FK idArtista)

Galeria (PK idGaleria, nomeDaExposicao, dataDeInicio, dataDeEncerramento, endereco,  cidade, estado,  pais, idArtista, FK idObra)
