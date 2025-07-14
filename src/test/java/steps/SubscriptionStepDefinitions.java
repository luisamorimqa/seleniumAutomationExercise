package steps;

import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pages.HomePage;
import pages.ProductsPage;

import static support.Commands.getNewEmail;

public class SubscriptionStepDefinitions {

    HomePage homePage = new HomePage();
    ProductsPage productsPage = new ProductsPage();

    @Quando("^acesso a tela de produtos$")
    public void acesso_a_tela_de_produtos() {
        homePage.clickProductsButton();
    }

    @Quando("^preencho o campo Your e-mail address$")
    public void preencho_o_campo_Your_e_mail_address() {
        productsPage.fillSubscriptionEmail(getNewEmail());
    }

    @Quando("^clico no botão confirmar$")
    public void clico_no_botão_confirmar() {
        productsPage.clickSubscrptionButton();
    }

    @Então("^a mensagem \"([^\"]*)\"$")
    public void a_mensagem(String value) {
        productsPage.checkSuccessMessage(value);
    }
}