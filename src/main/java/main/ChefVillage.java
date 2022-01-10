package main;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Décrivez votre classe ChefVillage ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class ChefVillage
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private String nomChef;
    private Village village;
    
    private List<Village> listVillageConquis;

   

	/**
     * Constructeur d'objets de classe ChefVillage
     */
    public ChefVillage(String nomChef, Village village)
    {
        this.nomChef = nomChef;
        this.village = village;
        this.listVillageConquis = new ArrayList<Village>();

    }
    
    public void attaquerVillage(Village cible)
    {
   	 if ((this.village.getEnnemis().contains(cible)) && !(this.village.equals(cible))) {
	   	 this.listVillageConquis.add(cible);
	   	 this.village.retirerEnnemi(cible);
    }
    }
    
    
    public void tuerTraitre(){
        village.setNbrHabitant(village.getNbrHabitant()-1);
    }
    
    public void setNomChef(String nouveauNom)
    {
        this.nomChef = nouveauNom;

    }
    public String getNomChef()
    {
    	return this.nomChef;
    }
    
    public List<Village> getListVillageConquis() {
		return Collections.unmodifiableList(this.listVillageConquis);
	}


    
}
