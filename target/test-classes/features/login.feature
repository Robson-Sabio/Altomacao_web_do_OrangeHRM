#language: pt
#enconding: UTF-8

@Login
Funcionalidade: Login

@LoginInvalido
Cenario: Usuario invalido
Quando informar um login com os dados invalidos
E aperta o botao de logar
Entao o sistema exibe usuario invalido

@LoginSucesso
Cenario: Usuario logado
Quando informar um login com os dados validos
E aperta o botao de logar
Entao o sistema exibe usuario logado