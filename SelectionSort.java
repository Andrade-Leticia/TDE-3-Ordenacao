//compara um valor com todos
//encontra o maior/menor enquanto caminha

public class SelectionSort {
    public static int trocasFeitas;

    static void selectionSort(int tamanho, int[] vetor){
        trocasFeitas = 0;

        for (int i = 0; i < tamanho - 1; i++){
            int minIndex = i;
            for (int j = i + 1; j < tamanho; j++){
                if (vetor[j] < vetor[minIndex]){
                    minIndex = j;
                }
            }

            if (minIndex != i){
                int temp = vetor[i];
                vetor[i] = vetor[minIndex];
                vetor[minIndex] = temp;
                trocasFeitas++;
            }

        }
    }
}
