//package p02a7;
import java.util.Stack;

public class ParentesisBalanceados {
    public static void main(String[] args){
        Stack<Character> pila = new Stack<>();

        String xpr = "()";

        //System.out.println(args[0]);

        for (char c : xpr.toCharArray()) {
            if (c == '(' || c == ')') {
                pila.push(c);
            }
        }

        //for (Character c : pila) {
        //    System.out.println(c);
        //}

        System.out.println("pila: " + pila);

        esBalanceada(pila);
        if (esBalanceada(pila)) {
            System.out.println("Està Balanceada");
        } else{
            System.out.println("No està Balanceada");
        }
    }

    public static boolean esBalanceada(Stack<Character> pila){

        if (pila.empty())
            return false;

        if (pila.size() % 2 != 0)
            return false;
        
        //Character c;
        //int parOpen = 0; 
        //int parClose = 0;
        //while (pila.size() > 0) {
        //    c = pila.pop();
        //    System.out.println(c);
        //    
        //    if (c == '(') {
        //        parOpen++;
        //    }else{
        //        parClose++;
        //    }
        //    if (parOpen > parClose) {
        //        return false;
        //    }
        //}
        //if (parOpen == parClose)
        //    return true;
        
        //version de la profe.
        Stack<Character> auxPila = new Stack<>();
        for (char c : pila) {
            if (c == '(') {
                auxPila.push(c);
            } else {
                if (auxPila.isEmpty()) {
                    return false;
                }
                auxPila.pop();
            }
        }

        return true;
    }
}
