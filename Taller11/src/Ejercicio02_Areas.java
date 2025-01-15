
/** *
 * Generar una solución que implemente 3 procedimientos.
 * Que permitan calcular el área de un cuadrado, área de un triángulo
 * y área de un rectángulo. Cada procedimiento/función debe recibir los
 * datos necesarios y generar el valor correspondiente.
 * Se debe invocar a los procedimientos desde un método principal;
 * Si el usuario ingresa 1 se llama al procedimiento obtenerAreaCuadrado;
 * 2 se llama al procedimiento obtenerAreaTriangulo; 3 se llama al procedimiento
 * obtenerAreaCuadrado.
 * El área del cuadrado es igual a lado x lado x lado x lado
 * El área del triángulo es igual a (base x altura)/2
 * El área del rectángulo es igual a base x altura
 */

import java.util.Scanner;

public class Ejercicio02_Areas {

    public static void main(String[] args) {
        int num;
        boolean proce = true;
        double num1, num2, respuesta = 0;
        Scanner tcl = new Scanner(System.in);

        while (proce == true) {
            System.out.print("Ingrese el procedimiento que desea realizar:"
                    + "1. Area de un Cuadrado, 2. Area de un Triangulo"
                    + "3. Area de un Rectangulo: ");
            num = tcl.nextInt();
            switch(num) {
                case 1:
                    System.out.print("Dame la medida de un lado del Cuadrado: ");
                    num1 = tcl.nextDouble();
                    respuesta = areaCuadrados(num1, respuesta);
                    System.out.println("El area del cuadrado es: " + respuesta);
                    proce = false;
                    break;
                case 2:
                    System.out.print("Dame la medida de la base del triangulo: ");
                    num1 = tcl.nextDouble();
                    System.out.print("Dame la altura del triangulo: ");
                    num2 = tcl.nextInt();
                    respuesta = areaTriangulos(num1, num2, respuesta);
                    System.out.println("El area del tiangulo es: " + respuesta);
                    proce = false;
                    break;
                case 3:
                    System.out.print("Dame la medida del largo del rectangulo: ");
                    num1 = tcl.nextDouble();
                    System.out.print("Dame la medida del ancho del rectangulo: ");
                    num2 = tcl.nextInt();
                    respuesta = areaRectangulos(num1, num2, respuesta);
                    System.out.println("El area del rectangulo es: " + respuesta);
                    proce = false;
                    break;
            }
        }
    }

    public static double areaCuadrados(double num1, double respuesta) {
        respuesta = num1 * num1;
        return respuesta;
    }

    public static double areaTriangulos(double num1, double num2, double respuesta) {
        respuesta = (num1 * num2) / 2;
        return respuesta;
    }

    public static double areaRectangulos(double num1, double num2, double respuesta) {
        respuesta = num1 * num2;
        return respuesta;
    }
}

/**
 * *
 * Ingrese el procedimiento que desea realizar: 1. Area de un Cuadrado, 2. Area
 * de un Triangulo3. Area de un Rectangulo: 3 Dame la medida del largo del
 * rectangulo: 4 Dame la medida del ancho del rectangulo: 3 El area del
 * rectangulo es: 12.0
 */
