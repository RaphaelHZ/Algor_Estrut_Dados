import java.util.Scanner;


public class Operacoes
{
    public static void main(String[] args){
        int[] qtd = new int[]{3,10,1,8,7,2,5,4,9,6};
        double[] valor = new double[]{3.00,5.00,1.50,4.00,7.00,1.80,2.00,3.20,0.00,10.00};
        double[] subtotal = new double[10];
        
        for (int cont = 0; cont < qtd.length; cont++){
            subtotal[cont] = qtd[cont] * valor[cont];
        }
        
        for (int cont = 0; cont < qtd.length; cont++){
            System.out.println("Subtotal do produto {" + cont + "} = " + subtotal[cont]);
        }
        
    }
}
