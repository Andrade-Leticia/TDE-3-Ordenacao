//ordena elementos em buckets (usando 5 pq é um bom valorp para agrupar eles)
//ordena os que estiverem desordenados usando bubblesort em buckets separados
//se nao usar bubblesort faz recursao do bucketsort, no fim junta tudo em ordem

public class BucketSort {
    static final int b = 5; //b p/ representar bucket
    public static int trocasFeitas;
    public static int iteracoesFeitas;

    static void bucketSort(int tamanho, int[] vetor, int min, int max) {
        trocasFeitas = 0;
        iteracoesFeitas = 0;

        int div = (max - min) / b;
        if (div == 0) div = 1;

        int[][] buckets = new int[b][tamanho];
        int[] contagem = new int[b];

        for (int i = 0; i < tamanho; i++) {
            iteracoesFeitas++; // cada elemento analisado
            int indice = (vetor[i] - min) / div;
            if (indice < 0) indice = 0;
            else if (indice >= b) indice = b - 1;

            buckets[indice][contagem[indice]++] = vetor[i];
        }
        //Bublle Sort p/ ordenar cada bucket
        for (int i = 0; i < b; i++) {
            iteracoesFeitas++; // uma iteração por bucket
            if (contagem[i] > 0) {
                BubbleSort.bubbleSort(contagem[i], buckets[i]);
                trocasFeitas += BubbleSort.trocasFeitas;
                iteracoesFeitas += BubbleSort.iteracoesFeitas; // soma as iterações do Bubble Sort
            }
        }

        int k = 0;
        for (int i = 0; i < b; i++){
            iteracoesFeitas++;
            for (int j = 0; j < contagem[i]; j++){
                iteracoesFeitas++;
                vetor[k++] = buckets[i][j];
            }
        }
    }
}
