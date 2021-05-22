import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        System.out.println("Hello World");
        JOptionPane.showMessageDialog(null,"Bem-Vindo à Programação\nJava por Janelas");
        String nome = JOptionPane.showInputDialog("Informe o seu nome");
        System.out.println(nome);
        /* System.out.println(JOptionPane.showInputDialog("Informe o seu nome")); */
    }
}
