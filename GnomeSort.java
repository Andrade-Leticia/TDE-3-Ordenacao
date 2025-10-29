//percorre esquerda p/ direita comparando adjacentes
// se ta em ordem avança, se não troca e volta uma "casa"

public class GnomeSort {
    public static int trocasFeitas;
    public static int iteracoesFeitas;

    static void gnomeSort(int tamanho, int[] vetor){
        trocasFeitas = 0;
        iteracoesFeitas = 0;
        int i = 0;

        while (i < tamanho) {
            iteracoesFeitas++;

            if (i == 0 || vetor[i - 1] <= vetor[i]) {
                i++;
            } else {
                int temp = vetor[i];
                vetor[i] = vetor[i - 1];
                vetor[i - 1] = temp;
                trocasFeitas++;
                i--;
            }
        }
    }
}


