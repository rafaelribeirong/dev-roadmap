```markdown
# Aula: Operadores em Java

## O que são operadores
São símbolos que indicam ao compilador que uma operação deve ser realizada, geralmente entre variáveis ou valores.

---

## Operadores Aritméticos

| Operador | Descrição | Explicação |
|-----------|------------|------------|
| + | Adição | Soma dois valores. Exemplo: 5 + 3 resulta em 8. |
| - | Subtração | Subtrai o segundo valor do primeiro. Exemplo: 5 - 2 resulta em 3. |
| * | Multiplicação | Multiplica dois valores. Exemplo: 4 * 2 resulta em 8. |
| / | Divisão | Divide o primeiro valor pelo segundo. Exemplo: 10 / 2 resulta em 5. |
| % | Módulo | Retorna o resto da divisão. Exemplo: 10 % 3 resulta em 1. |
| ++ | Incremento | Aumenta o valor de uma variável em 1. Pode ser pré (++x) ou pós (x++). |
| -- | Decremento | Diminui o valor de uma variável em 1. Pode ser pré (--x) ou pós (x--). |

---

## Operadores Relacionais

| Operador | Descrição | Explicação |
|-----------|------------|------------|
| == | Igual a | Retorna verdadeiro se os valores forem iguais. |
| != | Diferente de | Retorna verdadeiro se os valores forem diferentes. |
| > | Maior que | Retorna verdadeiro se o primeiro valor for maior que o segundo. |
| < | Menor que | Retorna verdadeiro se o primeiro valor for menor que o segundo. |
| >= | Maior ou igual a | Retorna verdadeiro se o primeiro valor for maior ou igual ao segundo. |
| <= | Menor ou igual a | Retorna verdadeiro se o primeiro valor for menor ou igual ao segundo. |

---

## Operadores Lógicos

| Operador | Descrição | Explicação |
|-----------|------------|------------|
| && | E lógico | Retorna verdadeiro se ambas as condições forem verdadeiras. |
| || | Ou lógico | Retorna verdadeiro se pelo menos uma das condições for verdadeira. |
| ! | Negação | Inverte o valor lógico. Se for verdadeiro, passa a falso, e vice-versa. |

---

## Operadores de Assignment (Atribuição)

| Operador | Descrição | Explicação |
|-----------|------------|------------|
| = | Atribuição simples | Atribui um valor a uma variável. Exemplo: x = 5. |
| += | Atribuição com adição | Soma e atribui o resultado. Exemplo: x += 3 é o mesmo que x = x + 3. |
| -= | Atribuição com subtração | Subtrai e atribui o resultado. Exemplo: x -= 2 é o mesmo que x = x - 2. |
| *= | Atribuição com multiplicação | Multiplica e atribui o resultado. Exemplo: x *= 4 é o mesmo que x = x * 4. |
| /= | Atribuição com divisão | Divide e atribui o resultado. Exemplo: x /= 2 é o mesmo que x = x / 2. |
| %= | Atribuição com módulo | Calcula o resto e atribui o resultado. Exemplo: x %= 3 é o mesmo que x = x % 3. |

---

## Precedência de Operadores
A precedência define a ordem em que as operações são executadas.  
Quando há mais de um operador na mesma expressão, o Java segue esta ordem:

1. Parênteses `()`
2. Pós-incremento e pós-decremento `x++` `x--`
3. Pré-incremento e pré-decremento `++x` `--x`
4. Multiplicação, divisão e módulo `*` `/` `%`
5. Adição e subtração `+` `-`
6. Operadores relacionais `>` `<` `>=` `<=`
7. Igualdade e diferença `==` `!=`
8. Lógicos `&&` `||`
9. Atribuição `=`, `+=`, `-=`, `*=`, `/=`, `%=` 

# Operadores Relacionais em Java

| Operador | Descrição | Explicação |
|-----------|------------|------------|
| == | Igual a | Retorna verdadeiro se os dois valores forem iguais. |
| != | Diferente de | Retorna verdadeiro se os valores forem diferentes. |
| > | Maior que | Retorna verdadeiro se o primeiro valor for maior que o segundo. |
| < | Menor que | Retorna verdadeiro se o primeiro valor for menor que o segundo. |
| >= | Maior ou igual que | Retorna verdadeiro se o primeiro valor for maior ou igual ao segundo. |
| <= | Menor ou igual que | Retorna verdadeiro se o primeiro valor for menor ou igual ao segundo. |

---

## Exemplo com incremento

```java
System.out.println(resultado++);
System.out.println(++resultado);

# Operadores Lógicos em Java

| Operador | Descrição | Explicação |
|-----------|------------|------------|
| & | AND | Retorna verdadeiro se ambas as expressões forem verdadeiras. |
| | | OR | Retorna verdadeiro se pelo menos uma das expressões for verdadeira. |
| ^ | XOR | Retorna verdadeiro se apenas uma das expressões for verdadeira. |
| || | OR curto-circuito | Avalia a segunda expressão somente se a primeira for falsa. |
| && | AND curto-circuito | Avalia a segunda expressão somente se a primeira for verdadeira. |
| ! | NOT | Inverte o valor lógico: se for verdadeiro, vira falso, e vice-versa. |

---

## Exemplo de uso

```java
int a = 5;
int b = 10;

System.out.println(a > 0 && b > 0); // verdadeiro
System.out.println(a > 0 || b < 0); // verdadeiro
System.out.println(!(a > 0));       // falso
System.out.println(a > 0 ^ b < 0);  // verdadeiro

# Tabela Verdade – Operadores Lógicos em Java

| a | b | a & b | a \| b | a ^ b | !a |
|---|---|--------|--------|--------|----|
| Falso | Falso | Falso | Falso | Falso | Verdadeiro |
| Verdadeiro | Falso | Falso | Verdadeiro | Verdadeiro | Falso |
| Falso | Verdadeiro | Falso | Verdadeiro | Verdadeiro | Verdadeiro |
| Verdadeiro | Verdadeiro | Verdadeiro | Verdadeiro | Falso | Falso |

```
