
package E2_CalcExcepcionesPers;

import java.util.InputMismatchException;


public class ArgumentoIncorrectoException extends InputMismatchException{

    public ArgumentoIncorrectoException() {
    }

    public ArgumentoIncorrectoException(String s) {
        super(s);
        System.out.println("***SE HA INTRODUCIDO UN FORMATO DE DATO INCORRECTO");
    }
    
}
