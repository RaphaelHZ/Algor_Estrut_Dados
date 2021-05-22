import java.util.Scanner;

public class ControleJogadores{
    public static void main(String args[]){
        Jogador jogadores = new Jogador(10);
        Placar placar = new Placar(10);
        
        Scanner input = new Scanner(System.in);
        String nome;
        int pontos;
        for (int i = 0 ; i < 5 ; i++){
            System.out.print("Informe o Nome do Jogador : ");
            nome = input.next();
            System.out.print("Pontos: ");
            pontos = input.nextInt();
            jogadores.adicionaJogador(nome);
            placar.adicionaPlacar(pontos);
        }
        
        System.out.println("****** MELHORES JOGADORES ******");
        jogadores.mostraJogadores();
        placar.mostraPlacar();        
    }    
}
