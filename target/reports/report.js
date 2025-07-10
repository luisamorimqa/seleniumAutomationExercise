$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/contactUs.feature");
formatter.feature({
  "name": "Envio de mensagem pelo formulário de contato",
  "description": "    Eu como cliente\n    Quero entrar em contato com a equipe do site\n    Para tirar dúvidas ou relatar problemas",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@contactus"
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
  "name": "que eu esteja na tela Contact us",
  "keyword": "Dado "
});
formatter.match({
  "location": "ContactUsStepDefinitions.que_eu_esteja_na_tela_Contact_us()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Envio de mensagem com sucesso",
  "description": "",
  "keyword": "Cenário",
  "tags": [
    {
      "name": "@contactus"
    },
    {
      "name": "@regressao"
    },
    {
      "name": "@contactus-successful-shipping"
    }
  ]
});
formatter.step({
  "name": "preencho o campo nome",
  "keyword": "E "
});
formatter.match({
  "location": "ContactUsStepDefinitions.preencho_o_campo_nome()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preencho o campo email",
  "keyword": "E "
});
formatter.match({
  "location": "ContactUsStepDefinitions.preencho_o_campo_email()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preencho o campo subject",
  "keyword": "E "
});
formatter.match({
  "location": "ContactUsStepDefinitions.preencho_o_campo_subject()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preencho o campo message",
  "keyword": "E "
});
formatter.match({
  "location": "ContactUsStepDefinitions.preencho_o_campo_message()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "seleciono o arquivo",
  "keyword": "E "
});
formatter.match({
  "location": "ContactUsStepDefinitions.seleciono_o_arquivo()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clico no botão submit",
  "keyword": "Quando "
});
formatter.match({
  "location": "ContactUsStepDefinitions.clico_no_botão_submit()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "confirmo o alerta",
  "keyword": "E "
});
formatter.match({
  "location": "ContactUsStepDefinitions.confirmo_o_alerta()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "a mensagem de sucesso \"Success! Your details have been submitted successfully.\" deve ser exibida",
  "keyword": "Então "
});
formatter.match({
  "location": "ContactUsStepDefinitions.a_mensagem_de_sucesso_deve_ser_exibida(String)"
});
formatter.result({
  "status": "passed"
});
formatter.uri("src/test/resources/features/createAccount.feature");
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
  "name": "E-mail já existente",
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
      "name": "@create-account-email-existente"
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
  "name": "preencho um e-mail já cadastrado",
  "keyword": "E "
});
formatter.match({
  "location": "LoginStepDefinitions.preencho_um_e_mail_já_cadastrado()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clico no botão Signup",
  "keyword": "Quando "
});
formatter.match({
  "location": "LoginStepDefinitions.clico_no_botão_Signup()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "a mensagem \"Email Address already exist!\" deve ser exibida",
  "keyword": "Então "
});
formatter.match({
  "location": "LoginStepDefinitions.a_mensagem_deve_ser_exibida(String)"
});
formatter.result({
  "status": "passed"
});
formatter.uri("src/test/resources/features/deleteAccount.feature");
formatter.feature({
  "name": "Deleção de conta",
  "description": "    Eu como usuário\n    Quero deletar minha conta\n    Para que não tenha mais acesso ao site",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@delete-account"
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
  "name": "que eu tenha uma conta no site",
  "keyword": "Dado "
});
formatter.match({
  "location": "DeleteAccountStepDefinitions.que_eu_tenha_uma_conta_no_site()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "esteja logado",
  "keyword": "E "
});
formatter.match({
  "location": "DeleteAccountStepDefinitions.esteja_logado()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Deleção com sucesso",
  "description": "",
  "keyword": "Cenário",
  "tags": [
    {
      "name": "@delete-account"
    },
    {
      "name": "@regressao"
    }
  ]
});
formatter.step({
  "name": "clico no botão deleteAccount",
  "keyword": "Quando "
});
formatter.match({
  "location": "DeleteAccountStepDefinitions.clico_no_botão_deleteAccount()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "a tela AccountDeleted deve ser exibida",
  "keyword": "Então "
});
formatter.match({
  "location": "DeleteAccountStepDefinitions.a_tela_AccountDeleted_deve_ser_exibida()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("src/test/resources/features/login.feature");
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
formatter.uri("src/test/resources/features/logout.feature");
formatter.feature({
  "name": "Logout",
  "description": "  Eu como usuário do sistema\n  Quero fazer logoff\n  Para proteger a integridade dos meus dados",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@logout"
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
  "name": "Logout do usuário",
  "description": "",
  "keyword": "Cenário",
  "tags": [
    {
      "name": "@logout"
    },
    {
      "name": "@regressao"
    }
  ]
});
formatter.step({
  "name": "clico no botão Logout",
  "keyword": "Quando "
});
formatter.match({
  "location": "LogoutStepDefinitions.clico_no_botão_Logout()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "devo ser redirecionado para a página de login",
  "keyword": "Então "
});
formatter.match({
  "location": "LogoutStepDefinitions.devo_ser_redirecionado_para_a_página_de_login()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("src/test/resources/features/testCase.feature");
formatter.feature({
  "name": "Test Case Page",
  "description": "    Eu como usuário do sistema\n    Quero acessar a página Test Case\n    Para visualizar seu conteúdo",
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
formatter.scenario({
  "name": "Acesso a página Test Case com sucesso",
  "description": "",
  "keyword": "Cenário",
  "tags": [
    {
      "name": "@regressao"
    },
    {
      "name": "@testCase-sucesso"
    }
  ]
});
formatter.step({
  "name": "clico no botão Test Cases",
  "keyword": "Quando "
});
formatter.match({
  "location": "TestCaseStepDefinition.clico_no_botão_Test_Cases()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "devo ser redirecionado para a página de Test Case",
  "keyword": "Então "
});
formatter.match({
  "location": "TestCaseStepDefinition.devo_ser_redirecionado_para_a_página_de_Test_Case()"
});
formatter.result({
  "status": "passed"
});
});