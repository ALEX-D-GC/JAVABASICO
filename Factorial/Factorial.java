package Factorial;

//Lo primero que hacemos es importar la clase Scanner por que sabemos que necesitamos interactuar con el usuario 
import java.util.Scanner;;

public class Factorial {
    public static void main(String[] args) {

        // Creamos el objeto Scanner
        Scanner in = new Scanner(System.in);

        // Imprimimos un mensaje para el usuario pidiendole que ingrese un numero
        
        System.out.print("Por favor ingrese un numero entero para calcular su Factorial: ");
        int numero = in.nextInt();/*
                                   * scanner para leer un número entero ingresado por el usuario. El método
                                   * nextInt() espera a que el usuario introduzca un valor numérico,
                                   * y luego almacena ese valor en la variable numero.
                                   */

        // Ahora vamos a calcular la factorial del numero
        long factorial = calcularFactorial(numero);
        // Imprimimos el resultado
        System.out.println("El factorial de " + numero + " es " + factorial);

    }

    // Creamos el metodo para calcular el Factorial
    public static long calcularFactorial(int n) {

        long resultado = 1;

        // Creamos una ciclo for
        for (int i = 1; i <= n; i++) {

            resultado *= i;

        }
        return resultado;

    }

}
