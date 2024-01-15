
package E2_CalcExcepcionesPers;


/**
 *
 * @author nccasares
 */
public class E2_DivisionCeroException extends ArithmeticException{

    public E2_DivisionCeroException() {
    }

    public E2_DivisionCeroException(String s) {
        super(s);
        System.out.println("***SE HA PRODUCIDO UN ERROR AL INTENTAR DIVIDIR POR 0");
    }
    
}
