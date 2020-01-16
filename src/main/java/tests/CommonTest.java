package tests;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import runner.TestRunner;

public class CommonTest extends PageProvider {

    @Given("^I open website (.*)$")
    public void user_already_on_home_page(String website) throws InterruptedException {
        Thread.sleep(2000);
        TestRunner.driver.get(website);
        Thread.sleep(2500);
        TestRunner.driver.manage().window().maximize();
    }
    @When("^I verify login successfully with username as (.*) password as (.*)$")
    public void loginSuccessfully(String username, String password) throws InterruptedException {
        Thread.sleep(2500);
        getLoginAccountPage().setUsernamePass(username, password);
        Thread.sleep(2000);
        getLoginAccountPage().clicksubmit();
        Thread.sleep(3000);
        getLoginAccountPage().loginsuccess("Welcome to Fusion Metrics,");
    }


    @And("^I click application on menu select$")
    public void clickApplication () throws InterruptedException {
        Thread.sleep(2500);
        getCommonPage().setClickApplication();
    }

    @And("^I log out$")
    public void logOut() throws InterruptedException {
        getCommonPage().logOut();
        Thread.sleep(2000);
    }
    @When("^I scroll to management tab$")
    public void management() throws InterruptedException {
        getCommonPage().setSidemenu();
        Thread.sleep(3000);
    }

    @And("^I click Login Account tab$")
    public void loginAccount() throws InterruptedException {
        getCommonPage().openLoginAccount();
        Thread.sleep(2000);
    }
}
