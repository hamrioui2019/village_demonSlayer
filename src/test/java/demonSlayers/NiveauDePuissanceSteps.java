package demonSlayers;

import static org.junit.Assert.*;
import damonSlayer.DemonSlayer;
import damonSlayer.Grade;
import io.cucumber.java.en.*;
import testRunners.TestRunnerGetNiveauDePuissance;

public class NiveauDePuissanceSteps extends TestRunnerGetNiveauDePuissance {
	private DemonSlayer toto;
	private Grade grade1;

	@Given("un demon slayer {string}")
	public void un_demon_slayer(String string) {
		toto = new DemonSlayer(string, 11, "eau");
	}

	@Given("avec un grade {string}")
	public void avec_un_grade(String string) {
		grade1 = new Grade(string, 5);
		toto.setGrade(grade1);
		grade1.ajouterDemonSlayerDansGrade(toto);
	}

	@When("je recupere mon niveau de puissance")
	public void je_recupere_mon_niveau_de_puissance() {
		toto.getGrade().getNiveauPuissance();
	}

	@Then("Le niveau de puissance {int} est affecte")
	public void le_niveau_de_puissance_est_affecte(Integer int1) {
		assertTrue(int1 == toto.getGrade().getNiveauPuissance());
	}
}