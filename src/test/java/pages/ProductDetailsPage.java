package pages;

import org.openqa.selenium.By;

import static support.Commands.*;

public class ProductDetailsPage extends BasePage {

    private By quantityField = By.id("quantity");
    private By addToCartButton = By.xpath("//button[@class='btn btn-default cart']");
    private By checkoutButton = By.xpath("//*[@id='do_action']/div[1]/div/div/a");
    private By viewCart = By.xpath("//*[@id='cartModal']/div/div/div[2]/p[2]/a/u");

    public void fillQuantity(String value) {
        clearAndFillField(quantityField, value);
    }

    public void clickAddToCart() {
        clickElement(addToCartButton);
    }

    public void checkProductDetailsPage() {
        checkVisibility(checkoutButton, 10);
    }

    public void clickViewCart() {
        clickElement(viewCart);
    }
}