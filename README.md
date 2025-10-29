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
| Gnome Sort | 78 | 0 | 190 |
| Bucket Sort | 13 | 0 | 63 |
| Bubble Sort | 78 | 0 | 190 |
| Selection Sort | 18 | 0 | 10 |
| Cocktail Sort | 78 | 0 | 190 |

## Comparação de iterações
| Algoritmo | Vetor1 | Vetor2 | Vetor3 |
| --------- | ------ | ------ | ------ |
| Comb Sort | 129 | 110 | 129 | 
| Gnome Sort | 176 | 20 | 400 |
| Bucket Sort | 83 | 86 | 113 |
| Bubble Sort | 190 | 190 | 190 |
| Selection Sort | 190 | 190 | 190 |
| Cocktail Sort | 154 | 19 | 190 |

## Análise de resultados
- Vetor1:
  - Melhor algoritmo para esse vetor foi o Bucket Sort (13 trocas e 83 iterações).

- Vetor2:
  - Esse vetor já estava ordenado, o que significa que não foram feitas trocas em nenhum algoritmo;
  - Algoritmo com o menor número de iterações foi o Cocktail Sort com 19 iterações.

- Vetor3:
  - Melhor algoritmo para trocas foi o Selection Sort com 10 trocas feitas;
  - Melhor algoritmo para iterações foi o Bucket Sort com 113 iterações;
  - O melhor algoritmo no geral para esse vetor seria o Selection Sort pois ele teve um número muito menor de trocas.

- Análise geral:
  - O algoritmo Bucket Sort obteve o melhor equilíbrio entre trocas e iterações nos três vetores apresentados no projeto, com isso concluímos que para este cenário, ele seria a melhor opção para ordenação.
    
  - Resultado geral:
    | Algoritmo | Desempenho |
    | --------- | ---------- |
    | Bucket Sort	| Melhor no Vetor 1, bom desempenho geral. |
    | Cocktail Sort	| Melhor no Vetor 2, ótimo quando o vetor já está ordenado. |
    | Selection Sort |	Melhor no Vetor 3, poucas trocas mas muitas iterações. |
    | Comb Sort |	Razoável em todos, mas nunca o melhor. |
    | Gnome / Bubble Sort	| Muito custosos (muitas trocas e iterações). |
    
