#language: pt
  @login @regressao
Funcionalidade: Login de usuário
  Eu como usuário do sistema
  Quero fazer login
  Para realizar ações dentro do sistema

  Contexto:
    Dado que estou na página de login

  @login-sucesso
  Cenário: Login com credenciais válidas
    Quando informo um e-mail cadastrado
    E informo a senha válida
    E clico no botão Login
    Então devo ver a mensagem "Logged in as "

  @senha-incorreta
  Cenário: Login com senha incorreta
    Quando informo um e-mail cadastrado
    E informo a senha incorretamente
    E clico no botão Login
    Então devo ver a mensagem de erro "Your email or password is incorrect!"

  @email-nao-cadastrado
  Cenário: Login com e-mail não cadastrado
    Quando informo um e-mail não cadastrado
    E informo a senha incorretamente
    E clico no botão Login
    Então devo ver a mensagem de erro "Your email or password is incorrect!"