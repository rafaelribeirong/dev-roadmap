Controle de decisão – Estruturas IF

O que é controle de decisão
Controle de decisão é o recurso que permite ao programa escolher caminhos diferentes dependendo de uma condição.
Isso faz com que o computador execute certos comandos apenas quando o resultado de um teste for verdadeiro.

Comando IF (SE)
O comando if executa um bloco de instruções somente se a condição for verdadeira.
Se a condição for falsa, os comandos dentro do bloco não são executados.

Exemplo:

```java
if (idade >= 18) {
    System.out.println("Maior de idade");
}
```

Comando IF – ELSE (SE – SENÃO)
O comando else é usado junto com o if para criar dois caminhos possíveis:
– IF: executa se a condição for verdadeira
– ELSE: executa se a condição for falsa

Exemplo:

```java
if (idade >= 18) {
    System.out.println("Maior de idade");
} else {
    System.out.println("Menor de idade");
}
```

Múltiplos IF – ELSE
É possível ter várias condições seguidas, criando uma cadeia de decisões.
Essas estruturas são conhecidas como IF aninhados.

Exemplo:

```java
if (nota >= 9) {
    System.out.println("Excelente");
} else if (nota >= 7) {
    System.out.println("Bom");
} else if (nota >= 5) {
    System.out.println("Regular");
} else {
    System.out.println("Reprovado");
}
```

Resumo

* if: executa quando a condição é verdadeira
* else: executa quando a condição é falsa
* múltiplos if-else: usados para testar várias condições em sequência
