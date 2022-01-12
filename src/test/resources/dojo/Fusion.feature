
@tag
Feature: Tuer un traitre
	En tant que chef du village
	Je veux pouvoir tuer les traitres
	Afin de maintenir la paix

  Scenario Outline: Accueillir un demon slayer
    Given le village <nomVillage>
    When ajouter un demon slayer
    Then le <nombreHabitantFinal> est enregistre

    Examples: 
      | nomVillage | nombreHabitantFinal |
      | "Konoha" |    5001  |
