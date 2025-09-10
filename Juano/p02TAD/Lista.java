public interface Lista<T> {
    void insertarFin(T item);
    void insertarInicio(T item);
    void insertarPos(T item, int pos);

    T eliminarUltimo();
    T eliminarPrimero();
    T eliminarPos(int pos);

    T obtenerPrimero();
    T obtenerUltimo();
    T obtenerPos(int pos);

    int buscar(T item);
    int longitud();
    boolean esVacia();
    void imprimir();
}