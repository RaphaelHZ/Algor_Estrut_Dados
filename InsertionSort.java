import java.util.Random;

public class InsertionSort {
    public static void main(String[] args) {
        Random gerador = new Random();
        int[] vetor = new int[10];

        //random pra preencher o vetor
        for (int x = 0; x < vetor.length; x++) {
            vetor[x] = gerador.nextInt(50);
        }

        //ordenação
        int posAnterior, valor;
        for (int posAtual = 1; posAtual < vetor.length; posAtual++) {
            valor = vetor[posAtual];
            posAnterior = posAtual - 1;
            mostraVetor(vetor);
            while ((posAnterior >= 0) && (vetor[posAnterior] > valor)) {
                vetor[posAnterior + 1] = vetor[posAnterior];
                posAnterior = posAnterior - 1;
            }
            vetor[posAnterior + 1] = valor;
        }
        mostraVetor(vetor);
    }
    //impressão dos valores ordenados
    private static void mostraVetor(int[] v) {
        System.out.print("VETOR: [");
        for (int cont = 0; cont < v.length; cont++){
            System.out.print(v[cont]);
            if (cont < v.length -1) System.out.print(",");
        }
        System.out.println("]");
    }
}
