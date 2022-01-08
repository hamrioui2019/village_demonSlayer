
@tag


Feature: US002_AjouterDansUnGrade
	Je souhaite integrer un Demon Slayer dans son grade correspondant en fonction de ses capacités.
	Selon son niveau de puissance, on lui affecte son grade
	
	
  Scenario Outline: AjouterDansUnGrade
    Given Lutilisateur definit un type de grade et le niveau du grade puissance compris entre 1 et 5
    When lutilisateur valide
    Then Le demon Slayer affecte a son grade
    
  Examples: 
      | name    | grade 							| niveauDePuissance  				|
      | tomioka |  	pillier	  				|  					5								|
      | kamado  |  sous-lieutenant 		|     			3								|
    
  Scenario Outline: AjouterDansUnGrade 
    Given Lutilisateur definit un niveau de puissance superieur à 5
    Then Le grade du demon Slayer nest pas cree avec le <message d'erreur> : 
    Examples: 
      | name    |   grade 				  | niveauDePuissance  | 		messageErreur 							|
      | tomioka |    pillier				|  					5     	 |																|
      | kamado  |     	--					|     		7					 |	grade non compris entre 1 et 5|