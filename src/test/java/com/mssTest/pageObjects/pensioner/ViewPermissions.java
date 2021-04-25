package com.mssTest.pageObjects.pensioner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewPermissions {
    WebDriver localDriver;

    public ViewPermissions(WebDriver remoteDriver) {
        this.localDriver = remoteDriver;
        PageFactory.initElements(remoteDriver, this);
    }


//    @FindBy(xpath = "//*[contains(@data-componentid,'ext-button-6')]")
    @FindBy(xpath = "//div[@id='ext-element-51']")
    WebElement btnPersonalInfo;

    @FindBy(xpath = "//div[@id='ext-element-52']")
    WebElement btnPayrolls;

    @FindBy(xpath = "//div[@id='ext-element-53']")
    WebElement btnDeductions;

    @FindBy(xpath = "//div[@id='ext-element-54']")
    WebElement btnCOE;

    @FindBy(xpath = "//div[@id='ext-element-55']")
    WebElement btnTickets;

    @FindBy(xpath = "//div[@id='ext-element-56']")
    WebElement btnActivityLogs;

    @FindBy(xpath = "//div[@id='ext-element-57']")
    WebElement btnManageAccount;

    @FindBy(xpath = "//div[@id='ext-element-50']")
    WebElement btnHome;

    @FindBy(name = "currentPassword")
    WebElement enterCurrentPassword;

    @FindBy(name = "newPassword")
    WebElement enterNewPassword;

    @FindBy(name = "confirmPassword")
    WebElement confirmNewPassword;

    @FindBy(id = "ext-element-1120")
    WebElement btnSaveNewPassword;

    public void viewPersonalInfo(){
        btnPersonalInfo.click();
    }

    public void viewPayrolls(){
        btnPayrolls.click();
    }

    public void viewDeductions(){
        btnDeductions.click();
    }

    public void viewCOE(){
        btnCOE.click();
    }

    public void viewTickets(){
        btnTickets.click();
    }

    public void viewLogs(){
        btnActivityLogs.click();
    }

    public void clickManageAccount(){
        btnManageAccount.click();
    }

    public void returnHome(){
        btnHome.click();
    }

    public void changePassword(){
        clickManageAccount();
        enterCurrentPassword.sendKeys("user");
        enterNewPassword.sendKeys("user");
        confirmNewPassword.sendKeys("user");
        btnSaveNewPassword.click();
    }
}
