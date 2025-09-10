public class Nodo<T> {
    Nodo<T> next;
    T dato;

    public Nodo(T item){
        this.next = null;
        this.dato = item;
    }
}
