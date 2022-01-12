package fusion;

import testRunners.TestRunnerDemonVillage;

import static org.junit.Assert.assertEquals;

import damonSlayer.DemonSlayerSedentaire;
import io.cucumber.java.en.*;
import main.Village;
public class DemonVillageSteps extends TestRunnerDemonVillage {
	private DemonSlayerSedentaire toto;
	private Village konoha;

	@Given("un demon slayer sedentaire {string}")
	public void un_demon_slayer_sedentaire(String string) {
		konoha = new Village();
		konoha.setNomVillage("konoha");
		toto = new DemonSlayerSedentaire(konoha, string, 11, "eau");
	}

	@When("recuperer le nom du village du demon slayer sedentaire")
	public void recuperer_le_nom_du_village_du_demon_slayer_sedentaire() {
		toto.getVillage().getNomVillage();
	}
	@Then("le {string} est celui qui lui est attribue")
	public void le_est_celui_qui_lui_est_attribue(String string) {
		assertEquals(toto.getVillage().getNomVillage(),string);
	}

}
