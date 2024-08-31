package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public static WebDriver driver;
    public BasePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//img[@alt='profile picture']")
    WebElement userIconHomePage;




    public boolean checkIfUserIconDisplayed(){
        return userIconHomePage.isDisplayed();
    }

    public void launchApplication(String url){
        driver.get(url);

    }
    public void closeBrowser(){
        driver.close();


    }
}
