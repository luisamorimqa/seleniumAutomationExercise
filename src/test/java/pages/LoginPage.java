package pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import static support.Commands.*;

public class LoginPage extends BasePage {

    String pageUrl = "/login";

    private By loginEmailAddressField = By.xpath("//*[@id='form']/div/div/div[1]/div/form/input[2]");
    private By loginPasswordField = By.xpath("//*[@id='form']/div/div/div[1]/div/form/input[3]");
    private By loginButton = By.xpath("//*[@id='form']/div/div/div[1]/div/form/button");

    private By alertMessageLogin = By.xpath("//*[@id='form']/div/div/div[1]/div/form/p");

    public void getPage() {
        getDriver("chrome").get(getBaseUrl() + pageUrl);
    }

    public void fillLoginEmailAddressField(String value) {
        fillField(loginEmailAddressField, value);
    }

    public void fillLoginPasswordField(String value) {
        fillField(loginPasswordField, value);
    }

    public void clickLoginButton() {
        clickElement(loginButton);
    }

    public void checkAlertMessageLogin(String value) {
        checkText(alertMessageLogin, value);
    }

    public void checkLoginPage() {
        Assert.assertEquals("Login to your account", getDriver().findElement(By.xpath("//*[@id='form']/div/div/div[1]/div/h2")).getText());
        Assert.assertEquals("New User Signup!", getDriver().findElement(By.xpath("//*[@id='form']/div/div/div[3]/div/h2")).getText());
    }
}