
@tag

Feature: US003_FaireEquipe
	Je souhaite ajouter un demon slayer à un autre si ces derniers sont de type de souffle différent
	
  Scenario Outline: un demon slayer peut faire equipe avec un autre
    Given un demon slayer d un type de souffle donnee
    When l autre demon slayer un dun type different 
    Then Les deux demons slayers peuvent faire equipe et chaque demon slayer se soit affecte un coequipier
    
    Examples: 
      | name    |  typeDeSouffle  | coequipier				|
      | tomioka |    		eau			  | kamado 						|
      | kamado  |     	feu		 		| tomioka    				|
    
  Scenario Outline: 
    Given un demon slayer dun type de souffle donnee
    When l autre demon slayer un dun type different 
    Then Les deux demons slayers ne peuvent pas faire equipe  avec le <message d'erreur> : 
    Examples: 
      | name    |  typeDeSouffle  | coequipier				|
      | tomioka |    		eau			  | --- 						|
      | kamado  |     	eau		 		| ---    				|