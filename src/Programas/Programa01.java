package Programas;
import java.util.Scanner;
public class Programa01 {
    public static void main(String args []){
        //VARIABLES
        int n, edad, acedad;
        double pe;
        Scanner lectura = new Scanner(System.in);
        //LECTURA DE DATOS
        System.out.println("Ingresar cantidad de edades: ");
        n = lectura.nextInt();
        int[] aedades = new int[n];
        acedad = 0;
        for(int i=0; i<n; i++){
            System.out.println("Edad "+(i+1)+ ": ");
            edad = lectura.nextInt(); 
            aedades[i]=edad;
        }
        //PROCESO DE DATOS
        for(int i=0; i<n; i++){
            acedad+=aedades[i];
        }
        pe=acedad/n;
        //SALIDA DE DATOS
        System.out.println("El promedio de edad es: " + pe);
    }
}
