#Author: Milton Denys

@api_test
Feature: Buscar e exibir os filmes da franquia Star Wars

  Scenario: Enviar um GET para API e buscar os filmes pelo titulo

    Given tenho a url
    When é feito uma chamada get
    Then validar que é retornado os filmes corretamente