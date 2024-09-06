package Numero_Par_Impar;

//Primero importamos la clase Scanner para leer la entrada del usuario 
import java.util.Scanner;

public class Numero_Par_Impar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        int numero = in.nextInt();
        if (numero % 2 == 0) {
            System.out.println("El número es par.");
        } else {
            System.out.println("El número es impar.");
        }
        in.close();  // Cerrar el Scanner para evitar fugas de recursos
    }
}
