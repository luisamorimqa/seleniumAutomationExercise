package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pages.HomePage;
import pages.ProductsPage;

public class CartBrandProductsStepDefinitions {

    HomePage homePage = new HomePage();
    ProductsPage productsPage = new ProductsPage();

    @Dado("^acesse a tela de produtos$")
    public void acesse_a_tela_de_produtos() {
        homePage.clickProductsButton();
    }

    @Quando("^seleciono o brand name$")
    public void seleciono_o_brand_name() {
        productsPage.checkProductsPage();
        productsPage.clickBrandsOption();
    }

    @Então("^o campo de categoria e marca deverá mostrar o mesmo brand name$")
    public void o_campo_de_categoria_e_marca_deverá_mostrar_o_mesmo_brand_name() {
        productsPage.checkShowCategory("POLO");
    }
}
