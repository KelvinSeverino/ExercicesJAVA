# ExercicesJAVA
Todos os exercícios realizados na Aula de POO na FATEC SJC

# Enunciados das Listas
## Lista 1
Não se tem enunciados propriamente dito, pois se trata apenas de uma revisão de conceitos básicos de programação aplicado em JAVA.

## Lista 2
1. Escreva um aplicativo que solicita ao usuário inserir dois números inteiros e imprima a soma, subtração, divisão e produto desses dois números.

2. Escreva um aplicativo que solicita ao usuário inserir dois números inteiros e imprima a soma, a média e imprima os números em ordem crescente.

3. Escreva um aplicativo que solicita ao usuário inserir cinco números inteiros e imprima o maior, o menor número do grupo.

4. Escreva um aplicativo que lê dois inteiros, determina se o primeiro é um múltiplo do segundo.

5. Desenvolva um aplicativo que determinará se um cliente de uma loja de departamentos excedeu o limite de crédito em uma conta-corrente. Para cada cliente, os seguintes fatos estão disponíveis: número da conta, saldo no início do mês, total de todos os itens cobrados desse cliente no mês, total de créditos aplicados ao cliente no mês e limite de crédito autorizado. O programa deve inserir todos esses fatos com ponteiros, calcular o novo saldo (= saldo inicial + despesas - créditos), exibir o novo saldo e determinar se o novo saldo excede o limite de crédito do cliente. Avisar se o crédito do cliente está excedido ou não.

6. Considere uma grande empresa que paga seu pessoal de vendas com base em comissões. O pessoal de vendas recebe R$ 200 por semana mais 9% de suas vendas brutas durante a semana. Desenvolva um aplicativo que receba a entrada de itens vendidos por um vendedor durante a última semana e calcule e exibe os rendimentos do vendedor.

7. Desenvolva um aplicativo que determine o salário de um empregado que recebe por hora trabalhada. A empresa paga “hora normal” para as primeiras 40 horas trabalhadas e 50% a mais para todas as horas trabalhadas além das 40 horas. O aplicativo deve receber a quantidade de horas trabalhadas e o valor da hora normal e calcular o salário bruto do empregado.

8. Uma empresa de grande porte quer transmitir dados via internet, mas está preocupada com a possibilidade de seus telefones estarem grampeados. Ela pediu para você escrever um programa que criptografe os dados de modo que estes possam
ser transmitidos mais seguramente. Todos os dados são transmitidos como inteiros de quatro dígitos. Seu aplicativo deve ler um inteiro de quatro dígitos inserido pelo usuário e criptográfa-lo desta maneira: Substitua cada dígito pelo resultado da adição de 7 ao dígito e obtendo o resto depois da visão do novo valor por 10. Troque então o primeiro dígito pelo terceiro e o segundo dígito pelo quarto. Então imprima o inteiro criptográfado. Escreva um outro aplicativo separado que receba como entrada um inteiro de quatro dígitos criptografado e o descriptografe para forma o número original.

## Lista 3
1. Desenvolva 3 aplicativos que funcionem como uma agenda eletrônica. Siga como referência os códigos das Figuras 1, 2, 3 e 4. O objetivo é armazenar informações de contatos como: Nome, Email e Telefone. O primeiro aplicativo deve conter a persistência das informações armazenada em objetos do tipo Array, o segundo deve ter a persistência armazenada em objetos do tipo Vecto<E> e o terceiro deve usar objetos do tipo ArrayList<E> para armazenar as informações. Todos os aplicativos devem permitir armazenar e excluir contatos.

2. Uma empresa que faz negócios por reembolso postal vende cinco produtos cujos preços de varejo são como segue: P1 R$1,00 – P2 R$2,98 – P3 R$9,98 – P4 R$4,49 e P5 R$6,87. Escreva um aplicativo que leia uma série de pares de números como segue: código do produto, quantidade vendida. Seu programa deve determinar o valor total de produtos vendidos, discriminando a porcentagem vendida em dinheiro de cada produto.

3. Um estacionamento cobra uma taxa mínima de R$2,00 para estacionar por até três horas. Um adicional de R$0,50 por hora não necessariamente inteira é cobrado após as três primeiras horas. Escreva um aplicativo que calcule e exiba as taxas de estacionamento para um cliente que estacionou. O aplicativo deve receber o intervalo de tempo que o veículo ficou estacionado e exibir a cobrança para o cliente.

4. Escreva um método múltiplo() que determina um par de inteiros se o se segundo é múltiplo do primeiro. O método deve retorna o valor boleano true se o segundo número for múltiplo do primeiro.

5. Escreva um aplicativo que utiliza um objeto do tipo Array de 1000 elementos para exibir os números primos entre 2 a 999.

