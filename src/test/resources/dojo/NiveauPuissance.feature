
@tag
Feature: recuperer le niveau de puissance
	En tant que demon slayer
	Je veux connaitre mon niveau de puissance
	Afin de savoir si j ai bien le bon grade
	
  Scenario Outline: un demon recupere son niveau de puissance
    Given un demon slayer <nomDemonSlayer>
    And avec un grade <grade>
    When je recupere mon niveau de puissance
    Then Le niveau de puissance <niveauDePuissance> est affecte
    
    Examples: 
      | nomDemonSlayer |    grade |  niveauDePuissance  |
      | "toto"         | 	 "chef" |     5	             |
    
