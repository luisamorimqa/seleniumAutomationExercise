package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;
import pages.HomePage;
import pages.ProductsPage;

public class CartBrandProductsStepDefinitions {

    HomePage homePage = new HomePage();
    ProductsPage productsPage = new ProductsPage();

    @Dado("^acesse a tela de produtos$")
    public void acesse_a_tela_de_produtos() {
        homePage.clickProductsButton();
    }

    @Quando("^seleciono o brand name \"([^\"]*)\"$")
    public void seleciono_o_brand_name(String condicao) {

        switch(condicao) {
            case "polo":
                productsPage.clickBrandsPolo();
                break;

            case "H&M":
                productsPage.clickBrandsHeM();
                break;

            case "mast&harbour":
                productsPage.clickMastEHarbour();
                break;

            case "madame":
                productsPage.clickBrandsMadame();
                break;

            default:
                Assert.fail("Não foi possível selecionar a brand correta.");
        }
    }

    @Então("^o campo de categoria e marca deverá mostrar o \"([^\"]*)\"$")
    public void o_campo_de_categoria_e_marca_deverá_mostrar_o(String condicao) {

        switch(condicao){

            case "polo":
                productsPage.checkShowedCategoryPolo("POLO");
                break;

            case "H&M":
                productsPage.checkShowedCategory("H&M");
                break;

            case "madame":
                productsPage.checkShowedCategory("MADAME");
                break;

            case "mast&harbour":
                productsPage.checkShowedCategory("MAST & HARBOUR");
                break;

            default:
                Assert.fail("Não foi possível validar texto apresentado.");
        }
    }
}