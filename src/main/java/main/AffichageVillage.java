package main;

import damonSlayer.DemonSlayerSedentaire;

public class AffichageVillage implements Affichage {

	public String afficher(Village village) {
		
		String listHabitantVillage= "Il y a " + village.getNbrHabitant() + " habitants dans ce village, dont : \n";
		String listNinja = "" +  village.getListNinja().size() + " ninjas qui sont : \n";
		
		for(Ninja ninja : village.getListNinja()) {
			listNinja = listNinja.concat("Nom : " + ninja.getNom() + "\n");
		}
		
		
		String listDemonSlayerSedentaire = " et " + village.getListDemonSlayerSedentaires().size() + " demon slayers qui sont : \n" ;
		
		for(DemonSlayerSedentaire demonslayer : village.getListDemonSlayerSedentaires()) {
			listDemonSlayerSedentaire = listDemonSlayerSedentaire.concat("Nom : " + demonslayer.getNom() + " | Type de souffle : " + demonslayer.getTypeDeSouffle() + "\n");
		}
		
		listHabitantVillage = listHabitantVillage.concat(listNinja);
		listHabitantVillage = listHabitantVillage.concat(listDemonSlayerSedentaire);

		return listHabitantVillage;
	}
}
