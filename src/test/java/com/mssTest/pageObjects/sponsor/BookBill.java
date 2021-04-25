package com.mssTest.pageObjects.sponsor;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BookBill {
    WebDriver localDriver;

    public BookBill(WebDriver remoteDriver) {
        this.localDriver = remoteDriver;
        PageFactory.initElements(remoteDriver, this);
    }

    @FindBy(id = "ext-element-58")
    WebElement btnBills;

    @FindBy(xpath = "//*[contains(@data-componentid,'btnBookContribBills')]")
//    @FindBy(id = "ext-element-175")
    WebElement btnBillBooking;

    @FindBy(xpath = "//body/div[@id='ext-global-floatWrap']/div[@id='ext-bookcontributionbillphoneform-1-floatWrap']/div[@id='ext-bookcontributionbillphoneform-1']/div[@id='ext-element-838']/div[@id='ext-element-923']/div[@id='ext-element-839']/div[@id='ext-module-4']/div[@id='ext-element-840']/div[@id='ext-container-9']/div[@id='ext-element-841']/div[@id='ext-container-10']/div[@id='ext-element-844']/form[@id='ext-formpanel-3']/div[@id='ext-element-911']/div[@id='ext-element-845']/div[@id='bookdateid']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]")
    WebElement billsDate;

    @FindBy(xpath = "//button[@id='ext-element-586']")
    WebElement btnProcessBill;

    @FindBy(xpath = "//button[@id='ext-element-586']")
    WebElement btnBookBill;

    @FindBy(xpath = "//button[@id='ext-element-586']")
    WebElement btnCancelProcess;

    public void clickBtnBills(){
        btnBills.click();
    }

    public void clickBtnBillBooking(){
//        WebDriverWait wait = new WebDriverWait(localDriver, 30);
//        wait.until(ExpectedConditions.elementToBeClickable(btnBillBooking));
//        btnProcessBill.click();

    }

    public void clickBillsDate(){
        billsDate.click();
    }

    public void clickBtnProcessBill(){
        btnProcessBill.click();
    }




}
