package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.customlisteners.CustomListeners;
import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Listeners;

@Listeners(CustomListeners.class)
public class HomePage extends Utility {


    @CacheLookup
    @FindBy(xpath = "//input[@name ='username']")
    WebElement enterUsername;
    @CacheLookup
    @FindBy(xpath = "//input[@name ='password']")
    WebElement enterPassword;
    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement loginButton;
    @CacheLookup
    @FindBy(xpath = "//img[@alt='client brand banner']")
    WebElement hrmLogo;
    @CacheLookup
    @FindBy(xpath= "//h5[@class='oxd-text oxd-text--h5 orangehrm-login-title']")
    WebElement verifyLoginPanel;

    public String setVerifyLoginPanel(){
        return getTextFromElement(verifyLoginPanel);
    }
    public void logInToApplication() {
        sendTextToElement(enterUsername, "Admin");
        sendTextToElement(enterPassword, "admin123");
        clickOnElement(loginButton);
    }

    public void orangeHRMLogo() {
        if (verifyThatElementIsDisplayed(hrmLogo)) {
            System.out.println("HRM Logo is displayed");
        } else {
            System.out.println("HRM Logo is not displayed");
        }
    }
}