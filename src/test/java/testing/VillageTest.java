package testing;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import java.util.List;


import main.ChefVillage;
import main.Ninja;
import main.Village;

public class VillageTest {
	private Village Konoha, Suna, Oto;
	private ChefVillage Kage;

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
		Konoha = new Village();
		Konoha.setNbrHabitant(5000);
		Konoha.setNbrMaison(2000);
		Konoha.setNomVillage("Konoha");
		Kage = new ChefVillage("Hokage", Konoha);

		Oto = new Village();
		Oto.setNbrHabitant(200);
		Oto.setNbrMaison(100);
		Oto.setNomVillage("Oto");

		Suna = new Village();
		Suna.setNbrHabitant(1000);
		Suna.setNbrMaison(700);
		Suna.setNomVillage("Suna");

		Konoha.addAllianceVillage(Suna);
		Konoha.declarerGuerre(Oto);
	}

	@After
	public void tearDown() // throws java.lang.Exception
	{
	}

	@Test
	public void testConstruire() {

		assertEquals(2000, Konoha.getNbrMaison());
		Konoha.construireMaison();
		assertEquals(2001, Konoha.getNbrMaison());
	}

	@Test
	public void testDetruire() {

		assertEquals(2000, Konoha.getNbrMaison());
		Konoha.detruireMaison();
		assertEquals(1999, Konoha.getNbrMaison());
	}

	@Test
	public void testTuerTraitre() {

		Kage.tuerTraitre();
		assertEquals(4999, Konoha.getNbrHabitant());
	}

	@Test
	public void testGetNomVillage() {
		assertEquals(Konoha.getNomVillage(), "Konoha");

	}

	@Test
	public void testGetNbrHabitants() {
		assertEquals(Konoha.getNbrHabitant(), 5000);

	}

	@Test
	public void testGetNbrMaison() {
		assertEquals(Konoha.getNbrMaison(), 2000);

	}

	@Test
	public void testSetNomVillage() {
		Konoha.setNomVillage("Feu");
		assertEquals(Konoha.getNomVillage(), "Feu");
	}

	@Test
	public void testSetNbrHabitant() {
		Konoha.setNbrHabitant(6000);
		assertEquals(Konoha.getNbrHabitant(), 6000);
	}

	@Test
	public void testSetNbrMaison() {
		Konoha.setNbrMaison(2500);
		assertEquals(Konoha.getNbrMaison(), 2500);
	}

	@Test
	public void testSetNomChef() {
		Kage.setNomChef("Tsunade");
		assertEquals(Kage.getNomChef(), "Tsunade");
	}

	@Test
	public void testGetNomChef() {
		assertEquals(Kage.getNomChef(), "Hokage");
	}

	@Test
	public void testAlliance() {
		Konoha.addAllianceVillage(Suna);
		containsIn(Konoha.getAllies(), Suna);
		Konoha.addAllianceVillage(Oto);
		containsIn(Konoha.getAllies(), Oto);

	}

	public void containsIn(List<Village> listVillage, Village village) {
		assertTrue(listVillage.contains(village));
	}

	@Test
	public void testDeclarerGuerre() {
		Konoha.declarerGuerre(Oto);
		containsIn(Konoha.getEnnemis(), Oto);
		Konoha.declarerGuerre(Suna);
		containsIn(Konoha.getEnnemis(), Suna);
	}

	@Test
	public void testRetirerAlliance() {
		Konoha.retirerAlliance(Suna);
		doNotContains(Konoha.getAllies(), Suna);
		Konoha.retirerAlliance(Oto);
		doNotContains(Konoha.getAllies(), Oto);
	}

	public void doNotContains(List<Village> listVillage, Village village) {
		assertEquals(false, (listVillage).contains(village));
	}

	@Test
	public void testRetirerEnnemis() {
		Konoha.retirerEnnemi(Suna);
		doNotContains(Konoha.getEnnemis(), Suna);
		Konoha.retirerEnnemi(Oto);
		doNotContains(Konoha.getEnnemis(), Oto);
	}

	@Test
	public void testAttaquerVillage() {
		Kage.attaquerVillage(Suna);
		doNotContains(Kage.getListVillageConquis(), Suna);
		Kage.attaquerVillage(Oto);
		containsIn(Kage.getListVillageConquis(), Oto);
	}

	@Test
	public void testDefendreVillage() {
		Ninja naruto = new Ninja("Naruto", Konoha);
		assertTrue(naruto.defendreVillage());
	}
}
