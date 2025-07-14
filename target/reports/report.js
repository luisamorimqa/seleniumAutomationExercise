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
formatter.scenarioOutline({
  "name": "Filter \"\u003cbrand\u003e\" products",
  "description": "",
  "keyword": "Esquema do Cenário",
  "tags": [
    {
      "name": "@filter-brand-products"
    }
  ]
});
formatter.step({
  "name": "acesse a tela de produtos",
  "keyword": "E "
});
formatter.step({
  "name": "seleciono o brand name \"\u003cbrand\u003e\"",
  "keyword": "Quando "
});
formatter.step({
  "name": "o campo de categoria e marca deverá mostrar o \"\u003cbrand\u003e\"",
  "keyword": "Então "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Exemplos",
  "rows": [
    {
      "cells": [
        "brand"
      ]
    },
    {
      "cells": [
        "polo"
      ]
    },
    {
      "cells": [
        "madame"
      ]
    },
    {
      "cells": [
        "H\u0026M"
      ]
    },
    {
      "cells": [
        "mast\u0026harbour"
      ]
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
  "name": "Filter \"polo\" products",
  "description": "",
  "keyword": "Esquema do Cenário",
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
  "name": "seleciono o brand name \"polo\"",
  "keyword": "Quando "
});
formatter.match({
  "location": "CartBrandProductsStepDefinitions.seleciono_o_brand_name(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o campo de categoria e marca deverá mostrar o \"polo\"",
  "keyword": "Então "
});
formatter.match({
  "location": "CartBrandProductsStepDefinitions.o_campo_de_categoria_e_marca_deverá_mostrar_o(String)"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: expected:\u003cPOLO[s]\u003e but was:\u003cPOLO[]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat support.Commands.checkText(Commands.java:68)\r\n\tat pages.ProductsPage.checkShowedCategoryPolo(ProductsPage.java:106)\r\n\tat steps.CartBrandProductsStepDefinitions.o_campo_de_categoria_e_marca_deverá_mostrar_o(CartBrandProductsStepDefinitions.java:51)\r\n\tat ✽.o campo de categoria e marca deverá mostrar o \"polo\"(src/test/resources/features/viewAndCartBrandProducts.feature:15)\r\n",
  "status": "failed"
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
  "name": "Filter \"madame\" products",
  "description": "",
  "keyword": "Esquema do Cenário",
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
  "name": "seleciono o brand name \"madame\"",
  "keyword": "Quando "
});
formatter.match({
  "location": "CartBrandProductsStepDefinitions.seleciono_o_brand_name(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o campo de categoria e marca deverá mostrar o \"madame\"",
  "keyword": "Então "
});
formatter.match({
  "location": "CartBrandProductsStepDefinitions.o_campo_de_categoria_e_marca_deverá_mostrar_o(String)"
});
formatter.result({
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat support.Commands.checkTextContains(Commands.java:82)\r\n\tat pages.ProductsPage.checkShowedCategory(ProductsPage.java:110)\r\n\tat steps.CartBrandProductsStepDefinitions.o_campo_de_categoria_e_marca_deverá_mostrar_o(CartBrandProductsStepDefinitions.java:59)\r\n\tat ✽.o campo de categoria e marca deverá mostrar o \"madame\"(src/test/resources/features/viewAndCartBrandProducts.feature:15)\r\n",
  "status": "failed"
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
  "name": "Filter \"H\u0026M\" products",
  "description": "",
  "keyword": "Esquema do Cenário",
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
  "name": "seleciono o brand name \"H\u0026M\"",
  "keyword": "Quando "
});
formatter.match({
  "location": "CartBrandProductsStepDefinitions.seleciono_o_brand_name(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o campo de categoria e marca deverá mostrar o \"H\u0026M\"",
  "keyword": "Então "
});
formatter.match({
  "location": "CartBrandProductsStepDefinitions.o_campo_de_categoria_e_marca_deverá_mostrar_o(String)"
});
formatter.result({
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat support.Commands.checkTextContains(Commands.java:82)\r\n\tat pages.ProductsPage.checkShowedCategory(ProductsPage.java:110)\r\n\tat steps.CartBrandProductsStepDefinitions.o_campo_de_categoria_e_marca_deverá_mostrar_o(CartBrandProductsStepDefinitions.java:55)\r\n\tat ✽.o campo de categoria e marca deverá mostrar o \"H\u0026M\"(src/test/resources/features/viewAndCartBrandProducts.feature:15)\r\n",
  "status": "failed"
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
  "name": "Filter \"mast\u0026harbour\" products",
  "description": "",
  "keyword": "Esquema do Cenário",
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
  "name": "seleciono o brand name \"mast\u0026harbour\"",
  "keyword": "Quando "
});
formatter.match({
  "location": "CartBrandProductsStepDefinitions.seleciono_o_brand_name(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o campo de categoria e marca deverá mostrar o \"mast\u0026harbour\"",
  "keyword": "Então "
});
formatter.match({
  "location": "CartBrandProductsStepDefinitions.o_campo_de_categoria_e_marca_deverá_mostrar_o(String)"
});
formatter.result({
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat support.Commands.checkTextContains(Commands.java:82)\r\n\tat pages.ProductsPage.checkShowedCategory(ProductsPage.java:110)\r\n\tat steps.CartBrandProductsStepDefinitions.o_campo_de_categoria_e_marca_deverá_mostrar_o(CartBrandProductsStepDefinitions.java:63)\r\n\tat ✽.o campo de categoria e marca deverá mostrar o \"mast\u0026harbour\"(src/test/resources/features/viewAndCartBrandProducts.feature:15)\r\n",
  "status": "failed"
});
});