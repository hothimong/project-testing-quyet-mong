package tests.User;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import tests.PageProvider;

public class AddUserTest extends PageProvider {

    //    Add User
    @And("^I open add user button$")
    public void openUserbutton() throws InterruptedException {
        getAddUserPage().openAddUser();
        Thread.sleep(2000);
    }

    @When("^I input first name as (.*), last name as (.*), role as (.*), user name as (.*), password as (.*)$")
    public void selectInformation(String firstName, String lastName, String role, String userName, String password) throws Throwable {
        getAddUserPage().setInformation(firstName,lastName,role,userName,password);
        Thread.sleep(2000);
    }
    @And("^I click create add user button$")
    public void CreateUser() throws InterruptedException{
        getAddUserPage().clickBtnCreate();
        Thread.sleep(2000);
    }
    @Then("^I verify add user successfully with username as (.*)$")
    public void verifyAddUserSuccess(String userName){
        getAddUserPage().verifyUsername(userName);
    }
    @Then("^I verify can not add user with blank last name$")
    public void verifyAddUserUnsuccess(){
        getAddUserPage().verifyAddBlankLastName();
    }


}
