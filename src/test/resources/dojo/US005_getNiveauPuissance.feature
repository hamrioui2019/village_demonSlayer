Feature: US_005_getNiveauPuissance
	Je souhaite définir le niveau de puissance dun demon slayer
	
  Scenario Outline: un demon slayer a un niveau de puissance
    Given un demon slayer
    Then Le demon slayer a un niveau de puissance qui définit son grade
    
    Examples: 
      | name    |  niveau de puissance   |
      | tomioka |    	5	             |
      | kamado  |     	2		         |
    
  Scenario Outline: 
    Given un demon slayer
    When le demon a un niveau de puissance 0 ou supérieur strictement à 5
    Then Le demon slayer ne peut être définit  avec le <message d'erreur> :
    Examples: 
      | name    |  niveau de puissance  |               messageErreur		                    |
      | tomioka |       5		        |                  --------                             |
      | kamado  |     	7		        | niveauDePuissance nul ou supérieur strictement à 5    |