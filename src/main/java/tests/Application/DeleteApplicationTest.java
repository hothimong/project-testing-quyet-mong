package tests.Application;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import tests.PageProvider;


public class DeleteApplicationTest extends PageProvider {
    @And("^I click delete button with name as (.*)$")
    public void clickDeleteButton(String name) throws Throwable {
        Thread.sleep(3000);
        getDeleteApplicationPage().clickDeleteButton(name);

    }
    @And("^I click alert delete button$")
    public void clickVerifyDelete() throws InterruptedException {
        Thread.sleep(3000);
        getDeleteApplicationPage().clickVerifyDeleteButton();
    }

    @Then("^Verify user able delete successfully with name as (.*)$")
    public void verify_user_able_delete_successfully_with_name_as_Fusion(String name) throws Throwable {
        Thread.sleep(3000);
        getDeleteApplicationPage().checkVerifyDelete(name);
    }




}
