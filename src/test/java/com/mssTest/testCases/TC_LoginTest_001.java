package com.mssTest.testCases;

import com.mssTest.pageObjects.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class TC_LoginTest_001 extends BaseClass {

    @Test
    public void login() throws IOException {
//        logger.info("url opened");

        LoginPage loginPage = new LoginPage(driver);

//        loginPage.waitPage();

        loginPage.setTxtEmail(email);
//        logger.info("Entered username");

        loginPage.setTxtPassword(password);
//        logger.info("Entered password");

        loginPage.clickSubmit();
//        logger.info("clicked login button");
//        System.out.println(driver.getTitle());


        if (driver.getTitle().contains("MSS")){
            Assert.assertTrue(true);
//            logger.info("login test passed");
        }
        else if(!driver.getTitle().contains("Mss")){
            Assert.assertTrue(false);
            captureScreen(driver,"loginTest");
//            logger.info("Login test failed");
         }
    }
}
