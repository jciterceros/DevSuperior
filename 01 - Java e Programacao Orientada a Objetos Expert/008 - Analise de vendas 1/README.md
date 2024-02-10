## DESAFIO: Análise de vendas 1 Java

Você deve ler um arquivo .csv contendo uma base de dados de registros de venda, e instanciar na memória uma lista de objetos do tipo Sale, conforme projeto ao lado (Atenção: não use tipos primitivos int e double nos atributos e métodos! Use os tipos wrapper Integer e Double, conforme mostrado no projeto).

<div align="center">
    <img alt="Model Sales" title="Model Sales" width="250px" src="https://github.com/jciterceros/DevSuperior/blob/08fbf98f0109b28639959ec2d191cf53ada31591/01%20-%20Java%20e%20Programacao%20Orientada%20a%20Objetos%20Expert/008%20-%20Analise%20de%20vendas%201/src/assets/ModelSales.png">
</div>

Favor baixar a base de dados .csv daqui:
https://gist.github.com/acenelio/e4e169691ee5aef2c56c87bc22a54379

Depois de ler os dados, seu programa deverá mostrar as seguintes análises (implemente o método toString da classe Sale para facilitar):

- Cinco primeiras vendas de 2016 de maior preço médio, ordenadas decrescentemente por preço médio.
- Valor total vendido pelo vendedor Logan nos meses 1 e 7 de qualquer ano.

  Atenção: use métodos Stream + lambda para extrair os resultados a partir da lista original.
  Atenção: caso ocorra alguma falha na leitura do arquivo, a exceção deve ser tratada, e mostrada uma mensagem conforme exemplo.

#### EXEMPLO 1 (CONSIDERANDO A BASE DE DADOS ACIMA) :

| Prompt de comando           | Entrada        |
| --------------------------- | :------------- |
| Entre o caminho do arquivo: | c:\temp\in.csv |

| Saida                                                              |
| ------------------------------------------------------------------ |
| Cinco primeiras vendas de 2016 de maior preço médio                |
| 9/2016, Kal-El, 23, 20530.29, pm = 892.62                          |
| 7/2016, Kal-El, 20, 17126.62, pm = 856.33                          |
| 3/2016, Kal-El, 25, 21099.27, pm = 843.97                          |
| 6/2016, Padme Amidala, 25, 16429.74, pm = 657.19                   |
| 1/2016, Logan, 12, 7625.55, pm = 635.46                            |
| Valor total vendido pelo vendedor Logan nos meses 1 e 7 = 45357.42 |

##### EXEMPLO 2:

| Prompt de comando           | Entrada    |
| --------------------------- | :--------- |
| Entre o caminho do arquivo: | c:\temp\in |

| Saida                                                                  |
| ---------------------------------------------------------------------- |
| Erro: c:\temp\in (O sistema não pode encontrar o arquivo especificado) |

##### CRITÉRIOS DE AVALIAÇÃO (TODOS DEVEM ESTAR CORRETOS):

1. Leitura correta do arquivo.
2. Uso das funções Stream + lambda de maneira coerente.
3. Tratamento de exceção correto.
4. Resultado da primeira análise correto.
5. Resultado da segunda análise correto.
