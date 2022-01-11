
package villageTest;



import io.cucumber.java.en.*;

import testRunners.TestRunner_AttaquerVillage;


public class AttaquerSteps extends TestRunner_AttaquerVillage{

	@Given("le village Oto")
	public void le_village_Oto() {

	}

	@When("je l attaque")
	public void je_l_attaque() {
	   
	}

	@Then("il apparait dans les villages conquis")
	public void il_apparait_dans_les_villages_conquis() {
	   
	}

	@Then("il n apparait pas dans les villages ennemis")
	public void il_n_apparait_pas_dans_les_villages_ennemis() {
	   
	}

	@Given("le village Suna")
	public void le_village_Suna() {
	  
	}

	@When("j attaque Suna")
	public void j_attaque_Suna() {
	   
	}

	@Then("il n apparait pas dans les villages conquis")
	public void il_n_apparait_pas_dans_les_villages_conquis() {
	    
	}

	@Given("un village {string}")
	public void un_village(String string) {
	   
	}

	@Then("il apparait dans les villages conquis de {string}")
	public void il_apparait_dans_les_villages_conquis_de(String string) {
	    
	}

	@Then("il n apparait pas dans les {string}")
	public void il_n_apparait_pas_dans_les(String string) {
	  
	}

}