#language: pt
@regressao
  Funcionalidade: Adiconar produto ao carrinho
    Eu como usuário
    Quero adicionar um produto ao carrinho
    Para que eu possa realizar uma compra

  Contexto:
    Dado que esteja logado no sistema

    @add-product-at-cart-success
    Cenário: Adição de produto ao carrinho
      Quando clico no botão Products
      E a tela de produtos é exibida
      E clico no botão 'Add to cart' do primeiro produto
      E clico no botão 'Continue Shopping'
      E clico no botão 'View Cart'
      Então verifico o produto no carrinho