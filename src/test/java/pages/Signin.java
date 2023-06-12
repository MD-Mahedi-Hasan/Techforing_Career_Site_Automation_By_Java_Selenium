package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signin{
    @FindBy(xpath = "//button[normalize-space()='Sign In']")
    public WebElement btnSignin;
    @FindBy(xpath = "//p[contains(normalize-space(),'This field is required')]")
    public WebElement valMsgEmail;
    @FindBy(xpath = "(//p[contains(normalize-space(),'This field is required')])[2]")
    public WebElement valMsgPassword;
    @FindBy(xpath = "//p[contains(text(),'No active account found with the given credentials')]")
    public WebElement accountErrMsg;
    @FindBy(xpath = "//p[contains(normalize-space(),'Shaping Tomorrows Cybersecurity')]")
    public WebElement titleHomepage;
    public Signin(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
}
