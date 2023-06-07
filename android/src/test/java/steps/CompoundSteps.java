package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

/*
This class contains all the steps that are made up of different actions
 */
public class CompoundSteps extends BaseSteps {

    @Given("I am an user searching with the characteristics {string}, {string}, {string}, {string}, {string}, {string}")
    public void iAmAnUserSearchingWithTheCharacteristics(String destinationName, String initialDate, String finalDate, String rooms, String adults, String children) {
        instanceOf( LoginPage.class ).clickCloseButton( );
        instanceOf( LoginPage.class ).clickIconDestinationViewText( );
        instanceOf( LoginPage.class ).clickDestinationViewTextFrame( );
        instanceOf( LoginPage.class ).fillDestinationViewText(destinationName);

    }

    @Given("Given I am on the Home of Conduit")
    public void iAmOnTheHomeOfConduit() {

    }

    @When("When I click on the Login button")
    public void iClickOnTheLoginButton() {

    }

    @Then("Then I am on the Login page")
    public void iAmOnTheLoginPage() {

    }

    @And("And I can fill in the user field {string}")
    public void iCanFillInTheUserField(String email) {

    }


    @And("And I can fill in the password field {string}")
    public void iCanFillInThePasswordField(String password) {

    }

    @And("And I click on the Sig In button")
    public void iClickOnTheSigInButton() {

    }

    @Then("Then the login is successfully")
    public void theLoginIsSucessfully() {

    }

}
