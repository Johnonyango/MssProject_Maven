package com.mssTest.testCases.member;

import com.mssTest.pageObjects.ClaimProcessing;
import com.mssTest.pageObjects.LoginPage;
import com.mssTest.pageObjects.member.SwitchScheme;
import com.mssTest.testCases.BaseClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC_SwitchScheme_002 extends BaseClass {

    @Test
    public void switchScheme() throws InterruptedException {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.setTxtEmail(email);
        loginPage.setTxtPassword(password);
        loginPage.clickSubmit();

        Thread.sleep(3000);

        SwitchScheme switchScheme = new SwitchScheme(driver);
        switchScheme.clickBtnSwitchScheme();

    }
}
