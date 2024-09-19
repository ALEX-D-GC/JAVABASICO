package ventas;

import javax.swing.JOptionPane;

public class VentasV2 {
   public static void main(String[] args) {

      // Primero vamos a obteber y almacenar los valores
      double precioDelArticulo = solicitarDouble(" Por favor ingrese el precio del Articulo: ");
      double montoPagoPorCliente = solicitarDouble(" ¿Cuanto a pagado el cliente? ");

      /*
       * Vamos a Llama al método procesarPago para calcular la diferencia entre el
       * pago y el precio del artículo,
       * y mostrar el mensaje adecuado al cliente dependiendo si necesita cambio,
       * falta dinero o el pago es exacto.
       */

      procesarPago(precioDelArticulo, montoPagoPorCliente);

   }

   // Metodo para solicitar un numero al usuario utilizando una ventana emergente
   private static double solicitarDouble(String mensaje){

      String entradaUsuario = JOptionPane.showInputDialog(null, mensaje);
      return Double.parseDouble(entradaUsuario);
   }

   // Metodo que maneja la logica del pago y muestra el resultado adecuado
   private static void procesarPago(double precioDelArticulo, double montoPagoPorCliente) {

      // Creamos una variable que guarde el calculo
      double diferenciaPago = montoPagoPorCliente - precioDelArticulo;

      // Creamos las condiciones con un if

      if (diferenciaPago < 0) {

         mostrarMensaje(" Falta dinero en el pago. El dinero faltante es de: " + Math.abs(diferenciaPago));

      } else if (diferenciaPago == 0) {

         mostrarMensaje(" Se a pagado exacto. No es necesario dar cambio. ");

      } else {

         mostrarMensaje(" El cambio es de: " + diferenciaPago);

      }

   }

   // Metodo para mostar mensajes al usuario une ventana emergente
   private static void mostrarMensaje(String mensaje) {

      JOptionPane.showMessageDialog(null, mensaje);
   }

}
