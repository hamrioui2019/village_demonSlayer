package villageTest;

import io.cucumber.java.en.*;
import main.Affichage;
import main.AffichageVillage;
import main.ChefVillage;
import main.Village;
import testRunners.TestRunnerTuerTraitre;
import static org.junit.Assert.*;

public class TuerTraitreSteps extends TestRunnerTuerTraitre {

	private Village village;
	private ChefVillage chef;
	private Affichage affichage;

	@Given("un village {string}")
	public void un_village(String string) {

		affichage = new AffichageVillage();
		this.village = new Village(affichage);
		this.village.setNomVillage(string);
	}

	@When("le village a {int} habitants")
	public void le_village_a_habitants(Integer int1) {
		village.setNbrHabitant(int1);
	}

	@When("un traitre est tue")
	public void un_traitre_est_tue() {
		chef = new ChefVillage("Konoha", village);
		this.chef.tuerTraitre();
	}

	@Then("le {int} est enregistre")
	public void le_est_enregistre(Integer int1) {
		assertTrue(int1 == this.village.getNbrHabitant());
	}

}
