
import java.util.Scanner;

public class Ejercicio01_ProcesarMatrices {

    public static void main(String[] args) {
        int limFil = 0, limCol = 0;
        Scanner tcl = new Scanner(System.in);
        System.out.print("Deme limFil y limCol: ");
        limFil = tcl.nextInt();
        limCol = tcl.nextInt();
        int matriz[][] = new int[limFil][limCol];
        generarMatriz(matriz);
        presentarMatriz(matriz);
        System.out.println("Elementos Pares de la Matriz:");
        presentarParesMatriz(matriz);
        System.out.println("Elementos Impares de la Matriz:");
        presentarimParesMatriz(matriz);
        System.out.println("Promedio Matriz: " + presentarPromedioMatriz(matriz));
    }

    public static void presentarimParesMatriz(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] % 2 == 0);
                System.out.print(matriz[i][j] + "");
            }
        }
        System.out.println("");
    }

    public static void presentarParesMatriz(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] % 2 == 0);
                System.out.print(matriz[i][j] + "");
            }
        }
        System.out.println("");
    }

    public static void generarMatriz(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }
    }

    public static void presentarMatriz(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static double presentarPromedioMatriz(int matriz[][]) {
        int sumaMatriz = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                sumaMatriz += matriz[i][j];
            }
        }
        return (sumaMatriz / (matriz.length * matriz[0].length));
    }
}
