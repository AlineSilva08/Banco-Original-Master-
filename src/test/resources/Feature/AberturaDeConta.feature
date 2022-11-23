@aberturaconta
Feature: Abertura de conta

  @pf
  Scenario: Abertura de conta pessoa fisica
 Given que o usuario acesse a url "https://www.original.com.br/"
 And selecionar o botao abrir conta
 And selecionar o botao abrir conta para voce 
 #When preencher o formulario de abertura de conta 
 And preencher o campo nome  "<nome>"
 And preencher o campo "<email>"
 And preencher o campo "<cpf>"
 And preencher o campo "<celular>"
 And selecionar o botao quero ser cliente
 Then sera exibido o texto falta pouco
 
 
 