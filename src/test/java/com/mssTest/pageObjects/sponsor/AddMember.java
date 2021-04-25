package com.mssTest.pageObjects.sponsor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddMember {
    WebDriver localDriver;

    public AddMember(WebDriver remoteDriver) {
        this.localDriver = remoteDriver;
        PageFactory.initElements(remoteDriver, this);
    }

    @FindBy(xpath = "//button[@data-componentid='ext-button-18']")
    WebElement btnMembers;

//    @FindBy(xpath = "//*[contains(@data-componentid,'ext-button-18')]")
    @FindBy(css = "#ext-element-687")
    WebElement btnAddMember;

    @FindBy(name = "firstname")
    WebElement firstName;

    @FindBy(name = "othernames")
    WebElement otherNames;

    @FindBy(name = "idNo")
    WebElement idNumber;

    @FindBy(name = "email")
    WebElement emailAddress;

    @FindBy(name = "fixedPhone")
    WebElement phoneNo;

    @FindBy(name = "cellPhone")
    WebElement cellPhoneNo;

    @FindBy(name = "secondaryPhone")
    WebElement secondaryPhoneNo;

    @FindBy(xpath = "//*[contains(@data-componentid,'ext-datetrigger-1')]")
    WebElement dateOfBirth;


    @FindBy(xpath = "//*[contains(@data-componentid,'ext-datetrigger-2')]")
    WebElement dateOfJoining;

    @FindBy(xpath = "//body/div[@id='ext-global-floatWrap']/div[@id='ext-sponsoraddmemberform-1-floatWrap']/div[@id='ext-sponsoraddmemberform-1']/div[@id='ext-element-496']/div[@id='ext-element-497']/div[@id='ext-module-2']/div[@id='ext-element-498']/form[@id='ext-formpanel-2']/div[@id='ext-element-617']/div[@id='ext-element-616']/div[@id='ext-element-499']/div[@id='ext-container-4']/div[@id='ext-element-501']/div[@id='ext-container-10']/div[@id='ext-element-592']/div[@id='ext-selectbox-2']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]")
    WebElement btnCostCenter;

    @FindBy(xpath = "//body/div[@id='ext-global-floatWrap']/" +
            "div[@id='ext-sponsoraddmemberform-1-floatWrap']/" +
            "div[@id='ext-sponsoraddmemberform-1']/" +
            "div[@id='ext-element-496']/div[@id='ext-element-497']" +
            "/div[@id='ext-module-2']/div[@id='ext-element-498']" +
            "/form[@id='ext-formpanel-2']/div[@id='ext-element-617']/" +
            "div[@id='ext-element-616']/div[@id='ext-element-499']/" +
            "div[@id='ext-container-4']/div[@id='ext-element-501']/" +
            "div[@id='ext-container-10']/div[@id='ext-element-592']/" +
            "div[@id='ext-selectbox-3']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]")
    WebElement btnMemberClass;

    @FindBy(xpath = "//*[contains(@data-componentid,'btnSaveSingleMember')]")
    WebElement btnSaveMember;

    public void clickBtnMembers(){
        btnMembers.click();
    }

    public void clickBtnAddMember(){
        btnAddMember.click();
    }
}
