//percorre esquerda p/ direita comparando adjacentes
// se ta em ordem avança, se não troca e volta uma "casa"

public class GnomeSort {
    public static int trocasFeitas;

    static void gnomeSort(int tamanho, int[] vetor){
        int i = 0;
        while (i < tamanho){
            if (i == 0 || vetor[i - 1] <= vetor[i]){
                i++;
            }
            else {
                int temp = vetor[i];
                vetor[i] = vetor[i - 1];
                vetor[--i] = temp;
                trocasFeitas++;
            }
        }
    }
}
