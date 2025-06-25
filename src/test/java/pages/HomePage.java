package pages;

import org.openqa.selenium.By;

import static support.Commands.*;

public class HomePage extends BasePage {

    private By loggedMessage = By.xpath("//*[@id='header']/div/div/div/div[2]/div/ul/li[10]/a");
    private By logoutButton = By.xpath("//*[@id='header']/div/div/div/div[2]/div/ul/li[4]/a");
    private By deleteAccountButton = By.xpath("//*[@id='header']/div/div/div/div[2]/div/ul/li[5]/a");
    private By contactUsButton = By.xpath("//*[@id='header']/div/div/div/div[2]/div/ul/li[9]/a");

    public void checkLoggedMessage(String value) {
        checkText(loggedMessage, value);
    }

    public void clickLogoutButton() {
        clickElement(logoutButton);
    }

    public void clickDeleteAccountButton() {
        clickElement(deleteAccountButton);
    }

    public void clickContactUsButton() {
        clickElement(contactUsButton);
    }

    public void checkHomePage() {
        System.out.println("###############################################################################");
        System.out.println("*************** Validando page ***************");
        checkVisibility(By.xpath("/html/body/section[2]/div/div/div[1]/div/h2"), 10);
        checkText(By.xpath("/html/body/section[2]/div/div/div[1]/div/h2"), "CATEGORY");
        checkVisibility(By.xpath("/html/body/section[2]/div/div/div[2]/div[1]/h2"), 10);
        checkText(By.xpath("/html/body/section[2]/div/div/div[2]/div[1]/h2"), "FEATURES ITEMS");
        System.out.println("*************** Page validada ***************");
    }
}