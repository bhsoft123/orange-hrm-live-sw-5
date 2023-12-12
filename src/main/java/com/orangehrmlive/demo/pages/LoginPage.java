package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//input[@name ='username']")
    WebElement enterUsername;
    @CacheLookup
    @FindBy(xpath = "//input[@name ='password']")
    WebElement enterPassword;
    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement loginButton;


    public void enterInvalidCredentials(String username,String password,String errorMessage){
        sendTextToElement(enterUsername, username);
        sendTextToElement(enterPassword, password);
        clickOnElement(loginButton);
    }
}
