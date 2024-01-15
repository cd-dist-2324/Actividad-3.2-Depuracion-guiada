
package E2_CalcExcepcionesPers;

import java.util.InputMismatchException;


public class E2_ArgumentoIncorrecto extends InputMismatchException{

    public E2_ArgumentoIncorrecto() {
    }

    public E2_ArgumentoIncorrecto(String s) {
        super(s);
        System.out.println("***SE HA INTRODUCIDO UN FORMATO DE DATO INCORRECTO");
    }
    
}
