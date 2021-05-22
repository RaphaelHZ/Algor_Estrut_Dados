import java.util.Scanner;

public class RecordesTeste {
    public static void main(String[] args){

        Scanner op = new Scanner(System.in);
        int menu;
        int aux;
        int[] recorde = new int[10];

        while(true) {
            System.out.println("PLACAR");
            System.out.println("1 - Mostar a tabela de pontos");
            System.out.println("2 - Incluir nova pontuação");
            System.out.println("3 - Apagar todos os pontos");
            System.out.println("Para sair aperte outra tecla");
            System.out.println("");
            System.out.print("Digite sua opção: ");
            menu = op.nextInt();
            System.out.println("");

            if (menu == 1) {
                System.out.println("LISTA DE RECORDES");
                for (int i = 0; i < recorde.length; i++) {
                    System.out.println((i+1) + "ª Posição: " + recorde[i]);
                }
            } else if (menu == 2) {
                System.out.print("Informe a nova pontuação: ");
                int novovalor = op.nextInt();
                for (int i = 0; i < recorde.length; i++) {
                    if (novovalor > recorde[i]) {
                        aux = recorde[i];
                        recorde[i] = novovalor;
                        novovalor = aux;
                    }
                }
            } else if (menu == 3) {
                for (int i = 0; i < recorde.length; i++) {
                    recorde[i] = 0;
                }
            } else {
                break;
            }
        }
    }
}  