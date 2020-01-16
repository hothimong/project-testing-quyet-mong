package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import runner.TestRunner;

public class CommonPage {

    @FindBy(xpath = "//*[@id=\"side-menu\"]/li[14]/a")
    WebElement sidemenu;
    @FindBy(xpath = "//*[@id=\"side-menu\"]/li[14]/ul/li[2]/a")
    WebElement LoginAccount;
    @FindBy(xpath = "//div[1]/nav/ul/li[2]/a")
    WebElement btnLogOut;
    @FindBy(xpath = "//div[1]/ul/li[14]/ul/li[1]/a")
    WebElement clickApplication;

    public void setSidemenu() {
        sidemenu.click();
    }

    public void openLoginAccount() {
        LoginAccount.click();
    }

    public void logOut() {
        btnLogOut.click();
    }
    public void setClickApplication() {
        clickApplication.click();
    }

}
