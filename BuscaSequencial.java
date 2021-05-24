import java.util.Random;
import java.util.Scanner;

public class BuscaSequencial {
    public static void main(String[] args){
        int[] meuVertorzao = new int[20000];
        int busca;
        boolean achei = false;

        Random gerador = new Random();
        Scanner valor = new Scanner(System.in);

        for (int i = 0 ; i < meuVertorzao.length ; i++){
            meuVertorzao[i] = gerador.nextInt(300);
        }
        System.out.print("Qual valor deseja saber se está no vetor: ");
        //busca = valor.nextInt();
        busca = gerador.nextInt(300);
        for (int ponteiro = 0 ; ponteiro < meuVertorzao.length ; ponteiro++) {
            if (meuVertorzao[ponteiro] == busca) {
                System.out.println("Encontrado o valor: " + busca + " na posição: " + ponteiro);
                achei = true;

            }
        }
        if (!achei) {
            System.out.println("Valor " + busca + " não localizado no vetor.");
        }

    }

}
