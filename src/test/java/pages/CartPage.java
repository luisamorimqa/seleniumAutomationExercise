package pages;

import org.openqa.selenium.By;
import support.SharedData;

import static support.Commands.*;

public class CartPage extends BasePage {

    private By product = By.xpath("//*[@id='product-1']/td[2]/h4/a");
    private By removeProduct = By.xpath("//*[@id='product-1']/td[6]/a/i");
    private By cartEmptyMessage = By.xpath("//*[@id='empty_cart']/p/b");

    public void checkProductAtCart() {
        checkVisibility(product, 10);
    }

    public void clickRemoveProduct() {
        clickElement(removeProduct);
    }

    public void checkCartEmptyMessage() {
        checkText(cartEmptyMessage, "Cart is empty!");
    }

    public void checkProductName() {
        String productName = SharedData.get("productName");
        checkText(product, productName);
    }
}