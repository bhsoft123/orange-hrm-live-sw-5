package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.customlisteners.CustomListeners;
import com.orangehrmlive.demo.pages.*;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class UsersTestWithDataProvider {

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
    @Test
    @DataProvider (name = "employee details")
    public void searchTheUserAndVerifyTheMessageRecordFound(String username,String userrole,String employeename,String status){
        //Login to Application
        homePage.logInToApplication();
        //	click On "Admin" Tab
        adminPage.clickOnAdminTab();
        //	Verify "System Users" Text
        Assert.assertEquals(adminPage.getTextVerifyUsers(), "System Users", "Error");
        //Enter data from Data table and search
        adminPage.enterEmployeedetails(username,userrole,employeename,status);


    }
}
