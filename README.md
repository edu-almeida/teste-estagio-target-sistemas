## Questão 01
### Class  [Questao01.java](src/main/java/org/teste/Questao01.java)

``` txt
1) Observe o trecho de código abaixo:

int INDICE = 13, SOMA = 0, K = 0;
enquanto K < INDICE faça
{
    K = K + 1;
    SOMA = SOMA + K;
}

imprimir(SOMA);

Ao final do processamento, qual será o valor da variável SOMA?
```
Chegamos ao resultado que a variavel `SOMA = 91`.
Para comprovar esse calculo fizemos de forma direta o algoritmo:
``` java
int indice = 13;
int soma = 0;
int k = 0;
while (k < 13) {
    k += 1;
    soma += k;
}
System.out.println(soma);
```
```cmd
91
```



---
## Questão 02
### Class  [Questao02.java](src/main/java/org/teste/Questao02.java)

``` txt
2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor 
sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), 
escreva um programa na linguagem que desejar onde, informado um número, 
ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o 
número informado pertence ou não a sequência.

IMPORTANTE:
Esse número pode ser informado através de qualquer entrada de sua preferência 
ou pode ser previamente definido no código;
```
Fizemos um teste na função main com as funçôes desenvolvidas:
``` java
// Um número pertence à sequência de Fibonacci se e somente se um
// ou ambos os seguintes critérios forem verdadeiros:
// 5n^2 + 4 ou 5n^2 - 4 é um quadrado perfeito.
public static boolean isFibonacci(int numero) {...}

// Não optamos pela abordagem com recursão por ser menos eficiente para
// números grandes devido à repetição de cálculos.
public static int fibonacci(int numero) {...}
```
Teste para verdade:
``` cmd
Digite um número inteiro da sequencia de fibonacci: 8
Você digitou 8 ele pertence a sequencia.
O proximo número da sequencia será 13
```
Teste para falso:
``` cmd
Digite um número inteiro da sequencia de fibonacci: 11
O número 11 não pertence a sequcnia.
```

___

## Questão 03
### Class  [Questao03.java](src/main/java/org/teste/Questao03.java)

``` txt
3) Descubra a lógica e complete o próximo elemento:

a) 1, 3, 5, 7, __
b) 2, 4, 8, 16, 32, 64, __
c) 0, 1, 4, 9, 16, 25, 36, __
d) 4, 16, 36, 64, __
e) 1, 1, 2, 3, 5, 8, __
f) 2,10, 12, 16, 17, 18, 19, __
``` 

#### Implementando as logicas aplicadas aos resultados predispostos na questão 03

Defimos que seriam gerados 10 valores para as sequencias.

``` java
int quantidadeElementos = 10;
```

Sobre as logicas:

``` java
// Proximo número é o acréscimo de 2 ao número atual
public static int logicaA(int numero){...};

// Proximo número é o ataul multiplicado por 2
public static int logicaB(int numero){...};

// Proximo número é a base do número atual somado de 1 e elevado ao quadrado.
public static int logicaC(int numero){...};

// Proximo número é a base do número atual somado de 2 e elevado ao quadrado.
// (Quadrado perfeito de números pares)
public static int logicaD(int numero){...};

// A logica é a Sequência de Fibonacci, reaproveitaremos o algoritmo da questão 2.
public static int logicaE(int numero){...};

// Os números estão seguindo uma sequência de adições e alguns incrementos unitários.
// Não percebemos a logica real nos primeiros, mas aparentemente se manteveram 
// constante em n+1, faremos o incremente adicionalmente fixo.
public static int logicaF(int numero){...};
```

Definimos que a função de cada logica ira preencher 10 elementos de suas listas respectivas.

Resultados:

``` cmd
Logica A: [1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21]
Logica B: [2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048]
Logica C: [0, 1, 4, 9, 16, 25, 36, 49, 64, 81, 100]
Logica D: [4, 9, 16, 25, 36, 49, 64, 81, 100, 121, 144]
Logica E: [1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144]
Logica F: [2, 10, 12, 16, 17, 18, 19, 20, 21, 22, 23]
```

___

## Questão 04
### Classe  [No class]()

``` txt
4) Você está em uma sala com três interruptores, cada um conectado a uma 
lâmpada em uma sala diferente. Você não pode ver as lâmpadas da sala em 
que está, mas pode ligar e desligar os interruptores quantas vezes quiser. 
Seu objetivo é descobrir qual interruptor controla qual lâmpada.

Como você faria para descobrir, usando apenas duas idas até uma das 
salas das lâmpadas, qual interruptor controla cada lâmpada?
```
O problema deixou algumas possibilidades.\  
Analisando o cenario.
São 4 salas e 3 lampadas:
 - `SALAS: W, X, Y, Z`
 - `INTERRUPTORES: A, B, C`

Ações:
``` txt
SALA W = Sala dos interruptores

Ligue o INTERRUPTOR A por 5min;
Ligue o INTERRUPTOR B;
Não ligue o INTERRUPTOR C;
Desligue o INTERRUPTOR A;
```
Algoritmo:
```
Para cada SALA na lista:
    Se, lâmpada ligada: 
        SALA = INTERRUPTOR B
    Se não, lâmpada desligada: 
        Se lãmpada quente:
            SALA = INTERRUPTOR A
        Se lâmpada fria:
            SALA = INTERRUPTOR C
```
Solução valida:
```
Lâmpada X ligada? (sim/não): sim
Lâmpada Y ligada? (sim/não): não
Lâmpada Y quente? (sim/não): sim
Lâmpada Z ligada? (sim/não): não
Lâmpada Z quente? (sim/não): não

Interruptor da sala X: B
Interruptor da sala Y: A
Interruptor da sala Z: C
```
Se você puder identificar os interruptores de duas salas, 
o interruptor da terceira sala será automaticamente conhecido.

---
## Questão 05
### Class  [Questao05.java](src/main/java/org/teste/Questao02.java)

``` txt
2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor 
sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), 
escreva um programa na linguagem que desejar onde, informado um número, 
ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o 
número informado pertence ou não a sequência.

IMPORTANTE:
Esse número pode ser informado através de qualquer entrada de sua preferência 
ou pode ser previamente definido no código;
```