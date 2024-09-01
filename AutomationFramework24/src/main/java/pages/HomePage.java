package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    public static WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath= "//span[normalize-space()='Admin']")
    WebElement adminTabOnSideMenu;
    @FindBy(xpath = "//span[normalize-space()='PIM']")
    WebElement PIMTabOnSideMenu;
    @FindBy(xpath = "//span[normalize-space()='Leave']")
    WebElement leaveTabOnSideMenu;
    @FindBy(xpath = "//a[@class='oxd-main-menu-item active']//span[1]")
    WebElement TimeonSideMenu;
    @FindBy(xpath = "//span[normalize-space()='Buzz']")
    WebElement BuzzTabOnSideMenu;
    @FindBy(xpath = "//span[normalize-space()='Recruitment']")
    WebElement RecruitmentTabOnSideMenu;
    @FindBy(xpath = "//span[normalize-space()='Performance']")
    WebElement PerformanceTabOnSideMenu;
    @FindBy(xpath = "//span[normalize-space()='My Info']")
    WebElement MyinfoTabOnSideMenu;
    @FindBy(xpath = "//span[normalize-space()='Maintenance']")
    WebElement MaintenanceTabOnSideMenu;
    @FindBy(xpath = "//span[normalize-space()='Directory']")
    WebElement DirectoryTabOnSideMenu;
    @FindBy(xpath = "//span[normalize-space()='Dashboard']")
    WebElement DashboardTabOnSideMenu;
    @FindBy(xpath = "//span[normalize-space()='Claim']")
    WebElement ClaimTabOnSideMenu;



    @FindBy(xpath = "//h6[normalize-space()='Admin']")
    WebElement AdminTitleOnHeader;
    @FindBy(xpath = "//h6[normalize-space()='PIM']")
    WebElement PIMTitleOnHeader;
    @FindBy(xpath = "//h6[normalize-space()='Leave']")
    WebElement leaveTitleOnHeader;
    @FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")
    WebElement TimeTitleOnHeader;
    @FindBy(xpath = "//h6[normalize-space()='Buzz']")
    WebElement BuzzTitleOnHeader;
    @FindBy(xpath = "//h6[normalize-space()='Performance']")
    WebElement PerformanceTitleOnHeader;
    @FindBy(xpath = "//h6[normalize-space()='PIM']")
    WebElement PimTitleOnHeader;
    @FindBy(xpath = "//h6[normalize-space()='Administrator Access']")
    WebElement AdministratorAccessWindowPopup;
    @FindBy(xpath = "//h6[normalize-space()='Directory']")
    WebElement DirectoryTitleOnHeader;
    @FindBy(xpath = "//span[normalize-space()='Dashboard']")
    WebElement DashboardTitleOnHeader;
    @FindBy(xpath = "//h6[normalize-space()='Claim']")
    WebElement ClaimTitleOnHeader;
    @FindBy(xpath ="//h6[normalize-space()='Recruitment']")
    WebElement RecruitmentTitleOnHeader;
    @FindBy(xpath= "//button[normalize-space()='Add']")
    WebElement AddButton;










    public void clickOnPIMTab() {
        PIMTabOnSideMenu.click();
    }

    public void clickOnAdminTab() {
        adminTabOnSideMenu.click();
    }

    public void clickOnLeaveTab() {
        leaveTabOnSideMenu.click();
    }

    public void clickOnTimeTab() {
        TimeonSideMenu.click();
    }

    public void clickOnBuzzTab() {
        BuzzTabOnSideMenu.click();
    }

    public void clickOnPerformanceTab() {
        PerformanceTabOnSideMenu.click();
    }
    public void clickOnRecruitmentTab() {
        RecruitmentTabOnSideMenu.click();
    }
    public void clickOnDirectoryTab() {
        DirectoryTabOnSideMenu.click();
    }
    public void clickOnDashboardTab() {
        DashboardTabOnSideMenu.click();
    }
    public void clickOnClaimTab() {
        ClaimTabOnSideMenu.click();
    }
    public void clickOnMyinfoTab() {
        MyinfoTabOnSideMenu.click();
    }










    public boolean checkIfAdminPageVisible() {
        return AdminTitleOnHeader.isDisplayed();
    }

    public boolean checkIfPIMPageVisible() {
        return PIMTitleOnHeader.isDisplayed();
    }

    public boolean checkIfLeavePageVisible() {
        return leaveTitleOnHeader.isDisplayed();
    }

    public boolean checkIfTimePageVisible() {
        return TimeTitleOnHeader.isDisplayed();
    }

    public boolean checkIfBuzzPageVisible() {
        return BuzzTitleOnHeader.isDisplayed();
    }
    public boolean checkIfRecruitmentPageVisible() {
        return RecruitmentTitleOnHeader.isDisplayed();
    }
    public boolean checkIfPerformancePageVisible() {
        return PerformanceTitleOnHeader.isDisplayed();
    }
    public boolean checkIfPimPageVisible() {
        return PimTitleOnHeader.isDisplayed();
    }
    public boolean checkIfDirectoryPageVisible() {
        return DirectoryTitleOnHeader.isDisplayed();
    }
    public boolean checkIfDashboardPageVisible() {
        return DashboardTitleOnHeader.isDisplayed();
    }
    public boolean checkIfAdministratorAccessPageVisible() {
        return AdministratorAccessWindowPopup.isDisplayed();
    }
    public boolean checkIfClaimPageIsVisible() {
        return ClaimTitleOnHeader.isDisplayed();
    }



}