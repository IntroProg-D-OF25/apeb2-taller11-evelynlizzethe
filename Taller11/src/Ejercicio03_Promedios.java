/***
 * Generar una función que tenga 4 parámetros de tipo decimal y devuelva el 
 * promedio cualitativo de los parámetros. Si el promedio es: De 0 a 5 el 
 * promedio cualitativo es Regular De 5.1 a 8 el promedio es Bueno De 8.1 a 9 
 * el promedio es Muy Bueno De 9.1 a 10 el promedio es Sobresaliente. 
 * A la función se la debe llamar desde un método principal. Los parámetros 
 * necesarios para llamar a la función, deben ser ingresados solicitados al usuario.
 */
import java.util.Scanner;

public class Ejercicio03_Promedios {

    public static void main(String[] args) {
        double num1, num2, num3, num4;
        String resultado;
        Scanner tcl = new Scanner(System.in);

        System.out.print("Ingrese cuatro numeros: ");
        num1 = tcl.nextDouble();
        num2 = tcl.nextDouble();
        num3 = tcl.nextDouble();
        num4 = tcl.nextDouble();

        resultado = obtenerPromedioCualitativo(num1, num2, num3, num4);
        System.out.println("El Promedio Cualitivo es: " + resultado);
    }

    public static String obtenerPromedioCualitativo(double num1, double num2,
            double num3, double num4) {
        String resultado;
        double promedio = (num1 + num2 + num3 + num4) / 4;
        if (promedio <= 5) {
            resultado = "Regular";
        } else if (promedio <= 8) {
            resultado = "Bueno";
        } else if (promedio <= 9) {
            resultado = "Muy Bueno";
        } else if (promedio <= 10) {
            resultado = "Sobresaliente";
        } else {
            resultado = "Promedio fuera de rango";
        }

        return resultado;
    }
}

/***
 * Ingrese cuatro numeros: 2 5 8 7
 * El Promedio Cualitivo es: Bueno
 */
