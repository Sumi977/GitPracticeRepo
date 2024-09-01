package test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.*;
import setup.DriverFactory;
import setup.Util;

public class LeaveTest {
    WebDriver driver;
    LoginPage loginPage;
    BasePage basePage;
    LeavePage leavePage;
    HomePage homepage;


    @BeforeClass(alwaysRun = true)
    public void tearUp() {
        driver = DriverFactory.getDriver(Util.getProperties("browserName"));
        loginPage = new LoginPage(driver);
        basePage = new BasePage(driver);
        leavePage = new LeavePage(driver);
        homepage = new HomePage(driver);
        basePage.launchApplication(Util.getProperties("url"));
        loginPage.enterUserName(Util.getProperties("username"));
        loginPage.enterPassword(Util.getProperties("password"));
        loginPage.clickOnLoginButton();
        Util.pauseExecutionForSeconds(2);
        Assert.assertTrue(basePage.checkIfUserIconDisplayed());

    }

    @Test
    public void CheckIfLeavePageIsLoading(){
        homepage.clickOnLeaveTab();
        Util.pauseExecutionForSeconds(2);
        Assert.assertTrue(homepage.checkIfLeavePageVisible());

    }



    @AfterClass(alwaysRun = true)
    public void tearDown(){
        basePage.closeBrowser();
    }






}



