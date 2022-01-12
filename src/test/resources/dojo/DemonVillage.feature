
@tag
Feature: Recuperer le village du demon slayer sedentaire
	En tant que demon slayer sedentaire
	Je veux connaitre a quel village j appartiens
	Afin de le communiquer a ma communaute

  Scenario Outline: recuperer le village
    Given un demon slayer sedentaire <demonSlayerSedentaire>
    When recuperer le nom du village du demon slayer sedentaire
    Then le <nomVillageAssocie> est celui qui lui est attribue

    Examples: 
      | demonSlayerSedentaire  | nomVillageAssocie |
      | "toto" |     "konoha" |
