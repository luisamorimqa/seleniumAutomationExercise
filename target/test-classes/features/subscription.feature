#language: pt
@regressao @subscription
  Funcionalidade: Subscription
    Eu como usuário
    Quero me inscrever
    Para receber informações e atualizações do site

  Contexto:
    Dado que esteja logado no sistema

    @subscribe-product-page
    Cenário: Subscription at products page
      Quando acesso a tela de produtos
      E preencho o campo Your e-mail address
      E clico no botão confirmar
      Então a mensagem "You have been successfully subscribed!"

    @subscribe-home-page
    Cenário: Subscription at home page
      E preencho o campo Your e-mail address
      E clico no botão confirmar
      Então a mensagem "You have been successfully subscribed!"