package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class nameReservationSteps {
    @Given("the user is on the dashboard")
    public void theUserIsOnTheDashboard() {

    }

    @When("the user clicks on the {string} tab")
    public void theUserClicksOnTheTab(String tabName) {
        // Code to click on the specified tab
    }

    @And("the user clicks on the {string} button")
    public void theUserClicksOnTheButton(String buttonName) {
        // Code to click on the specified button
    }

    @And("the user chooses the {string} option")
    public void theUserChoosesTheOption(String optionName) {
        // Code to choose the specified option
    }

    @Then("the user should see the {string} form")
    public void theUserShouldSeeTheForm(String formName) {
        // Code to verify that the specified form is visible
    }

}
