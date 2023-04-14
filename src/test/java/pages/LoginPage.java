package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPage extends BasePage {
    By mobileNo = By.id("mobileNo");
    By password = By.id("et_password");
    By loginBtn = By.id("btn_mlogin");
    By existingUserBtn = By.id("btn_mlogin");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage invalidLogin() {
        driver.findElement(existingUserBtn).click();
        driver.findElement(mobileNo).clear();
        driver.findElement(mobileNo).sendKeys("test@testmail.com");
        driver.findElement(password).sendKeys("pw12345");
        driver.findElement(loginBtn).click();
        return new LoginPage(driver);
    }
    public LoginPage assertInvalidLogin (){
        Assert.assertTrue(driver.findElement(By.id("pageLevelError")).getText().equalsIgnoreCase("Account does not exist"));
        return new LoginPage(driver);
    }
}
