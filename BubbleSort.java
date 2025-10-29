// conjunto percorrido = n - 1
// compara i com sucessor, se i é maior, a troca de lugares é feita

public class BubbleSort {
    public static int trocasFeitas;
    public static int iteracoesFeitas;

    static void bubbleSort(int tamanho, int[] vetor){
        trocasFeitas = 0;
        iteracoesFeitas = 0;

        int i = 0;
        while (i < tamanho - 1) {
            int j = 1;
            while (j < tamanho - i) {
                iteracoesFeitas++;
                if (vetor[j - 1] > vetor[j]) {
                    int temp = vetor[j - 1];
                    vetor[j - 1] = vetor[j];
                    vetor[j] = temp;
                    trocasFeitas++;
                }
                j++;
            }
            i++;
        }
    }
}
