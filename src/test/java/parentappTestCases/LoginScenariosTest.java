package parentappTestCases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.ActivityReportsPage;
import pageObjects.LoginPage;
import testUtilities.TestConfigurations;

public class LoginScenariosTest extends TestConfigurations {

    LoginPage loginPage;

    @BeforeMethod
    public void beforeMethod() {
        loginPage = new LoginPage(driver);
    }

    public void login(String userName, String password) {
        loginPage.emailField.sendKeys(userName);
        loginPage.passwordField.sendKeys(password);
        loginPage.loginButton.click();
    }

    //@Test
    public void loginWithoutEnteringCredentials() {
        login("", "");
        Assert.assertTrue(loginPage.userNameErrorMessage.isDisplayed());
    }

    //@Test
    public void loginWithoutEnteringPassword() {
        login("test@abc.com", "");
        Assert.assertTrue(loginPage.passwordErrorMessage.isDisplayed());
    }
    //@Test
    public void loginWithoutEnteringUsername() {
        login("", "test123");
        Assert.assertTrue(loginPage.userNameErrorMessage.isDisplayed());
    }

    //@Test
    public void loginUsingInvalidCredentials() {
        login("test@abc.com", "test123");
        Assert.assertTrue(loginPage.loginButton.isDisplayed());
        Assert.assertEquals(loginPage.snackBar.getText(), "You have entered incorrect email or password.");
    }

    @Test(groups = {"smoke"})
    public void loginUsingValidCredentials() {
        login(System.getenv("PS2ME_Parent_Username"), System.getenv("PS2ME_Parent_Password"));
        ActivityReportsPage arp = new ActivityReportsPage(driver);
        Assert.assertTrue(arp.ActivityReportsHeading.isDisplayed());
    }
}
