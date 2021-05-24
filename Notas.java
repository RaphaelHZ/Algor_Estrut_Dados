import java.util.ArrayList;
import java.util.Scanner;

public class Notas {
    public static void main(String[] args){
        ArrayList lista = new ArrayList();
        Scanner ler = new Scanner(System.in);
        int[] nota = new int[4];
        for (int i = 0 ; i < 4 ; i++){
            System.out.print("Digite a "+ (i+1) +" nota: ");
            nota[i] = ler.nextInt();
        }
        for (int i = 0 ; i < 4 ; i++){
            System.out.println("Nota " + (i+1) + " = " + nota[i]);
        }
    }
} 