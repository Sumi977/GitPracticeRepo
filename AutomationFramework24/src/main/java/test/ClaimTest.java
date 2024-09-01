package test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.ClaimPage;
import pages.HomePage;
import pages.LoginPage;
import setup.DriverFactory;
import setup.Util;

public class ClaimTest {
    WebDriver driver;
    HomePage homepage;
    ClaimPage claimPage;
    BasePage basePage;
    LoginPage loginPage;

    @BeforeClass(alwaysRun = true)
    public void TearUp() {
        driver = DriverFactory.getDriver(Util.getProperties("browserName"));
        homepage = new HomePage(driver);
        claimPage = new ClaimPage(driver);
        basePage = new BasePage(driver);
        loginPage = new LoginPage(driver);
        basePage.launchApplication(Util.getProperties("url"));
        loginPage.enterUserName(Util.getProperties("username"));
        loginPage.enterPassword(Util.getProperties("password"));
        loginPage.clickOnLoginButton();
        Util.pauseExecutionForSeconds(2);
        Assert.assertTrue(basePage.checkIfUserIconDisplayed());


    }

    @Test(groups = {"regression"})
    public void CheckIfClaimPageIsLoading(){
        homepage.clickOnClaimTab();
        Util.pauseExecutionForSeconds(2);
        Assert.assertTrue(homepage.checkIfClaimPageIsVisible());



    }
    @AfterClass(alwaysRun = true)
    public void TearDown(){
        basePage.closeBrowser();
    }
}