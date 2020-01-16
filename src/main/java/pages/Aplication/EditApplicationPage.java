package pages.Aplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import runner.TestRunner;

import java.util.List;

public class EditApplicationPage {
    @FindBy(xpath = "//div[4]/div/form/div[2]/input")
    WebElement editAppName;
    @FindBy(xpath = "//div[4]/div/form/div[3]/input")
    WebElement editSessionExpiration;
    @FindBy(xpath = "//div[4]/div/form/div[4]/select")
    WebElement getSentUserBase;
    @FindBy(xpath = "//div[4]/div/form/div[5]/button")
    WebElement updateButton;

    @FindBy(tagName = "table")
    WebElement table;

    public void setClickEditButton(String name) {
        List<WebElement> applicationInfoRows = table.findElements(By.tagName("tr"));
        for (int i = 1; i <= applicationInfoRows.size() - 1; i++) {
            List<WebElement> applicationInfo = applicationInfoRows.get(i).findElements(By.tagName("td"));
            if (applicationInfo.get(0).getText().equals(name)) {
                TestRunner.driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[5]/a[1]")).click();
            }
        }
    }

    public void setEditInfo(String appName, String expiration, String userBase) throws InterruptedException {
        editAppName.clear();
        if (!appName.equals("null")) {
            editAppName.sendKeys(appName);
        }
        editSessionExpiration.clear();
        if (!expiration.equals("null")) {
            editSessionExpiration.sendKeys(expiration);
        }
        if (!userBase.equals("null")) {
            getSentUserBase.sendKeys(userBase);
        }


    }

    public void setClickUpdate() {
        updateButton.click();

    }

    public void verifyEditApplication(String appName, String expiration, String userBase) {
        List<WebElement> applicationInfoRows = table.findElements(By.tagName("tr"));
        for (int i = 1; i <= applicationInfoRows.size() - 1; i++) {
            List<WebElement> applicationInfo = applicationInfoRows.get(i).findElements(By.tagName("td"));
            if (applicationInfo.get(0).getText().equals(appName) && applicationInfo.get(2).getText().equals(expiration) && applicationInfo.get(3).getText().equals(userBase)) {
                System.out.printf("check edit successfully");
            } else {
                System.out.printf("check edit unsuccessfully");
            }

        }
    }

}
