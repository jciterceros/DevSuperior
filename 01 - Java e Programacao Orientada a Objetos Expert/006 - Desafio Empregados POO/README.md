## DESAFIO: Empregados POO Java

Você deve fazer um programa para ler os dados de um departamento, que inclui seu endereço e seus empregados. Em seguida você deverá mostrar na tela um relatório de folha de pagamento, conforme exemplos.

#### EXEMPLO :

| Prompt de comando                        |            Entrada |
| ---------------------------------------- | -----------------: |
| Nome do departamento:                    |             Vendas |
| Dia do pagamento:                        |                 10 |
| Email:                                   | vendas@lojatop.com |
| Telefone:                                |           99883355 |
| Quantos funcionários tem o departamento? |                  2 |
| Dados do funcionário 1:                  |
| Nome:                                    |         João Silva |
| Salário:                                 |            8000.00 |
| Dados do funcionário 2:                  |
| Nome:                                    |       Maria Torres |
| Salário:                                 |           10000.00 |

##### RELATÓRIO FOLHA DE PAGAMENTO:

| Saida                                                    |
| -------------------------------------------------------- |
| FOLHA DE PAGAMENTO:                                      |
| Departamento Vendas = R$ 18000.00                        |
| Pagamento realizado no dia 10                            |
| Funcionários:                                            |
| João Silva                                               |
| Maria Torres                                             |
| Para dúvidas favor entrar em contato: vendas@lojatop.com |

Para resolver este problema, você deverá implementar as entidades conforme projeto abaixo. O método payroll() da classe Department é responsável por retornar o valor total da folha de pagamento do departamento:

<div align="center">
<img alt="Model Department" title="Model Department" width="650px" src="https://github.com/jciterceros/DevSuperior/blob/e225dd4e4d0595995f547eb28c6a10e47f2b5f14/01%20-%20Java%20e%20Programacao%20Orientada%20a%20Objetos%20Expert/006%20-%20Desafio%20Empregados%20POO/src/assets/ModelDepartment.png">
</div>

##### Critérios de avaliação ATENÇÃO:

- Para o exemplo dado acima, esta é a estrutura de objetos que você deverá criar na memória:

<div align="center">
<img alt="Instance Department in Memory" title="Instance Department in Memory" width="650px" src="https://github.com/jciterceros/DevSuperior/blob/e225dd4e4d0595995f547eb28c6a10e47f2b5f14/01%20-%20Java%20e%20Programacao%20Orientada%20a%20Objetos%20Expert/006%20-%20Desafio%20Empregados%20POO/src/assets/Instance%20Department%20in%20Memory.png">
</div>
