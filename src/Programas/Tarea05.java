package Programas;
import java.util.Scanner;
public class Tarea05 {
    public static void main(String args[]){
        // Variables
        int n = 5;
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n * 2];
        Scanner scanner = new Scanner(System.in);
        // Entrada de datos
        System.out.println("Ingrese 5 números para el arreglo a:");
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "]: ");
            a[i] = scanner.nextInt();
        }
        System.out.println("Ingrese 5 números para el arreglo b:");
        for (int i = 0; i < n; i++) {
            System.out.print("b[" + i + "]: ");
            b[i] = scanner.nextInt();
        }
        // Proceso - Intercalar los valores de a y b en el arreglo c
        for (int i = 0, j = 0; i < n; i++) {
            c[j++] = a[i];
            c[j++] = b[i];
        }
        // Salida - Mostrar el arreglo c
        System.out.println("Arreglo c intercalado:");
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
    }
}