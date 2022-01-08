package testing;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import main.Village;

public class DamonSlayerVillageTest {
	private Village Konoha;
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Before
	public void setUp() // throws java.lang.Exception
	{
	
	Konoha = new Village();
	Konoha.setNbrHabitant(5000);
	Konoha.setNbrMaison(2000);
	}
}
