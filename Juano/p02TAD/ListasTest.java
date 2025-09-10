
public class ListasTest {
    public static void main(String[] args) {
        ListaEnlazada<Integer> listaE = new ListaEnlazada<>(); 
        listaE.insertarInicio(3);
        listaE.insertarInicio(2);
        listaE.insertarInicio(1);
        listaE.insertarFin(4);
        listaE.insertarPos(8, 2);

        listaE.imprimir();

        listaE.eliminarPrimero();

        listaE.imprimir();
    }
}
