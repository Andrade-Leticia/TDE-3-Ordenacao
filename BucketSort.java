//ordena elementos em buckets (usando 5 pq é um bom valorp para agrupar eles)
//ordena os que estiverem desordenados usando bubblesort em buckets separados
//se nao usar bubblesort faz recursao do bucketsort, no fim junta tudo em ordem

public class BucketSort {
    static final int b = 5; //b p/ representar bucket
    public static int trocasFeitas;

    static void bucketSort(int tamanho, int[] vetor, int min, int max){
        trocasFeitas = 0;

        int i,j,k;
        int div = (max - min) / b;
        if (div == 0){
            div = 1;
        }
        int[][] buckets = new int[b][tamanho];
        int[] contagem = new int[b];
        i = 0;
        while (i < tamanho){
            int indice = (vetor[i] - min) / div;
            if (indice < 0){
                indice = 0;
            } else if (indice >= b){
                indice = b - 1;
            }
            buckets[indice][contagem[indice]] = vetor[i];
            contagem[indice]++;
            i++;
        }

        i = 0; //Bublle Sirt p/ ordenar cada bucket
        while (i < b){
            if (contagem[i] > 0){
                BubbleSort.bubbleSort(contagem[i],buckets[i]);
                trocasFeitas += BubbleSort.trocasFeitas;
            }
            i++;
        }

        k = 0;
        i = 0;
        while (i < b){
            j = 0;
            while (j < contagem[i]){
                vetor[k] = buckets[i][j];
                k++;
                j++;
            }
            i++;
        }
    }
}
