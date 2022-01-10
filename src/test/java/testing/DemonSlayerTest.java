package testing;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import damonSlayer.DemonSlayer;
import damonSlayer.Grade;

import static org.junit.Assert.*;

public class DemonSlayerTest
{
    private DemonSlayer toto;
    private Grade grade1;
    private  DemonSlayer tata;
    private Grade pillier; 

    /**
     * Constructeur de la classe-test DemonSlayerTest
     */
    public DemonSlayerTest()
    {
    }

    /**
     * Met en place les engagements.
     *
     * M�thode appel�e avant chaque appel de m�thode de test.
     */
    @Before
    public void setUp() // throws java.lang.Exception
    {
        toto = new DemonSlayer("toto",11,"eau");
        grade1 = new Grade("chef", 5);
        grade1.getIntitule();
        toto.setGrade(grade1);
        tata = new DemonSlayer("tata", 6, "feu");
        
        pillier= new Grade("pillier",5);

    }

    /**
     * Supprime les engagements
     *
     * M�thode appel�e apr�s chaque appel de m�thode de test.
     */
    @After
    public void tearDown() // throws java.lang.Exception
    {
        //Lib�rez ici les ressources engag�es par setUp()
    }

    @Test
    public void testGetNom()
    {
        assertEquals("toto", toto.getNom());
    }

    @Test
    public void testFaireEquipe()
    {
      
        assertEquals(true, toto.faireEquipe(tata));
    }
    
    @Test
    public void testAjouterDemonSlayerDansEquipe()
    {
        pillier.ajouterDemonSlayerDansGrade(toto);
        assertEquals(true, pillier.estDansLeGrade(toto));
    }

    @Test
    public void testPeutVaincreUnDemon()
    {
        tata.setNbDeMouvements(11);
        pillier.ajouterDemonSlayerDansGrade(toto);
        pillier.ajouterDemonSlayerDansGrade(tata);
        toto.setGrade(pillier);
        tata.setGrade(pillier);
        toto.ajouterCoequipier(tata);
        assertEquals(true,toto.peutVaincreUnDemon() );

    }
    
    @Test
    public void testRedefinitionDemonSlayer()
    {
    	toto.setTypeDeSouffle("terre");
    	toto.setNom("Tanjiro");
    	toto.setCoequipier(tata);
    	assertEquals(11, toto.getNbDeMouvements());
    	assertEquals(tata.getNom(), toto.getCoequipier());
    }
}
