
---

````markdown
# Paradigmas de Programação: Estruturado x Orientado a Objetos

## Paradigma Estruturado
- Baseado em funções e procedimentos.
- Foco na sequência lógica de comandos.
- Os dados e as funções que os manipulam são separados.
- Exemplo: Linguagens como C e Pascal.

### Desvantagens
- Dificuldade na manutenção e reutilização do código.
- Pouca flexibilidade para projetos grandes.

---

## Paradigma Orientado a Objetos (OO)

A Programação Orientada a Objetos reflete o mundo real, representando entidades (pessoas, animais, produtos etc.) como objetos.

### Vantagens da Orientação a Objetos
- Reflete o mundo real de forma mais natural.
- Facilita a manutenção e evolução do código.
- Favorece a reutilização de código.
- Aumenta a modularidade e a organização do projeto.

---

## Conceitos Fundamentais da OO

### Classe
- É a **descrição de um grupo de objetos** com características e comportamentos semelhantes.
- Define **atributos** (dados, propriedades) e **métodos** (ações, comportamentos).

**Estrutura básica de uma classe:**
```java
public class Cachorro {
    // Atributos
    String nome;
    String raca;
    int idade;

    // Métodos (comportamentos)
    void latir() {
        System.out.println("O cachorro está latindo!");
    }

    void dormir() {
        System.out.println("O cachorro está dormindo...");
    }
}
````

**Explicação:**

* A classe `Cachorro` descreve como será um objeto cachorro.
* `nome`, `raca` e `idade` são atributos.
* `latir()` e `dormir()` são métodos (ações do cachorro).

---

### Objeto

* É uma **instância** de uma classe, ou seja, um exemplar concreto.

**Exemplo:**

```java
public class TesteCachorro {
    public static void main(String[] args) {
        Cachorro dog = new Cachorro();
        dog.nome = "Rex";
        dog.raca = "Labrador";
        dog.idade = 3;

        dog.latir();
    }
}
```

**Saída esperada:**

```
O cachorro está latindo!
```

---

### Herança

* Permite **reutilizar a estrutura e o comportamento** de uma classe existente.
* Uma classe "filha" herda atributos e métodos de uma classe "pai".

**Exemplo:**

```java
// Classe pai
public class Animal {
    void emitirSom() {
        System.out.println("Som genérico de animal");
    }
}

// Classes filhas
public class Cachorro extends Animal {
    void emitirSom() {
        System.out.println("Cachorro latindo");
    }
}

public class Gato extends Animal {
    void emitirSom() {
        System.out.println("Gato miando");
    }
}
```

---

### Polimorfismo

* É a **habilidade de um mesmo método** se comportar de maneiras diferentes dependendo do objeto que o executa.

**Exemplo:**

```java
public class TesteAnimal {
    public static void main(String[] args) {
        Animal a1 = new Cachorro();
        Animal a2 = new Gato();

        a1.emitirSom(); // Cachorro latindo
        a2.emitirSom(); // Gato miando
    }
}
```

**Saída esperada:**

```
Cachorro latindo
Gato miando
```

---

## Organização de Pacotes no Java

Os pacotes são usados para **organizar classes** de forma lógica dentro de um projeto.

**Convenção de nomenclatura:**

```
domínio + nomeDoProjeto + nomeDoMódulo
```

**Exemplo:**

```
com.loiane.cursojava.aula09
```

**Estrutura de pastas correspondente:**

```
src/
 └── com/
      └── loiane/
           └── cursojava/
                └── aula09/
                     └── Cachorro.java
```

---

## Resumo Geral

| Conceito     | Descrição                                                   |
| ------------ | ----------------------------------------------------------- |
| Classe       | Modelo que define os atributos e comportamentos dos objetos |
| Objeto       | Instância concreta de uma classe                            |
| Herança      | Reutilização de código entre classes                        |
| Polimorfismo | Um mesmo método com comportamentos diferentes               |
| Pacotes      | Organização de classes dentro de um projeto                 |

---

```
