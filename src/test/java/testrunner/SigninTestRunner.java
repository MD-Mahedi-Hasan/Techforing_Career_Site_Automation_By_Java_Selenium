package testrunner;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Signin;
import pages.Signup;
import setup.Setup;

public class SigninTestRunner extends Setup {
    Signin signin;
    Signup signup;
    @Test(priority = 1, description = "Verify user sign in with blank credentials\n")
    public void signinBlankCreds() throws InterruptedException {
        signin= new Signin(driver);
        signup= new Signup(driver);
        driver.get("https://career.techforing.com/");
        Thread.sleep(2000);
        signin.btnSignin.click();
        Thread.sleep(1000);
        Assert.assertEquals(signup.titleSignin.getText(),"SIGN IN");
        signin.btnSignin.click();
        Thread.sleep(500);
        Assert.assertEquals(signin.valMsgEmail.getText(),"This field is required");
        Assert.assertEquals(signin.valMsgPassword.getText(),"This field is required");
    }
    @Test(priority = 2, description = "Verify user sign in with invalid credentials.")
    public void signinInvalCreds() throws InterruptedException {
        signin= new Signin(driver);
        signup= new Signup(driver);
        signup.txtemail.sendKeys("mehedihasan.com");
        signup.txtPassword.sendKeys("123456");
        signin.btnSignin.click();
        Thread.sleep(4000);
        Assert.assertEquals(signin.accountErrMsg.getText(),"No active account found with the given credentials");
    }
    @Test(priority = 3, description = "Verify user sign in with valid password & invalid email.")
    public void signinInvalEmail() throws InterruptedException {
        signin= new Signin(driver);
        signup= new Signup(driver);
        signup.txtPassword.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
        signup.txtPassword.sendKeys("Mehedihasan0-");
        signin.btnSignin.click();
        Thread.sleep(3000);
        Assert.assertEquals(signin.accountErrMsg.getText(),"No active account found with the given credentials");
    }
    @Test(priority = 4, description = "Verify user sign in with valid email & invalid password.")
    public void signinInvalPass(){
        signin= new Signin(driver);
        signup= new Signup(driver);
        signup.txtPassword.sendKeys(Keys.CONTROL+"a");
        signup.txtPassword.sendKeys(Keys.BACK_SPACE);
        signup.txtPassword.sendKeys("123456");
        signup.txtemail.sendKeys(Keys.CONTROL+"a");
        signup.txtemail.sendKeys(Keys.BACK_SPACE);
        signup.txtemail.sendKeys("naymhasan3@gmail.com");
        signin.btnSignin.click();
    }
    @Test(priority = 5, description = "User can successfully sign in with valid credentials.")
    public void signinValCreds() throws InterruptedException {
        signin= new Signin(driver);
        signup= new Signup(driver);
        signup.txtPassword.sendKeys(Keys.CONTROL+"a");
        signup.txtPassword.sendKeys(Keys.BACK_SPACE);
        signup.txtPassword.sendKeys("Mahedi724@");
        signin.btnSignin.click();
        Thread.sleep(2000);
        String title=signin.titleHomepage.getText();
        System.out.println(title);
        Assert.assertEquals(signin.titleHomepage.getText(),"Shaping Tomorrows Cybersecurity");
    }

}
