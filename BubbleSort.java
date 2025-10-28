// conjunto percorrido = n - 1
// compara i com sucessor, se i é maior, a troca de lugares é feita

public class BubbleSort {
    public static int trocasFeitas;

    static void bubbleSort(int tamanho, int[] vetor){
        trocasFeitas = 0;
        int temp = 0;

        for (int i = 0; i < tamanho; i++){
            for (int j = 0; j < tamanho; j++){
                if (vetor[j - 1] > vetor[j]){
                    temp = vetor[j - 1];
                    vetor[j - 1] = vetor[j];
                    vetor[j] = temp;
                    trocasFeitas++;
                }
            }
        }
    }
}
