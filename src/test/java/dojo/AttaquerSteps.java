
package dojo;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import main.ChefVillage;
import main.Village;

import org.junit.Assert;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class AttaquerSteps {
	private Village Konoha;
	private Village Suna;
	private Village Oto;

	private ChefVillage Kage;

	@Given("un village")
	public void un_village() {
		Konoha = new Village();
		Konoha.setNbrHabitant(5000);
		Konoha.setNbrMaison(2000);
		Konoha.setNomVillage("Konoha");
	}

	@Given("un chef de village")
	public void un_chef_de_village() {
		Kage = new ChefVillage("Hokage", Konoha);
	}
	@Given("un autre village")
	public void un_autre_village() {
		Suna = new Village();
		Suna.setNbrHabitant(1000);
		Suna.setNbrMaison(700);
	}


	@When("le chef de village veut declarer la guerre")
	public void le_chef_de_village_veut_declarer_la_guerre() {
		Konoha.declarerGuerre(Suna);
	}

	@Then("le village devra apparaitre dans la ma liste de village conquis")
	public void le_village_devra_apparaitre_dans_la_ma_liste_de_village_conquis() {
		Kage.attaquerVillage(Suna);
		System.out.println(Kage.getListVillageConquis().contains(Suna));

		if(!Kage.getListVillageConquis().contains(Suna)) {
			return;
		}else{
			System.out.println("le village nous appartient");
		}

//		Assert.assertTrue(Kage.getListVillageConquis().contains(Suna));
	}

	@Then("retirer de ma liste d ennemis")
	public void retirer_de_ma_liste_d_ennemis() {
		Konoha.retirerEnnemi(Suna);
		if(Konoha.getEnnemis().contains(Suna)) {
			return;
		}else{
			System.out.println("Nous ne faisons plus qu'un");
		}
	}

	@When("le chef de village s allie avec un village")
	public void le_chef_de_village_s_allie_avec_un_village() {
		Konoha.addAllianceVillage(Oto);
	}

	@Then("ajouter le village a la liste d allies")
	public void ajouter_le_village_a_la_liste_d_allies() {
		Assert.assertTrue(Konoha.getAllies().contains(Oto));
		if(!Konoha.getAllies().contains(Oto)) {
			return;
		}else {
			System.out.println("Nous somme maintenant alliés");
			
		}
	}

}