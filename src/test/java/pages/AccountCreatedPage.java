package pages;

import org.openqa.selenium.By;

import static support.Commands.*;

public class AccountCreatedPage extends BasePage {

    private By continueButton = By.xpath("//*[@id='form']/div/div/div/div/a");
    private By accountCreatedMessage = By.xpath("//h2/b");
    private By congratulationsMessage = By.xpath("//*[@id='form']/div/div/div/p[1]");
    private By privilegesMessage = By.xpath("//*[@id='form']/div/div/div/p[2]");

    public void clickContinueButton() {
        clickElement(continueButton);
    }

    public void checkAccountCreatedMessage(String value) {
        checkText(accountCreatedMessage, value);
    }

    public void checkCongratulationsMessage(String value) {
        checkText(congratulationsMessage, value);
    }

    public void checkPrivilegesMessage(String value) {
        checkTestContains(privilegesMessage, value);
    }
}