/*Crear un programa que, al recibir como datos dos numeros enteros, calcule la Suma, Resta y Multiplicacion 
 * de dichos numeros */

package operaciones;

//Importamos las clases 
import java.util.Scanner;

public class OpercionesV1 {

   public static void main(String[] args) {

      // Crear un Scanner para pedir datos por teclado
      Scanner in = new Scanner(System.in);

      // Creamos las variables
      double primerNumero, segundoNumero;

      // Pedimos los datos al usuario
      System.out.println("Por favor ingrese el primer número: ");
      primerNumero = in.nextDouble();

      System.out.println("Por favor ingrese el segundo número: ");
      segundoNumero = in.nextDouble();

      // Cerramos el Scanner (solo se cierra una vez)
      in.close();

      // Creamos las variables para las operaciones
      double suma, resta, multiplicacion;

      // Sumar
      suma = primerNumero + segundoNumero;

      // Imprimimos el resultado de la suma
      System.out.println("La suma de " + primerNumero + " + " + segundoNumero + " es: " + suma);

      // Restar
      resta = primerNumero - segundoNumero;

      // Imprimimos el resultado de la resta
      System.out.println("La resta de " + primerNumero + " - " + segundoNumero + " es: " + resta);

      // Multiplicar
      multiplicacion = primerNumero * segundoNumero;

      // Imprimimos el resultado de la multiplicación
      System.out.println("La multiplicación de " + primerNumero + " * " + segundoNumero + " es: " + multiplicacion);
   }
}
