package p02a09;

public interface Pila<T> {

    void apilar(T item);
    void desapilar();
    T tope();
    boolean esVacia();
    void vaciar();
}