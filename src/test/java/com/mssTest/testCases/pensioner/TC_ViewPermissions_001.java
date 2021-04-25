package com.mssTest.testCases.pensioner;

import com.mssTest.pageObjects.LoginPage;
import com.mssTest.pageObjects.pensioner.ViewPermissions;
import com.mssTest.testCases.BaseClass;
import org.testng.annotations.Test;

public class TC_ViewPermissions_001 extends BaseClass {

    @Test
    public void viewPermissions() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);

//        loginPage.waitPage();

        loginPage.setTxtEmail("j.yayah7@gmail.com");
//        logger.info("Entered username");

        loginPage.setTxtPassword("user");
//        logger.info("Entered password");

        loginPage.clickSubmit();

        Thread.sleep(3000);
//        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        ViewPermissions viewPermissions = new ViewPermissions(driver);

        viewPermissions.viewPersonalInfo();
        Thread.sleep(5000);
        viewPermissions.viewPayrolls();
        Thread.sleep(5000);
        viewPermissions.viewDeductions();
        Thread.sleep(5000);
        viewPermissions.viewCOE();
        Thread.sleep(5000);
        viewPermissions.viewLogs();
        Thread.sleep(5000);
        viewPermissions.viewTickets();
        Thread.sleep(5000);
        viewPermissions.clickManageAccount();
        Thread.sleep(5000);
        viewPermissions.returnHome();
    }
}
