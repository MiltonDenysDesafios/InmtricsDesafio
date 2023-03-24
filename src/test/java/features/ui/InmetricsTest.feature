#Author: Milton Denys

@inm_test
Feature: Validar acesso a pagina Gupy

Scenario: Validar que ao clicar no link confira nossas vagas o usuário é encaminhado para o site gupy

Given que acesso a home do site da Inmetrics
When desço até a sessão confira nossas vagas
Then validar que ao clicar no link o usuário é encaminhado para a tela de visualização das vagas