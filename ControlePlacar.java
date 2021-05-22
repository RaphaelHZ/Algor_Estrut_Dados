import java.util.Scanner;

public class ControlePlacar{
    public static void main(String args[]){
        Placar meuPlacar = new Placar(10);
        Scanner op = new Scanner(System.in);
        int opcao;
        int x = 0;
        
        while (x < 4){
            mostraMenu();    
            opcao = op.nextInt();
            if (opcao == 1) {
                System.out.print("Qual o valor da pontuação a inserir: ");
                meuPlacar.adicionaPlacar(op.nextInt());
                System.out.println("Pontuação Inserida \n");
            }
            else if (opcao == 2) {
                meuPlacar.mostraPlacar();
                System.out.println("");
            }
            else if (opcao == 3) {
                meuPlacar.ordenar();
                System.out.println("Placar ordenado");
            }
            else if (opcao == 4) {
                System.out.print("Recuperar valor de qual posição do array: ");
                int pos = op.nextInt();
                System.out.println("O valor da posição "+ pos + " -> "+ meuPlacar.recupera(pos));
                System.out.println("");
            }
            else if (opcao == 5) x = 99;
        }
    }    

    private static void mostraMenu() {
        System.out.println("[1] Inserir Pontuação [2] Listar Pontuação [3] Ordenar Array [4] Recuperar Pontuação [5] Encerrar");
        System.out.print("Qual sua opção -> ");
    }
}
