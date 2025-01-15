import java.util.Scanner;
public class Ejercicio04_PlanilladeLuz {
    public static void main(String[] args) {
        String nombreCliente, cedulaCliente; 
        int opcion; 
        Scanner tcl = new Scanner(System.in);

        System.out.print("Ingrese el nombre del cliente: ");
        nombreCliente = tcl.nextLine();

        System.out.print("Ingrese la cedula del cliente: ");
        cedulaCliente = tcl.nextLine();

        System.out.println("Seleccione una opcion:");
        System.out.println("1. Calcular valor de la planilla de luz");
        System.out.println("2. Calcular valor del predio de un inmueble");
        System.out.print("Opcion: ");
        opcion = tcl.nextInt();

        switch (opcion) {
            case 1:
                calcularValorLuz(nombreCliente, cedulaCliente);
                break;
            case 2:
                calcularPredio(nombreCliente, cedulaCliente);
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }

    public static void calcularValorLuz(String nombreCliente, String cedulaCliente) {
        double valorKilovatio, numeroKilovatios, valorTotal; 
        Scanner tcl = new Scanner(System.in);
        
        System.out.print("Ingrese el valor del kilovatio: ");
        valorKilovatio = tcl.nextDouble();

        System.out.print("Ingrese el numero de kilovatios consumidos este mes: ");
        numeroKilovatios = tcl.nextDouble();

        valorTotal = valorKilovatio * numeroKilovatios;

        System.out.printf("Cliente %s con cedula %s debe cancelar el valor de $%.2f\n",
                nombreCliente, cedulaCliente, valorTotal);
    }

    public static void calcularPredio(String nombreCliente, String cedulaCliente) {
        double valorInmueble, valorPredio; 
        Scanner tcl = new Scanner(System.in);

        System.out.print("Ingrese el valor del inmueble: ");
        valorInmueble = tcl.nextDouble();

        valorPredio = valorInmueble * 0.02;

        System.out.printf("Cliente %s con cedula %s tiene un bien inmueble "
                + "valorado en $%.2f y tiene que pagar de predio $%.2f\n",
                nombreCliente, cedulaCliente, valorInmueble, valorPredio);
    }
}
/***
 * Ingrese el nombre del cliente: Juan
 * Ingrese la cedula del cliente: 1234567
 * Seleccione una opcion:
 * 1. Calcular valor de la planilla de luz
 * 2. Calcular valor del predio de un inmueble
 * Opcion: 1
 * Ingrese el valor del kilovatio: 12
 * Ingrese el numero de kilovatios consumidos este mes: 23
 * Cliente Juan con cedula 1234567 debe cancelar el valor de $276,00
 */
