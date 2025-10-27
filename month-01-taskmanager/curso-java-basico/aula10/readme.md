# Aula: Variáveis e Tipos Primitivos em Java

---

## O que é uma variável

Uma **variável** é uma área da memória do computador associada a um nome, que pode armazenar valores de um determinado tipo.

Em outras palavras:
Uma variável serve para **guardar informações** que serão usadas pelo programa.

**Exemplo:** armazenar a idade de uma pessoa

```java
int idade = 25;
```

Neste caso, o Java reserva um espaço na memória para guardar o número `25` e o identifica com o nome `idade`.

---

## Como declarar uma variável em Java

**Sintaxe:**

```java
<tipo> <nomeDaVariavel>;
```

ou, já atribuindo um valor inicial:

```java
<tipo> <nomeDaVariavel> = <valor>;
```

**Exemplos:**

```java
int idade;               // declaração
idade = 25;              // atribuição
String nome = "Rafael";  // declaração + atribuição
double altura = 1.80;    // variável com número decimal
```

---

## Convenção de nomenclatura (boas práticas)

As convenções de nomenclatura são regras que os desenvolvedores seguem para manter o código legível e organizado.
Não são obrigatórias, mas são recomendadas.

### Regras básicas:

* O nome da variável deve começar com uma letra, `_` (sublinhado) ou `$`.
* Não pode começar com número.
* Depois da primeira letra, pode conter letras, números, `_` ou `$`.
* Java diferencia maiúsculas e minúsculas (`idade` ≠ `Idade`).

### Convenções de estilo:

* Usar **camelCase**: primeira letra minúscula e as demais palavras com inicial maiúscula.
  Exemplo: `nomeCompleto`, `quantidadeDeAlunos`
* Usar **nomes descritivos**: `idade`, `salarioMensal`, `nomeCliente`
* Evitar `_` e `$`, a não ser em casos especiais.

---

## Tipos primitivos em Java

Java possui **8 tipos primitivos**, que são os tipos básicos de dados.
Eles não são objetos e armazenam valores diretamente na memória.

| Tipo      | Tamanho | Exemplo                         | Descrição                                 |
| --------- | ------- | ------------------------------- | ----------------------------------------- |
| `byte`    | 1 byte  | `byte idade = 20;`              | Números inteiros pequenos (-128 a 127)    |
| `short`   | 2 bytes | `short alunos = 300;`           | Números inteiros curtos                   |
| `int`     | 4 bytes | `int idade = 25;`               | Números inteiros (mais usado)             |
| `long`    | 8 bytes | `long populacao = 2147483648L;` | Números inteiros grandes (precisa do `L`) |
| `float`   | 4 bytes | `float altura = 1.75f;`         | Números decimais (precisa do `f`)         |
| `double`  | 8 bytes | `double salario = 3500.75;`     | Números decimais mais precisos            |
| `char`    | 2 bytes | `char letra = 'A';`             | Armazena um único caractere               |
| `boolean` | 1 bit   | `boolean ativo = true;`         | Armazena valores verdadeiro ou falso      |

---

## Exemplo completo

```java
public class ExemploVariaveis {
    public static void main(String[] args) {
        int idade = 25;
        double altura = 1.80;
        char sexo = 'M';
        boolean ativo = true;
        String nome = "Rafael Ribeiro"; // String não é primitivo, é uma classe

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Sexo: " + sexo);
        System.out.println("Ativo: " + ativo);
    }
}
```

**Saída esperada:**

```
Nome: Rafael Ribeiro
Idade: 25
Altura: 1.8
Sexo: M
Ativo: true
```

---

## Resumo

| Conceito       | Explicação                                        |
| -------------- | ------------------------------------------------- |
| Variável       | Espaço na memória que armazena um valor           |
| Declaração     | `int idade;`                                      |
| Atribuição     | `idade = 25;`                                     |
| Tipo primitivo | Tipo básico (int, double, boolean, etc.)          |
| CamelCase      | Forma padrão de nomear variáveis (`nomeCompleto`) |
| Case-sensitive | Java diferencia maiúsculas e minúsculas           |
