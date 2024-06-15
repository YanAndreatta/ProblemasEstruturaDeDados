# Estrutura de dados

Alguns problemas que podem ser resolvidos com o que foi estudado de Estrutura de dados, LinkedLists, Stacks, Queues e Trees;

## Resolvendo Problemas

**Estes são os problemas propostos.**

1. Balanceamento de colchetes em uma expressão.

2. Revertendo os primeiros elementos de uma fila.

3. Maior valor em cada nível da Árvore Binária.

## Balanceamento de colchetes em uma expressão

Dada uma string de expressão exp, escreva um programa para examinar se os pares e as ordens de "{", "}", "(", ")", "[", "]" estão correntos na expressão dada.

```text
1. **2*(3+4+5*[2+3)]**

2. **[2*(3+4+5*[2+3]/(2+(3+(7+5)*9)*6)*[5+8]+17)+2]**
```

### Solução 1

1. Empilhar caracteres de abertura;

2. Ao identificar caractere de fechamento:

    * desempilhar e verificar se coincide com abertura;

3. Ao final a pilha deve estar vazia.

## Revertendo os primeiro elementos de uma fila

Dado um inteiro k e uma fila de inteiros, a tarefa é inverter a ordem dos primeiros  k elementos da fila, deixando os demais elementos na mesma ordem relativa.

```text
1. [1, 2, 3, 4, 5] -> k = 2 -> [2, 1, 3, 4, 5]

2. [1, 2, 3, 4, 5] -> K = 4 -> [4, 3, 2, 1, 5]
```

### Solução 2

```text
queue = [1, 2, 3, 4, 5], k = 4
```

Algoritmo:

1. Para os K primeiros elementos:

    * desenfileirar elemento x
    * reordena (k-1) elementos
    * enfileirar elemento x

2. Para os N-K elementos:
    * desenfileirar
    * enfileirar

## Maior valor em cada nível da Árvore Binária

Dada uma árvore binária, encontre o maior valor em cada nível.

### Solução 3

Algoritmo:

1. Utilize o algoritmo BFS para percorrer a árvore e uma lista auxiliar.
2. Para cada elemento e seu nível na árvore:
    * Se a lista possuir o índice == nível, substitua pelo maior valor.
    * Senão adiciona na lista
