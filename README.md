# InmetricsDesafio
Este projeto é um desafio proposto pela Inmetrics, que consiste em um desafio de webservice e outro de UI test automation.

# Ui Test

## Feature: Validar acesso a pagina Gupy

### Scenario: Validar que ao clicar no link confira nossas vagas o usuário é encaminhado para o site gupy

###  Given

Que acesso a home do site da Inmetrics
###  When

Desço até a sessão "Confira nossas vagas" e clico no link correspondente
### Then

Deve ser validado que o usuário é encaminhado para a tela de visualização das vagas no site da plataforma Gupy.

# Observações:

O link para as vagas de emprego pode ser encontrado na página inicial do site da Inmetrics, na sessão "Confira nossas vagas".
Ao clicar no link correspondente, o usuário deve ser redirecionado para a página de vagas no site da plataforma Gupy, onde poderá visualizar as vagas disponíveis e se candidatar a elas.
O redirecionamento deve ser validado para garantir que o usuário seja direcionado para a página correta no site da Gupy.



# WebService

## Feature: Validar Api Star Wars

### Scenario: Enviar um GET para API e buscar os filmes pelo titulo

###  Given

tenho a url
###  When

é feito uma chamada get
### Then

validar que é retornado os filmes corretamente

Exemplos:

| Título do Filme           | Resposta Esperada     |
|---------------------------|-----------------------|
| "A New Hope"              | Filme 4 da saga       |
| "The Empire Strikes Back" | Filme 5 da saga       |
| "Return of the Jedi"      | Filme 6 da saga       |


# Observações:

A lista de filmes da saga Star Wars deve ser obtida através da API https://swapi.dev/api/films/
A API deve ser chamada passando o título do filme como parâmetro na URL, por exemplo: https://swapi.dev/api/films/?search=A%20New%20Hope
A resposta da API deve estar no formato JSON e deve conter as informações sobre os filmes, como título, episódio, diretor, produtor, lançamento, personagens, planetas, entre outras.
As informações sobre cada filme devem ser validadas para garantir que estão corretas.
Caso a busca não retorne nenhum filme, a resposta da API deve indicar isso de forma clara.

# Tecnologias utilizadas
Cucumber: Framework de teste de aceitação (BDD) que utiliza a linguagem Gherkin para escrever cenários de teste em linguagem natural.
Selenium WebDriver: Biblioteca de testes automatizados de interface do usuário (UI) para web, que permite interagir com elementos da página web e automatizar tarefas em navegadores.
JUnit: Framework de testes unitários para Java.
Rest-assured: Biblioteca Java para testes de API RESTful que permite escrever testes de forma mais clara e legível, utilizando um estilo fluente de linguagem de programação.
