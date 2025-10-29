public class Main {
    static void imprimir(String titulo, int[] v, int tamanho){
        System.out.println(titulo);
        int i = 0;
        while (i < tamanho){
            System.out.println(v[i] + " ");
            i++;
        }
        System.out.println("\n");
    }
    static void copiar(int[] origem, int[] destino, int tamanho){
        int i = 0;
        while (i < tamanho){
            destino[i] = origem[i];
            i++;
        }
    }
    static int minimo(int[] v, int tamanho){
        int i = 1;
        int min = v[0];
        while (i < tamanho){
            if (v[i] < min){
                min = v[i];
            }
            i++;
        }
        return min;
    }
    static int maximo(int[] v, int tamanho){
        int i = 1;
        int max = v[0];
        while (i < tamanho){
            if (v[i] > max){
                max = v[i];
            }
            i++;
        }
        return max;
    }
    static void testar(String nome, int tamanho, int[] vetorOrigem){
        int[] copia = new int[tamanho];
        copiar(vetorOrigem, copia,tamanho);
        imprimir("Vetor original: ", copia, tamanho);

        int trocas = 0;
        int iteracoes = 0;

        if (nome == "Comb Sort"){
            CombSort.combSort(tamanho,copia);
            trocas = CombSort.trocasFeitas;
            iteracoes = CombSort.iteracoesFeitas;
        } else if (nome == "Gnome Sort"){
            GnomeSort.gnomeSort(tamanho, copia);
            trocas = GnomeSort.trocasFeitas;
            iteracoes = GnomeSort.iteracoesFeitas;
        } else if (nome == "Bucket Sort"){
            BucketSort.bucketSort(tamanho,copia, minimo(copia, tamanho),maximo(copia, tamanho));
            trocas = BucketSort.trocasFeitas;
            iteracoes = BucketSort.iteracoesFeitas;
        }else if (nome == "Bubble Sort"){
            BubbleSort.bubbleSort(tamanho, copia);
            trocas = BubbleSort.trocasFeitas;
            iteracoes = BubbleSort.iteracoesFeitas;
        }else if (nome == "Selection Sort"){
            SelectionSort.selectionSort(tamanho, copia);
            trocas = SelectionSort.trocasFeitas;
            iteracoes = SelectionSort.iteracoesFeitas;
        } else if (nome == "Cocktail Sort"){
            CocktailSort.cocktailSort(tamanho, copia);
            trocas = CocktailSort.trocasFeitas;
            iteracoes = CocktailSort.iteracoesFeitas;
        }
        System.out.println(" *** Resultado " + nome + " *** ");
        System.out.println(" Trocas: " + trocas );
        System.out.println(" Iterações: " + iteracoes );
        System.out.println(" -----------------------\n " );

    }

    public static void main(String[] args){
        int[] vetor1= {12, 18, 9, 25, 17, 31, 22, 27, 16, 13, 19, 23, 20, 30, 14, 11, 15, 24, 26, 28};
        int[] vetor2 = {5, 7, 9, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32};
        int[] vetor3 = {99, 85, 73, 60, 50, 40, 35, 30, 25, 20, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6};

        int[][] vetores = {vetor1, vetor2, vetor3};
        int tamanho = 20;
        String[] algoritmos = {"Comb Sort", "Gnome Sort", "Bucket Sort", "Bubble Sort", "Selection Sort", "Cocktail Sort"};

        int i  = 0;
        while (i < 3){
            System.out.println("Testando vetor: " + (i + 1) + "\n");
            int j = 0;
            while (j < 6){
                testar(algoritmos[j], tamanho, vetores[i]);
                j++;
            }
            i++;
        }
    }
}

