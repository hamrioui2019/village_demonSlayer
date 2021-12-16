package testing;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import damonSlayer.DemonSlayer;
import damonSlayer.Grade;

import static org.junit.Assert.*;

public class DemonSlayerTest
{
    private DemonSlayer toto;
    private Grade grade1;
    
    

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
        DemonSlayer Toto = new DemonSlayer("toto", 11, "eau");
        assertEquals("toto", Toto.getNom());
    }

    @Test
    public void testFaireEquipe()
    {
        DemonSlayer toto = new DemonSlayer("toto", 11, "eau");
        DemonSlayer tata = new DemonSlayer("tata", 6, "feu");
        
        assertEquals(true, toto.faireEquipe(tata));
    }
    
    @Test
    public void testAjouterDemonSlayerDansEquipe()
    {
        DemonSlayer toto = new DemonSlayer("toto", 11, "eau");
        Grade pillier = new Grade("pillier",5);
        pillier.ajouterDemonSlayerDansGrade(toto);
        assertEquals(true, pillier.estDansLeGrade(toto));
    }

    @Test
    public void testPeutVaincreUnDemon()
    {
        DemonSlayer toto = new DemonSlayer("toto", 11, "eau");
        DemonSlayer tata = new DemonSlayer("tata", 11, "feu");
        Grade pillier = new Grade("pillier",5);
        pillier.ajouterDemonSlayerDansGrade(toto);
        pillier.ajouterDemonSlayerDansGrade(tata);
        toto.setGrade(pillier);
        tata.setGrade(pillier);
        toto.ajouterCoequipier(tata);
        assertEquals(true,toto.peutVaincreUnDemon() );

    }
}
