#language:pt
  @contactus @regressao
  Funcionalidade: Envio de mensagem pelo formulário de contato
    Eu como cliente
    Quero entrar em contato com a equipe do site
    Para tirar dúvidas ou relatar problemas

  Contexto:
    Dado que eu esteja na tela Contact us

    @contactus-successful-shipping
    Cenário: Envio de mensagem com sucesso
      E preencho o campo nome
      E preencho o campo email
      E preencho o campo subject
      E preencho o campo message
      E seleciono o arquivo
      Quando clico no botão submit
      E confirmo o alerta
      Então a mensagem de sucesso "Success! Your details have been submitted successfully." deve ser exibida