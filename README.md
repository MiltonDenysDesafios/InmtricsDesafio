# InmetricsChallenge
This project is a challenge proposed by Inmetrics, which consists of a webservice and a UI test automation challenge.

# UI Test

# Description:

[InmetricsTest.feature](https://github.com/MiltonDenysDesafios/InmtricsDesafio/blob/master/src/test/java/features/ui/InmetricsTest.feature)

The link to job listings can be found on the Inmetrics website homepage, in the "Confira nossas vagas" section.
When clicking on the corresponding link, the user should be redirected to the job listings page on the Gupy platform, where they can view available jobs and apply for them.
The redirection should be validated to ensure that the user is directed to the correct page on the Gupy website.

# WebService

# Description:

[StarWars.feature](https://github.com/MiltonDenysDesafios/InmtricsDesafio/blob/master/src/test/java/features/api/StarWars.feature)

The list of Star Wars movies should be obtained through the API https://swapi.dev/api/films/
The API should be called passing the movie title as a parameter in the URL, for example: https://swapi.dev/api/films/?search=A%20New%20Hope
The API response should be in JSON format and should contain information about the movies, such as title, episode, director, producer, release date, characters, planets, among others.
The information about each movie should be validated to ensure that it is correct.
If the search returns no movies, the API response should indicate this clearly.

# Technologies 

 - Cucumber: Framework de teste de aceitação (BDD) que utiliza a linguagem Gherkin para escrever cenários de teste em linguagem natural.
 - Selenium WebDriver: Biblioteca de testes automatizados de interface do usuário (UI) para web, que permite interagir com elementos da página web e automatizar tarefas em navegadores.
 - JUnit: Framework de testes unitários para Java.
 - Rest-assured: Biblioteca Java para testes de API RESTful que permite escrever testes de forma mais clara e legível, utilizando um estilo fluente de linguagem de programação.
