package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import support.SharedData;

import static support.Commands.*;

public class CartPage extends BasePage {

    private String pageUrl = "/view_cart";

    private By product = By.xpath("//*[@id='product-1']/td[2]/h4/a");
    private By removeProduct = By.xpath("//*[@id='product-1']/td[6]/a/i");
    private By cartEmptyMessage = By.xpath("//*[@id='empty_cart']/p/b");
    private By productQtd = By.xpath("//*[@id='product-1']/td[4]/button");

    public void getPage() {
        System.out.println(getBaseUrl() + pageUrl);
        getDriver().get(getBaseUrl() + pageUrl);

    }

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

    public void checkProductQuantity(String value) {
        WebElement productQuantidade = getDriver().findElement(productQtd);
        String quantidadeApresentada = productQuantidade.getText();

        Assert.assertEquals(value, quantidadeApresentada);
    }
}