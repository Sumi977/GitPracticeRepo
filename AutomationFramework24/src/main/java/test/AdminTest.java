package test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.*;
import setup.DriverFactory;
import setup.Util;

public class AdminTest {

    WebDriver driver;
    LoginPage loginPage;
    BasePage basePage;
    AdminPage adminPage;
    HomePage homepage;


    @BeforeClass(alwaysRun = true)
    public void tearUp() {
        driver = DriverFactory.getDriver(Util.getProperties("browserName"));
        loginPage = new LoginPage(driver);
        basePage = new BasePage(driver);
        adminPage = new AdminPage(driver);
        homepage = new HomePage(driver);
        basePage.launchApplication(Util.getProperties("url"));
        loginPage.enterUserName(Util.getProperties("username"));
        loginPage.enterPassword(Util.getProperties("password"));
        loginPage.clickOnLoginButton();
        Util.pauseExecutionForSeconds(2);
        Assert.assertTrue(basePage.checkIfUserIconDisplayed());

    }



    @Test(groups = {"sanity"})
    public void CheckIfAdminPageIsLoading(){
        homepage.clickOnAdminTab();
        Util.pauseExecutionForSeconds(2);
        Assert.assertTrue(homepage.checkIfAdminPageVisible());


    }

    @Test(groups = {"regression"})
    public void VerifyUserManagementIsVisible(){
        homepage.clickOnAdminTab();
        Util.pauseExecutionForSeconds(2);
        Assert.assertTrue(adminPage.CheckIfUserManagmentDrpDownBoxIsVisible());
    }

    @Test(groups={"sanity"})
    public  void enterSystemUserName(){
        homepage.clickOnAdminTab();
        Util.pauseExecutionForSeconds(3);
        adminPage.SystemUserUserName().sendKeys("Sumana");
        Util.pauseExecutionForSeconds(3);

    }

    @AfterClass(alwaysRun = true)
    public void tearDown(){
        basePage.closeBrowser();
    }


}