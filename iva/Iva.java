
/* Pide el precio de un producto sin IVA y calcula su precio con IVA.
 * El IVA es del 21%
 * Formatea el resultado para que se muestre con dos decimales 
 */
package iva;

import java.util.*;

public class Iva {

   public static void main(String[] args) {

      // Creamos el Scanner
      try (Scanner in = new Scanner(System.in)) {

         // Pedir al usuario que ingrese un precio sin IVA
         System.out.println("Por favor ingrese el precio del producto sin IVA:");
         double precioSinIVA = in.nextDouble(); // Esta linea guarda el dato del cliente

         // Calcular el precio con IVA
         double precioConIVA = precioSinIVA * 1.21;

         System.out.println("El precio del producto con IVA es: " + precioConIVA);
      }

   }

}
