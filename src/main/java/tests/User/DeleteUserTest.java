package tests.User;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import tests.PageProvider;

public class DeleteUserTest extends PageProvider{

    @When("^I click delete user button (.*)$")
    public void deleteElement(String userName) throws InterruptedException {
        getDeleteUserPage().clickBtnDelete(userName);
        Thread.sleep(2000);
    }
    @Then("^I verify user able delete successfully with (.*)$")
    public void deleteSuccess(String userName){
        getDeleteUserPage().verifydeleteSuccess(userName);
    }
}
