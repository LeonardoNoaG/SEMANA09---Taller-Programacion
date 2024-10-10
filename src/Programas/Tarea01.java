package Programas;
import java.util.Scanner;
public class Tarea01 {
    public static void main(String args[]){
        // Variables
        int n;
        double sumaPesos = 0;
        Scanner scanner = new Scanner(System.in);
        // Entrada de datos
        System.out.print("Ingrese el número de personas: ");
        n = scanner.nextInt();
        // Crear el arreglo para almacenar los pesos
        double[] pesos = new double[n];
        // Registrar el peso de cada persona
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el peso de la persona " + (i + 1) + ": ");
            pesos[i] = scanner.nextDouble();
            // Proceso - acumular el peso para luego calcular el promedio
            sumaPesos += pesos[i];
        }
        // Calcular el peso promedio
        double pesoPromedio = sumaPesos / n;
        
        // Salida
        System.out.println("El peso promedio de las personas es: " + pesoPromedio + " kg");
    }
}
