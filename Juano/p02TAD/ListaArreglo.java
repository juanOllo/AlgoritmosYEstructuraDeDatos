public class ListaArreglo<T> implements Lista<T>{
    private T[] elementos;
    private int cant;

    public ListaArreglo(int capacidad){
        if (capacidad <= 0) {
            throw new IllegalArgumentException("Capacidad invalida");
        }

        elementos = (T[]) new Object[capacidad];
        cant = 0;
    }

    @Override
    public void insertarFin(T item) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insertarFin'");
    }

    @Override
    public void insertarInicio(T item) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insertarInicio'");
    }

    @Override
    public void insertarPos(T item, int pos) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insertarPos'");
    }

    @Override
    public T eliminarUltimo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eliminarUltimo'");
    }

    @Override
    public T eliminarPrimero() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eliminarPrimero'");
    }

    @Override
    public T eliminarPos(int pos) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eliminarPos'");
    }

    @Override
    public T obtenerPrimero() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'obtenerPrimero'");
    }

    @Override
    public T obtenerUltimo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'obtenerUltimo'");
    }

    @Override
    public T obtenerPos(int pos) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'obtenerPos'");
    }

    @Override
    public int buscar(T item) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscar'");
    }

    @Override
    public int longitud() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'longitud'");
    }

    @Override
    public boolean esVacia() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'esVacia'");
    }

    @Override
    public void imprimir() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'imprimir'");
    }
    
}
