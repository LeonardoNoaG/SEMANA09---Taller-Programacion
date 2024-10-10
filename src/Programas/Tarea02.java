package Programas;
import java.util.Scanner;
public class Tarea02 {
    public static void main(String args[]){
        // Variables
        int n;
        double sumaIngresos = 0;
        double ingresoMayor = 0;
        Scanner scanner = new Scanner(System.in);
        // Entrada de datos
        System.out.print("Ingrese el número de personas: ");
        n = scanner.nextInt();
        double[] ingresos = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el ingreso de la persona " + (i + 1) + ": ");
            ingresos[i] = scanner.nextDouble();
            sumaIngresos += ingresos[i];
            if (ingresos[i] > ingresoMayor) {
                ingresoMayor = ingresos[i];
            }
        }
        double ingresoPromedio = sumaIngresos / n;
        // Salida
        System.out.println("El ingreso promedio de las personas es: $" 
                + ingresoPromedio);
        System.out.println("El ingreso mayor registrado es: $" + ingresoMayor);
    }
}