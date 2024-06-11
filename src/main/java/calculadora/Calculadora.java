package calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main (String [] args){
        Scanner leer = new Scanner(System.in);
        int opcion;
        double n1;
        double n2;
        double r;
        
        System.out.println("Elige las operaciones que quieras realizar");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        opcion = leer.nextInt();

        System.out.println("Escribe el primer numero");
        n1 = leer.nextDouble();
        System.out.println("Escribe el segundo numero");
        n2 = leer.nextDouble();

        switch(opcion){
            case 1:
                r = n1 + n2;
                System.out.println("El resultado es " + r);
                break;
            case 2:
                r = n1 - n2;
                System.out.println("El resultado es " + r);
                break;
            case 3:
                r = n1 * n2;
                System.out.println("El resultado es " + r);
                break;
            case 4:
                if (n2 != 0) {
                    r = n1 / n2;
                    System.out.println("El resultado es " + r);
                } else {
                    System.out.println("Error: División por cero");
                }
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
    }
}
