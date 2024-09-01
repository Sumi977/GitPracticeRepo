package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeavePage {
    public static WebDriver driver;
    public LeavePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//a[normalize-space()='My Leave']")
    WebElement ApplyTabIsVisible;
    @FindBy(xpath = "//h6[normalize-space()='Apply Leave']")
    WebElement ApplyLeaveTextIsVisible;




    public void ApplyButtonIsClickable(){
        ApplyTabIsVisible.click();
    }



}

