package com.mssTest.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class LoginPage{

    WebDriver localDriver;




    public LoginPage(WebDriver remoteDriver){
        this.localDriver = remoteDriver;
        PageFactory.initElements(remoteDriver, this);
    }

//    @FindBy(id = "name-ef64")
    @FindBy(xpath = "//input[@class='u-border-1 u-border-grey-30 u-input u-input-rectangle']")
    @CacheLookup
    WebElement txtEmail;

    @FindBy(id = "email-ef64")
    @CacheLookup
    WebElement txtPassword;

    @FindBy(partialLinkText = "Log in")
    @CacheLookup
    WebElement btnLogin;

    @FindBy(id = "ext-element-25")
    @CacheLookup
    WebElement btnLogout;


    @FindBy(id = "ext-element-380")
    @CacheLookup
    WebElement logout;




//    WebElement txtEmail;
//    WebElement txtPassword;
//    WebElement btnLogin;
//
//    public void waitPage(){
//        localDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//         txtEmail = localDriver.findElement(By.id("name-ef64"));
//         txtPassword = localDriver.findElement(By.id("email-ef64"));
//         btnLogin = localDriver.findElement(By.partialLinkText("Log in"));
//    }




//    public void waiting(){
////        localDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//        WebElement element;
//        WebDriverWait wait = new WebDriverWait(localDriver, 100);
//        element= wait.until(ExpectedConditions.elementToBeClickable(By.name("uid")));
//        element.sendKeys("ASDFGHJKL");
//    }
//    @FindBy(partialLinkText = "Log in")
//    @CacheLookup
//    WebElement btnLogin;

    public void setTxtEmail(String uname){
        txtEmail.sendKeys(uname);
    }

    public void setTxtPassword(String pwd){
        txtPassword.sendKeys(pwd);
    }

    public void clickSubmit(){
        btnLogin.click();
    }

//    public void clickLogout() {
//        btnLogout.click();
//        Actions actions = new Actions(localDriver);
//        actions.moveToElement(logout).click().perform();
//    }

}
