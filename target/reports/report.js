$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/subscription.feature");
formatter.feature({
  "name": "Subscription",
  "description": "    Eu como usuário\n    Quero me inscrever\n    Para receber informações e atualizações do site",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@regressao"
    },
    {
      "name": "@subscription"
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
  "name": "Subscription at products page",
  "description": "",
  "keyword": "Cenário",
  "tags": [
    {
      "name": "@regressao"
    },
    {
      "name": "@subscription"
    },
    {
      "name": "@subscribe-product-page"
    }
  ]
});
formatter.step({
  "name": "acesso a tela de produtos",
  "keyword": "Quando "
});
formatter.match({
  "location": "SubscriptionStepDefinitions.acesso_a_tela_de_produtos()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preencho o campo Your e-mail address",
  "keyword": "E "
});
formatter.match({
  "location": "SubscriptionStepDefinitions.preencho_o_campo_Your_e_mail_address()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clico no botão confirmar",
  "keyword": "E "
});
formatter.match({
  "location": "SubscriptionStepDefinitions.clico_no_botão_confirmar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "a mensagem \"You have been successfully subscribed!\"",
  "keyword": "Então "
});
formatter.match({
  "location": "SubscriptionStepDefinitions.a_mensagem(String)"
});
formatter.result({
  "status": "passed"
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
  "name": "Subscription at home page",
  "description": "",
  "keyword": "Cenário",
  "tags": [
    {
      "name": "@regressao"
    },
    {
      "name": "@subscription"
    },
    {
      "name": "@subscribe-home-page"
    }
  ]
});
formatter.step({
  "name": "preencho o campo Your e-mail address",
  "keyword": "E "
});
formatter.match({
  "location": "SubscriptionStepDefinitions.preencho_o_campo_Your_e_mail_address()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clico no botão confirmar",
  "keyword": "E "
});
formatter.match({
  "location": "SubscriptionStepDefinitions.clico_no_botão_confirmar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "a mensagem \"You have been successfully subscribed!\"",
  "keyword": "Então "
});
formatter.match({
  "location": "SubscriptionStepDefinitions.a_mensagem(String)"
});
formatter.result({
  "status": "passed"
});
});