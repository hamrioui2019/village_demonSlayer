
@tag
Feature: Construire une maison
	En tant que Village
	Je veux pouvoir construire des maisons
	Afin d agrandir le village

  Scenario Outline: Construire une maison
    Given le village <nomVillage>
    When le village a <nombreDeMaison> maisons
    And une maison est construite
    Then le <nombreDeMaisonFinal> enregistre

    Examples: 
      | nomVillage  | nombreDeMaison | nombreDeMaisonFinal|
      | "Konoha" |     2000 | 2001  |
