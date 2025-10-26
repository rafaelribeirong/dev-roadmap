# Tipos Primitivos em Java

Os tipos primitivos são a base da linguagem Java. Eles representam valores simples, não objetos, e são divididos em quatro categorias:

* Tipos numéricos inteiros
* Tipos numéricos de ponto flutuante
* Tipo caractere (`char`)
* Tipo lógico (`boolean`)

---

## Tipos Numéricos Inteiros

Em Java existem quatro tipos inteiros:

| Tipo  | Tamanho (bits) | Intervalo de valores                                   |
| ----- | -------------- | ------------------------------------------------------ |
| byte  | 8              | -128 a 127                                             |
| short | 16             | -32.768 a 32.767                                       |
| int   | 32             | -2.147.483.648 a 2.147.483.647                         |
| long  | 64             | -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807 |

Na prática, os tipos mais usados são `int` e `long`. Os tipos `byte` e `short` aparecem menos, mas são úteis em situações de otimização de memória.

**Declaração de variáveis:**

```java
byte idade1 = 20;
short idade2 = 20;
int idade3 = 20;
long idade4 = 20L;
```

---

## Tipos de Ponto Flutuante

São usados para representar números com casas decimais.
Existem dois tipos principais:

| Tipo   | Tamanho (bits) | Exemplo |
| ------ | -------------- | ------- |
| float  | 32             | 3.14f   |
| double | 64             | 3.14    |

O `double` é mais utilizado no dia a dia por oferecer maior precisão.
Para declarar um número como `float`, é obrigatório colocar a letra **f** no final.

**Exemplo:**

```java
float saldo1 = 100.30f;
double saldo2 = 100.30;
```

---

## Tipo Char

Representa um único caractere, como uma letra, número ou símbolo.
O `char` ocupa 16 bits e usa a tabela **Unicode**, que é compatível com a tabela ASCII.

**Exemplos:**

```java
char o = 'o';
char i = 'i';
char interrogacao = 0x00e1;
```

Também é possível atribuir valores numéricos equivalentes aos caracteres:

```java
char letraO = 111;  // código ASCII
char letraI = 105;
```

O uso de `""` (aspas duplas) vazias na linha `System.out.println("" + o + i + interrogacao);`
serve para indicar ao Java que a operação deve ser tratada como **concatenação de texto**, e não soma de valores numéricos.

---

## Tipo Boolean

Armazena valores lógicos: verdadeiro ou falso.
É comumente usado para controle de fluxo e definição de condições.

**Exemplo:**

```java
boolean verdadeiro = true;
boolean falso = false;
```

Muito usado para criar **flags** (indicadores), por exemplo:

```java
boolean sistemaAtivo = true;
if (sistemaAtivo) {
    System.out.println("O sistema está ativo.");
}
```

---

## Literais

São valores fixos que aparecem diretamente no código.
Exemplos de literais em Java:

* Inteiros: `10`, `-5`, `1000`
* Ponto flutuante: `3.14`, `2.5f`
* Caractere: `'A'`, `'1'`, `'\n'`
* Booleano: `true`, `false`
* Texto (String): `"Olá mundo"`

---