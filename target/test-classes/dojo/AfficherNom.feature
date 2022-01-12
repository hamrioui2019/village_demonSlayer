
Feature: Recuperer le nom du demon slayer sedentaire
	En tant que demon slayer sedentaire
	Je veux connaitre mon nom 
	Afin de le transmettre au village

  Scenario: Recuperer le nom
    Given un demon slayer sedentaire
    When recupere son nom
    Then son nom correspond bien 