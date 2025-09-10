import java.util.LinkedList;
import java.util.Random;

//import java.util.ArrayList;

public class ListaAleatoria{
    public static void main(String[] args){
        LinkedList<Integer> lista = new LinkedList<>();

        lista = nuevaLista(5);

        //lista.add(10);
        //System.out.println(pertenece(lista, 10));        
        System.out.println(lista);        
    }

    public static LinkedList<Integer> nuevaLista(int n){
        LinkedList<Integer> newList = new LinkedList<>();
        Random rand = new Random();

        for (int i = 0; i < n; i++) {
            newList.add(rand.nextInt(99));
        }

        return newList;
    }

    public static boolean pertenece(LinkedList<Integer> list, int n){

        for (Integer integer : list) {
            if (integer == n) {
                return true;
            }
        }

        return false;
    }

}