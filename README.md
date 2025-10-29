# TDE 03 - Ordenação
---
### Feito por: 
- Leticia Maria Maia de Andrade Vieira
---
## Objetivo
- Comparar o desempenho de diversos algoritmos de ordenação sugeridos, e depois avaliar a eficiência de cada um deles e quantas trocas foram realizadas para sua ordenação organizada.
---
## Algoritmos usados
- Comb Sort: 
  - melhora o "Bubble Sort", eliminando as "tartarugas" ou os pequenos valores que estão próximos do final da listal. Reordena diferentes pares, separados por um salto (gap), que é calculado a cada passagem;
  - Elementos comparados sempre tem um gap de distância de 1
- Gnome Sort:
  - compara os elementos em duplas, quando o elemento maior está antes que o menor, ele realiza a troca de posições, volta ao elemento trocado e percorre novamente até que todos estejam em sua posição correta;
  - usa uma sequência grande de trocas até ordenar todo o vetor.
- Bucket Sort:
  - divide o vetor em um número determinado de "baldes", onde cada um é ordenado usando um algoritmo diferente ou então usando o próprio algoritmo bucket fazendo a recursão.
- Bubble Sort:
  - percorre o vetor diversas vezes levando o maior elemento para o topo;
  - não recomendado para projetos que precisem de velocidade, ou operem com muita quantidade de dados.
- Selection Sort:
  - ele funciona passando o elemento requerido (maior ou menor) para o início do vetor;
  - usa dois laços para percorrer, o externo que controla o índice do topo, e o interno que percorre todo o vetor.
- Cocktail Sort:
  - variação do "Bubble Sort";
  - ordena em ambas as direções a cada iteração.
---
## Valores usados para comparação
vetor1: {12, 18, 9, 25, 17, 31, 22, 27, 16, 13, 19, 23, 20, 30, 14, 11, 15, 24, 26, 28};

vetor2 = {5, 7, 9, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32}. 

vetor3 = {99, 85, 73, 60, 50, 40, 35, 30, 25, 20, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6};

## Comparação de trocas feitas

| Algoritmo | Vetor1 | Vetor2 | Vetor3 |
| --------- | ------ | ------ | ------ |
| Comb Sort | 22     | 0      | 18     | 
| Gnome Sort | 0 | 0 | 0 |
| Bucket Sort | 13 | 0 | 63 |
| Bubble Sort | 78 | 0 | 190 |
| Selection Sort | 18 | 0 | 10 |
| Cocktail Sort | 78 | 0 | 190 |

## Comparação de iterações
| Algoritmo | Vetor1 | Vetor2 | Vetor3 |
| --------- | ------ | ------ | ------ |
| Comb Sort | 129 | 110 | 129 | 
| Gnome Sort | 0 | 0 | 0 |
| Bucket Sort | 83 | 86 | 113 |
| Bubble Sort | 190 | 190 | 190 |
| Selection Sort | 190 | 190 | 190 |
| Cocktail Sort | 154 | 19 | 190 |

## Análise de resultados
-
