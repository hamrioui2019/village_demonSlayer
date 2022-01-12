
@tag
Feature: Tuer un traitre
	En tant que chef du village
	Je veux pouvoir tuer les traitres
	Afin de maintenir la paix

  Scenario Outline: Tuer un traitre
    Given un village <nomVillage>
    When le village a <nombreHabitants> habitants
    And un traitre est tue
    Then le <nombreHabitantFinal> est enregistre

    Examples: 
      | nomVillage  | nombreHabitants | nombreHabitantFinal |
      | "Konoha" |     10000 | 9999  |
      | "Suna" |     1500 |   1499  |
