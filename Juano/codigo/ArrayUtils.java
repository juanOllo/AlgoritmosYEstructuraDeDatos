import java.util.ArrayList;

/**
 * Clase ArrayUtils: contiene implementaciones de rutinas fundamentales
 * sobre arreglos.
 * 
 * @author N. Aguirre
 * @version 0.1
 */
public class ArrayUtils
{   
    /**
     * Comprueba si un elemento (entero) pertenece a un arreglo.
     */
    public boolean pertenece(int elem, int[] arreglo) {
        if (arreglo == null)
            throw new IllegalArgumentException("Arreglo nulo");
        //TODO: Completar la implementación, reemplazando la línea siguiente

        for (int i : arreglo) {
            if (i == elem) {
                return true;
            }
        }

        return false;
    }
    
    /**
     * Calcula la suma de los elementos de un arreglo de enteros
     */
    public int suma(int[] arreglo) {
        //TODO: Completar la implementación, reemplazando la línea siguiente
        int suma = 0;

        for (int n : arreglo) {
            suma += n;
        }

        return suma;
    }
    
    /**
     * Calcula el valor mínimo de un arreglo de reales
     */
    public float minimo(float[] arreglo) {
        //TODO: Completar la implementación, reemplazando la línea siguiente

        float min = arreglo[0];
        
        for(float n : arreglo){
            if (n < min) {
                min = n;
            }
        }

        return min;
    }
    
    /**
     * Calcula el valor máximo de un arreglo de reales
     */
    public float maximo(float[] arreglo) {
        //TODO: Completar la implementación, reemplazando la línea siguiente

        float max = arreglo[0];
        //int prom2 = 0;
        
        for(float n : arreglo){
            if (n > max) {
                max = n;
            }
        }

        return max;
    }
    
    
    /**
     * Calcula el valor promedio de un arreglo de reales
     */
    public float promedio(float[] arreglo) {
        //TODO: Completar la implementación, reemplazando la línea siguiente

        float prom = 0;
        
        for(float n : arreglo){
            prom += n;
        }

        return prom;
    }
    
    /**
     * Retorna un arreglo con los primeros n números de Fibonacci
     */
    public int[] fibSequence(int n) {
        //TODO: Completar la implementación, reemplazando la línea siguiente

        

        return null;
    }
    
    /**
     * Calcula la mediana de un arreglo de reales
     */
    public float mediana(float[] arreglo) {
        //TODO: Completar la implementación, reemplazando la línea siguiente

        

        return 0;
    }
    
    /**
     * Comprueba si dos arreglos de enteros son iguales
     */
    public boolean iguales(int[] arr1, int[] arr2) {
        //TODO: Completar la implementación, reemplazando la línea siguiente

        if (arr1.length != arr2.length) {
            return false;
        }
        
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }
    
    /**
     * Comprueba si un arreglo tiene valores repetidos
     */
    public boolean tieneRepetidos(int[] arreglo) {
        //TODO: Completar la implementación, reemplazando la línea siguiente

        for (int i = 0; i < arreglo.length; i++) {
            for (int j = i+1; j < arreglo.length; j++) {
                if (arreglo[i] == arreglo[j]) {
                    return true;
                }
            }
        }

        return false;
    }
    
    /**
     * Comprueba si un arreglo tiene dos valores cuya suma dé cero.
     */
    public boolean tieneOpuestos(float[] arreglo) {
        //TODO: Completar la implementación, reemplazando la línea siguiente

        for (int i = 0; i < arreglo.length; i++) {
            for (int j = i+1; j < arreglo.length; j++) {
                if (arreglo[i] + arreglo[j] == 0) {
                    return true;
                }
            }
        }

        return false;
    }
    
}
