package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.BaseTest;

public class LoginTests extends BaseTest {

    @Test(priority = 1)
    public void testValidLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterEmail("test@test.com");
        loginPage.enterPassword("dhw63js8");
        loginPage.clickLogin();
        Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"), "Login failed.");
    }

    @Test(priority = 2)
    public void testInvalidEmailFormat() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterEmail("test@");
        loginPage.enterPassword("dhw63js8");
        loginPage.clickLogin();
        Assert.assertTrue(loginPage.getErrorMessage().contains("Invalid email"));
    }

    @Test(priority = 3)
    public void testBlankFields() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterEmail("");
        loginPage.enterPassword("");
        loginPage.clickLogin();
        Assert.assertTrue(loginPage.getErrorMessage().contains("cannot be blank"));
    }

    @Test(priority = 4)
    public void testShortPassword() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterEmail("test@test.com");
        loginPage.enterPassword("short");
        loginPage.clickLogin();
        Assert.assertTrue(loginPage.getErrorMessage().contains("at least 8 characters"));
    }

    @Test(priority = 5)
    public void testForgotPasswordLink() {
        LoginPage loginPage = new LoginPage(driver);
        String currentUrlBeforeClick = driver.getCurrentUrl();
        loginPage.clickForgotPassword();
        String currentUrlAfterClick = driver.getCurrentUrl();
        Assert.assertNotEquals(currentUrlAfterClick, currentUrlBeforeClick, "Forgot Password link did not navigate anywhere.");
    }
}