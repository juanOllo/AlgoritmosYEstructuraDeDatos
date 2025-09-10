package p02;

public class Persona {
    private int dni;
    private String nombre;
    private String apellido;

    public Persona(int dni, String nombre, String apellido){
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    @Override
    public String toString(){
        return ("dni: " + this.dni + ". nombre: "+ nombre + ". apellido: " + apellido);
    }
}
