#language: pt
#enconding: UTF-8
 @Cadastro
 Funcionalidade: Cadastrar usuario
 
 Contexto: 
 Dado que esteja logado no sistema
 
 @CadastrarNovoUsuario
 Cenario: cadastrar usuario
 Quando for cadastra um novo usuario
 E preencher com os dados validos
 Entao o sistema apresenta o usuario cadastrado
 
 @DeletarUsuario
 Cenario: deletar usuario
 Quando estiver na aba Admin 
 E aperta em deletar o usuario
 Entao o sistema apresenta usuario deletado com sucesso