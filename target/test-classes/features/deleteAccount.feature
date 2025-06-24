#language: pt

  @delete-account @regressao
  Funcionalidade: Deleção de conta
    Eu como usuário
    Quero deletar minha conta
    Para que não tenha mais acesso ao site

  Contexto:
    Dado que eu tenha uma conta no site
    E esteja logado

    Cenário: Deleção com sucesso
      Quando clico no botão deleteAccount
      Então a tela AccountDeleted deve ser exibida