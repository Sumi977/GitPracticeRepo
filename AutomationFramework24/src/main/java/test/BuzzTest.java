package test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.BuzzPage;
import pages.HomePage;
import pages.LoginPage;
import setup.DriverFactory;
import setup.Util;

public class BuzzTest {
    WebDriver driver;
    HomePage homepage;
    BasePage basePage;
    BuzzPage buzzpage;
    LoginPage loginPage;

    @BeforeClass(alwaysRun = true)
    public void SetUp(){
        driver = DriverFactory.getDriver(Util.getProperties("browserName"));
        loginPage = new LoginPage(driver);
        homepage = new HomePage(driver);
        basePage= new BasePage(driver);
        buzzpage = new BuzzPage(driver);
        basePage.launchApplication(Util.getProperties("url"));
        loginPage.enterUserName(Util.getProperties("username"));
        loginPage.enterPassword(Util.getProperties("password"));
        loginPage.clickOnLoginButton();
        basePage.checkIfUserIconDisplayed();
        Util.pauseExecutionForSeconds(2);
        Assert.assertTrue(basePage.checkIfUserIconDisplayed());

    }
    @Test(groups = "sanity")
    public void CheckIfBuzzPageIsLoading(){
        homepage.clickOnBuzzTab();
        Util.pauseExecutionForSeconds(2);
        Assert.assertTrue(homepage.checkIfBuzzPageVisible());
    }



    @AfterClass(alwaysRun = true)
    public void TearDown(){
        basePage.closeBrowser();

    }

}
