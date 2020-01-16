package pages.User;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import runner.TestRunner;

import java.util.List;


public class EditUserPage {
    @FindBy(xpath = "//div[4]/div/form/div[1]/input")
    WebElement firstName;
    @FindBy(xpath = "//div[4]/div/form/div[2]/input")
    WebElement lastName;
    @FindBy(xpath = "//div[4]/div/form/div[3]/select")
    WebElement role;
    @FindBy(xpath = "//div[4]/div/form/div[4]/input")
    WebElement userName;
    @FindBy(xpath = "//div[4]/div/form/div[5]/input")
    WebElement password;
    @FindBy(tagName = "table")
    WebElement listTable;
    @FindBy(xpath = "//div[4]/div/form/div[6]/button")
    WebElement btnUpdated;

    public void clickBtnEdit(String name) {
        List<WebElement> rows = listTable.findElements(By.tagName("tr"));
        for (int i = 1; i < rows.size(); i++) {
            List<WebElement> tdElement = rows.get(i).findElements(By.tagName("td"));
            if (tdElement.get(0).getText().equals(name)) {
                TestRunner.driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[5]/a[1]")).click();
            }
        }
    }

    public void setInformation(String firstName, String lastName, String role, String userName, String password) {
        this.firstName.clear();
        if (!firstName.equals("null")) {
            this.firstName.sendKeys(firstName);
        }

        this.lastName.clear();
        if (!lastName.equals("null")) {
            this.lastName.sendKeys(lastName);
        }

        Select roleSelects = new Select(this.role);
        roleSelects.selectByVisibleText(role);

        this.userName.clear();
        if (!userName.equals("null")) {
            this.userName.sendKeys(userName);
        }

        this.password.clear();
        if (!password.equals("null")) {
            this.password.sendKeys(password);
        }
    }

    public void clickUpdated() {
        btnUpdated.click();
    }

    public void verifyElementEdit(String firstName, String lastName, String roleUser, String userName) {
        List<WebElement> rows = listTable.findElements(By.tagName("tr"));
        for (int i = 1; i < rows.size(); i++) {
            List<WebElement> td = rows.get(i).findElements(By.tagName("td"));
            if (td.get(0).getText().equals(firstName) && td.get(1).getText().equals(lastName) && td.get(2).getText().equals(roleUser) && td.get(3).getText().equals(userName)) {
                System.out.println(" Edit successfully");
            } else {
                System.out.println("Edit unsuccessfully");
            }
        }
    }

    public void verifyEditUserBlankFirstName() {
        if (this.firstName.getText().equals("") || this.lastName.getText().equals("") || this.role.getText().equals("") || this.userName.getText().equals("") || this.password.getText().equals("")) {
            System.out.println("Edit user unsuccessfully");
        }
    }
}

