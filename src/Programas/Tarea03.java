package Programas;
import java.util.Scanner;
public class Tarea03 {
    public static void main(String args[]){
        // Variables
        int n;
        double sumaCompras = 0;
        double compraMayor = 0;
        double compraMenor = Double.MAX_VALUE;
        Scanner scanner = new Scanner(System.in);
        // Entrada de datos
        System.out.print("Ingrese el número de personas: ");
        n = scanner.nextInt();
        double[] compras = new double[n];
        // Registrar la compra de cada persona
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el valor de la compra de la persona " + (i + 1) + ": ");
            compras[i] = scanner.nextDouble();
            sumaCompras += compras[i];
            // Proceso - encontrar la compra mayor
            if (compras[i] > compraMayor) {
                compraMayor = compras[i];
            }
            if (compras[i] < compraMenor) {
                compraMenor = compras[i];
            }
        }
        double promedioCompras = sumaCompras / n;
        // Salida
        System.out.println("El total de las compras es: $" + sumaCompras);
        System.out.println("El promedio de las compras es: $" + promedioCompras);
        System.out.println("La compra mayor registrada es: $" + compraMayor);
        System.out.println("La compra menor registrada es: $" + compraMenor);
    }
}
