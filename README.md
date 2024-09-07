# Drools Example

Este repositório tem o objetivo de disponibilizar um código simples e funcional para entendimento do Drools e sua integração com Protobuf.

Atualmente são utilizadas as versões:

- [Drools `8.44.0.Final`][drools-844-docs]
- [Protobuf `28.0`][protobuf-28-release]
- [protobuf-java `4.28`][protobuf-java-428] (Maven)

## Protobuf

Uma demonstração de uso com [Protobuf][protobuf-java-docs] foi adicionada, pois é um caso de estudo que também carece de exemplos simples.

Devido às classes geradas pelo compilador serem `static final` (imutáveis) existe uma certa dificuldade ao usar o Drools, pois não é possível se aproveitar de `setters` para fácil manuseio dos objetos. Assim, foi criada uma branch específica ([feat/protobuf][branch-protobuf]) para tratar deste caso.

## Disclaimer

Não sou desenvolvedor `Java`, baseei-me nos exemplos mais simples encontrados no repositório [kiegroup/drools][gh-drools-example], que pra mim, já eram muito complexos pro tempo e conhecimento que dispunha.

Portanto não conte com qualidade no código, ele foi feito para entendimento primordial e teste de integração com Protobuf. Sinta-se à vontade para melhorá-lo.

[drools-844-docs]: https://docs.drools.org/8.44.0.Final
[protobuf-28-release]: https://github.com/protocolbuffers/protobuf/releases/tag/v28.0
[protobuf-java-docs]: https://protobuf.dev/getting-started/javatutorial/
[protobuf-java-428]: https://mvnrepository.com/artifact/com.google.protobuf/protobuf-java/4.28.0
[branch-protobuf]: https://github.com/gomesar9/drools-example/tree/feat/protobuf
[gh-drools-example]: https://github.com/kiegroup/drools/tree/main/drools-examples/src/main

