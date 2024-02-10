## DESAFIO: Análise de vendas 2 Java

Você deve ler um arquivo .csv contendo uma base de dados de registros de venda, e instanciar na memória uma lista de objetos do tipo Sale, conforme projeto ao lado (Atenção: não use tipos primitivos int e double nos atributos e métodos! Use os tipos wrapper Integer e Double, conforme mostrado no projeto).

<div align="center">
    <img alt="Model Sales" title="Model Sales" width="250px" src="https://github.com/jciterceros/DevSuperior/blob/08fbf98f0109b28639959ec2d191cf53ada31591/01%20-%20Java%20e%20Programacao%20Orientada%20a%20Objetos%20Expert/008%20-%20Analise%20de%20vendas%201/src/assets/ModelSales.png">
</div>

Favor baixar a base de dados .csv daqui:
https://gist.github.com/acenelio/e4e169691ee5aef2c56c87bc22a54379

Depois de ler os dados, seu programa deverá mostrar o total vendido por cada vendedor conforme exemplo (a ordem em que os vendedores são mostrados não importa).

Atenção: seu programa é que deve varrer toda a lista para encontrar os nomes dos vendedores.

Atenção: caso ocorra alguma falha na leitura do arquivo, a exceção deve ser tratada, e mostrada uma mensagem conforme exemplo.
Dicas:

1. Para resolver este problema, você deve primeiro varrer toda a lista gerando os nomes únicos de cada vendedor. Para fazer isso de forma eficiente, use a coleção Set ou Map, pois estas não admitem repetição.

2. Uma vez que você tenha uma coleção com os nomes únicos de cada vendedor, use métodos Stream + lambda para extrair o total vendido por cada um.

#### EXEMPLO 1 (CONSIDERANDO A BASE DE DADOS ACIMA) :

| Prompt de comando           | Entrada        |
| --------------------------- | :------------- |
| Entre o caminho do arquivo: | c:\temp\in.csv |

| Saida                          |
| ------------------------------ |
| Total de vendas por vendedor:  |
| Logan - R$ 220443.05           |
| Rachel Roth - R$ 502478.67     |
| Padme Amidala - R$ 473104.63   |
| Victor Von Doom - R$ 478657.40 |
| Barry Allen - R$ 499946.28     |
| Anakin - R$ 477153.54          |
| Kal-El - R$ 444881.58          |
| Wanda Maximoff - R$ 470741.34  |

##### EXEMPLO 2:

| Prompt de comando           | Entrada    |
| --------------------------- | :--------- |
| Entre o caminho do arquivo: | c:\temp\in |

| Saida                                                                  |
| ---------------------------------------------------------------------- |
| Erro: c:\temp\in (O sistema não pode encontrar o arquivo especificado) |

##### CRITÉRIOS DE AVALIAÇÃO (TODOS DEVEM ESTAR CORRETOS):

1. Leitura correta do arquivo.
2. Uso das coleções Set e/ou Map de forma coerente.
3. Uso das funções Stream + lambda de maneira coerente.
4. Tratamento de exceção correto.
5. Resultados com valores corretos.
