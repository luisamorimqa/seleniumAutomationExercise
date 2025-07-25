package pages;

import org.openqa.selenium.By;

import static support.Commands.*;

public class HomePage extends BasePage {

    private By loggedMessage = By.xpath("//*[@id='header']/div/div/div/div[2]/div/ul/li[10]/a");
    private By logoutButton = By.xpath("//*[@id='header']/div/div/div/div[2]/div/ul/li[4]/a");
    private By deleteAccountButton = By.xpath("//*[@id='header']/div/div/div/div[2]/div/ul/li[5]/a");
    private By contactUsButton = By.xpath("//*[@id='header']/div/div/div/div[2]/div/ul/li[9]/a");
    private By testCaseButton = By.xpath("//*[@id='header']/div/div/div/div[2]/div/ul/li[6]/a");
    private By productsButton = By.xpath("//*[@id='header']/div/div/div/div[2]/div/ul/li[2]/a");
    private By emailSubscription = By.id("subscribe_email");
    private By subscriptionButton = By.id("subscribe");
    private By subscriptionSuccess = By.xpath("//*[@id='success-subscribe']/div");

    public void fillEmailSubscription(String value) {
        fillField(emailSubscription, value);
    }

    public void clickSubscriptionButton() {
        clickElement(subscriptionButton);
    }

    public void checkMessageSubscriptionSuccess(String value) {
        checkText(subscriptionSuccess, value);
    }

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

    public void clickTestCaseButton() {
        clickElement(testCaseButton);
    }

    public void clickProductsButton() {
        clickElement(productsButton);
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