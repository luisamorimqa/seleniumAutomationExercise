#language: pt
@regressao @filter-brand
  Funcionalidade:
    Eu como usuário
    Quero filtrar os produtos por marca
    Para conseguir encontrar os produtos mais facilmente

    Contexto:
      Dado que esteja logado no sistema

    @filter-brand-products
    Esquema do Cenário: Filter "<brand>" products
      E acesse a tela de produtos
      Quando seleciono o brand name "<brand>"
      Então o campo de categoria e marca deverá mostrar o "<brand>"

      Exemplos:
        | brand        |
        | polo         |
        | madame       |
        | H&M          |
        | mast&harbour |
