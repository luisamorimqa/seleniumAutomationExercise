$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/createAccount.feature");
formatter.feature({
  "name": "Criação de conta",
  "description": "    Eu como cliente\n    Quero me cadastrar no site\n    Para realizar compras",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@create-account"
    },
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
  "name": "que estou na página de login",
  "keyword": "Dado "
});
formatter.match({
  "location": "LoginStepDefinitions.que_estou_na_página_de_login()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Criação de conta com sucesso",
  "description": "",
  "keyword": "Cenário",
  "tags": [
    {
      "name": "@create-account"
    },
    {
      "name": "@regressao"
    },
    {
      "name": "@create-account-success"
    }
  ]
});
formatter.step({
  "name": "preencho um nome",
  "keyword": "E "
});
formatter.match({
  "location": "LoginStepDefinitions.preencho_um_nome()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preencho um e-mail não cadastrado",
  "keyword": "E "
});
formatter.match({
  "location": "LoginStepDefinitions.preencho_um_e_mail_não_cadastrado()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clico no botão Signup",
  "keyword": "E "
});
formatter.match({
  "location": "LoginStepDefinitions.clico_no_botão_Signup()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preencho o campo password",
  "keyword": "E "
});
formatter.match({
  "location": "CreateAccountStepDefinitions.preencho_o_campo_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preencho o campo firstname",
  "keyword": "E "
});
formatter.match({
  "location": "CreateAccountStepDefinitions.preencho_o_campo_firstname()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preencho o campo lastname",
  "keyword": "E "
});
formatter.match({
  "location": "CreateAccountStepDefinitions.preencho_o_campo_lastname()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preencho o campo company",
  "keyword": "E "
});
formatter.match({
  "location": "CreateAccountStepDefinitions.preencho_o_campo_company()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preencho o campo address",
  "keyword": "E "
});
formatter.match({
  "location": "CreateAccountStepDefinitions.preencho_o_campo_address()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "seleciono o país",
  "keyword": "E "
});
formatter.match({
  "location": "CreateAccountStepDefinitions.seleciono_o_país()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preencho o campo state",
  "keyword": "E "
});
formatter.match({
  "location": "CreateAccountStepDefinitions.preencho_o_campo_state()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preencho o campo city",
  "keyword": "E "
});
formatter.match({
  "location": "CreateAccountStepDefinitions.preencho_o_campo_city()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preencho o campo zipcode",
  "keyword": "E "
});
formatter.match({
  "location": "CreateAccountStepDefinitions.preencho_o_campo_zipcode()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preencho o campo mobilenumber",
  "keyword": "E "
});
formatter.match({
  "location": "CreateAccountStepDefinitions.preencho_o_campo_mobilenumber()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clico no botão Create Account",
  "keyword": "Quando "
});
formatter.match({
  "location": "CreateAccountStepDefinitions.clico_no_botão_Create_Account()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "a mensagem de conta criada \"ACCOUNT CREATED!\" deve ser exibida",
  "keyword": "Então "
});
formatter.match({
  "location": "CreateAccountStepDefinitions.a_mensagem_de_conta_criada_deve_ser_exibida(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "a mensagem congratulations \"Congratulations! Your new account has been successfully created!\" deve ser exibida",
  "keyword": "E "
});
formatter.match({
  "location": "CreateAccountStepDefinitions.a_mensagem_congratulations_deve_ser_exibida(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "a mensagem advantage \"You can now take advantage of member privileges to enhance your online shopping experience with us.\" deve ser exibida",
  "keyword": "E "
});
formatter.match({
  "location": "CreateAccountStepDefinitions.a_mensagem_advantage_deve_ser_exibida(String)"
});
formatter.result({
  "status": "passed"
});
});