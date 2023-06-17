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
 
 @DeletarUsuario
 Cenario: deletar usuario
 Quando estiver na aba Admin 
 E aperta em deletar o usuario
 Entao o sistema apresenta usuario deletado com sucesso