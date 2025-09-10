public class ListaEnlazada<T> implements Lista<T> {
    private Nodo<T> head;
    private int cant;

    public ListaEnlazada(){
        this.head = null;
        this.cant = 0;
    }

    @Override
    public void insertarFin(T item) {
        if (esVacia()) {
            this.head = new Nodo<T>(item);
        } else {
            Nodo<T> aux = this.head;
            while (aux.next != null) {
               aux = aux.next; 
            }
            aux.next = new Nodo<T>(item);
        }
        this.cant++;
        //throw new IllegalArgumentException(""); 
    }

    @Override
    public void insertarInicio(T item) {
        Nodo<T> aux = this.head;
        this.head = new Nodo<T>(item);
        this.head.next = aux;
        this.cant++;
    }

    @Override
    public void insertarPos(T item, int pos) {
        if (pos == 1) {
            insertarInicio(item);
        } else {
            Nodo<T> aux = this.head;
            for (int i = 1; i <= cant; i++) {
                if (i == pos-1) {
                    Nodo<T> nuevoNodo = new Nodo<T>(item);
                    nuevoNodo.next = aux.next;
                    aux.next = nuevoNodo;
                    this.cant++;
                }
                aux = aux.next;
            }
            //aux.next = new Nodo<T>(item);
        }
    }

    @Override
    public T eliminarUltimo() {
        if (esVacia()) {
            return null;
        }

        Nodo<T> aux = this.head;
        while (aux.next.next != null) {
            aux = aux.next; 
        }
        T auxT = aux.next.dato;
        aux.next = null;
        this.cant--;
        return auxT;
    }

    @Override
    public T eliminarPrimero() {
        if (esVacia()) {
            return null;
        }
        Nodo<T> aux = this.head;
        this.head = this.head.next;
        this.cant--;
        return aux.dato;
    }

    @Override
    public T eliminarPos(int pos) {
        if (pos == 1) {
            return eliminarPrimero();
        } else {
            Nodo<T> aux = this.head;
            Nodo<T> aux2 = new Nodo<T>(null);
            for (int i = 1; i <= cant; i++) {
                if (i == pos-1) {
                    aux2 = aux.next;
                    aux.next = aux.next.next;
                    this.cant--;
                    return aux2.dato;
                }
                aux = aux.next;
            }
            return null;
        }
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
        if (this.head == null) {
            return true;
        }
        return false;
    }

    @Override
    public void imprimir() {
        Nodo<T> aux = this.head;
        System.out.println("//////////");
        while (aux != null) {
            System.out.println(aux.dato);
            aux = aux.next;
        }
    }
}
