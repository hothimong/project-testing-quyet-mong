package pages.Aplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.lang.reflect.Array;
import java.util.List;

public class AddApplicationPage {

//    @FindBy(xpath = "//*[@id=\"side-menu\"]/li[14]/ul/li[1]/a")
//    WebElement clickApplication;

    @FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[2]/div/div/div/div/button")
    WebElement getClickApplicationButton;

    @FindBy(xpath = "/html/body/div/div/div/div[3]/div/form/div[1]/input")
    WebElement getSentAppName;

    @FindBy(xpath = "/html/body/div/div/div/div[3]/div/form/div[2]/input")
    WebElement getSentSessionExpiration;


    @FindBy(xpath = "/html/body/div/div/div/div[3]/div/form/div[3]/select")
    WebElement getSentUserBase;

    @FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[3]/div/form/div[4]/button")
    WebElement clickCreateButton;

    @FindBy(tagName = "table")
    WebElement table;


//    public void setClickApplication() {
//        clickApplication.click();
//    }

    public void setGetClickApplicationButton() {
        getClickApplicationButton.click();
    }

    public void setGetSentInf(String appName, String sessionExpiration, String userBase) throws InterruptedException {
        if (!appName.equals("null")) {
           getSentAppName.sendKeys(appName);
        }
        if (!sessionExpiration.equals("null")) {
            getSentSessionExpiration.sendKeys(sessionExpiration);
        }
        if (!userBase.equals("null")) {
            getSentUserBase.sendKeys(userBase);
        }
    }

    public void setClickCreateButton() throws InterruptedException {
        clickCreateButton.click();
    }

    public void checkAddApplication(String appName) throws InterruptedException {
        List<WebElement> applicationInfoRows = table.findElements(By.tagName("tr"));
        for (int i = 1; i <= applicationInfoRows.size() - 1; i++) {
            List<WebElement> applicationInfo = applicationInfoRows.get(i).findElements(By.tagName("td"));
            if (applicationInfo.get(0).getText().equals(appName)) {
                System.out.printf(" add successfully");
            }else {
                System.out.printf(" add unsuccessfully");
            }
        }
    }





}
