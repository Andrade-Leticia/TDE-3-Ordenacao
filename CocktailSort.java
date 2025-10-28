//percorre indo e voltando, esquerda p/ direita comparando
//troca os que tao fora de odem, maior vai pro fim
//percorre direita p/ esquerda comparando e trocando
//menor fica no inicio

public class CocktailSort {
    public static int trocasFeitas;

    static void cocktailSort(int tamanho, int[] vetor){
        trocasFeitas = 0;
        boolean trocou = true;
        int inicio = 0;
        int fim= tamanho - 1;
        int temp;

        while (trocou){
            trocou = false;
            for (int i = inicio; i < fim; i++){
                if (vetor[i] > vetor[i + 1]){
                    temp = vetor[i];
                    vetor[i] = vetor[i +1];
                    vetor[i + 1] = temp;
                    trocou = true;
                    trocasFeitas++;
                }
            }
            if (!trocou){
                break; //ta no exemplo do slide
            }

            trocou = false;
            fim--;

            for (int i = fim; i > inicio; i++){
                if (vetor[i] < vetor[i - 1]){
                    temp = vetor[i];
                    vetor[i] = vetor[i - 1];
                    vetor[i - 1] = temp;
                    trocasFeitas++;
                }
            }
            inicio++;
        }
    }
}
