package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import damonSlayer.DemonSlayerSedentaire;

/**
 * DÃ©crivez votre classe Village ici.
 *
 * @author (votre odile et Fares)
 * @version (un numÃ©ro de version ou une date)
 */
public class Village {
	// variables d'instance - remplacez l'exemple qui suit par le vÃ´tre
	private String nomVillage;
	private int nbrHabitants;
	private int nbrMaison;
	private List<Village> listAllies;
	private List<Village> listEnemies;
//   Ajouter une liste de demonSlayerSedentaire pour nous permettre de récupérer leurs informations et les lier au village 
	private List<DemonSlayerSedentaire> listDemonSlayerSedentaires;

	/**
	 * Constructeur d'objets de classe Village
	 */
	public Village() {
		// initialisation des variables d'instance
		this.nbrHabitants = 100;
		this.nbrMaison = 50;
		this.nomVillage = "";
		this.listAllies = new ArrayList<Village>();
		this.listEnemies = new ArrayList<Village>();
	}

	public void construireMaison() {

		this.nbrMaison++;

	}

	public void detruireMaison() {
		this.nbrMaison--;

	}

	public void addAllianceVillage(Village nouvelAllie) {
		if (this.getAllies().contains(nouvelAllie))
			return;
		if (this.getEnnemis().contains(nouvelAllie)) // Si le nouvel allié est un ennemi, on le retire de la liste des
														// ennemis et on le rajoute dans la liste des alliés
			this.listAllies.remove(nouvelAllie);

		this.listAllies.add(nouvelAllie);

	}

	public void declarerGuerre(Village nouvelEnemie) {
		if (this.getEnnemis().contains(nouvelEnemie))
			return;
		if (this.getAllies().contains(nouvelEnemie)) // Si le nouvel ennemi est un allié, on le retire de la liste des
														// alliés et on le rajoute dans la liste des ennemis
			this.listAllies.remove(nouvelEnemie);
		this.listEnemies.add(nouvelEnemie);

	}

	public void setNomVillage(String nouveauNom) {
		this.nomVillage = nouveauNom;

	}

	public String getNomVillage() {
		return this.nomVillage;

	}

	public int getNbrHabitant() {
		return this.nbrHabitants;

	}

	public int getNbrMaison() {
		return this.nbrMaison;

	}

	public void setNbrHabitant(int nbrHabitant) {
		this.nbrHabitants = nbrHabitant;

	}

	public void setNbrMaison(int nbrMaison) {
		this.nbrMaison = nbrMaison;

	}

	public List<Village> getAllies() {
		return Collections.unmodifiableList(this.listAllies);

	}

	public List<Village> getEnnemis() {
		return Collections.unmodifiableList(this.listEnemies);

	}

	public void retirerAlliance(Village village) {
		if (!(this.getAllies().contains(village))) // On vérifie si ce village est bien un allié
			return;
		this.listAllies.remove(village);

	}

	public void retirerEnnemi(Village village) {
		if (!(this.getEnnemis().contains(village))) // On vérifie si ce village est bien un ennemi
			return;
		this.listEnemies.remove(village);

	}

	public List<DemonSlayerSedentaire> getListDemonSlayerSedentaires() {
		return Collections.unmodifiableList(this.listDemonSlayerSedentaires);
	}

}
