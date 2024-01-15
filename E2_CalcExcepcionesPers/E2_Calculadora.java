package E2_CalcExcepcionesPers;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author nccasares
 */
public class E2_Calculadora {

    public static int suma(int num1, int num2) {
        return num1 + num2;
    }

    public static int resta(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiplicacion(int num1, int num2) {
        int resultado = 0;
        for (int i = 0; i < num2; i++) {
            resultado = resultado + suma(num1, num1);
        }
        return resultado;
    }

    public static int division(int num1, int num2) {
        if (num2 == 0) {
            throw new E2_DivisionCeroException("***NO SE PERMITEN LAS DIVISIONES POR 0");
        }
        return num1 / num2;
    }

    public static double potencia(int num1, int num2) {
        int resultado = 0;
        for (int i = 0; i < num2; i++) {
            resultado = resultado + suma(num1, num1);
        }
        return resultado;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double resultado = 0;
        int n1 = 0, n2 = 0;
        boolean numValidos = true;
        do {
            sc = new Scanner(System.in);
            try {
                try {
                    System.out.println("Introduzca el primer número:");
                    n1 = sc.nextInt();

                    System.out.println("Introduzca el segundo número:");
                    n2 = sc.nextInt();

                    numValidos = true;
                } catch (InputMismatchException e) {
                    throw new E2_ArgumentoIncorrecto("***ERROR DE FORMATO");
                }
            } catch (E2_ArgumentoIncorrecto ex) {
                numValidos = false;
                System.out.println(ex.getMessage());
            }
        } while (!numValidos);

        System.out.println("Introduzca la operación a realizar:");
        System.out.println("S/s: suma");
        System.out.println("R/r: resta");
        System.out.println("D/d: división");
        System.out.println("M/m: multiplicación");
        System.out.println("P/p: potencia");
        String op = sc.next();

        switch (op.toLowerCase()) {
            case "s":
                resultado = suma(n1, n2);
                break;
            case "r":
                resultado = resta(n1, n2);
                break;
            case "d":
                try {
                    resultado = division(n1, n2);
                } catch (E2_DivisionCeroException ex) {
                    System.out.println(ex.getMessage());
                    // ex.printStackTrace();
                } catch (Exception ex) {
                    System.out.println("ERROR " + ex.getMessage());
                }
                break;
            case "m":
                resultado = multiplicacion(n1, n2);
                break;
            case "p":
                resultado = potencia(n1, n2);
                break;
        }

        System.out.println("El resultado de la operación es: " + resultado);
       

    }
}
