package Numero_Par_Impar;

//Primero importamos la clase Scanner para leer la entrada del usuario 
import java.util.Scanner;

public class Numero_Par_Impar {
    public static void main(String[] args) {

        // Creamos una istancia de scanner para leer la entreada del usuario
        Scanner in = new Scanner(System.in);

        // En la siguiente linea vamos hacer dos cosas
        // Uno pedirle al usuario que ingrese un numero con System.out.print
        System.out.print("Por favor ingrese un numero: "); // Aqui utilizamos esta linea para interactuar con el usuario
        // Dos vamos a crear la variable y nombrarla en la cual vamos a guardar el
        // numero que el usuario ingrese
        int numero = in.nextInt();// Esta linea captura el número entero que el usuario ingresa y lo almacena en
                                  // la variable numero.

        // Ahora vamos a verificar si el numero es par o impar
        // Creamos un candicion o condicional if y else

        if (numero % 2 == 0) {// En esta linea le decimos que el numero que ingreso el usuario es divisible
                              // para dos y su resultado es 0 es par

            // Entonces imprimimos un mesaje
            System.out.print("El numero que ingreso es par: " + numero);

            // cramos otra condicional en caso de que no sea verdadero

        } else {
            System.out.println("el numero que ingreso : " + numero + " no es par ");

        }

    }

}
