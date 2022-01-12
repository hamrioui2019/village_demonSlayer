package main;

import damonSlayer.DemonSlayerSedentaire;

public class AffichageDemonSlayerSedentaire implements Affichage {

	
	public String afficher(Village village) {

		String listDemonSlayerSedentaire = "";
		
		for(DemonSlayerSedentaire demonslayer : village.getListDemonSlayerSedentaires()) {
			listDemonSlayerSedentaire = listDemonSlayerSedentaire.concat("Nom : "  + demonslayer.getNom() + " | Type de souffle : " + demonslayer.getTypeDeSouffle() + "\n");

		}
		
		return listDemonSlayerSedentaire;
	}

}


