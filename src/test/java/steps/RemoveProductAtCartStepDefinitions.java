package steps;

import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pages.CartPage;

public class RemoveProductAtCartStepDefinitions {

    CartPage cartPage = new CartPage();

    @Quando("^clico no botão remover produto do carrinho$")
    public void clico_no_botão_remover_produto_do_carrinho() {
        cartPage.clickRemoveProduct();
    }

    @Então("^o produto deve ser removido do carrinho$")
    public void o_produto_deve_ser_removido_do_carrinho() {
        cartPage.checkCartEmptyMessage();
    }
}
