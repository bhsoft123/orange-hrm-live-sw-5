package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.customlisteners.CustomListeners;
import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Listeners;

@Listeners(CustomListeners.class)
public class AdminPage extends Utility {

    @CacheLookup
    @FindBy (xpath = "//li[1]//a[1]//span[1]")
    WebElement admin;
    @CacheLookup
    @FindBy(css ="//h5[normalize-space()='System Users']")
    WebElement verifyUsersText;
    @CacheLookup
    @FindBy(className ="oxd-button oxd-button--medium oxd-button--secondary")
    WebElement addButton;
    @CacheLookup
    @FindBy(xpath = "//img[@alt='profile picture']" )
    WebElement clickOnUserProfileLogo;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Logout')]" )
    WebElement mouseHoverOnLogout;
    @CacheLookup
    @FindBy(css ="div[class='oxd-input-group oxd-input-field-bottom-space'] div input[class='oxd-input oxd-input--active']")
    WebElement username1;
    @CacheLookup
    @FindBy(css ="body > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > form:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2)")
    WebElement selectDropdown;
    @CacheLookup
    @FindBy(css="input[placeholder='Type for hints...']")
    WebElement employeename1;
    @CacheLookup
    @FindBy(css="body > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > form:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(4) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > i:nth-child(1)")
    WebElement status1;


    public void setClickOnUserProfileLogo(){
        clickOnElement(clickOnUserProfileLogo);    }

    public void setMouseHoverOnLogout(){
        mouseHoverToElementAndClick(mouseHoverOnLogout);   }

    public void clickOnAdminTab(){
        clickOnElement(admin);    }
    public String getTextVerifyUsers(){ return getTextFromElement(verifyUsersText);    }
    public void clickAddButton(){ clickOnElement(addButton);}

    public void enterEmployeedetails(String username,String userrole,String employeename,String status)
    {
        sendTextToElement(username1, username);
        clickOnElement(selectDropdown);
        selectByVisibleTextFromDropDown(selectDropdown, userrole);
        sendTextToElement(employeename1, employeename);
        clickOnElement(status1);
        selectByVisibleTextFromDropDown(status1, status);
    }





}
