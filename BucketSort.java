//ordena elementos em buckets (usando 5 pq é um bom valorp para agrupar eles)
//ordena os que estiverem desordenados usando bubblesort em buckets separados
//se nao usar bubblesort faz recursao do bucketsort, no fim junta tudo em ordem

public class BucketSort {
    static final int b = 5; //b p/ representar bucket
    public static int trocasFeitas;

    static void bucketSort(int tamanho, int[] vetor, int min, int max) {
        trocasFeitas = 0;

        int div = (max - min) / b;
        if (div == 0) div = 1;

        int[][] buckets = new int[b][tamanho];
        int[] contagem = new int[b];

        for (int i = 0; i < tamanho; i++) {
            int indice = (vetor[i] - min) / div;
            if (indice < 0) indice = 0;
            else if (indice >= b) indice = b - 1;

            buckets[indice][contagem[indice]++] = vetor[i];
        }
        //Bublle Sort p/ ordenar cada bucket
        for (int i = 0; i < b; i++) {
            if (contagem[i] > 0) {
                BubbleSort.bubbleSort(contagem[i], buckets[i]);
                trocasFeitas += BubbleSort.trocasFeitas;
            }
        }

        int k = 0;
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < contagem[i]; j++) {
                vetor[k++] = buckets[i][j];
            }
        }
    }
}
