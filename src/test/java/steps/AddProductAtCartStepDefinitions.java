package steps;

import com.github.javafaker.Faker;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pages.CartPage;
import pages.HomePage;
import pages.ProductDetailsPage;
import pages.ProductsPage;
import support.CartUtils;
import support.SharedData;

public class AddProductAtCartStepDefinitions {

    HomePage homePage = new HomePage();
    ProductsPage productsPage = new ProductsPage();
    CartPage cartPage = new CartPage();
    ProductDetailsPage productDetailsPage = new ProductDetailsPage();
    CartUtils cartUtils = new CartUtils();

    @Dado("^o carrinho esteja vazio$")
    public void o_carrinho_esteja_vazio() {
        cartPage.getPage();
        cartUtils.clearCart();
    }

    @Quando("^clico no botão Products$")
    public void clico_no_botão_Products() {
        homePage.clickProductsButton();
    }

    @Quando("^a tela de produtos é exibida$")
    public void a_tela_de_produtos_é_exibida() {
        productsPage.checkProductsPage();
    }

    @Quando("^clico no botão 'Add to cart' do primeiro produto$")
    public void clico_no_botão_Add_to_cart_do_primeiro_produto() {
        productsPage.clickAddToCartFirstProduct();
    }

    @Quando("^clico no botão 'Continue Shopping'$")
    public void clico_no_botão_Continue_Shopping() {
        productsPage.checkAddProductMessage();
        productsPage.checkHasBeenAddedToCartMessage();
        productsPage.clickContinueShopping();
    }

    @Quando("^clico no botão 'View Cart'$")
    public void clico_no_botão_View_Cart() {
        productsPage.clickViewCart();
    }

    @Então("^verifico o produto no carrinho$")
    public void verifico_o_produto_no_carrinho() {
        cartPage.checkProductAtCart();
        cartPage.checkProductName();
    }

    @Dado("^clico no botão View Product$")
    public void clico_no_botão_View_Product() {
        productsPage.clickViewDetailFirstProductClick();
    }

    @Dado("^a tela de detalhes do produto é exibida$")
    public void a_tela_de_detalhes_do_produto_é_exibida() {

    }

    @Dado("^preencho a quantidade do produto$")
    public void preencho_a_quantidade_do_produto() {
        Faker faker = new Faker();

        String quantidade = String.valueOf(faker.number().numberBetween(1, 20));
        SharedData.set("quantidade", quantidade);
        productDetailsPage.fillQuantity(quantidade);
    }

    @Quando("^clico no botão Add to cart$")
    public void clico_no_botão_Add_to_cart() {
        productDetailsPage.clickAddToCart();
    }

    @Quando("^clico em View Cart$")
    public void clico_em_View_Cart() {
        productDetailsPage.clickViewCart();
    }

    @Então("^o produto deve ser exibido com a quantidade correta no carrinho$")
    public void o_produto_deve_ser_exibido_com_a_quantidade_correta_no_carrinho() {
        String quantidade = SharedData.get("quantidade");
        cartPage.checkProductQuantity(quantidade);
    }
}