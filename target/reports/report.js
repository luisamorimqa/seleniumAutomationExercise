$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/login.feature");
formatter.feature({
  "name": "Login de usuário",
  "description": "  Eu como usuário do sistema\n  Quero fazer login\n  Para realizar ações dentro do sistema",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@login"
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
  "name": "Login com credenciais válidas",
  "description": "",
  "keyword": "Cenário",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@regressao"
    },
    {
      "name": "@login-sucesso"
    }
  ]
});
formatter.step({
  "name": "informo um e-mail cadastrado",
  "keyword": "Quando "
});
formatter.match({
  "location": "LoginStepDefinitions.informo_um_e_mail_cadastrado()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informo a senha válida",
  "keyword": "E "
});
formatter.match({
  "location": "LoginStepDefinitions.informo_a_senha_válida()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clico no botão Login",
  "keyword": "E "
});
formatter.match({
  "location": "LoginStepDefinitions.clico_no_botão_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "devo ver a mensagem \"Logged in as \"",
  "keyword": "Então "
});
formatter.match({
  "location": "LoginStepDefinitions.devo_ver_a_mensagem(String)"
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
  "name": "Login com senha incorreta",
  "description": "",
  "keyword": "Cenário",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@regressao"
    },
    {
      "name": "@senha-incorreta"
    }
  ]
});
formatter.step({
  "name": "informo um e-mail cadastrado",
  "keyword": "Quando "
});
formatter.match({
  "location": "LoginStepDefinitions.informo_um_e_mail_cadastrado()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informo a senha incorretamente",
  "keyword": "E "
});
formatter.match({
  "location": "LoginStepDefinitions.informo_a_senha_incorretamente()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clico no botão Login",
  "keyword": "E "
});
formatter.match({
  "location": "LoginStepDefinitions.clico_no_botão_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "devo ver a mensagem de erro \"Your email or password is incorrect!\"",
  "keyword": "Então "
});
formatter.match({
  "location": "LoginStepDefinitions.devo_ver_a_mensagem_de_erro(String)"
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
  "name": "Login com e-mail não cadastrado",
  "description": "",
  "keyword": "Cenário",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@regressao"
    },
    {
      "name": "@email-nao-cadastrado"
    }
  ]
});
formatter.step({
  "name": "informo um e-mail não cadastrado",
  "keyword": "Quando "
});
formatter.match({
  "location": "LoginStepDefinitions.informo_um_e_mail_não_cadastrado()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informo a senha incorretamente",
  "keyword": "E "
});
formatter.match({
  "location": "LoginStepDefinitions.informo_a_senha_incorretamente()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clico no botão Login",
  "keyword": "E "
});
formatter.match({
  "location": "LoginStepDefinitions.clico_no_botão_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "devo ver a mensagem de erro \"Your email or password is incorrect!\"",
  "keyword": "Então "
});
formatter.match({
  "location": "LoginStepDefinitions.devo_ver_a_mensagem_de_erro(String)"
});
formatter.result({
  "status": "passed"
});
});