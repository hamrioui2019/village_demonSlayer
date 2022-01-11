
@tag
Feature: US005_AttaquerVillage
	En tant que Chef de Village
	Je veux pouvoir attaquer des villages
	Afin de les conquérir
	
  Scenario: Attaquer un village ennemi
    Given le village Oto
    When je l attaque
    Then il apparait dans les villages conquis 
		And il n apparait pas dans les villages ennemis

	Scenario: Attaquer un village non ennemi
		Given le village Suna
		When j attaque Suna
		Then il n apparait pas dans les villages conquis
	
  Scenario Outline: Attaquer un village
    Given un village <nomVillage>
    When je l attaque
    Then il apparait dans les villages conquis de <chefVillage>
		And il n apparait pas dans les <villageEnnemi>

    Examples: 
      | nomVillage | chefVillage  | villageEnnemi |
      |     "Oto"   | "Hokage"               |       ""         |
