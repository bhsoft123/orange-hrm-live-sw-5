package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.customlisteners.CustomListeners;
import com.orangehrmlive.demo.pages.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class LoginTestWithDataProvider {

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
    @DataProvider(name = "invalid credentials")
    public void verifyErrorMessageWithInvalidCredentials(String username,String password, String errorMessage){
        //enter username, password and click //verify error message
        loginPage.enterInvalidCredentials(username,password,errorMessage);
    }
}
