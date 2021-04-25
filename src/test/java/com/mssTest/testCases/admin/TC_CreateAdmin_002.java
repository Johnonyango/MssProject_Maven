package com.mssTest.testCases.admin;

import com.mssTest.pageObjects.LoginPage;
import com.mssTest.pageObjects.admin.CreateAdmin;
import com.mssTest.testCases.BaseClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC_CreateAdmin_002 extends BaseClass {

    @Test
    public void createAdmin() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);

//        loginPage.waitPage();

        loginPage.setTxtEmail("newtonkarumba@yahoo.com");
//        logger.info("Entered username");

        loginPage.setTxtPassword("Admin@123");
//        logger.info("Entered password");

        loginPage.clickSubmit();

        Thread.sleep(3000);
//        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        CreateAdmin ca = new CreateAdmin(driver);
        ca.clickManageAdmins();
//        ca.clickCreateAdmin();
//        ca.enterStaffNo("H20");
//        ca.enterEmail("j,yayah7@gmail.com");
//        ca.enterRole("Admin");
//        ca.enterFirstName("John");
//        ca.enterLastName("Yayah");
//        ca.clickCreateAdmin();
    }
}
