//compara elementos entre gaps(começa tendo o valor do vetor), trocas feitas se precisar
// reduz o gap ate ele se tornar 1, depois ele vira Bubble Sort

public class CombSort {
    public static int trocasFeitas;

    static void combSort(int tamanho, int[] vetor){
        trocasFeitas = 0;
        int sorted = 0;
        int gap = tamanho;

        while (sorted == 0){
            gap = (int) (gap / 1.3); //1.3 valor redução material de apoio explics
            if (gap <= 1){
                gap = 1;
                sorted = 1;
            }

            for (int i = 0; i < tamanho - gap; i++){
                int sm = gap + 1; //sm variavel segundo elementop no material de apoio
                if (vetor[i] > vetor[sm]){
                    int aux = vetor[sm];
                    vetor[sm] = vetor[i];
                    vetor[i] = aux;
                    sorted = 0;
                    trocasFeitas++;
                }
            }
        }
    }
}
