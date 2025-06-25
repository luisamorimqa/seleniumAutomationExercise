package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static support.Commands.*;
import static support.Commands.checkText;

public class CreateAccountPage extends BasePage {

    private By passwordField = By.id("password");
    private By firstnameField = By.id("first_name");
    private By lastnameField = By.id("last_name");
    private By companyField = By.id("company");
    private By addressField = By.id("address1");
    private By countryField = By.id("country");
    private By stateField = By.id("state");
    private By cityField = By.id("city");
    private By zipcodeField = By.id("zipcode");
    private By mobileNumberField = By.id("mobile_number");
    private By createAccountButton = By.xpath("//*[@id='form']/div/div/div/div/form/button");

    public void fillPasswordField(String value) {
        fillField(passwordField, value);
    }

    public void fillFirstname(String value) {
        fillField(firstnameField, value);
    }

    public void fillLastName(String value) {
        fillField(lastnameField, value);
    }

    public void fillCompany(String value) {
        fillField(companyField, value);
    }

    public void fillAddress(String value) {
        fillField(addressField, value);
    }

    public void fillCountry(String value) {
        WebElement countryElement = getDriver().findElement(countryField);
        Select countrySelect = new Select(countryElement);
        countrySelect.selectByVisibleText(value);
    }

    public void fillState(String value) {
        fillField(stateField, value);
    }

    public void fillCity(String value) {
        fillField(cityField, value);
    }

    public void fillZipCode(String value) {
        fillField(zipcodeField, value);
    }

    public void fillMobileNumber(String value) {
        fillField(mobileNumberField, value);
    }

    public void clickCreateAccountButton() {
        clickElement(createAccountButton);
    }

    public void checkCreateAccountPage() {
        System.out.println("###############################################################################");
        System.out.println("*************** Validando page ***************");
        checkVisibility(By.xpath("//*[@id='form']/div/div/div/div/h2/b"), 5);
        checkText(By.xpath("//*[@id='form']/div/div/div/div/h2/b"), "ENTER ACCOUNT INFORMATION");
        checkVisibility(By.xpath("//*[@id='form']/div/div/div/div/form/h2/b"), 5);
        checkText(By.xpath("//*[@id='form']/div/div/div/div/form/h2/b"),"ADDRESS INFORMATION");
        System.out.println("*************** Page validada ***************");
    }
}