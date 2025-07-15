#language: pt
@regressao @add-product-at-cart
  Funcionalidade: Adiconar produto ao carrinho
    Eu como usuário
    Quero adicionar um produto ao carrinho
    Para que eu possa realizar uma compra

  Contexto:
    Dado que esteja logado no sistema
    E o carrinho esteja vazio

    @add-product-at-cart-success
    Cenário: Adição de produto ao carrinho
      Quando clico no botão Products
      E a tela de produtos é exibida
      E clico no botão 'Add to cart' do primeiro produto
      E clico no botão 'Continue Shopping'
      E clico no botão 'View Cart'
      Então verifico o produto no carrinho

    @add-product-quantity
    Cenário: Adição de produto ao carrinho com quantidade de 3
      E clico no botão Products
      E a tela de produtos é exibida
      E clico no botão View Product
      E a tela de detalhes do produto é exibida
      E preencho a quantidade do produto
      Quando clico no botão Add to cart
      E clico em View Cart
      Então o produto deve ser exibido com a quantidade correta no carrinho