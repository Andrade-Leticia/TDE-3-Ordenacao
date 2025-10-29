//compara um valor com todos
//encontra o maior/menor enquanto caminha

public class SelectionSort {
    public static int trocasFeitas;
    public static int iteracoesFeitas;

    static void selectionSort(int tamanho, int[] vetor){
        trocasFeitas = 0;
        iteracoesFeitas = 0;

        int i = 0;
        while (i < tamanho - 1) {
            int minIndex = i;
            int j = i + 1;

            while (j < tamanho) {
                iteracoesFeitas++; //comparação conta como iteração
                if (vetor[j] < vetor[minIndex]) {
                    minIndex = j;
                }
                j++;
            }

            if (minIndex != i) {
                int temp = vetor[i];
                vetor[i] = vetor[minIndex];
                vetor[minIndex] = temp;
                trocasFeitas++;
            }

            i++;
        }
    }
}
