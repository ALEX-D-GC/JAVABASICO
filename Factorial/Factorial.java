package Factorial;

//Lo primero que hacemos es importar la clase Scanner por que sabemos que necesitamos interactuar con el usuario 
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Por favor ingrese un numero entero para calcular su Factorial: ");
        int numero = in.nextInt();

        if (numero < 0) {
            System.out.println("El factorial no está definido para números negativos.");
        } else {
            long factorial = calcularFactorial(numero);
            System.out.println("El factorial de " + numero + " es " + factorial);
        }

        in.close(); // Se cierra el Scanner para evitar fugas de recursos
    }

    public static long calcularFactorial(int n) {
        long resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
}