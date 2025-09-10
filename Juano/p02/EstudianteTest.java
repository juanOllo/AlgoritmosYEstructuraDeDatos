package p02;
import java.util.ArrayList;

public class EstudianteTest {
    public static void main(String[] args){
        Estudiante estudiante01 = new Estudiante(42513252, "juan", "ollo", true);

        System.out.println(estudiante01.toString());

        estudiante01.aproboMateria(7);
        estudiante01.aproboMateria(9);

        System.out.println(estudiante01.toString());

        ArrayList<Persona> arr = new ArrayList<>();

        arr.add(new Persona(222, "leo", "oliver"));
        arr.add(estudiante01);
        arr.add(new Persona(333, "rodri", "saavedra"));
        
        for (Persona p : arr) {
            System.out.println(p.toString());
        }
    }
}
