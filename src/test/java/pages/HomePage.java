package pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import static support.Commands.*;

public class HomePage extends BasePage {

    private By loggedMessage = By.xpath("//*[@id='header']/div/div/div/div[2]/div/ul/li[10]/a");
    private By logoutButton = By.xpath("//*[@id='header']/div/div/div/div[2]/div/ul/li[4]/a");
    private By deleteAccountButton = By.xpath("//*[@id='header']/div/div/div/div[2]/div/ul/li[5]/a");

    public void checkLoggedMessage(String value) {
        //checkContainsText(loggedMessage, value);
        checkText(loggedMessage, value);
    }

    public void checkHomePage() {
        Assert.assertEquals("FEATURES ITEMS", getDriver().findElement(By.xpath("//div[@class='features_items']/h2[@class='title text-center']")).getText());
    }

    public void clickLogoutButton() {
        clickElement(logoutButton);
    }

    public void clickDeleteAccountButton() {
        clickElement(deleteAccountButton);
    }
}
