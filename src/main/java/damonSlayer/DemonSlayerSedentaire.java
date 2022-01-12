package damonSlayer;

import main.Village;

public class DemonSlayerSedentaire extends DemonSlayer {
	private Village village;

	public DemonSlayerSedentaire(Village village, String nom, int nombreMouvement, String typeSouffle) {
		super(nom, nombreMouvement, typeSouffle);
		this.setVillage(village);
	}

	public Village getVillage() {
		return this.village;
	}

	public void setVillage(Village village) {
		this.village = village;
	}

}



