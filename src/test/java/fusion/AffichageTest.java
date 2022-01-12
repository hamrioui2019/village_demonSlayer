package fusion;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import damonSlayer.DemonSlayerSedentaire;
import main.AffichageDemonSlayerSedentaire;
import main.AffichageNinja;
import main.AffichageVillage;
import main.Ninja;
import main.Village;

public class AffichageTest {

	private DemonSlayerSedentaire toto;
    private DemonSlayerSedentaire tata;
    private Ninja naruto; 
    private Ninja sasuke; 
    private Village konoha;
    private AffichageDemonSlayerSedentaire affichageDemon;
    private AffichageNinja affichageNinja;
    private AffichageVillage affichageVillage;

	@Before
    public void setUp() // throws java.lang.Exception
    {
		affichageDemon = new AffichageDemonSlayerSedentaire();
		affichageNinja = new AffichageNinja();
		affichageVillage = new AffichageVillage();
		
		konoha = new Village();
		konoha.setNbrHabitant(5000);
		konoha.setNbrMaison(2000);
		konoha.setNomVillage("konoha");
		
        toto = new DemonSlayerSedentaire(konoha,"toto",11,"eau");
        tata = new DemonSlayerSedentaire(konoha,"tata", 6, "feu");
        
        naruto = new Ninja("naruto",konoha);
        sasuke = new Ninja("sasuke",konoha);
        
        konoha.ajouterDemonSlayerSedentaire(toto);
        konoha.ajouterDemonSlayerSedentaire(tata);
        
        konoha.ajouterNinja(naruto);
        konoha.ajouterNinja(sasuke);
        }

	
	@Test
	public void testAffichageDemonSlayer() {
		assertEquals("Nom : toto | Type de souffle : eau\nNom : tata | Type de souffle : feu\n", affichageDemon.afficher(konoha));
	}
	
	@Test
	public void testAffichageNinja() {
		assertEquals("Nom : naruto | Village : konoha\nNom : sasuke | Village : konoha\n", affichageNinja.afficher(konoha));
	}
	
	@Test
	public void testAffichageVillage() {
		assertEquals("Il y a 5004 habitants dans ce village, dont : \n2 ninjas qui sont : \nNom : naruto\nNom : sasuke\n et 2 demon slayers qui sont : \nNom : toto | Type de souffle : eau\nNom : tata | Type de souffle : feu\n", affichageVillage.afficher(konoha));
	}
}
