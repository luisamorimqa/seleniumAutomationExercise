package pages;

import org.openqa.selenium.By;
import support.SharedData;

import static support.Commands.checkText;
import static support.Commands.checkVisibility;

public class CartPage extends BasePage {

    private By product = By.xpath("//*[@id='product-1']/td[2]/h4/a");

    public void checkProductAtCart() {
        checkVisibility(product, 10);
    }

    public void checkProductName() {
        String productName = SharedData.get("productName");
        checkText(product, productName);
    }
}