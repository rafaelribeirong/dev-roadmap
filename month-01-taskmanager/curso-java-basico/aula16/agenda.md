# Agenda da Aula

## Estruturas de Controle: `while` e `do-while`

### Objetivo

Compreender o funcionamento dos comandos `while` e `do-while`, entendendo **quando e por que utilizá-los** em vez de estruturas condicionais simples como `if`, `else if` e `else`.

---

## Introdução

As estruturas de repetição em Java permitem **executar um bloco de código várias vezes** enquanto uma condição for verdadeira.
Esses comandos são fundamentais quando precisamos **repetir uma ação sem saber quantas vezes** ela será necessária antecipadamente.

O Java possui três principais estruturas de repetição:

* `while`
* `do-while`
* `for` (será visto em outra aula)

Nesta aula, o foco é compreender o funcionamento do `while` e do `do-while`.

---

## Comando `while`

O comando `while` **avalia uma expressão lógica** e, **enquanto ela for verdadeira**, o bloco dentro das chaves `{ }` será executado.
Assim que a condição se tornar falsa, o laço é encerrado.

### Estrutura

```java
while (condição) {
    // comandos repetidos enquanto a condição for verdadeira
}
```

### Exemplo

```java
int i = 1;
int max = 10;

System.out.println("Contando até " + max);

while (i < max) {
    System.out.println("Valor de i: " + i);
    i++; // incrementa o contador para evitar loop infinito
}
```

**Explicação:**

* O programa começa com `i = 1`.
* Enquanto `i` for menor que `max` (10), o bloco é executado.
* A cada repetição, `i` aumenta em 1.
* Quando `i` chega a 10, a condição `i < max` se torna falsa, encerrando o laço.

---

## Comando `do-while`

O `do-while` funciona de forma parecida, mas com uma diferença importante:
**a condição é avaliada apenas depois da execução do bloco**.
Isso significa que o bloco será **executado pelo menos uma vez**, mesmo que a condição seja falsa.

### Estrutura

```java
do {
    // comandos executados ao menos uma vez
} while (condição);
```

### Exemplo

```java
int i = 1;
int max = 5;

do {
    System.out.println("Valor de i: " + i);
    i++;
} while (i <= max);
```

**Explicação:**

* O código dentro do `do` é executado.
* Depois da execução, a condição é testada.
* Se for verdadeira, o laço repete. Se for falsa, ele termina.

---

## Por que usar `while` e não `if`, `else if` ou `else`

O comando `if` serve para **tomar decisões**, não para **repetir ações**.
Ele executa um bloco **apenas uma vez**, quando a condição é verdadeira.

Já o `while` é usado quando queremos **repetir** a execução enquanto a condição continuar sendo verdadeira.

### Diferença conceitual

| Estrutura   | Função principal                                                  | Execução                                          |
| ----------- | ----------------------------------------------------------------- | ------------------------------------------------- |
| `if / else` | Escolher **um caminho** baseado em uma condição                   | Executa **uma única vez**                         |
| `while`     | **Repetir** um bloco de código enquanto a condição for verdadeira | Executa **várias vezes** até a condição ser falsa |

### Exemplo prático

Usando `if`:

```java
if (senha != correta) {
    System.out.println("Senha incorreta!");
}
```

→ A mensagem aparece **uma única vez**, mesmo que o usuário ainda erre a senha.

Usando `while`:

```java
while (senha != correta) {
    System.out.println("Senha incorreta! Tente novamente.");
    senha = scan.nextInt();
}
```

→ A mensagem aparece **todas as vezes** em que o usuário errar, até digitar a senha correta.

---

## Resumo

* `while`: repete enquanto a condição for verdadeira.
* `do-while`: executa o bloco uma vez antes de testar a condição.
* Use `if` quando quiser **verificar uma condição única**.
* Use `while` quando quiser **repetir uma ação até a condição mudar**.