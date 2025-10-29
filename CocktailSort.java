//percorre indo e voltando, esquerda p/ direita comparando
//troca os que tao fora de odem, maior vai pro fim
//percorre direita p/ esquerda comparando e trocando
//menor fica no inicio

public class CocktailSort {
    public static int trocasFeitas;
    public static int iteracoesFeitas;

    static void cocktailSort(int tamanho, int[] vetor) {
        trocasFeitas = 0;
        iteracoesFeitas = 0;
        boolean trocou = true;
        int inicio = 0;
        int fim = tamanho - 1;

        while (trocou) {
            trocou = false;

            int i = inicio;
            while (i < fim) {
                iteracoesFeitas++; // cada comparação entre pares
                if (vetor[i] > vetor[i + 1]) {
                    int temp = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = temp;
                    trocasFeitas++;
                    trocou = true;
                }
                i++;
            }
            if (!trocou) {
                break; //ta no exemplo do slide
            }
            trocou = false;
            fim--;

            i = fim;
            while (i > inicio) {
                iteracoesFeitas++; // comparação inversa
                if (vetor[i] < vetor[i - 1]) {
                    int temp = vetor[i];
                    vetor[i] = vetor[i - 1];
                    vetor[i - 1] = temp;
                    trocasFeitas++;
                    trocou = true;
                }
                i--;
            }
            inicio++;
        }
    }
}
