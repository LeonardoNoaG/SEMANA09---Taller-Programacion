package Programas;
import java.util.Scanner;
public class Tarea04 {
    public static void main(String args[]){
        // Variables
        int n = 5;
        String[] nombres = new String[n];
        boolean encontrado = false;
        int posicion = -1;
        Scanner scanner = new Scanner(System.in);
        // Entrada de datos - Registro de nombres
        System.out.println("Ingrese los nombres de 5 personas:");
        for (int i = 0; i < n; i++) {
            System.out.print("Nombre " + (i + 1) + ": ");
            nombres[i] = scanner.nextLine();
        }
        System.out.print("Ingrese el nombre a buscar: ");
        String nombreBuscado = scanner.nextLine();  
        // Proceso - Búsqueda del nombre en el arreglo
        for (int i = 0; i < n; i++) {
            if (nombres[i].equalsIgnoreCase(nombreBuscado)) {
                encontrado = true;
                posicion = i;
                break;
            }
        }
        // Salida
        if (encontrado) {
            System.out.println("La persona " + nombreBuscado + " existe en la "
                    + "posición: " + (posicion + 1));
        } else {
            System.out.println("La persona " + nombreBuscado + " no existe "
                    + "en el arreglo de datos.");
        }
    }
}
