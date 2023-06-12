package testrunner;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Signup;
import setup.Setup;
import utils.Utils;

public class SignupTestRunner extends Setup {
    Signup signup;
    @Test(priority = 1, description = "Verify user signup without entering any data")
    public void signupWithBlankCreds() throws InterruptedException {
        signup= new Signup(driver);
        driver.get("https://career.techforing.com/");
        Thread.sleep(3000);
        signup.btnSignup.click();
        Thread.sleep(1000);
        Assert.assertEquals(signup.titleSignup.getText(),"SIGN UP");
        signup.btnSignup.click();
        Thread.sleep(1000);
        Assert.assertEquals(signup.validMsgFullname.getText(),"This field is required");
        Assert.assertEquals(signup.validMsgPhoneNum.getText(),"This field is required");
        Assert.assertEquals(signup.validMsgGender.getText(),"This field is required");
        Assert.assertEquals(signup.validMsgEmail.getText(),"This field is required");
        Assert.assertEquals(signup.validMsgPassword.getText(),"This field is required");
        Assert.assertEquals(signup.validMsgConfirmPass.getText(),"This field is required");
        Thread.sleep(1000);
    }
    @Test(priority = 2, description = "Verify user signup with invalid credentials")
    public void signupInvalCreds() throws InterruptedException {
        signup= new Signup(driver);
        signup.txtFullname.sendKeys("Mehedi Hasan");
        signup.txtPhoneNUm.sendKeys("1554");
        signup.drpdwnGender.click();
        signup.optMale.click();
        signup.txtemail.sendKeys("mehedihasan.com");
        signup.txtPassword.sendKeys("123456");
        signup.txtConfirmPassword.sendKeys("123456");
        signup.btnSignup.click();
        Thread.sleep(1000);
        Assert.assertEquals(signup.invalMsgPhoneNum.getText(),"Phone number must be valid");
        Assert.assertEquals(signup.invalMsgPass.getText(),"Password must be at least 8 characters, 1 uppercase and 1 number");
        Thread.sleep(3000);
    }
    @Test(priority = 3, description = "Verify user signup with valid password & invalid phone-number, email, confirm password")
    public void signupInvalConfirmPassPhoneEmail() throws InterruptedException {
        signup= new Signup(driver);
        signup.txtPassword.sendKeys(Keys.CONTROL+"a");
        signup.txtPassword.sendKeys(Keys.BACK_SPACE);
        signup.txtPassword.sendKeys("Mehedihasan0-");
        signup.btnSignup.click();
        Thread.sleep(1000);
        Assert.assertEquals(signup.invalMsgPhoneNum.getText(),"Phone number must be valid");
    }
    @Test(priority = 4, description = "Verify user signup with valid password,confirm password & invalid phone-number & email.\n")
    public void signupInvalPhoneEmail() throws InterruptedException {
        signup= new Signup(driver);
        signup.txtConfirmPassword.sendKeys(Keys.CONTROL+"a");
        signup.txtConfirmPassword.sendKeys(Keys.BACK_SPACE);
        signup.txtConfirmPassword.sendKeys("Mehedihasan0-");
        signup.btnSignup.click();
        Thread.sleep(1000);
        Assert.assertEquals(signup.invalMsgPhoneNum.getText(),"Phone number must be valid");
    }
    @Test(priority = 5, description = "Verify user signup with valid email, pasword, confirm password & invalid phone-number\n")
    public void signupInval() throws InterruptedException {
        signup= new Signup(driver);
        signup.txtemail.sendKeys(Keys.CONTROL+"a");
        signup.txtemail.sendKeys(Keys.BACK_SPACE);
        signup.txtemail.sendKeys("mehedihasan@gmail.com");
        signup.btnSignup.click();
        Thread.sleep(1000);
        Assert.assertEquals(signup.invalMsgPhoneNum.getText(),"Phone number must be valid");
        Thread.sleep(2000);
    }
    @Test(priority = 6, description = "Verify user signup with valid phone-number, password, confirm-password & invalid email\n")
    public void signupInvalemail(){
        signup= new Signup(driver);
        for(int i=0;i<4;i++){
            signup.txtPhoneNUm.sendKeys(Keys.BACK_SPACE);
        }
        signup.txtPhoneNUm.sendKeys("1615269724");
        signup.txtemail.sendKeys(Keys.CONTROL+"a");
        signup.txtemail.sendKeys(Keys.BACK_SPACE);
        signup.txtemail.sendKeys("mehedihasan.com");
        signup.btnSignup.click();
    }
    @Test(priority = 7, description = "Verify user signup with valid phone-number, password & invalid email, confirm-password.")
    public void signupInvalEmailConfirmPass(){
        signup= new Signup(driver);
        signup.txtConfirmPassword.sendKeys(Keys.CONTROL+"a");
        signup.txtConfirmPassword.sendKeys(Keys.BACK_SPACE);
        signup.txtConfirmPassword.sendKeys("123456");
        signup.btnSignup.click();
        Assert.assertEquals(signup.invalMsgCOnfirmPass.getText(),"Password does not match");
    }
    @Test(priority = 8, description = "Verify user signup with valid phone number & invalid email, password & confirm password.")
    public void signupInvalEmailPassConfirmPass(){
        signup= new Signup(driver);
        signup.txtPassword.sendKeys(Keys.CONTROL+"a");
        signup.txtPassword.sendKeys(Keys.BACK_SPACE);
        signup.txtPassword.sendKeys("Mehedi");
        signup.btnSignup.click();
        Assert.assertEquals(signup.invalMsgCOnfirmPass.getText(),"Password does not match");
        Assert.assertEquals(signup.invalMsgPass.getText(),"Password must be at least 8 characters, 1 uppercase and 1 number");
    }
    @Test(priority = 9, description = "Verify user signup with valid phone-number,email & invalid password, confirm password.")
    public void signupInvalPassConfirmPass(){
        signup= new Signup(driver);
        signup.txtemail.sendKeys(Keys.CONTROL+"a");
        signup.txtemail.sendKeys(Keys.BACK_SPACE);
        signup.txtemail.sendKeys("mehedihasan@gmail.com");
        signup.btnSignup.click();
        Assert.assertEquals(signup.invalMsgPass.getText(),"Password must be at least 8 characters, 1 uppercase and 1 number");
        Assert.assertEquals(signup.invalMsgCOnfirmPass.getText(),"Password does not match");
    }
    @Test(priority = 10, description = "Verify user email with valid email & invalid phone-number, password, confirm password\n")
    public void signupInvalPhonePassConfirmPass(){
        signup= new Signup(driver);
        for(int i=0;i<10;i++){
            signup.txtPhoneNUm.sendKeys(Keys.BACK_SPACE);
        }
        signup.txtPhoneNUm.sendKeys("1516");
        signup.btnSignup.click();
        Assert.assertEquals(signup.invalMsgPass.getText(),"Password must be at least 8 characters, 1 uppercase and 1 number");
        Assert.assertEquals(signup.invalMsgCOnfirmPass.getText(),"Password does not match");
        Assert.assertEquals(signup.invalMsgPhoneNum.getText(),"Phone number must be valid");
    }
    @Test(priority = 11, description = "Verify user signup with valid email, password & invalid phone-number, confirm password.\n")
    public void signupInvalPhoneConfirmPass(){
        signup= new Signup(driver);
        signup.txtPassword.sendKeys(Keys.CONTROL+"a");
        signup.txtPassword.sendKeys(Keys.BACK_SPACE);
        signup.txtPassword.sendKeys("Mehedihasan0-");
        signup.btnSignup.click();
        Assert.assertEquals(signup.invalMsgCOnfirmPass.getText(),"Password does not match");
        Assert.assertEquals(signup.invalMsgPhoneNum.getText(),"Phone number must be valid");
    }
    @Test(priority = 12, description = "Verify user signup with valid phone-number, email, password & invalid confirm password\n")
    public void signupInvalConfirmPass(){
        signup= new Signup(driver);
        for(int i=0;i<4;i++){
            signup.txtPhoneNUm.sendKeys(Keys.BACK_SPACE);
        }
        signup.txtPhoneNUm.sendKeys("1615269724");
        signup.btnSignup.click();
        Assert.assertEquals(signup.invalMsgCOnfirmPass.getText(),"Password does not match");
    }
    @Test(priority = 13, description = "Verify user signup without selecting any date.\n")
    public void signupWithoutDate(){
        signup= new Signup(driver);
        signup.txtConfirmPassword.sendKeys(Keys.CONTROL+"a");
        signup.txtConfirmPassword.sendKeys(Keys.BACK_SPACE);
        signup.txtConfirmPassword.sendKeys("Mehedihasan0-");
        signup.txtdate.sendKeys(Keys.CONTROL+"a");
        signup.txtdate.sendKeys(Keys.BACK_SPACE);
        signup.btnSignup.click();
    }
    @Test(priority = 14, description = "Verify user sign up with registered email.")
    public void signupRegisteredEmail() throws InterruptedException {
        signup= new Signup(driver);
        signup.txtdate.sendKeys("01/05/1997");
        signup.txtemail.sendKeys(Keys.CONTROL+"a");
        signup.txtemail.sendKeys(Keys.BACK_SPACE);
        signup.txtemail.sendKeys("tanvirmitul96@gmail.com");
        signup.btnSignup.click();
        Thread.sleep(5000);
        Assert.assertEquals(signup.txtError.getText(),"Error!");
        Assert.assertEquals(signup.errorMsgRegistrEmail.getText(),"Already registered with this email address");
        signup.btnOk.click();
    }
    @Test(priority = 15, description = "User can sucessfully signup with valid credentials")
    public void signupValCreds() throws InterruptedException {
        int num = Utils.generateRandomNumber(10000, 99999);
        signup.txtemail.sendKeys(Keys.CONTROL+"a");
        signup.txtemail.sendKeys(Keys.BACK_SPACE);
        signup.txtemail.sendKeys("mehedihasan"+num+"@gmail.com");
        signup.btnSignup.click();
        Thread.sleep(5000);
        Assert.assertEquals(signup.txtCongratulations.getText(),"Congratulations!");
        Assert.assertEquals(signup.txtVerificationMail.getText(),"You've successfully completed registration. Please check your inbox/spam/promotion for verification mail");
        signup.btnOk.click();
        Thread.sleep(2000);
        Assert.assertEquals(signup.titleSignin.getText(),"SIGN IN");
    }
}
