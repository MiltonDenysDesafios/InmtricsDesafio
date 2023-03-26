#Author: Milton Denys

@api_test
Feature: Validar Api Star Wars

  Scenario: Validar quantos filmes tem a participacao do diretor e produtor

    When é feito uma chamada get
    Then mostrar em quantos filmes aparece "George Lucas" como diretor
    And mostrar em quantos filmes aparece "Rick McCallum" como produtor

  Scenario: Enviar um GET para API e buscar os filmes pelo titulo

    When é feito uma chamada get para o filme "The Phantom Menace"
    Then validar que é retornado os filmes corretamente