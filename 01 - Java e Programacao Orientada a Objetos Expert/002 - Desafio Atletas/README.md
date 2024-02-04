## DESAFIO: Ateltas Java

Fazer um programa para ler uma quantidade N (supor N > 0), depois ler os dados de N atletas (nome, sexo, altura, peso). Depois, mostrar um relatório contendo:

- Peso médio dos atletas
- Nome do atleta mais alto
- Porcentagem de homens
- Altura média das mulheres
  Caso não sejam digitadas mulheres, a altura média não poderá ser calculada (pois divisão por zero não existe).
  Neste caso, apenas mostrar a mensagem "Não há mulheres cadastradas".
  Fazer validações de dados para altura e peso, não permitindo digitar valores não positivos para esses dados.
  Faça também a validação do sexo, não permitindo valores diferentes de F e M.
  Dica: para validar o sexo, a lógica é: tem que pedir para o usuário digitar novamente enquanto o valor digitado for diferente de "F" E diferente de "M"

#### EXEMPLO 1:

| Prompt de comando                                |       Entrada |
| ------------------------------------------------ | ------------: |
| Qual a quantidade de atletas?                    |             3 |
| Digite os dados do atleta numero 1:              |               |
| Nome:                                            |  Carlos Silva |
| Sexo:                                            |             M |
| Altura:                                          |          -1.5 |
| Valor invalido! Favor digitar um valor positivo: |             0 |
| Valor invalido! Favor digitar um valor positivo: |          1.75 |
| Peso:                                            |          84.8 |
| Digite os dados do atleta numero 2:              |               |
| Nome:                                            |    Maria José |
| Sexo:                                            |             F |
| Altura:                                          |          1.71 |
| Peso:                                            |          64.5 |
| Digite os dados do atleta numero 3:              |               |
| Nome:                                            | Teresa Borges |
| Sexo:                                            |             R |
| Valor invalido! Favor digitar F ou M:            |             S |
| Valor invalido! Favor digitar F ou M:            |             F |
| Altura:                                          |          1.65 |
| Peso:                                            |             0 |
| Valor invalido! Favor digitar um valor positivo: |           -60 |
| Valor invalido! Favor digitar um valor positivo: |          54.3 |

##### RELATÓRIO:

| Prompt de comando          |        Saida |
| -------------------------- | -----------: |
| Peso médio dos atletas:    |        67.87 |
| Atleta mais alto:          | Carlos Silva |
| Porcentagem de homens:     |       33.3 % |
| Altura média das mulheres: |         1.68 |

#### EXEMPLO 2:

| Prompt de comando                   |      Entrada |
| ----------------------------------- | -----------: |
| Qual a quantidade de atletas?       |            1 |
| Digite os dados do atleta numero 1: |              |
| Nome:                               | Carlos Silva |
| Sexo:                               |            M |
| Altura:                             |         1.75 |
| Peso:                               |         84.8 |

##### RELATÓRIO:

| Prompt de comando           |        Saida |
| --------------------------- | -----------: |
| Peso médio dos atletas:     |        84.80 |
| Atleta mais alto:           | Carlos Silva |
| Porcentagem de homens:      |      100.0 % |
| Não há mulheres cadastradas |              |