6. Uma loja o contratou para desenvolver um aplicativo para gerenciamento de relacionamento com clientes e mineração de dados. O objetivo do é armazenar informações sobre cada cliente e o total de gasto por cada cliente ao longo de 12 meses. Dessa forma escreva um aplicativo que armazene informações de clientes como: Nome, Email, Telefone e Endereço e de dinheiro gasto para cada uns dos últimos 12 meses. O Aplicativo deve informa o montante gasto por todos os clientes para cada mês e para o total do período de 12 meses, além de informa qual foi o cliente que mais gastou dinheiro por mês e no período total de 12 meses. O aplicativo também deve permitir cadastro e exclusão de clientes e também a possibilidade editar dados de clientes como telefone ou endereço.

## Lista 4
1. Desenvolva um aplicativo que funcione como uma agenda eletrônica para a faculdade. O objetivo é armazenar informações de contatos como: Nome, Email e Telefone. O aplicativo deve separar os contatos por conjuntos de acordo com sua função na faculdade entre professor e aluno. A cada vez que o aplicativo listar os contatos de um aluno, junto deve ser exibido o número de matricula. A cada vez que o aplicativo listar os contatos de um professor junto deve ser exibido o numero de registro do professor e a quantidade de horas/aulas que ele possui na Faculdade. O aplicativo deverá permitir inserção, edição e remoção de contatos.

## Lista 5
1. Desenvolva um aplicativo que funcione como uma agenda eletrônica para a faculdade. O objetivo é armazenar informações de contatos como: Nome, Email e Telefone. O aplicativo deve separar os contatos por conjuntos de acordo com sua função na faculdade entre professor e aluno. A cada vez que o aplicativo listar os contatos de um aluno, junto deve ser exibido o número de matricula. A cada vez que o aplicativo listar os contatos de um professor junto deve ser exibido o numero de registro do professor e a quantidade de horas/aulas que ele possui na Faculdade. O aplicativo deverá permitir inserção, edição e remoção de contatos.
O aplicativo deverá permitir a opção de salvar a agenda em disco e também carregar informações de uma agenda salva em disco, dessa forma criam-se as idéias de portabilidade e persistência das informações.
Utilize as Figuras de 1 à 8 como modelo para o seu desenvolvimento. Você deve utilizar a interface Contato e a classe abstrata Pessoa na construção de sua agenda.

2. Escreva um aplicativo que solicite ao usuário inserir o tamanho do lado de um quadrado e então exiba um quadrado vazio desse tamanho com asteriscos. Seu programa deve trabalhar com quadrados de todos os comprimentos de lado possíveis entre 1 e 20.

3. Escreva um aplicativo que leia três valores, diferentes de zero, inseridos pelo usuário e determine e imprima se eles poderiam representar os lados de um triângulo retângulo

## Lista 6
1. Você foi contratado para desenvolver um aplicativo controlador de estoque para o almoxarifado de uma empresa, situado no parque tecnológico. O aplicativo deve permitir ao almoxarife cadastrar, editar e remover produtos e suas quantidades. Além disso, o aplicativo deve ser capaz de emitir relatórios contendo informações do tipo, quantidade total de produtos cadastrados, quantidade de cada produto armazenado no almoxarifado. Por último, o aplicativo deve ser responsável por armazenar suas informações sem perdas, logo ele deve permitir ao usuário poder salvar e recuperar as informações do disco.

Ao se gerar relatórios sobre as informações o aplicativo deve listar os produtos armazenados em ordem alfabética. Seguindo o modelo:

   ![alt text](https://github.com/KelvinSeverino/ExercicesPOO/blob/master/Lista%206%20-%20Exerc%C3%ADcios/Quadro.PNG)

## Lista 7
Em Progresso...

## Lista 8
1. Desenvolva um aplicativo Java que acesse todos os arquivos contidos no HD do computador, imprima o nome de cada arquivo e também escreva se o arquivo é ou não um diretório.

2. Sua empresa foi contratada para processar dados de uma agência de marketing digital. Você receberá um arquivo de texto contento aproximadamente 50.000,00 emails. Cada email ocupa uma linha do arquivo de texto, sendo que em cada linha além do email estão também algumas informações desnecessárias. Seu objetivo é ler o arquivo e extrair os emails lá contidos. Após isso salve a lista de email em outro arquivo de texto. Seu aplicativo deve informar o inicio e termino do processamento. Por fim, o novo arquivo criado deve ter os emails salvos e organizados de forma que cada email ocupe uma linha do arquivo de texto.

## Lista 9
1. Desenvolva uma aplicação gráfica em Java, para gerar formas retangulares na em uma Janela gráfica. Siga o modelo da imagem abaixo.
   
   ![alt text](https://github.com/KelvinSeverino/ExercicesPOO/blob/master/Lista%209%20-%20Exerc%C3%ADcios/Forma.PNG)
   
2. Crie um aplicativo gráfico em Java, que simule o comportamento de uma calculadora simples, com opções de soma, subtração, multiplicação e divisão. O aplicativo desenvolvido deve receber no máximo dois valores numéricos, inseridos pelo usuário e realizar uma das operações de acordo com a vontade do usuário.

## Lista 10
Em Progresso...

## Lista 11
Em Progresso...

## Lista 12
Em Progresso...

## Lista 13
Em Progresso...
