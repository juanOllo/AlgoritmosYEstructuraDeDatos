package p02;

public class Caja<T>{
    private T contenido;

    //private ArrayList<T> caja;

    void guardar(T item){
        this.contenido = item;
    }

    public void printItems(){
        System.out.println("item: " + this.contenido);
    }
}
