package pedirnombreteclado;

import java.util.Scanner;

public class PedirNombreTeclado {

   public static void main(String[] args) {
      
      // Crear un Scanner
      Scanner in = new Scanner(System.in);

      // Pedir al usuario que ingrese su nombre
      System.out.println("Por favor ingrese su nombre: ");
      String nombre = in.nextLine();

      // Saludar al usuario
      System.out.println("Hola, ¿cómo estás " + nombre + "? Un gusto saludarte.");

      // Cerrar el Scanner para evitar fugas de recursos
      in.close();
   }
}