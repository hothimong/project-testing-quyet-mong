package pages.User;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

public class AddUserPage {

    @FindBy(xpath = "//div[2]/div/div/div/div/button")
    WebElement btnAddUser;
    @FindBy(xpath = "//div[3]/div/form/div[1]/input")
    WebElement firstName;
    @FindBy(xpath = "//div[3]/div/form/div[2]/input")
    WebElement lastName;
    @FindBy(xpath = "//div[3]/div/form/div[3]/select")
    WebElement role;
    @FindBy(xpath = "//div[3]/div/form/div[4]/input")
    WebElement userName;
    @FindBy(xpath = "//div[3]/div/form/div[5]/input")
    WebElement password;
    @FindBy(xpath = "//div[3]/div/form/div[6]/button")
    WebElement btnCreate;
    @FindBy(tagName = "table")
    WebElement listTable;

    public void openAddUser() {
        btnAddUser.click();
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

    public void clickBtnCreate() {
        btnCreate.click();
    }

    public void verifyUsername(String userName) {
        List<WebElement> rows = listTable.findElements(By.tagName("tr"));
        for (int i = 1; i < rows.size(); i++) {
            List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
            if (cols.get(0).getText().equals(userName)) {
                System.out.println("add account successfully");
            } else {
                System.out.println("add account unsuccessfully");
            }

        }
    }

    public void verifyAddBlankLastName() {
        if (this.firstName.getText().equals("") || this.lastName.getText().equals("") || this.userName.getText().equals("") || this.password.getText().equals("")) {
            System.out.println("Add user unsuccessfully");
        }
    }

}



