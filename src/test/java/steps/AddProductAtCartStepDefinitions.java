package steps;

import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pages.CartPage;
import pages.HomePage;
import pages.ProductsPage;

public class AddProductAtCartStepDefinitions {

    HomePage homePage = new HomePage();
    ProductsPage productsPage = new ProductsPage();
    CartPage cartPage = new CartPage();

    @Quando("^clico no botão Products$")
    public void clico_no_botão_Products() throws Exception {
        homePage.clickProductsButton();
    }

    @Quando("^a tela de produtos é exibida$")
    public void a_tela_de_produtos_é_exibida() throws Exception {
        productsPage.checkProductsPage();
    }

    @Quando("^clico no botão 'Add to cart' do primeiro produto$")
    public void clico_no_botão_Add_to_cart_do_primeiro_produto() throws Exception {
        productsPage.clickAddToCartFirstProduct();
    }

    @Quando("^clico no botão 'Continue Shopping'$")
    public void clico_no_botão_Continue_Shopping() throws Exception {
        productsPage.checkAddProductMessage();
        productsPage.checkHasBeenAddedToCartMessage();
        productsPage.clickContinueShopping();
    }

    @Quando("^clico no botão 'View Cart'$")
    public void clico_no_botão_View_Cart() throws Exception {
        productsPage.clickViewCart();
    }

    @Então("^verifico o produto no carrinho$")
    public void verifico_o_produto_no_carrinho() throws Exception {
        cartPage.checkProductAtCart();
        cartPage.checkProductName();
    }
}
