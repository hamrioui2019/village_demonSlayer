
@tag


Feature: US004_peutVaincreUnDemon
	Je souhaite envoyer une equipe face un démon identifie mais je veux avant m'assurer que la somme de leur niveau 
	est superieur ou egal au grade du démon
	
	
  Scenario Outline: faisabilite denvoyer une equipe face à un demon 
    Given un demon slayer de niveau d1 et son coequipier de niveau d2, alors si d1+d2 > d3 qui est le grade du demon 
    Then peutVaincreDemon = true 
    
    Examples: 
      | name    | grade | gradeCoequipier  | GradeDémon | Resultat|
      | tomioka |    	5 | 3 						 	 |   2   			|  True|
      | kamado  |     3 | 5    						 |   2  		  |  True|
    
  Scenario Outline: faisabilité denvoyer une équipe face à un démon 
    Given un demon slayer de niveau d1 et son coequipier de niveau d2, alors si d1+d2 > d3 qui est le grade du demon 
    Then peutVaincreDemon = false avec le <message d'erreur> : 
    Examples: 
  
      | name    | grade | gradeCoequipier  | GradeDémon | Resultat  | message derreur     |
      | tomioka |    	5 | 2 						 	 |   9   		|  false     |  niveau trop faible |
      | kamado  |     2 | 5    						 |   9 		  |  false     |  niveau trop faible |