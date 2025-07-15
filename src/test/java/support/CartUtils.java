package support;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.BasePage;

import static support.Commands.clickElement;

public class CartUtils extends BasePage {

    private By removeProduct = By.xpath("//i[@class='fa fa-times']");
    private By emptyCartMessage = By.xpath("//*[@id='empty_cart']/p/b");

    public void clearCart() {

        WebElement emptyCartMessageElement = getDriver().findElement(emptyCartMessage);

        while(!emptyCartMessageElement.isDisplayed()){
            clickElement(removeProduct);
        }
    }
}
