package com.mssTest.testCases.sponsor;

import com.mssTest.pageObjects.LoginPage;
import com.mssTest.pageObjects.sponsor.BookBill;
import com.mssTest.testCases.BaseClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC_BookBills extends BaseClass {

    @Test
    public void bookBill() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);

//        loginPage.waitPage();

        loginPage.setTxtEmail("officialtonyngeno123@gmail.com");
//        logger.info("Entered username");

        loginPage.setTxtPassword("Admin@123");
//        logger.info("Entered password");

        loginPage.clickSubmit();

//        Thread.sleep(3000);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        BookBill bill = new BookBill(driver);
        bill.clickBtnBills();
//        bill.clickBtnBillBooking();
//        bill.clickBtnProcessBill();
    }
}
