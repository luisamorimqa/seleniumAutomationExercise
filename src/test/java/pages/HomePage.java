package pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import static support.Commands.checkContainsText;

public class HomePage extends BasePage {

    private By loggedMessage = By.xpath("//*[@id='header']/div/div/div/div[2]/div/ul/li[10]/a");

    public void checkLoggedMessage(String value) {
        checkContainsText(loggedMessage, value);
    }

    public void checkHomePage() {
        Assert.assertEquals("FEATURES ITEMS", getDriver().findElement(By.xpath("//div[@class='features_items']/h2[@class='title text-center']")).getText());
    }
}
