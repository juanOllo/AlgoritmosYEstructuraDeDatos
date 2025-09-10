package p02;

public class Estudiante extends Persona {
    private boolean esRegular;
    private float promedio;

    private int cantidadMateriasAprobadas;

    public Estudiante(int dni, String nombre, String apellido, boolean esRegular){
        super(dni, nombre, apellido);
        this.esRegular = esRegular;
        this.promedio = 0;
        this.cantidadMateriasAprobadas = 0;
    }

    public void aproboMateria(int nota){
        if (nota<5 || nota>10) {
            return;
        }

        float aux = this.promedio * this.cantidadMateriasAprobadas;

        this.cantidadMateriasAprobadas++;
        this.promedio = (aux + nota) / this.cantidadMateriasAprobadas;
    }

    @Override
    public String toString(){
        return (super.toString() + "promedio: " + this.promedio);
    }
}