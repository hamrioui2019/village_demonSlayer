Feature:  Attaquer un village
	En tant que Chef de Village, 
	je veux d�clarer la guerre et attaquer un certain village 
	Afin de conqu�rir le pays
	
 Scenario: attaquer un village  
	  Given un village 
	  And un chef de village
	  And un autre village
	  When  le chef de village veut declarer la guerre    
	  Then  le village devra apparaitre dans la ma liste de village conquis
  
 Scenario: retirer de la liste d ennemie un village conquis
    Given un village 
  	And un chef de village
  	And un autre village
 		When  le chef de village veut declarer la guerre    
    Then retirer de ma liste d ennemis

  Scenario: en tant que chef de village, je peux ajouter un allies
    Given un village 
  	And un chef de village
	  And un autre village  	
 		When  le chef de village s allie avec un village    
    Then ajouter le village a la liste d allies
    
    
 