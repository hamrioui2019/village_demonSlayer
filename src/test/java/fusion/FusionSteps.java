package fusion;

import static org.junit.Assert.*;
import damonSlayer.DemonSlayerSedentaire;
import io.cucumber.java.en.*;
import main.Village;
import testRunners.TestRunnerFusion;

public class FusionSteps extends TestRunnerFusion {
	private DemonSlayerSedentaire toto;
	private Village konoha;

	@Given("le village {string}")
	public void le_village(String string) {
		konoha = new Village();
		konoha.setNbrHabitant(5000);
		konoha.setNbrMaison(2000);
		konoha.setNomVillage(string);
	}


	@When("ajouter un demon slayer")
	public void ajouter_un_demon_slayer() {
		toto = new DemonSlayerSedentaire(konoha, "toto", 11, "eau");
		konoha.ajouterDemonSlayerSedentaire(toto);
	}
	@Then("le {int} est enregistre")
	public void le_est_enregistre(Integer int1) {
		assertTrue(int1==konoha.getNbrHabitant());
	}
}
