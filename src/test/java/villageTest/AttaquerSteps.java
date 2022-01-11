
package villageTest;


import java.util.Collection;

import org.junit.Assert;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.runner.EventBus;
import cucumber.runner.Runner;
import cucumber.runtime.Backend;
import cucumber.runtime.Glue;
import cucumber.runtime.RuntimeOptions;
import main.ChefVillage;
import main.Village;


public class AttaquerSteps extends Runner {

	public AttaquerSteps(Glue glue, EventBus bus, Collection<? extends Backend> backends,
			RuntimeOptions runtimeOptions) {
		super(glue, bus, backends, runtimeOptions);
		// TODO Auto-generated constructor stub
	}


}