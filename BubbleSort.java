import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {
        Random gerador = new Random();
        int[] vetor = new int[10];

        //random pra preencher o vetor
        for (int x = 0; x < vetor.length; x++) {
            vetor[x] = gerador.nextInt(250);
        }
        mostraVetor(vetor);
        int tamanho = vetor.length;
        int comparacoes = 0;
        int trocas = 0;
        for (int i = tamanho - 1; i >= 1; i--){
            for (int j = 0; j < i; j++){
                comparacoes++;
                if (vetor[j] > vetor[j + 1]){
                    int aux = vetor[j];
                    vetor[j] = vetor[j +1];
                    vetor[j + 1] = aux;
                    trocas++;
                }
            mostraVetor(vetor);
            }
        }
        mostraVetor(vetor);
        System.out.println("Comparações: " + comparacoes + "\nTrocas: " + trocas);

    }
    private static void mostraVetor(int[] v) {
        System.out.print("VETOR: [");
        for (int cont = 0; cont < v.length; cont++){
            System.out.print(v[cont]);
            if (cont < v.length -1) System.out.print(",");
        }
        System.out.println("]");
    }

}