import java.util.Random;
import java.util.Scanner;

public class BuscaBinaria {
    public static void main(String[] args) {
        int[] meuVertorzao = new int[20000];
        int busca;
        boolean achei = false;

        Random gerador = new Random();
        Scanner valor = new Scanner(System.in);
        meuVertorzao[0] = 4;
        for (int i = 1; i < meuVertorzao.length; i++) {
            int anterior = meuVertorzao[(i-1)];
            meuVertorzao[i] = anterior + gerador.nextInt(10)+1;
        }
        System.out.print("Qual valor deseja saber se está no vetor: ");
        busca = valor.nextInt();
        int resultado = buscaBinaria(meuVertorzao, meuVertorzao.length, busca);
        if (resultado == 0){
            System.out.println("Valor " + busca + " não localizado.");
        } else System.out.println("Valor " + busca + " localizado no índice ["+ resultado+"]");
    }

    public static int buscaBinaria(int[] v, int n, int x){
        int inf = 0, sup = n-1, meio;
        while (inf <= sup){
            meio = (inf + sup) / 2;
            if (x == v[meio]) {
                return meio;
            } else if (x < v[meio]) {
                sup = meio - 1;
            } else inf = meio + 1;
        }
    return 0;
    }

}