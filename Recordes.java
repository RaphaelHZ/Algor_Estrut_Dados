import java.util.Scanner;

public class Recordes {
    public static void main(String[] args){
        String[][] recordes = new String[5][2];    
        Scanner input = new Scanner(System.in);
        
        for (int lin = 0; lin < recordes.length ; lin++){
            for (int col = 0; col < recordes[lin].length ; col++){
                if (col == 0){
                    System.out.print("Informe o nome do jogador: ");
                    recordes[lin][col] = input.next();
                } else {
                    System.out.print("Informe a pontuação do jogador: ");
                    recordes[lin][col] = input.next();
                }
            }
        }
        
        for (int lin = 0; lin < recordes.length ; lin++){
            for (int col = 0; col < recordes[lin].length ; col++){        
                if (col < recordes[lin].length - 1){
                    System.out.println("Nome:   " + recordes[lin][col]);
                } else {
                    System.out.println("Pontos: " + Integer.parseInt(recordes[lin][col]));
                }
            }
        }    
    }
}
