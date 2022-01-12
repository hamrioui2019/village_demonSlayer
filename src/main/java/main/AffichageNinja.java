package main;


public class AffichageNinja implements Affichage {

	public String afficher(Village village) {

		String listNinja = "";
		
		for(Ninja ninja : village.getListNinja()) {
			listNinja = listNinja.concat("Nom : " + ninja.getNom() + " | Village : " + ninja.getVillage().getNomVillage() + "\n");
		}
		
		return listNinja;
	}

}
