
@tag


Feature: US004_peutVaincreUnDemon
	Je souhaite envoyer une equipe face un d�mon identifie mais je veux avant m'assurer que la somme de leur niveau 
	est superieur ou egal au grade du d�mon
	
	
  Scenario Outline: faisabilite denvoyer une equipe face � un demon 
    Given un demon slayer de niveau d1 et son coequipier de niveau d2, alors si d1+d2 > d3 qui est le grade du demon 
    Then peutVaincreDemon = true 
    
    Examples: 
      | name    | grade | gradeCoequipier  | GradeD�mon | Resultat|
      | tomioka |    	5 | 3 						 	 |   2   			|  True|
      | kamado  |     3 | 5    						 |   2  		  |  True|
    
  Scenario Outline: faisabilit� denvoyer une �quipe face � un d�mon 
    Given un demon slayer de niveau d1 et son coequipier de niveau d2, alors si d1+d2 > d3 qui est le grade du demon 
    Then peutVaincreDemon = false avec le <message d'erreur> : 
    Examples: 
  
      | name    | grade | gradeCoequipier  | GradeD�mon | Resultat  | message derreur     |
      | tomioka |    	5 | 2 						 	 |   9   		|  false     |  niveau trop faible |
      | kamado  |     2 | 5    						 |   9 		  |  false     |  niveau trop faible |