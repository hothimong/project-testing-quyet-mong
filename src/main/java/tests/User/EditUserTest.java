package tests.User;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.lexer.Pa;
import tests.PageProvider;

public class EditUserTest extends PageProvider {

    @When("^I click button edit as (.*)$")
    public void clickEditButton(String username) throws InterruptedException {
        getEditUserPage().clickBtnEdit(username);
        Thread.sleep(2000);
    }
    @When("^I edit first name as (.*), last name as (.*), user as (.*), user name as (.*),  password as (.*)$")
    public void selectInformation(String firstName, String lastName, String role, String userName, String password) throws InterruptedException {
        getEditUserPage().setInformation(firstName,lastName,role,userName,password);
        Thread.sleep(2000);
    }

    @And("^I click updated button$")
    public void updated(){
        getEditUserPage().clickUpdated();
    }
    @Then("^I verify edit element first name as (.*) and last name as (.*) and role as (.*) and user name as (.*)$")
    public void verifyEditSuccess(String firstname, String lastname, String role, String username) throws InterruptedException {
        getEditUserPage().verifyElementEdit(firstname,lastname,role,username);
        Thread.sleep(2000);
    }
    @Then("^I verify can not edit element with blank first name$")
    public void verifyEditUserUnsuccess(){
        getEditUserPage().verifyEditUserBlankFirstName();
    }
}
