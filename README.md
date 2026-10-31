# Desafio POO I - Operação Crachá Geek

Este projeto é um sistema simples de cadastro de participantes para eventos geek (campeonatos, cosplay e palestras), feito em Java e executado no console.
A classe `Participante` é o molde dos objetos e guarda os atributos `id`, `nome`, `email` e `tipoParticipacao`.
Os métodos usados são os construtores, `cadastrar()`, os getters e setters e `exibirInformacoes()`.
O encapsulamento foi aplicado deixando todos os atributos `private`, com acesso apenas por métodos públicos.
Os setters validam os dados (nome não vazio e e-mail com "@"), protegendo o estado do objeto.
A classe `Main` cria três objetos diferentes (Ana, Bruno e Carla), cada um com dados próprios.
Dois são cadastrados pelo construtor e um pelo método `cadastrar()`.
O teste foi feito executando o programa e conferindo no console se os três cadastros aparecem corretamente.
O desenho manuscrito da classe está na imagem `desenho-classe.jpeg` deste repositório.

## Como executar

```
javac Participante.java Main.java
java Main
```
