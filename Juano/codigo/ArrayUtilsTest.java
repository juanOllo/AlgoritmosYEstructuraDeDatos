//import java.util.ArrayList;

public class ArrayUtilsTest {

    public static void main(String[] args){

        int[] numerosEntros = new int[4];
        float[] numerosReales = new float[4];

        numerosEntros[0] = 2;
        numerosEntros[1] = 4;
        numerosEntros[2] = 5;
        numerosEntros[3] = 1;

        numerosReales[0] = 1.5f;
        numerosReales[1] = 4f;
        numerosReales[2] = 2.5f;
        numerosReales[3] = 0.5f;

        ArrayUtils arrayUtils = new ArrayUtils();

        int aux = 3;

        if (arrayUtils.pertenece(aux, numerosEntros)) {
            System.out.println(aux + " pertenece a la lista entera");
        } else {
            System.out.println(aux + " NO pertenece a la lista entera");
        }

        System.out.println("Suma d la lista entera: " + arrayUtils.suma(numerosEntros));

        System.out.println("Minimo d la lista real: " + arrayUtils.minimo(numerosReales));
    }
}