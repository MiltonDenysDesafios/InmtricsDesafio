#Author: Milton Denys

@api_test
Feature: Validar Api Star Wars

  Scenario: Validar quantos filmes tem a participacao do diretor e produtor

    Given tenho a url
    When é feito uma chamada get
    Then mostrar em quantos filmes aparece "George Lucas" como diretor
    And mostrar em quantos filmes aparece "Rick McCallum" como produtor

  Scenario: Enviar um GET para API e buscar os filmes pelo titulo

    Given tenho a url
    When é feito uma chamada get para o filme ""
    Then validar que é retornado os filmes corretamente