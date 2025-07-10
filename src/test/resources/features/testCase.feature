#language: pt
  @regressao
  Funcionalidade: Test Case Page
    Eu como usuário do sistema
    Quero acessar a página Test Case
    Para visualizar seu conteúdo

  Contexto:
    Dado que esteja logado no sistema

    @testCase-sucesso
    Cenário: Acesso a página Test Case com sucesso
      Quando clico no botão Test Cases
      Então devo ser redirecionado para a página de Test Case