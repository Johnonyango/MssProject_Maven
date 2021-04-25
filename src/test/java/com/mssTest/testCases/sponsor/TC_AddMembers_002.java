package com.mssTest.testCases.sponsor;

import com.mssTest.pageObjects.LoginPage;
import com.mssTest.pageObjects.sponsor.AddMember;
import com.mssTest.testCases.BaseClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC_AddMembers_002 extends BaseClass {

    @Test
    public void addMembers() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);

//        loginPage.waitPage();

        loginPage.setTxtEmail("officialtonyngeno123@gmail.com");
//        logger.info("Entered username");

        loginPage.setTxtPassword("Admin@123");
//        logger.info("Entered password");

        loginPage.clickSubmit();

        Thread.sleep(3000);
//        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        AddMember addMember = new AddMember(driver);
        addMember.clickBtnMembers();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        addMember.clickBtnAddMember();

    }
}
