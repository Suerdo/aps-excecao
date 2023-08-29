**Universidade Federal da Paraíba - UFPB** \
**Centro de Ciências Exatas e Educação - CCAE** \
**Departamento de Ciências Exatas - DCX**

**Professor:** [Rodrigo Rebouças de Almeida](http://rodrigor.dcx.ufpb.br)

# 

Um sistema de vendas em um supermercado `sistema.SisVendas` utiliza um `sistema.LeitorCodigoBarras`
para ler códigos de barras dos produtos.

A classe `sistema.LeitorCodigoBarras` possui um método `String lerCodigo()`;


## Questão 1

O sistema `sistema.SisVendas` agora precisa utilizar um `sistema.LeitorQRCode`.
Implemente o sistema de modo que seja fácil acrescentar novos leitores de códigos no `sistema.SisVendas`;

O `sistema.SisVendas` não pode ter acoplamento com um tipo específico de leitor de códigos.

## Questão 2

O `sistema.LeitorCodigoBarras` deve lançar a exceção `exceptions.CodigoBarrasException`;
O `sistema.LeitorQRCode` deve lançar a exceção `exceptions.QRCodeException`;
O `sistema.SisVendas` deve receber um `ErroLeituraException` quando houver algum erro na leitura de qualquer leitor.

Implemente o tratamento de exceções acima.