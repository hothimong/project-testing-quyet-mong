package pages.User;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import runner.TestRunner;

import java.util.List;

public class DeleteUserPage {
    @FindBy(tagName = "table")
    WebElement listTable;

    public void clickBtnDelete(String userName) {
        List<WebElement> rows = listTable.findElements(By.tagName("tr"));
        for (int i = 1; i < rows.size(); i++) {
            List<WebElement> tdElement = rows.get(i).findElements(By.tagName("td"));
            if (tdElement.get(0).getText().equals(userName)) {
                TestRunner.driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[5]/a[2]")).click();
            }
        }
    }
    public void verifydeleteSuccess(String userName){
        List<WebElement> rows = listTable.findElements(By.tagName("tr"));
        for (int i = 1; i < rows.size(); i++) {
            List<WebElement> tdElement = rows.get(i).findElements(By.tagName("td"));
            if (tdElement.get(0).getText().equals(userName)) {
                System.out.println("Delete unsuccessfully");
            }else{
                System.out.println("Delete successfully");
            }
        }
    }
}

