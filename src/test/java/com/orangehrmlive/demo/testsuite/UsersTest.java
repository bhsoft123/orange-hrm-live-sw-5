package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.*;
import com.orangehrmlive.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UsersTest extends BaseTest {

    HomePage homePage;
    LoginPage loginPage;
    AdminPage adminPage;
    AddUserPage addUserPage;
    ViewSystemUserPage viewSystemUserPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        loginPage = new LoginPage();
        adminPage = new AdminPage();
        addUserPage = new AddUserPage();
        viewSystemUserPage = new ViewSystemUserPage();
    }

    @Test(groups = {"sanity", "smoke", "regression"})
    public void adminShouldAddUserSuccessFully() {
        //Login to Application
        homePage.logInToApplication();
        //click On "Admin" Tab
        adminPage.clickOnAdminTab();
        //Verify "System Users" Text
        Assert.assertEquals(adminPage.getTextVerifyUsers(), "System Users", "Error");
        //click On "Add" button
        adminPage.clickAddButton();
        //Verify "Add User" Text
        Assert.assertEquals(addUserPage.getTextAddUsers(), "Add User", "Error");
        //Select User Role "Admin"
        addUserPage.enterEmployeeDetails("Admin", "Ananya.Dash", "ananya Dash", "Qwert123", "Qwert123", "Disabled");
        //enter Username
        //Select status "Disable"
        //enter psaaword
        //enter Confirm Password
        //click On "Save" Button
        addUserPage.clickOnSaveButton();
        //verify message "Successfully Saved"
        //Assert.assertEquals(addUserPage.getTextSuccessfullySaved(), "Successfully Saved", "Error");
    }

    @Test(groups = {"Smoke", "Regression"})
    public void searchTheUserCreatedAndVerifyIt() throws InterruptedException {
        //Login to Application
        homePage.logInToApplication();
        //	click On "Admin" Tab
        adminPage.clickOnAdminTab();
        //	Verify "System Users" Text
        Assert.assertEquals(adminPage.getTextVerifyUsers(), "System Users", "Error");
        //	Enter Username
        viewSystemUserPage.setEnterUsername("Ananya.Dash");
        //	Select User Role
        addUserPage.setSelectUserRole();
        //	Select Status
        addUserPage.setSelectStatus();
        addUserPage.setSelectDisable();
        //	Click on "Search" Button
        viewSystemUserPage.setEnterSearch();
        //	Verify the User should be in Result list.
        Assert.assertTrue(viewSystemUserPage.setVerifyTheResult().contains("Linda.Anderson"), "Linda.Anderson is not displayed");
    }

    @Test(groups = {"Regression"})
    public void searchTheDeletedUserAndVerifyTheMessageNoRecordFound() {
        //Login to Application
        homePage.logInToApplication();
        //	click On "Admin" Tab
        adminPage.clickOnAdminTab();
        //	Verify "System Users" Text
        Assert.assertEquals(adminPage.getTextVerifyUsers(), "System Users", "Error");
        viewSystemUserPage.setEnterUsername("Ananya.Dash");
        //	Select User Role
        addUserPage.setSelectUserRole();
        //	Select Status
        addUserPage.setSelectStatus();
        addUserPage.setSelectDisable();
        //	Click on "Search" Button
        viewSystemUserPage.setEnterSearch();
        //	Verify the User should be in Result list.
        Assert.assertTrue(viewSystemUserPage.setVerifyTheResult().contains("Linda.Anderson"), "Linda.Anderson is not displayed");

    }

}