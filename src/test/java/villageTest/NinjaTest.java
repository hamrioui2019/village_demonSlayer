package villageTest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.Affichage;
import main.AffichageNinja;
import main.Ninja;
import main.Village;

public class NinjaTest {
	private Village konoha;
	private Affichage affichage;

	@Before
	public void setUp() // throws java.lang.Exception
	{

		affichage = new AffichageNinja();
		konoha = new Village(affichage);
		konoha.setNbrHabitant(5000);
		konoha.setNbrMaison(2000);
		konoha.setNomVillage("konoha");

	}

	@After
	public void tearDown() // throws java.lang.Exception
	{
	}

	@Test
	public void testDefendreVillage() {
		Ninja naruto = new Ninja("Naruto", konoha);
		assertTrue(naruto.defendreVillage());
		naruto.setNom("Naruto Uzumaki");
		assertEquals("Naruto Uzumaki", naruto.getNom());
		assertEquals(konoha, naruto.getVillage());
	}
}
