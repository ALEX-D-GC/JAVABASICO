/*Costruye un programa que, al recibir como datos el costo de un articulo vendido y la cantidad de dinero entregada 
 * por el cliente, calcula he impriome:
 * 1.- El cambio que se debe entregar al cliente, si el pago efectuado es mayor que el precio del producto 
 * 2.- Que pasa si el cliente paga exactamente lo que vale el producto 
 * 3.- La cantidad de dinero que falta por pagar, si el pago efectuado es menor que  el precio del producto 
 */
package ventas;

import java.util.Scanner;

public class VentasV1 {

   public static void main(String[] args) {

      Scanner in = new Scanner(System.in);

      double precioArticulo, pagoCliente, cambioPago, faltaPagar;

      System.out.println(" Por favor ingrese el pricio del articulo: ");
      precioArticulo = in.nextDouble();

      System.out.println(" ¿Cuanto a pagado el cliente? ");
      pagoCliente = in.nextDouble();

      cambioPago = pagoCliente - precioArticulo;

      faltaPagar = precioArticulo - pagoCliente;

      if (cambioPago < 0) {
         System.out.println(" Falta denero en el pago. " + " El dinero faltante es de: " + faltaPagar);

      } else if (cambioPago == 0) {
         System.out.println(" Se a pagado exacto. no es necesario drar cambio: ");

      } else if (cambioPago > 0) {
         System.out.println(" El cambio es de: " + cambioPago);

      }

   }

}
