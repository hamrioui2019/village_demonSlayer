package villageTest;

import io.cucumber.java.en.*;

import static org.junit.Assert.*;

import main.Affichage;
import main.AffichageVillage;
import main.Village;
import testRunners.TestRunnerConstruireMaison;

public class ConstruireSteps extends TestRunnerConstruireMaison {

	private Village village;
	private Affichage affichage;

	@Given("le village {string}")
	public void le_village(String string) {

		affichage = new AffichageVillage();
		village = new Village(affichage);
		village.setNomVillage(string);
	}

	@When("le village a {int} maisons")
	public void le_village_a_maisons(Integer int1) {
		village.setNbrMaison(int1);

	}

	@When("une maison est construite")
	public void une_maison_est_construite() {
		village.construireMaison();
	}

	@Then("le {int} enregistre")
	public void le_enregistre(Integer int1) {
		assertTrue(int1 == village.getNbrMaison());
	}

}