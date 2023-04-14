package steps;

import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.LoginPage;

public class LoginSteps {
    public WebDriver driver;
    BasePage basePage;
    LoginPage loginPage;

    public LoginSteps() {
    }


    @Given("User is in the landing page")
    public void user_is_in_homepage() throws Throwable
    {
        basePage.verifyLoginPage();
    }

    @When("User enters invalid credentials")
    public void user_login_with_invalid_credentials() throws Throwable
    {
        loginPage.invalidLogin();
    }

    @Then("Error message should display")
    public void display_error_message() throws Throwable
    {
        loginPage.assertInvalidLogin();
    }
}
