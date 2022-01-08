
@tag


Feature: US001_CreerUnPersonnage
	Je souhaite integrer un personnage qui a un nom, un nombre de mouvements, un type de souffle
	afin quil puisse faire equipe pour affronter des demons
	
	
  Scenario Outline: Creer un demon slayer 
    Given le <nom>, le <nombre de mouvements> et le <type de souffle> dun demon
    When lutilisateur valide
    Then Le demon Slayer est cree
    
    Examples: 
      | name    | nbDeMouvements | typeDeSouffle  |
      | tomioka |    					 5 | eau 						|
      | kamado  |     				 7 | feu    				|
    
  Scenario Outline: Creer un demon slayer 
    Given La creation dun demon slayer comprend un nom, nombre de mouvements et type de souffle
    When lutilisateur valide
    Then Le demon Slayer nest pas cree avec le <message d'erreur> : 
    Examples: 
      | name    | nbDeMouvements | typeDeSouffle  | messageErreur 				|
      | tomioka |    					 5 | eau 						|     									|
      | kamado  |     				-6 | feu    				| nbDeMouvements negatif|