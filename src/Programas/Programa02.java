package Programas;
import java.util.Scanner;
public class Programa02 {
    public static void main(String args[]){
        //DECLARAR VARIABLES
        int numero, nbus;
        String mensaje = null;
        Scanner lectura = new Scanner(System.in);
        int[] anumeros = new int[5];
        //ENTRADAD DE DATOS
        for(int i=0; i<anumeros.length; i++){
            System.out.println("Ingresa numero "+(i+1)+ ": ");
            numero = lectura.nextInt(); 
            anumeros[i]=numero;
        }
        System.out.println("Ingresa numero a buscar: ");
        nbus = lectura.nextInt();
        //PROCESO DE DATOS
        for(int i=0; i<anumeros.length; i++){
            if(anumeros[i]==nbus){
                mensaje="Si existe el numero";
                i=anumeros.length+1;
            }else{
                mensaje="No existe numero";
            }
        }
        //SALIDA
        System.out.println(mensaje);
    }
}
