package testing;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import damonSlayer.DemonSlayer;
import damonSlayer.DemonSlayerSedentaire;
import damonSlayer.Grade;
import main.Village;

public class DemonSlayerVillageTest {
	private Village konoha;
	private DemonSlayerSedentaire toto;
	private Grade grade1;

	@Test
	public void testGetVillage() {
		assertEquals(konoha, toto.getVillage());
	}

	@Before
	public void setUp() // throws java.lang.Exception
	{

		konoha = new Village();
		konoha.setNbrHabitant(5000);
		konoha.setNbrMaison(2000);
		toto = new DemonSlayerSedentaire(konoha, "toto", 11, "eau");
		grade1 = new Grade("chef", 5);
		grade1.getIntitule();
		toto.setGrade(grade1);
	
		
	}

	@After
	public void tearDown() // throws java.lang.Exception
	{
	}
}
