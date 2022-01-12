package fusion;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import damonSlayer.DemonSlayerSedentaire;
import main.Village;

import static org.junit.Assert.*;

public class DemonSlayerSedentaireTest {
	private DemonSlayerSedentaire toto;
	private Village konoha;
	private Village oto;

	public DemonSlayerSedentaireTest() {
	}

	@Before
	public void setUp() // throws java.lang.Exception
	{
		konoha = new Village();
		oto = new Village();
		toto = new DemonSlayerSedentaire(konoha, "toto", 11, "eau");
	}

	@After
	public void tearDown() // throws java.lang.Exception
	{
		// Lib�rez ici les ressources engag�es par setUp()
	}

	@Test
	public void testDemonSlayerSedentaire() {
		toto.setVillage(oto);
		assertEquals(oto, toto.getVillage());
	}
}
