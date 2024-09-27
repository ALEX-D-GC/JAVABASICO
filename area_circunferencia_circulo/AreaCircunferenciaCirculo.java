/* Construye un programa que al recibir como dato el radio de un circulo, calcule he imprima tanto su area como la 
 * longitud de su circunferencia.
 * 
 * El area de un circulo la claculamos como  Área = pi * radio al cuadrado 
 * 
 * La circunferencia del circulo la calculamos de la siguiente forma:
 * longitud de la Circunferencia = 2 * pi * radio 
 */
package area_circunferencia_circulo;

import java.util.Scanner;

public class AreaCircunferenciaCirculo {

   public static void main(String[] args) {

      Scanner in = new Scanner(System.in);

      System.out.println("Por favor ingrese un valor o el radios del circulo: ");
      double radio = in.nextDouble();

      double area = Math.PI * Math.pow(radio, 2);

      double longitud = 2 * Math.PI * radio;

      System.out.println("El Areas del circulo es: " + area);
      System.out.println("La longitud de la circunferencia es: " + longitud);

      in.close();

   }
   

}
