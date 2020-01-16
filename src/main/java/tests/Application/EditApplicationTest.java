package tests.Application;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import javafx.application.Application;
import tests.PageProvider;

public class EditApplicationTest extends PageProvider {

    @And("^I click edit button with name as (.*)$")
    public void clickEditButton(String name) throws InterruptedException {
        Thread.sleep(2500);
        getEditApplicationPage().setClickEditButton(name);
        Thread.sleep(2500);
    }

    @And("^I input name as (.*), session expiration as (.*), user base as (.*)$")
    public void SentInfoEdit(String appName, String expiration, String userBase) throws InterruptedException {
        Thread.sleep(2500);
        getEditApplicationPage().setEditInfo(appName,expiration,userBase);
        Thread.sleep(2500);
    }

    @And("^I click update button$")
    public void clickUpdateButton() throws InterruptedException {
        getEditApplicationPage().setClickUpdate();
    }

    @Then("^I Verify if a user will be able to edit with a new application (.*) and session expiration as (.*) and user base (.*)$")
    public void checkVerifyEditSuccess(String appName, String expiration, String userBase) throws InterruptedException {
        Thread.sleep(2500);
        getEditApplicationPage().verifyEditApplication( appName,expiration,userBase);
    }

    @Then("^I Verify user can not edit with a new application (.*) and session expiration as (.*) and user base (.*)$")
    public void checkVerifyEditUnSuccess(String appName, String expiration, String userBase) throws InterruptedException {
        Thread.sleep(2500);
        getEditApplicationPage().verifyEditApplication( appName,expiration,userBase);
    }

}
