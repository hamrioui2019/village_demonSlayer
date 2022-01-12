package villageTest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import main.Affichage;
import main.AffichageVillage;
import main.Village;

public class VillageTest {
	private Village konoha, suna, oto;
	private Affichage affichageVillage;

//    /**
//     * Constructeur de la classe-test VillageTest
//     */
//    public VillageTest()
//    {
//    }

	/**
	 * Met en place les engagements.
	 *
	 * Méthode appelée avant chaque appel de méthode de test.
	 */
	@Before
	public void setUp() // throws java.lang.Exception
	{
		affichageVillage = new AffichageVillage();

		konoha = new Village(affichageVillage);
		konoha.setNbrHabitant(5000);
		konoha.setNbrMaison(2000);
		konoha.setNomVillage("konoha");

		oto = new Village(affichageVillage);
		oto.setNbrHabitant(200);
		oto.setNbrMaison(100);
		oto.setNomVillage("oto");

		suna = new Village(affichageVillage);
		suna.setNbrHabitant(1000);
		suna.setNbrMaison(700);
		suna.setNomVillage("suna");

		konoha.addAllianceVillage(suna);
		konoha.declarerGuerre(oto);
	}

	@After
	public void tearDown() // throws java.lang.Exception
	{
	}

	@Test
	public void testConstruire() {

		assertEquals(2000, konoha.getNbrMaison());
		konoha.construireMaison();
		assertEquals(2001, konoha.getNbrMaison());
	}

	@Test
	public void testDetruire() {

		assertEquals(2000, konoha.getNbrMaison());
		konoha.detruireMaison();
		assertEquals(1999, konoha.getNbrMaison());
	}

	@Test
	public void testGetNomVillage() {
		assertEquals(konoha.getNomVillage(), "konoha");

	}

	@Test
	public void testGetNbrHabitants() {
		assertEquals(konoha.getNbrHabitant(), 5000);

	}

	@Test
	public void testGetNbrMaison() {
		assertEquals(konoha.getNbrMaison(), 2000);

	}

	@Test
	public void testSetNomVillage() {
		konoha.setNomVillage("Feu");
		assertEquals(konoha.getNomVillage(), "Feu");
	}

	@Test
	public void testSetNbrHabitant() {
		konoha.setNbrHabitant(6000);
		assertEquals(konoha.getNbrHabitant(), 6000);
	}

	@Test
	public void testSetNbrMaison() {
		konoha.setNbrMaison(2500);
		assertEquals(konoha.getNbrMaison(), 2500);
	}

	@Test
	public void testAlliance() {
		konoha.addAllianceVillage(suna);
		containsIn(konoha.getAllies(), suna);
		konoha.addAllianceVillage(oto);
		containsIn(konoha.getAllies(), oto);

	}

	public void containsIn(List<Village> listVillage, Village village) {
		assertTrue(listVillage.contains(village));
	}

	@Test
	public void testDeclarerGuerre() {
		konoha.declarerGuerre(oto);
		containsIn(konoha.getEnnemis(), oto);
		konoha.declarerGuerre(suna);
		containsIn(konoha.getEnnemis(), suna);
	}

	@Test
	public void testRetirerAlliance() {
		konoha.retirerAlliance(suna);
		doNotContains(konoha.getAllies(), suna);
		konoha.retirerAlliance(oto);
		doNotContains(konoha.getAllies(), oto);
	}

	public void doNotContains(List<Village> listVillage, Village village) {
		assertEquals(false, (listVillage).contains(village));
	}

	@Test
	public void testRetirerEnnemis() {
		konoha.retirerEnnemi(suna);
		doNotContains(konoha.getEnnemis(), suna);
		konoha.retirerEnnemi(oto);
		doNotContains(konoha.getEnnemis(), oto);
	}

}
