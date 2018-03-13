#language: pt
#encoding: iso-8859-1
Funcionalidade: Selenium Teste Exemplo

  @selenium
  Cenario: Efetuar Login com dados validos
    Dado que estou na HomePage do Woop    
    Quando clico no botao Login
    E preencho os campos E-mail e Senha com dados validos
    Entao devo conseguir efetuar login corretamente
    
    @selenium
  Cenario: Efetuar Login com dados invalidos
    Dado que estou na HomePage do Woop    
    Quando clico no botao Login
    E preencho os campos E-mail e Senha com dados invalidos
    Entao nao devo conseguir efetuar login