package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import support.SharedData;

import static support.Commands.*;

public class ProductsPage extends BasePage {

    private By addedProductMessage = By.xpath("//*[@id='cartModal']/div/div/div[1]/h4");
    private By hasBeenAddedToCartMessage = By.xpath("//*[@id='cartModal']/div/div/div[2]/p[1]");
    private By continueShoppingButton = By.xpath("//*[@id='cartModal']/div/div/div[3]/button");
    private By viewCartButton = By.xpath("//*[@id='header']/div/div/div/div[2]/div/ul/li[3]/a");

    private By emailSubscriptionField = By.id("susbscribe_email");
    private By subscriptionButton = By.id("subscribe");
    private By subscriptionSuccessMessage = By.xpath("//*[@id='success-subscribe']/div");

    private By brandsOptionsPolo = By.xpath("//div[@class='brands-name']/ul/li[1]/a");
    private By brandsOptionsHeM = By.xpath("//div[@class='brands-name']/ul/li[2]/a");
    private By brandsOptionsMadame = By.xpath("//div[@class='brands-name']/ul/li[3]/a");
    private By brandsOptionsMastEHarbour = By.xpath("//div[@class='brands-name']/ul/li[4]/a");

    private By showedCategoryPolo = By.xpath("//h2[@class='title text-center']/a/span");
    private By showedCategory = By.xpath("//h2[@class='title text-center']");

    private By viewDatailFirstProduct = By.xpath("//div[2]/div[@class='features_items']/div[2]/div[@class='product-image-wrapper']/div[2]/ul/li/a");

    public void fillSubscriptionEmail(String value) {
        fillField(emailSubscriptionField, value);
    }

    public void clickSubscrptionButton() {
        clickElement(subscriptionButton);
    }

    public void checkSuccessMessage(String value) {
        checkText(subscriptionSuccessMessage, value);
    }

    public void clickAddToCartFirstProduct() {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(getDriver().findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[1]/div[1]"))).perform();
        String productName = getDriver().findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[1]/div[2]/div/p")).getText();
        SharedData.set("productName", productName);
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOf(getDriver().findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[1]/div[2]/div/a"))));
        clickElement(By.xpath("/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[1]/div[2]/div/a"));
    }

    public void clickAddToCartAndViewCart() {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(getDriver().findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[1]/div[1]"))).perform();
        String productName = getDriver().findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[1]/div[2]/div/p")).getText();
        SharedData.set("productName", productName);
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOf(getDriver().findElement(By.xpath("//*[@id='cartModal']/div/div/div[2]/p[2]/a/u"))));
    }

    public void checkAddProductMessage() {
        checkText(addedProductMessage, "Added!");
    }

    public void checkHasBeenAddedToCartMessage() {
        checkText(hasBeenAddedToCartMessage, "Your product has been added to cart.");
    }

    public void clickContinueShopping() {
        clickElement(continueShoppingButton);
    }

    public void clickViewCart() {
        clickElement(viewCartButton);
    }

    public void addProdutcAtCart() {
        clickAddToCartFirstProduct();
        checkAddProductMessage();
        checkHasBeenAddedToCartMessage();
        clickContinueShopping();
    }

    public void checkProductsPage() {
        checkVisibility(By.xpath("/html/body/section[2]/div/div/div[2]/div/h2"), 5);
        checkText(By.xpath("/html/body/section[2]/div/div/div[2]/div/h2"), "ALL PRODUCTS");
    }

    public void clickBrandsPolo() {
        clickElement(brandsOptionsPolo);
    }

    public void clickBrandsHeM() {
        clickElement(brandsOptionsHeM);
    }

    public void clickBrandsMadame() {
        clickElement(brandsOptionsMadame);
    }

    public void clickMastEHarbour() {
        clickElement(brandsOptionsMastEHarbour);
    }

    public void clickViewDetailFirstProductClick() {
        clickElement(viewDatailFirstProduct);
    }

    public void checkShowedCategoryPolo(String value) {
        checkText(showedCategoryPolo, value);
    }

    public void checkShowedCategory(String value) {
        checkTextContains(showedCategory, value);
    }
}