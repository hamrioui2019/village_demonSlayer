package testing;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import main.ChefVillage;
import main.Village;
public class ChefVillageTest {
	private Village suna,oto;
	private ChefVillage kazekage;
	
	@Before
	public void setUp() // throws java.lang.Exception
	{
		
		suna = new Village();
		suna.setNbrHabitant(5000);
		suna.setNbrMaison(2000);
		suna.setNomVillage("suna");
		kazekage = new ChefVillage("kazekage", suna);

		oto = new Village();
		oto.setNbrHabitant(200);
	}

	@After
	public void tearDown() // throws java.lang.Exception
	{
	}
	
	@Test
	public void testTuerTraitre() {

		kazekage.tuerTraitre();
		assertEquals(4999, suna.getNbrHabitant());
	}
	@Test
	public void testSetNomChef() {
		kazekage.setNomChef("Gaara");
		assertEquals(kazekage.getNomChef(), "Gaara");
	}

	@Test
	public void testGetNomChef() {
		assertEquals(kazekage.getNomChef(), "kazekage");
	}
	
	@Test
	public void testAttaquerVillage() {
		suna.declarerGuerre(oto);
		kazekage.attaquerVillage(oto);
		System.out.println(kazekage.getListVillageConquis());
		assertTrue(kazekage.getListVillageConquis().contains(oto));
		
	}


}
