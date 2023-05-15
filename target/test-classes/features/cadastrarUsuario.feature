#language: pt
#enconding: UTF-8
 @Cadastro
 Funcionalidade: Cadastrar usuario
 
 Contexto: 
 Dado que esteja logado no sistema
 
 @CadastroBemSucedido
 Cenario: cadastrar usuario
 Quando for cadastra um novo usuario
 E preencher com os dados vaidos
 Entao o sistema aprensenta o usuario cadastrado