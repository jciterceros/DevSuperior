## DESAFIO: imposto Java

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

Fazer um programa para ler quanto a pessoa obteve de renda anual com salário, prestação de serviço e ganho de capital. Leia também quando a pessoal teve de gastos médicos e educacionais no ano. Seu programa deverá então produzir um relatório de imposto de renda dessa pessoa conforme exemplos.
Considere a renda mensal com salário como sendo a renda anual dividida por 12.

#### EXEMPLO 1:

| Prompt de comando                     |  Entrada |
| ------------------------------------- | -------: |
| Renda anual com salário:              | 48000.00 |
| Renda anual com prestação de serviço: |     0.00 |
| Renda anual com ganho de capital:     |   800.00 |
| Gastos médicos:                       |   400.00 |
| Gastos educacionais:                  |  5400.00 |

##### RELATÓRIO DE IMPOSTO DE RENDA

##### CONSOLIDADO DE RENDA:

| Prompt de comando               |   Saida |
| ------------------------------- | ------: |
| Imposto sobre salário:          | 4800.00 |
| Imposto sobre serviços:         |    0.00 |
| Imposto sobre ganho de capital: |  160.00 |

##### DEDUÇÕES:

| Prompt de comando  |   Saida |
| ------------------ | ------: |
| Máximo dedutível:  | 1488.00 |
| Gastos dedutíveis: | 5800.00 |

##### RESUMO:

| Prompt de comando    |   Saida |
| -------------------- | ------: |
| Imposto bruto total: | 4960.00 |
| Abatimento:          | 1488.00 |
| Imposto devido:      | 3472.00 |

#### EXEMPLO 2:

| Prompt de comando                     |   Entrada |
| ------------------------------------- | --------: |
| Renda anual com salário:              | 189000.00 |
| Renda anual com prestação de serviço: |  55184.93 |
| Renda anual com ganho de capital:     |  20000.00 |
| Gastos médicos:                       |    600.00 |
| Gastos educacionais:                  |   7500.00 |

##### RELATÓRIO DE IMPOSTO DE RENDA

##### CONSOLIDADO DE RENDA:

| Prompt de comando               |    Saida |
| ------------------------------- | -------: |
| Imposto sobre salário:          | 37800.00 |
| Imposto sobre serviços:         |  8277.74 |
| Imposto sobre ganho de capital: |  4000.00 |

##### DEDUÇÕES:

| Prompt de comando  |    Saida |
| ------------------ | -------: |
| Máximo dedutível:  | 15023.32 |
| Gastos dedutíveis: |  8100.00 |

##### RESUMO:

| Prompt de comando    |    Saida |
| -------------------- | -------: |
| Imposto bruto total: | 50077.74 |
| Abatimento:          |  8100.00 |
| Imposto devido:      | 41977.74 |
