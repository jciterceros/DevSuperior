## DESAFIO: Contribuintes OO e Lista Java

Para calcular o imposto de renda que uma pessoa deve pagar, um país aplica as seguintes regras:

1. Imposto sobre salário: a pessoa paga imposto sobre seu salário conforme tabela ao lado:

   | Salário MENSAL          | Imposto |
   | ----------------------- | ------- |
   | Abaixo de 3000 por mês  | Isento  |
   | 3000 até 5000 exclusive | 10%     |
   | 5000 ou acima           | 20%     |

2. Se a pessoa obteve renda com prestação de serviços, o imposto cobrado é de 15%.
3. Se a pessoa obteve ganho de capital (imóveis, ações, etc.), o imposto cobrado é de 20%.
4. A pessoa pode abater até 30% do seu imposto bruto devido com gastos médicos ou educacionais. Mas se seus gastos médicos e educacionais forem abaixo desses 30%, apenas os gastos médicos e educacionais podem ser abatidos.

Você deve fazer um programa para ler os dados de N contribuintes,armazenando os dados desses contribuintes em uma lista. Depois, você deve mostrar, para cada contribuinte, um resumo do imposto
conforme exemplo abaixo.

Você deve utilizar uma classe TaxPayer conforme projeto ao lado para representar cada contribuinte. Repare que sua lista vai ter que ser uma List<TaxPayer>

<div align="center">
<img alt="Logo 005 - Contribuintes POO e Lista Java" title="Logo 005 - Contribuintes POO e Lista Java" width="250px" src="">
</div>

Lembre-se de respeitar os nomes apresentados no projeto ao lado (como foi fornecido o projeto para você executar, você tem que respeitar a especificação do projeto). Sinta-se livre para implementar construtores pra facilitar a instanciação dos objetos.

#### EXEMPLO 1:

| Prompt de comando                       |   Entrada |
| --------------------------------------- | --------: |
| Quantos contribuintes você vai digitar? |         2 |
|                                         |           |
|                                         |           |
| Digite os dados do 1o contribuinte:     |           |
| Renda anual com salário:                |  48000.00 |
| Renda anual com prestação de serviço:   |      0.00 |
| Renda anual com ganho de capital:       |    800.00 |
| Gastos médicos:                         |    400.00 |
| Gastos educacionais:                    |   5400.00 |
|                                         |           |
|                                         |           |
| Prompt de comando                       |   Entrada |
| -------------------------------------   | --------: |
| Digite os dados do 2o contribuinte:     |           |
| Renda anual com salário:                | 189000.00 |
| Renda anual com prestação de serviço:   |  55184.93 |
| Renda anual com ganho de capital:       |  20000.00 |
| Gastos médicos:                         |    600.00 |
| Gastos educacionais:                    |   7500.00 |

##### RELATÓRIO DOS CONTRIBUINTES

##### RESUMO:

| Prompt de comando          |    Saida |
| -------------------------- | -------: |
| Resumo do 1o contribuinte: |          |
| Imposto bruto total:       |  4960.00 |
| Abatimento:                |  1488.00 |
| Imposto devido:            |  3472.00 |
|                            |          |
|                            |          |
| Prompt de comando          |    Saida |
| --------------------       | -------: |
| Resumo do 2o contribuinte: |          |
| Imposto bruto total:       | 50077.74 |
| Abatimento:                |  8100.00 |
| Imposto devido:            | 41977.74 |

##### Critérios de avaliação (todos devem estar corretos):

1. Nomes de classes, atributos, métodos e argumentos respeitando o projeto, bem como as convenções
   de nome para Java (classe com primeira letra maiúscula, e padrão "camel case" para atributos, variáveis e métodos.
2. Atributos corretos e devidamente encapsulados com métodos get/set.
3. Todos métodos corretos calculando os valores corretamente.
4. Comportamento do programa correto conforme exemplo.
