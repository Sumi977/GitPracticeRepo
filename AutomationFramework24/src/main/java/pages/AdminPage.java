package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import setup.Util;

public class AdminPage {

    public static WebDriver driver;
    public AdminPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//span[normalize-space()='User Management']")
    WebElement UserManagementDropDownBox;
    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
    WebElement UserNameTextbox;
    @FindBy(xpath = "//div[@tabindex='0']")
    WebElement UserRoleSelectDropDown;



    public boolean CheckIfUserManagmentDrpDownBoxIsVisible(){
        return UserManagementDropDownBox.isDisplayed();

    }
    public WebElement SystemUserUserName(){
        return UserNameTextbox;
    }

    public void SelectAdminFromDropdown(){
        UserRoleSelectDropDown.click();


        Select dropdown = new Select(UserRoleSelectDropDown);
        dropdown.selectByValue("Admin");
    }
    public void SelectUserRole(){

    }


}
