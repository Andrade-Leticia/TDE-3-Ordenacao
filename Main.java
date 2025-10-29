public class Main {
    static void imprimir(String titulo, int[] v, int tamanho){ //v = vetor
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

        if (nome == "Comb Sort"){
            CombSort.combSort(tamanho,copia);
            System.out.println("Trocas feitas: " + CombSort.trocasFeitas);
        } else if (nome == "Gnome Sort"){
            GnomeSort.gnomeSort(tamanho, copia);
            System.out.println("Trocas feitas: " + GnomeSort.trocasFeitas);
        } else if (nome == "Bucket Sort"){
            BucketSort.bucketSort(tamanho,copia, minimo(copia, tamanho),maximo(copia, tamanho));
            System.out.println("Trocas feitas: " + GnomeSort.trocasFeitas);
        }else if (nome == "Bubble Sort"){
            BubbleSort.bubbleSort(tamanho, copia);
            System.out.println("Trocas feitas: " +BubbleSort.trocasFeitas);
        }else if (nome == "Selection Sort"){
            SelectionSort.selectionSort(tamanho, copia);
            System.out.println("Trocas feitas: " + SelectionSort.trocasFeitas);
        } else if (nome == "Cocktail Sort"){
            CocktailSort.cocktailSort(tamanho, copia);
            System.out.println("Trocas feitas: " + CocktailSort.trocasFeitas);
        }
        imprimir("Vetor foi ordenado por " + nome + ":", copia,tamanho);
    }

    public static void main(String[] args){
        int[] vetor1= {12, 18, 9, 25, 17, 31, 22, 27, 16, 13, 19, 23, 20, 30, 14, 11, 15, 24, 26, 28};
        int[] vetor2 = {5, 7, 9, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32};
        int[] vetor3 = {99, 85, 73, 60, 50, 40, 35, 30, 25, 20, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6};

        int[][] vetores = {vetor1, vetor2, vetor3};
        int tamanho = 20;
        String[] algoritmos = {"Comb Sort", "Gnome Stort", "Bucket Sort", "Bubble Sort", "Selection Sort", "Cocktail Sort"};

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
