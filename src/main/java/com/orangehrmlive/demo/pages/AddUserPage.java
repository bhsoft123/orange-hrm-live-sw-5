package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.customlisteners.CustomListeners;
import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Listeners;

@Listeners(CustomListeners.class)
public class AddUserPage extends Utility {

    @CacheLookup
    @FindBy(xpath="//h6[@class='oxd-text oxd-text--h6 orangehrm-main-title']")
    WebElement adduserText;
    @CacheLookup
    @FindBy(css ="body > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > form:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)")
    WebElement clickOnRole;
    @CacheLookup
    @FindBy(css ="input[placeholder='Type for hints...']")
    WebElement addEmployeeName;
    @CacheLookup
    @FindBy(css= "div[class='oxd-form-row'] div[class='oxd-grid-2 orangehrm-full-width-grid'] div[class='oxd-grid-item oxd-grid-item--gutters'] div[class='oxd-input-group oxd-input-field-bottom-space'] div input[class='oxd-input oxd-input--active']")
    WebElement addUserName;
    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-select-text-input']")
    WebElement selectStatus1;
    @CacheLookup
    @FindBy(xpath = "//input[@class='oxd-input oxd-input--active']")
    WebElement addPassword;
    @CacheLookup
    @FindBy(css = "//div[@class='oxd-grid-item oxd-grid-item--gutters']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@type='password']")
    WebElement addConfirmPassword;
    @CacheLookup
    @FindBy(css ="button[type='submit']")
    WebElement saveButton;
    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-form-actions']")
    WebElement choseAdmin ;
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]" )
    WebElement selectUserRole;
    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-select-text oxd-select-text--active']//div[@class='oxd-select-text-input'][normalize-space()='-- Select --']" )
    WebElement selectStatus;
    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Disabled')]")
    WebElement selectDisable;


    public String getTextAddUsers(){return getTextFromElement(adduserText);  }
    public void enterEmployeeDetails(String role, String name,String username, String password, String confirmPassword,String selectStatus3) {
        mouseHoverToElementAndClick(clickOnRole);
        selectByVisibleTextFromDropDown(clickOnRole, "Admin");
        sendTextToElement(addEmployeeName, name);
        sendTextToElement(addUserName, username);
        sendTextToElement(addPassword, password);
        sendTextToElement(addConfirmPassword, confirmPassword);
        mouseHoverToElementAndClick(selectStatus1);
        selectByVisibleTextFromDropDown(selectStatus1, selectStatus3);
    }
    public void clickOnSaveButton(){ clickOnElement(saveButton);   }
    public void setSelectUserRole(){clickOnElement(selectUserRole);
        clickOnElement(choseAdmin);}
    public void setSelectStatus(){
        clickOnElement(selectStatus);}
    public void setSelectDisable(){
        selectByIndexFromDropDown(selectDisable,0);}



}




