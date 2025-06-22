#language: pt
@logout @regressao
Funcionalidade: Logout
  Eu como usuário do sistema
  Quero fazer logoff
  Para proteger a integridade dos meus dados

  Contexto:
    Dado que esteja logado no sistema

    Cenário: Logout do usuário
      Quando clico no botão Logout
      Então devo ser redirecionado para a página de login