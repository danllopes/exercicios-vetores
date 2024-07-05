# Exercícios sobre uso de Arrays em Java - Curso do Prof. Nelio Alves

Este repositório contém uma implementação em Java sobre vetores do curso ministrado pelo professor Nelio Alves no EducandoWeb. 
Os exercícios estão implementados na versão Java 21 utilizando a IDE IntelliJ IDEA.

## Estrutura do Projeto

- O projeto consiste em um programa Java que permite ao usuário escolher um exercício a partir de um menu.
- Cada exercício é implementado em um bloco `case` do switch dentro do método `main`.
- O programa utiliza `Scanner` para entrada de dados e `Locale.US` para formatação de números.


### Requisitos

1. **Java 21**: É necessário ter o JDK 21 configurado no ambiente.
2. **IntelliJ IDEA**: Recomenda-se o uso do IntelliJ IDEA como IDE para abrir e executar o projeto.


## Lista de Exercícios Implementados

### Exercício 01: Cadastro de Pessoas

#### Descrição

Neste exercício, o programa solicita ao usuário o número de pessoas a serem cadastradas. Para cada pessoa, são coletados nome, idade e altura. Ao final, o programa calcula a altura média, a porcentagem de pessoas com menos de 16 anos e lista os nomes das pessoas com menos de 16 anos.

#### Implementação

- **Classe utilizada:** `Person`
- **Funcionalidades:**
  - Cadastro de múltiplas pessoas com entrada de dados interativa.
  - Cálculo da altura média das pessoas cadastradas.
  - Contagem e listagem das pessoas com menos de 16 anos.

### Exercício 02: Verificação de Aprovação de Alunos

#### Descrição

Neste exercício, o programa solicita ao usuário o número de alunos a serem cadastrados. Para cada aluno, são coletados nome, primeira nota e segunda nota. O programa verifica se cada aluno foi aprovado, considerando a média mínima de 6 pontos.

#### Implementação

- **Classe utilizada:** `Student`
- **Funcionalidades:**
  - Cadastro de múltiplos alunos com entrada de dados interativa.
  - Verificação de aprovação com base nas notas fornecidas.
  - Listagem dos nomes dos alunos aprovados.

## Como Executar

- Clone o repositório para o seu ambiente local.
- Abra o projeto no IntelliJ IDEA.
- Execute o programa a partir do método `main` na classe `Main`.
- Siga as instruções no console para escolher um exercício e fornecer os dados necessários.



