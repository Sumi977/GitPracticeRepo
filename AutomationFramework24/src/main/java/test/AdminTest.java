package test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.*;
import setup.DriverFactory;
import setup.Util;

public class AdminTest {

    WebDriver driver;
    LoginPage loginPage;
    BasePage basePage;
    AdminPage adminPage;
    BuzzPage buzzPage;
    ClaimPage claimPage;


    @BeforeClass
    public void tearUp() {
        driver = DriverFactory.getDriver("chrome");
        loginPage = new LoginPage(driver);
        basePage = new BasePage(driver);
        adminPage = new AdminPage(driver);


    }

    @Test
    public void verifyIfUserIsAbleToLogin() {
        basePage.launchApplication("https://opensource-demo.orangehrmlive.com/");
        Util.pauseExecutionForSeconds();
        loginPage.enterUserName("Admin");
        Util.pauseExecutionForSeconds();
        loginPage.enterPassword("admin123");
        Util.pauseExecutionForSeconds();
        loginPage.clickOnLoginButton();
        Util.pauseExecutionForSeconds();
        Assert.assertTrue(basePage.checkIfUserIconDisplayed());
    }
    @AfterClass
    public void tearDown(){
        basePage.closeBrowser();
    }
}