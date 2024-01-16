
package CalculadoraExcepciones;



public class DivisionCeroException extends ArithmeticException{

    public DivisionCeroException() {
    }

    public DivisionCeroException(String s) {
        super(s);
        System.out.println("***SE HA PRODUCIDO UN ERROR AL INTENTAR DIVIDIR POR 0");
    }
    
}
