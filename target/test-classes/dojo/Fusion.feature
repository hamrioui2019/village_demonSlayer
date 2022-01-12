
@tag
Feature: Recuperer le nombre d habittant
	En tant que chef du village
	Je veux pouvoir ajouter un demon slayer
	Afin de voir ma population grandir

  Scenario Outline: Accueillir un demon slayer
    Given le village <nomVillage>
    When ajouter un demon slayer
    Then le <nombreHabitantFinal> est enregistre

    Examples: 
      | nomVillage | nombreHabitantFinal |
      | "Konoha" |    5001  |
