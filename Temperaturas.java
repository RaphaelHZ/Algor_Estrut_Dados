import java.util.Random;
/**
 * Escreva uma descrição da classe Temperaturas aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Temperaturas
{
    public static void main(String[] args){
        int min = -2;
        int max = 45;
        int temp;
        Random aleatorio = new Random();
        
        for (int x = 0 ; x < 10 ; x++){
            temp = aleatorio.nextInt(max - min) + min;
            System.out.println(temp);
        }

        int maximas[] = new int[7];
        int minimas[] = new int[7];
        
        for (int i = 0 ; i < 7 ; i++){
            temp = aleatorio.nextInt(max - min) + min;
            maximas[i] = temp;
            ///
            if (temp < maximas[i]){
                
                temp = aleatorio.nextInt(max - min) + min;
                minimas[i] = temp;
                ///
            }
        }
    }
}
