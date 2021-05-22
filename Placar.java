import java.util.Arrays;

public class Placar {
    private int[] placar;

    public Placar (int tamanho){
        placar = new int[tamanho];
    }

    public void mostraPlacar(){
        System.out.println("******MELHORES PONTUAÇÕES******");
        for (int i = 0; i < placar.length; i++){
            System.out.print(placar[i] + " | ");
        }
    }

    public void adicionaPlacar(int pontos){
        for (int i = 0; i < placar.length; i++){
            if(placar[i] == 0) {
                placar[i] = pontos;
                break;
            }
        }

    }

    public void ordenar(){
        Arrays.sort(placar);
        for (int esq = 0, dir = placar.length-1; esq < dir; esq ++, dir --){
            int temp = placar[esq]; placar[esq] = placar[dir]; placar[dir] = temp;
        }
    }

    public int recupera(int indice){
        return placar[indice];
    }
}
