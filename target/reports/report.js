$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/viewAndCartBrandProducts.feature");
formatter.feature({
  "name": "",
  "description": "    Eu como usuário\n    Quero filtrar os produtos por marca\n    Para conseguir encontrar os produtos mais facilmente",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@regressao"
    },
    {
      "name": "@filter-brand"
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
formatter.scenario({
  "name": "Filter Polo brand products",
  "description": "",
  "keyword": "Cenário",
  "tags": [
    {
      "name": "@regressao"
    },
    {
      "name": "@filter-brand"
    },
    {
      "name": "@filter-brand-products"
    }
  ]
});
formatter.step({
  "name": "acesse a tela de produtos",
  "keyword": "E "
});
formatter.match({
  "location": "CartBrandProductsStepDefinitions.acesse_a_tela_de_produtos()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "seleciono o brand name",
  "keyword": "Quando "
});
formatter.match({
  "location": "CartBrandProductsStepDefinitions.seleciono_o_brand_name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o campo de categoria e marca deverá mostrar o mesmo brand name",
  "keyword": "Então "
});
formatter.match({
  "location": "CartBrandProductsStepDefinitions.o_campo_de_categoria_e_marca_deverá_mostrar_o_mesmo_brand_name()"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: expected:\u003cPO[u]LO\u003e but was:\u003cPO[]LO\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat support.Commands.checkText(Commands.java:68)\r\n\tat pages.ProductsPage.checkShowCategory(ProductsPage.java:89)\r\n\tat steps.CartBrandProductsStepDefinitions.o_campo_de_categoria_e_marca_deverá_mostrar_o_mesmo_brand_name(CartBrandProductsStepDefinitions.java:27)\r\n\tat ✽.o campo de categoria e marca deverá mostrar o mesmo brand name(src/test/resources/features/viewAndCartBrandProducts.feature:15)\r\n",
  "status": "failed"
});
});