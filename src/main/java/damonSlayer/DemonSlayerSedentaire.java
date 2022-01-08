package damonSlayer;

import main.Village;

public class DemonSlayerSedentaire extends DemonSlayer {
	private Village village;
	public DemonSlayerSedentaire(Village village,String n, int nb, String type) {
		super(n, nb, type);
		this.setVillage(village);
	}
	public Village getVillage() {
		return village;
	}
	public void setVillage(Village village) {
		this.village = village;
	}

}
