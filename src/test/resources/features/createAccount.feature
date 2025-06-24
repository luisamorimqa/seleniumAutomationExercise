#language: pt
  @create-account @regressao
  Funcionalidade: Criação de conta
    Eu como cliente
    Quero me cadastrar no site
    Para realizar compras

  Contexto:
    Dado que estou na página de login

    @create-account-success
    Cenário: Criação de conta com sucesso
      E preencho um nome
      E preencho um e-mail não cadastrado
      E clico no botão Signup
      E preencho o campo password
      E preencho o campo firstname
      E preencho o campo lastname
      E preencho o campo company
      E preencho o campo address
      E seleciono o país
      E preencho o campo state
      E preencho o campo city
      E preencho o campo zipcode
      E preencho o campo mobilenumber
      Quando clico no botão Create Account
      Então a mensagem de conta criada "ACCOUNT CREATED!" deve ser exibida
      E a mensagem congratulations "Congratulations! Your new account has been successfully created!" deve ser exibida
      E a mensagem advantage "You can now take advantage of member privileges to enhance your online shopping experience with us." deve ser exibida

    @create-account-email-existente
    Cenário: E-mail já existente
      E preencho um nome
      E preencho um e-mail já cadastrado
      Quando clico no botão Signup
      Então a mensagem "Email Address already exist!" deve ser exibida