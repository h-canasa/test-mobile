package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import config.baseAndroid;

public class BasePage extends baseAndroid {
    By userId = By.id("mobileNo");
    By password = By.id("et_password");
    By login_Button = By.id("btn_mlogin");
    By existingUser_login = By.id("btn_mlogin");

    public BasePage(WebDriver driver) {
        super();
    }

    public boolean verifyLoginPage() {
        driver.findElement(userId).isDisplayed();
        return true;
    }

    public LoginPage invalidLogin() {
        driver.findElement(existingUser_login).click();
        driver.findElement(userId).clear();
        driver.findElement(userId).sendKeys("test12345@testvagrant.com");
        driver.findElement(password).sendKeys("pw12345");
        driver.findElement(login_Button).click();
        Assert.assertTrue(driver.findElement(By.id("pageLevelError")).getText().equalsIgnoreCase("Account does not exist"));
        return new LoginPage(driver);
    }
}
