#language: pt
#encoding: iso-8859-1
Funcionalidade: Efetuar Login/Logout no Woop - Sicredi 

@login 
Cenario: Efetuar Login com dados validos 
Dado que estou na HomePage do Woop 
Quando clico no botao Login 
E preencho os campos E-mail e Senha com dados validos 
Entao devo conseguir efetuar login corretamente 

@login 
Cenario: Efetuar Login com dados invalidos 
Dado que estou na HomePage do Woop 
Quando clico no botao Login 
E preencho os campos E-mail e Senha com dados invalidos 
Entao nao devo conseguir efetuar login 

@logout 
Cenario: Efetuar Logout 
Dado que estou na HomePage do Woop 
Quando estou logado 
Entao devo conseguir efetuar logout 

@esqueciMinhaSenha 
Cenario: Acessar o link Esqueci minha senha 
Dado que estou na HomePage do Woop
Quando clico no botao Login
E clico em Esqueci minha senha
E preencho o campo E-mail
E clico no botao Enviar
Entao devo ser informado de que recebi um e-mail de recuperacao de senha