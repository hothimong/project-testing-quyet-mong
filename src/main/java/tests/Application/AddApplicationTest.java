package tests.Application;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.lexer.Th;
import org.omg.PortableServer.THREAD_POLICY_ID;
import tests.PageProvider;

public class AddApplicationTest extends PageProvider {


    @And("^I click add application button$")
    public void clickApplicationButton() throws InterruptedException {
        Thread.sleep(3000);
        getAddApplicationPage().setGetClickApplicationButton();
    }

    @And("^I input app name as (.*) and session expiration as (.*) and user base as (.*)$")
    public void SentInf(String appName,String sessionExpiration,String userBase) throws InterruptedException {
        Thread.sleep(3000);
        getAddApplicationPage().setGetSentInf(appName,sessionExpiration,userBase);

    }

    @And("^I click create button$")
    public void clickCreateButton() throws InterruptedException {
        Thread.sleep(3000);
        getAddApplicationPage().setClickCreateButton();
    }

    @Then("^Verify if a user will be able to add with a new application (.*)$")
    public void verifyAddApplication(String applicationName) throws InterruptedException {
        Thread.sleep(2500);
        getAddApplicationPage().checkAddApplication(applicationName);
    }







}
