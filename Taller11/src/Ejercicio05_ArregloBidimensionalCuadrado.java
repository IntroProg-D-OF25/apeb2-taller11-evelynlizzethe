public class Ejercicio05_ArregloBidimensionalCuadrado {
    public static void main(String[] args) {
        int[][] matriz = {
            {5, 8, 9},
            {4, 6, 8},
            {5, 2, 3}
        };

        System.out.println("Suma de la matriz: " + suma(matriz));
        System.out.println("Resta de la matriz: " + resta(matriz));
        System.out.println("Multiplicacion de la matriz: " + multiplicacion(matriz));
    }

    public static int suma(int[][] matriz) {
        int resultado = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                resultado += matriz[i][j]; 
            }
        }
        return resultado;
    }

    public static int resta(int[][] matriz) {
        int resultado = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (resultado == 0) {
                    resultado = matriz[i][j]; 
                } else {
                    resultado -= matriz[i][j];
                }
            }
        }
        return resultado;
    }

    public static int multiplicacion(int[][] matriz) {
        int resultado = 1;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                resultado *= matriz[i][j]; 
            }
        }
        return resultado;
    }
}

/***
 * Suma de la matriz: 50
 * Resta de la matriz: -40\
 * Multiplicacion de la matriz: 2073600
 */

