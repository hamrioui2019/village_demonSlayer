package main;

public class Ninja {
	private String nom;
	private Village village;

	public Ninja(String nom, Village village) {
		this.nom = nom;
		this.setVillage(village);
	}

	public boolean defendreVillage() {
		return true;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Village getVillage() {
		return this.village;
	}

	public void setVillage(Village village) {
		this.village = village;
	}

}
