import java.util.Arrays;

public class Jogador {
    private String[] jogador;

    public Jogador (int tamanho){
        jogador = new String[tamanho];
    }

    public void mostraJogadores(){
        System.out.println("******MELHORES PONTUAÇÕES******");
        for (int i = 0; i < jogador.length; i++){
            System.out.print(jogador[i] + " | ");
        }
    }

    public void adicionaJogador(String nome){
        for (int i = 0; i < jogador.length; i++){
            if(jogador[i] == null) {
                jogador[i] = nome;
                break;
            }
        }

    }

    public void ordenar(){
        Arrays.sort(jogador);
        for (int esq = 0, dir = jogador.length-1; esq < dir; esq ++, dir --){
            String temp = jogador[esq]; jogador[esq] = jogador[dir]; jogador[dir] = temp;
        }
    }

    public String recupera(int indice){
        return jogador[indice];
    }
}
