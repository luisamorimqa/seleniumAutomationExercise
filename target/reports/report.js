$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/removeProductOfCart.feature");
formatter.feature({
  "name": "Remove produto do carrinho",
  "description": "    Eu como usuário do sistema\n    Quero remover produto do carrinho\n    Para que eu não compre um produto não desejado",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@regressao"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Contexto"
});
formatter.step({
  "name": "que esteja logado no sistema",
  "keyword": "Dado "
});
formatter.match({
  "location": "LogoutStepDefinitions.que_esteja_logado_no_sistema()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clico no botão Products",
  "keyword": "E "
});
formatter.match({
  "location": "AddProductAtCartStepDefinitions.clico_no_botão_Products()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "a tela de produtos é exibida",
  "keyword": "E "
});
formatter.match({
  "location": "AddProductAtCartStepDefinitions.a_tela_de_produtos_é_exibida()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clico no botão \u0027Add to cart\u0027 do primeiro produto",
  "keyword": "E "
});
formatter.match({
  "location": "AddProductAtCartStepDefinitions.clico_no_botão_Add_to_cart_do_primeiro_produto()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clico no botão \u0027Continue Shopping\u0027",
  "keyword": "E "
});
formatter.match({
  "location": "AddProductAtCartStepDefinitions.clico_no_botão_Continue_Shopping()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clico no botão \u0027View Cart\u0027",
  "keyword": "E "
});
formatter.match({
  "location": "AddProductAtCartStepDefinitions.clico_no_botão_View_Cart()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Remove produto com sucesso",
  "description": "",
  "keyword": "Cenário",
  "tags": [
    {
      "name": "@regressao"
    },
    {
      "name": "@remove-at-cart-success"
    }
  ]
});
formatter.step({
  "name": "clico no botão remover produto do carrinho",
  "keyword": "Quando "
});
formatter.match({
  "location": "RemoveProductAtCartStepDefinitions.clico_no_botão_remover_produto_do_carrinho()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o produto deve ser removido do carrinho",
  "keyword": "Então "
});
formatter.match({
  "location": "RemoveProductAtCartStepDefinitions.o_produto_deve_ser_removido_do_carrinho()"
});
formatter.result({
  "status": "passed"
});
});