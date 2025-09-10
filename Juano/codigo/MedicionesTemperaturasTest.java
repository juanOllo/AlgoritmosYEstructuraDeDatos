public class MedicionesTemperaturasTest {
    public static void main(String[] args){
        MedicionesTemperaturas dia01 = new MedicionesTemperaturas(1, 2);

        dia01.agregarRegistro(-1);
        dia01.agregarRegistro(3);
        dia01.agregarRegistro(8);
        dia01.agregarRegistro(15);
        dia01.agregarRegistro(12);
        dia01.agregarRegistro(6);
        dia01.agregarRegistro(6);
        dia01.agregarRegistro(2);

        dia01.imprimirTemperaturas();

        dia01.temperaturaPromedio();
        dia01.temperaturaMaxima();
        dia01.amplitudTermica();
    }
}