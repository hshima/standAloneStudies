# Collections API

## Introduction

Como a própria Oracle declada na propriedade content, sobre a página de tutoriais, o conteúdo a ser revisado será: `This collections Java tutorial describes interfaces, implementations, and algorithms in the Java Collections framework`.

> A collection — sometimes called a container — is simply an object that groups multiple elements into a single unit. Collections are used to store, retrieve, manipulate, and communicate aggregate data. Typically, they represent data items that form a natural group, such as a poker hand (a collection of cards), a mail folder (a collection of letters), or a telephone directory (a mapping of names to phone numbers). If you have used the Java programming language — or just about any other programming language — you are already familiar with collections.

### Collections Framework

Serão abordas
- Interfaces
- Implementations
- Algorithms

### Interfaces

![link](https://docs.oracle.com/javase/tutorial/figures/collections/colls-coreInterfaces.gif)

A árvore de hierarquia das interfaces filhas de Collection e Map demonstradas na imagem permitem ter uma visão geral sobre as interfaces de alto nível que trabalham com séries de dados.

O primeiro ponto relevante é que todas as interfaces core da API usam generics:

```java
public interface Collection<E>
```

Esse recurso permite que sejam designados tipos dessa forma permite que o compilador verifique o tipo de objeto, reduzindo a ocorrência de erros durante Runtime.

Importante ressaltar que esse recurso é empregado a partir do Java 1.8, então versões mais antigas podem precisar de tratamento com base na referência de Generics.

Para manter as bibliotecas padrão enxuta, não são providas interfaces separadas para cada cada variante de Collections, sendo que cada classe filha pode suportar ou não a implementação de algum método. Nesse caso, será lançada uma [`UnsupportedOperationException` (link)](https://docs.oracle.com/javase/8/docs/api/java/lang/UnsupportedOperationException.html), que é documentada por cada implementação.

Interfaces que descrevem Collection:
- Collection\
    É a raiz da hierarquia de Collection. Uma Collection representa um grupo de objetos compostos por elementos (`elements`). É o tipo mais amplo do framework e não fornece nenhuma implementação direta, mas interfaces de especializações. Isso permite que ocorra maior flexibilidade na utilização das classes descendentes e, se necessário, interação entre si.
- Set\
    É uma Collection que não contém elementos duplicados. Essa interface é uma abstração do modelo matemático de conjunto (Set).
    - SortedSet

    É um Set que mantém seus elementos em ordem  ascendente. São implementados métodos que provêem e aproveitam dessa ordenação.
- List\
    É uma Collection ordenada (sequência, similar ao `array`). Normalmente dá controle à posição de cada elemento.
- Queue\
    É uma Collection destinada a aramazenar elementos antes de seu processamento. Provê métodos específicos de interação, como FIFO (First-In, First-Out). Especializações como `PriorityQueue` ordenam a lista de acordo com o critério passado em `Comparator` ou a `ordem natural` (Natural Order), não seguindo a regra FIFO.
    
    Toda implementação de `Queue` deve especificar as propriedades de ordenação.
- Deque\
    É uma Collection usada para armazenar múltiplos elementos antes de serem processados. Provê métodos adicionais de inserção, ExtRação e operações de inspeção.
    Podem implementar FIFO, LIFO (Last-In, Fist-Out). Em um Deque, todos os elementos podem ser inseridos e removidos em ambas as pontas.
- Map\
    Um `Object` (Objeto) que mapeia elementos na estrutura `chave:valor`. Essa estrutura não permite keys (chaves) duplicadas. Cada chave pode armazenar até um valor.
    - SortedMap
    
    É uma Map que ordena os itens de forma alfanumérica ascendente pela chave. É utilizada para ordenações de Colletion utilizando como critério `Natural Order` de pares `chave:valor`.


# References
Oracle. **The Java™ Tutorials : Collections**. Oracle, 2020. Disponível em: https://docs.oracle.com/javase/tutorial/collections/intro/index.html. Acesso em: 16 mar. 2021