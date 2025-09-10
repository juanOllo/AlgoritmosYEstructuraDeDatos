import java.util.ArrayList; 

/**
 * Registros de temperaturas diarios de una estacion meteorológica
 */
public class MedicionesTemperaturas
{
    /**
     * Contiene las mediciones de temperaturas.
     */
    private ArrayList<Integer> registros;
    
    /**
     * Dia del registro
     */
    private int dia;
    
    /**
     * Mes del registro
     */
    private int mes;
    
    /**
     * Constructor de la clase. Inicializa dia y mes con los parámetros respectivos,
     * y la lista de registros se inicializa vacía (sin mediciones).
     * Precondición: 
     *  - dia debe ser un día válido (entre 1 y 31)
     *  - mes debe ser un mes válido (entre 1 y 12)
     */
    public MedicionesTemperaturas(int dia, int mes) {
        assert dia >= 1 && dia <= 31;
        assert mes >= 1 && mes <= 12;
        this.dia = dia;
        this.mes = mes;
        this.registros = new ArrayList<Integer>();
    }
    
    /**
     * Agrega una temperatura al registro de temperaturas
     */
    public void agregarRegistro(int nuevaTemperatura) {
        registros.add(new Integer(nuevaTemperatura));
    }
    
    /**
     * Muestra todas las temperaturas registradas en 
     * la pantalla. 
     */
    public void imprimirTemperaturas() {
        System.out.println(dia + "/" + mes);
        int pos = 0;
        for (Integer temperatura: registros) {
            System.out.print(pos + ": ");
            System.out.println(temperatura + "C");
            pos = pos + 1;
        }
    }

    public void temperaturaPromedio(){
        Integer prom = new Integer(0);
        //int prom2 = 0;
        
        for(Integer n : registros){
            prom += n;
        }

        System.out.println("Temperatura promedio: "+ prom/registros.size());
    }


    private int getTemperaturaMaxima(){
        Integer max = new Integer(0);
        max = registros.get(0);
        //int prom2 = 0;
        
        for(Integer n : registros){
            if (n > max) {
                max = n;
            }
        }

        return max;
    }

    public void temperaturaMaxima(){
        System.out.println("Temperatura maxima: "+ getTemperaturaMaxima());
    }

    private int getTemperaturaMinima(){
        Integer min = new Integer(0);
        min = registros.get(0);
        //int prom2 = 0;
        
        for(Integer n : registros){
            if (n < min) {
                min = n;
            }
        }

        return min;
    }

    public void temperaturaMinima(){
        

        System.out.println("Temperatura minima: "+ getTemperaturaMinima());
    }
    
    public void amplitudTermica(){
        //Integer aux = new Integer(0);
        System.out.println("Amplitud termica: "+ (getTemperaturaMaxima() - getTemperaturaMinima()));
    }
}
