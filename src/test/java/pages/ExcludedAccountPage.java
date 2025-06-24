package pages;

import org.openqa.selenium.By;

import static support.Commands.checkText;

public class ExcludedAccountPage extends BasePage {

    private By pageTitle = By.xpath("//h2/b");
    private By excludedAccountMessage = By.xpath("//*[@id='form']/div/div/div/p[1]");
    private By instructionsMessage = By.xpath("//*[@id='form']/div/div/div/p[2]");

    public void checkTitle(String value) {
        checkText(pageTitle, value);
    }

    public void checkExcludedAccountMessage(String value) {
        checkText(excludedAccountMessage, value);
    }

    public void checkInstructionsMessage(String value) {
        checkText(instructionsMessage, value);
    }

    public void checkExcludedAccountPage() {
        checkTitle("ACCOUNT DELETED!");
        checkExcludedAccountMessage("Your account has been permanently deleted!");
        checkInstructionsMessage("You can create new account to take advantage of member privileges to enhance your online shopping experience with us.");
    }
}