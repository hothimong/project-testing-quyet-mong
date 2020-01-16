package tests;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegisterTest extends PageProvider {
    @When("I click register button$")
    public void register() throws InterruptedException {
        getRegisterPage().setBtnRegister();
        Thread.sleep(2000);
    }

    @When("^I input information are first name as (.*), last name as (.*), user name as (.*), password as (.*)$")
    public void selectInformationUser(String firstName, String lastName, String userName, String password) throws InterruptedException {
        getRegisterPage().setInformationUser(firstName, lastName, userName, password);
        Thread.sleep(2000);
    }

    @And("^I click submit register$")
    public void registerButton() throws InterruptedException {
        getRegisterPage().clickRegister();
        Thread.sleep(2000);
    }

    @Then("^I verify register successfully$")
    public void verifyRegisterSuccess() {
        getRegisterPage().registerSuccess("Registration successful");
    }

    @Then("^I verify register unsuccessfully with invalid information$")
    public void verifyRegisterUnSuccess() {
        getRegisterPage().registerUnSuccess("Last name is required");
    }

    @Then("^I verify account already exit$")
    public void verifyAccount() {
        getRegisterPage().verifyAccountExit("Username \"lamtran\" is already taken");
    }


}
