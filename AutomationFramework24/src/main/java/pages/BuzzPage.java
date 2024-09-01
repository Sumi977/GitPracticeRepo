package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BuzzPage {

    public static WebDriver driver;
    public BuzzPage(WebDriver driver){
        this.driver = driver;
    }
    @FindBy(xpath = "//textarea[@placeholder=\"What's on your mind?\"]")
    WebElement whatIsInYourMindTextBox;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement PostYourText;

    public WebElement  WriteInaTextBox(){
        return whatIsInYourMindTextBox;
    }
    public void ShareYoursText(){
         PostYourText.click();
    }


}



