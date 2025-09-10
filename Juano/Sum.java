public class Sum {
    public static void main(String[] args){
        if (args.length > 1) {
            System.out.println("La suma es: " + (Integer.parseInt(args[0]) + Integer.parseInt(args[1])));
        } else {
            System.out.println("Por favor ingrese exactamente los númreos");
        }
    }
}
