package com.mssTest.pageObjects.admin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAdmin {
    WebDriver localDriver;

    public CreateAdmin(WebDriver remoteDriver) {
        this.localDriver = remoteDriver;
        PageFactory.initElements(remoteDriver, this);
    }

    @FindBy(xpath = "//div[@id='ext-element-47']")
    WebElement manageAdmin;

    @FindBy(xpath = "//button[@id='ext-element-1652']")
    WebElement createAdmin;

    @FindBy(name = "staffNo")
    WebElement staffno;

    @FindBy(name = "email")
    WebElement staffEmail;

    @FindBy(name = "profileId")
    WebElement staffRole;

    @FindBy(name = "firstName")
    WebElement firstname;

    @FindBy(name = "lastName")
    WebElement lastname;

    @FindBy(id = "ext-element-1961")
    WebElement btnSaveAdmin;


    public void clickManageAdmins(){
        manageAdmin.click();
    }

    public void clickCreateAdmin(){
        createAdmin.click();
    }

    public void enterStaffNo(String staffNo){
        staffno.sendKeys(staffNo);
    }

    public void enterEmail(String email){
        staffEmail.sendKeys(email);
    }

    public void enterRole(String role){
        staffRole.sendKeys(role);
    }

    public void enterFirstName(String firstName){
        firstname.sendKeys(firstName);
    }

    public void enterLastName(String lname){
        lastname.sendKeys(lname);
    }

    public void clickBtnSaveAdmin(){
        btnSaveAdmin.click();
    }
}