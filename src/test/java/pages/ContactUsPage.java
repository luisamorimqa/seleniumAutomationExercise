package pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import static support.Commands.*;

public class ContactUsPage extends BasePage {

    private By nameField = By.name("name");
    private By emailField = By.name("email");
    private By subjectField = By.name("subject");
    private By messageField = By.name("message");
    private By uploadFileField = By.name("upload_file");
    private By submitButton = By.name("submit");
    private By successfulMessage = By.xpath("//*[@id='contact-page']/div[2]/div[1]/div/div[2]");

    public void fillName(String value) {
        fillField(nameField, value);
    }

    public void fillEmail(String value) {
        fillField(emailField, value);
    }

    public void fillSubject(String value) {
        fillField(subjectField, value);
    }

    public void fillMessage(String value) {
        fillField(messageField, value);
    }

    public void selectFile() {
        fileUpload(uploadFileField);
    }

    public void checkSuccessfulMessage(String value) {
        checkText(successfulMessage, value);
    }

    public void clickSubmitButton() {
        clickElement(submitButton);
    }

    public void checkSuccessMessage(String value) {
        checkText(successfulMessage, value);
    }

    public void checkContactUsPage() {
        System.out.println("*************** Validando Page ***************");
        Assert.assertEquals("CONTACT US", getDriver().findElement(By.xpath("//div[@class='col-sm-12']/h2")).getText());
        Assert.assertEquals("Note: Below contact form is for testing purpose.Software testing certification", getDriver().findElement(By.xpath("//*[@id='contact-page']/div[2]/div[1]/div/div[1]")).getText());
        Assert.assertEquals("GET IN TOUCH", getDriver().findElement(By.xpath("//*[@id='contact-page']/div[2]/div[1]/div/h2")).getText());
        System.out.println("*************** Page validada ***************");
    }
}