package pages.Aplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import runner.TestRunner;

import java.util.List;

public class DeleteApplicationPage {

    @FindBy(id = "btn-delete-app")
    WebElement verifyDeleteButton;

    @FindBy(tagName = "table")
    WebElement table;

    public void clickDeleteButton(String name) throws InterruptedException {
        List<WebElement> applicationInfoRows = table.findElements(By.tagName("tr"));
        for (int i = 1; i <= applicationInfoRows.size() - 1; i++) {
            List<WebElement> applicationInfo = applicationInfoRows.get(i).findElements(By.tagName("td"));
            if (applicationInfo.get(0).getText().equals(name)) {
                TestRunner.driver.findElement(By.xpath(" //tbody/tr[" + i + "]/td[5]/a[2]")).click();
            }
        }
    }

    public void clickVerifyDeleteButton() throws InterruptedException {
        Thread.sleep(3000);
        verifyDeleteButton.click();
    }

    public void checkVerifyDelete(String name)  {
        List<WebElement> applicationInfoRows = table.findElements(By.tagName("tr"));
        for (int i = 1; i <= applicationInfoRows.size() - 1; i++) {
            List<WebElement> applicationInfo = applicationInfoRows.get(i).findElements(By.tagName("td"));
            if (applicationInfo.get(0).getText() != name) {
                System.out.printf("delete successfully");
            }else {
                System.out.printf("delete unsuccessfully");
            }
        }


    }

}
