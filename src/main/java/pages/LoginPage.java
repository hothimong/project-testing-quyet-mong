package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LoginPage {

    @FindBy(id = "username")
    WebElement username;
    @FindBy(id = "password")
    WebElement password;
    @FindBy(xpath = "/html/body/div/div/div/div/fieldset/form/div[3]/button")
    WebElement btnlogin;
    @FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[1]/nav/ul/li[1]/span[1]")
    WebElement textWelcome;
    @FindBy(xpath = "/html/body/div/div/div/div/div[2]")
    WebElement Ftext;

    public void setUsernamePass(String userName, String pass) {
        username.clear();
        if (!username.equals("null"))
            username.sendKeys(userName);
        password.clear();
        if (!password.equals("null"))
            password.sendKeys(pass);
    }

    public void clicksubmit() {
        btnlogin.click();
    }

    public void loginsuccess(String text) {
        String tx = textWelcome.getText();
        Assert.assertEquals(text, tx);
    }
    public void checkTextFail(String text){
        String tx = Ftext.getText();
        Assert.assertEquals(text, tx);
    }
}
