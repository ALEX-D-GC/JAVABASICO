/*Crear un programa que, al recibir como datos dos numeros enteros, calcule la Suma, Resta y Multiplicacion 
 * de dichos numeros */

 package operaciones;

 // Importamos las clases que vamos a ocupar 
 import java.util.Scanner;
 
 public class OperacionesV2 {
 
     public static void main(String[] args) {
 
         // Creamos un Scanner para pedir datos por teclado
         Scanner in = new Scanner(System.in);
 
         // Le pedimos los números al Usuario
         double primerNumero = pedirNumero(in, "Por favor ingrese el primer número: ");
         double segundoNumero = pedirNumero(in, "Por favor ingrese el segundo número: ");
 
         // Cerramos el Scanner
         in.close();
 
         // Mostramos los resultados de las operaciones 
         mostrarResultado("suma", sumar(primerNumero, segundoNumero), primerNumero, segundoNumero);
         mostrarResultado("resta", restar(primerNumero, segundoNumero), primerNumero, segundoNumero);
         mostrarResultado("multiplicación", multiplicar(primerNumero, segundoNumero), primerNumero, segundoNumero);
     }
 
     // Método para pedir un número con validación
     public static double pedirNumero(Scanner in, String mensaje) {
         double numero;
         while (true) {
             System.out.println(mensaje);
             if (in.hasNextDouble()) {
                 numero = in.nextDouble();
                 break;
             } else {
                 System.out.println("Por favor ingrese un número válido.");
                 in.next(); // Consumir entrada no válida
             }
         }
         return numero;
     }
 
     // Método para sumar dos números
     public static double sumar(double a, double b) {
         return a + b;
     }
 
     // Método para restar dos números
     public static double restar(double a, double b) {
         return a - b;
     }
 
     // Método para multiplicar dos números
     public static double multiplicar(double a, double b) {
         return a * b;
     }
 
     // Método para mostrar el resultado de la operación
     public static void mostrarResultado(String operacion, double resultado, double num1, double num2) {
         String simbolo = obtenerSimboloOperacion(operacion);
         System.out.println("La " + operacion + " de " + num1 + " " + simbolo + " " + num2 + " es: " + resultado);
     }
 
     // Método para obtener el símbolo adecuado según la operación
     public static String obtenerSimboloOperacion(String operacion) {
         switch (operacion) {
             case "suma":
                 return "+";
             case "resta":
                 return "-";
             case "multiplicación":
                 return "*";
             default:
                 return "";
         }
     }
 }