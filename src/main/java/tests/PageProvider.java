package tests;

import org.openqa.selenium.support.PageFactory;
import pages.Aplication.AddApplicationPage;
import pages.Aplication.DeleteApplicationPage;
import pages.Aplication.EditApplicationPage;
import pages.LoginPage;
import pages.CommonPage;
import pages.User.AddUserPage;
import pages.User.DeleteUserPage;
import pages.User.EditUserPage;
import pages.RegisterPage;
import runner.TestRunner;

public class PageProvider {
    private static LoginPage getLoginAccountPage;
    private static CommonPage commonPage;
    private static AddApplicationPage addApplicationPage;
    private static EditApplicationPage editApplicationPage;
    private static DeleteApplicationPage deleteApplicationPage;

    public static LoginPage getLoginAccountPage() {
        // if (getLoginAccountPage == null) {
        getLoginAccountPage = PageFactory.initElements(TestRunner.driver, LoginPage.class);
        // }
        return getLoginAccountPage;
    }

    public static CommonPage getCommonPage() {
        //if (commonPage == null) {
        commonPage = PageFactory.initElements(TestRunner.driver,CommonPage.class);
        // }
        return commonPage;
    }

    public static AddApplicationPage getAddApplicationPage() {
        // if (getAddApplicationPage == null) {
        addApplicationPage = PageFactory.initElements(TestRunner.driver, AddApplicationPage.class);
        //}
        return addApplicationPage;
    }
    public static EditApplicationPage getEditApplicationPage () {
        // if (editApplicationPage == null) {
        editApplicationPage = PageFactory.initElements(TestRunner.driver, EditApplicationPage.class);
        // }
        return editApplicationPage;
    }
    public static DeleteApplicationPage getDeleteApplicationPage() {
        // if (editApplicationPage == null) {
        deleteApplicationPage = PageFactory.initElements(TestRunner.driver, DeleteApplicationPage.class);
        // }
        return deleteApplicationPage;
    }

// User page

    private static AddUserPage addUserPage;
    private static EditUserPage editUserPage;
    private static DeleteUserPage deleteUserPage;
    private static RegisterPage registerPage;


    public static AddUserPage getAddUserPage() {
        if (addUserPage == null) {
            addUserPage = PageFactory.initElements(TestRunner.driver, AddUserPage.class);
        }
        return addUserPage;
    }

    public static EditUserPage getEditUserPage() {
        if (editUserPage == null) {
            editUserPage = PageFactory.initElements(TestRunner.driver, EditUserPage.class);
        }
        return editUserPage;
    }

    public static DeleteUserPage getDeleteUserPage() {
        if (deleteUserPage == null) {
            deleteUserPage = PageFactory.initElements(TestRunner.driver, DeleteUserPage.class);
        }
        return deleteUserPage;
    }

    public static RegisterPage getRegisterPage(){
        if (registerPage == null) {
            registerPage = PageFactory.initElements(TestRunner.driver, RegisterPage.class);
        }
        return registerPage;
    }
}
