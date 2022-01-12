package fusion;

import testRunners.TestRunnerAfficherNom;


import static org.junit.Assert.assertEquals;

import damonSlayer.DemonSlayerSedentaire;
import io.cucumber.java.en.*;
import main.Village;

public class AfficherNomDemonSedentaireSteps extends TestRunnerAfficherNom {
	private DemonSlayerSedentaire toto;
	private Village konoha;

	@Given("un demon slayer sedentaire")
	public void un_demon_slayer_sedentaire() {
		konoha = new Village();
		konoha.setNomVillage("konoha");
		toto = new DemonSlayerSedentaire(konoha, "toto", 11, "eau");
	}

	@When("recupere son nom")
	public void recupere_son_nom() {
		toto.getNom();
	}

	@Then("son nom correspond bien")
	public void son_nom_correspond_bien() {
		assertEquals("toto" ,toto.getNom());
	}

}
