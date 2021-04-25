package com.mssTest.pageObjects.member;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwitchScheme {

    WebDriver localDriver;



    public SwitchScheme(WebDriver remoteDriver){
        this.localDriver = remoteDriver;
        PageFactory.initElements(remoteDriver, this);
    }

    @FindBy(xpath = "//*[contains(@data-componentid,'ext-button-1')]")
    WebElement switchSchemeBtn;

    @FindBy(name = "memberschemesbox")
    WebElement selectScheme;


    public void clickBtnSwitchScheme(){
        switchSchemeBtn.click();
    }
}
