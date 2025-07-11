#language: pt

  @regressao
  Funcionalidade: Remove produto do carrinho
    Eu como usuário do sistema
    Quero remover produto do carrinho
    Para que eu não compre um produto não desejado

  Contexto:
    Dado que esteja logado no sistema
    E clico no botão Products
    E a tela de produtos é exibida
    E clico no botão 'Add to cart' do primeiro produto
    E clico no botão 'Continue Shopping'
    E clico no botão 'View Cart'

    @remove-at-cart-success
    Cenário: Remove produto com sucesso
      Quando clico no botão remover produto do carrinho
      Então o produto deve ser removido do carrinho