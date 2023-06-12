package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signup {
    @FindBy(xpath = "//button[normalize-space()='Sign Up']")
    public WebElement btnSignup;
    @FindBy(xpath = "//p[contains(text(),'This field is required')]")
    public WebElement validMsgFullname;
    @FindBy(xpath = "(//p[contains(text(),'This field is required')])[2]")
    public WebElement validMsgPhoneNum;
    @FindBy(xpath = "(//p[contains(text(),'This field is required')])[3]")
    public WebElement validMsgGender;
    @FindBy(xpath = "(//p[contains(text(),'This field is required')])[4]")
    public WebElement validMsgEmail;
    @FindBy(xpath = "(//p[contains(text(),'This field is required')])[5]")
    public WebElement validMsgPassword;
    @FindBy(xpath = "(//p[contains(text(),'This field is required')])[6]")
    public WebElement validMsgConfirmPass;
    @FindBy(name = "full_name")
    public WebElement txtFullname;
    @FindBy(xpath = "//input[@type='tel']")
    public WebElement txtPhoneNUm;
    @FindBy(id = "gender")
    public WebElement drpdwnGender;
    @FindBy(xpath = "//li[normalize-space()='Male']")
    public WebElement optMale;
    @FindBy(id = "email")
    public WebElement txtemail;
    @FindBy(id = "password")
    public WebElement txtPassword;
    @FindBy(xpath = "//input[@name='confirm_password']")
    public WebElement txtConfirmPassword;
    @FindBy(xpath = "//p[contains(text(),'Phone number must be valid')]")
    public WebElement invalMsgPhoneNum;
    @FindBy(xpath = "//p[contains(normalize-space(),'Password must be at least 8 characters, 1 uppercase and 1 number')]")
    public WebElement invalMsgPass;
    @FindBy(xpath = "//p[contains(text(),'Password does not match')]")
    public WebElement invalMsgCOnfirmPass;
    @FindBy(xpath = "//input[@placeholder='mm/dd/yyyy']")
    public WebElement txtdate;
    @FindBy(css = "[data-testid='CalendarIcon']")
    public WebElement calenderIcon;
    @FindBy(xpath = "//p[contains(.,'Already registered with this email address')]")
    public WebElement errorMsgRegistrEmail;
    @FindBy(xpath = "//button[contains(text(),'OK')]")
    public WebElement btnOk;
    @FindBy(xpath = "//div[normalize-space()='Error!']")
    public WebElement txtError;
    @FindBy(xpath = "//div[normalize-space()='Congratulations!']")
    public WebElement txtCongratulations;
    @FindBy(xpath = "//h3[normalize-space()='Sign in']")
    public WebElement titleSignin;
    @FindBy(xpath = "//h3[normalize-space()='Sign Up']")
    public WebElement titleSignup;
    @FindBy(xpath = "//div[contains(text(),\"You've successfully completed registration. Please check your inbox/spam/promotion for verification mail\")]")
    public WebElement txtVerificationMail;
    public Signup(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
}
