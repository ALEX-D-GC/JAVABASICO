package Numero_Par_Impar;

//Importamos la clase scanner 
import java.util.Scanner;

public class Numero_Par_Impar2 {

    // Primero declaramos o creamos un metodo llamado leerNumero()
    // public --> Significa que este método puede ser accedido desde cualquier parte
    // del código.
    // Static --> Este método se puede llamar sin necesidad de crear un objeto de la
    // clase.
    // int Indica que este método devolverá un número entero (int).
    // leerNumero No tiene parámetros de entrada, lo que significa que no requiere
    // datos para ejecutarse.
    public static int leerNumero() {

        // Creamos un Scanner para leer los datos del usuario
        // Scanner --> Es una clase en Java que permite leer datos de entrada (como
        // números o texto) que el usuario escribe desde el teclado.
        // in --> Es el nombre que le damos al objeto Scanner. Usaremos este nombre para
        // referirnos a este objeto más adelante.
        // new Scanner(System.in);--> Aquí estamos creando un nuevo objeto de tipo
        // Scanner, que será utilizado para leer datos desde la consola (entrada
        // estándar System.in).
        Scanner in = new Scanner(System.in);

        // Imprimimos un mensaje para el usuario indicandole que ingrese un numero
        // System.out.print();--> Se usa para mostrar un mensaje en la consola sin un
        // salto de línea al final.
        // Por favor ingrese un numero --> Es el mensaje que aparecerá en pantalla
        // pidiéndole al usuario que ingrese un número.
        // int numero --> Declaramos una variable de tipo int (entero) llamada numero.
        // in.nextInt(); --> El objeto Scanner (en este caso in) usa el método nextInt()
        // para leer el siguiente número entero que el usuario ingrese en la consola.
        // El número ingresado se guarda en la variable numero.
        System.out.print("Por favor ingrese un numero: ");
        int numero = in.nextInt();

        // Crearamos el objeto Scanner
        /*
         * Aquí estamos cerrando el objeto Scanner usando el método close(). Esto es
         * importante porque,
         * una vez que ya no necesitemos leer más datos, es una buena práctica cerrar el
         * Scanner para liberar recursos.
         */
        in.close();

        // Creamos return para retor nar un numero
        /*
         * El método devuelve el valor de la variable numero a quien llamó este método.
         * Esto permite que
         * el número que el usuario ingresó sea utilizado en otras partes del programa.
         */
        return numero;

    }

    // Creamos o declaramos otro metodo para verificar si un numero es par o impar
    // public --> Significa que este método puede ser accedido desde cualquier parte
    // Static --> Este método se puede llamar sin necesidad de crear un objeto de la
    // clase.
    // void --> Este método no devuelve ningún valor (solo realiza una acción, que
    // en este caso es imprimir si el número es par o impar).
    /*
     * verificarParImpar(int numero) --> El método recibe un parámetro de tipo int
     * (un número entero) que se
     * llama numero. Este número será el que el método va a verificar si es par o
     * impar.
     */
    public static void verificarParImpar(int numero) {

        // Dentro del metodo creamos una condicion if
        /*
         * if Inicia una estructura condicional. El programa ejecutará el bloque de
         * código dentro
         * de este if si la condición es verdadera.
         */
        if (numero % 2 == 0) {/*
                               * Esta es la condición. Aquí usamos el operador de módulo
                               * (%) para dividir el número por 2 y obtener el resto de esa división.
                               */

            // Aqui estamos imprimiendo un mensaje en caso de que se cumpla que es par
            System.out.print(" El " + numero + " que ingreso es par");
            /*
             * Si la condición del if no se cumple (es decir, si el número no es par), el
             * bloque de
             * código dentro del else se ejecutará.
             */
        } else {

            // Y imprimimos un mensaje que diga que el numero es impar
            System.out.print(" El " + numero + " que ingreso no es para es impar");

        }

    }

    // Ahora crearemos el metodo main para poder llamar a los metodos
    public static void main(String[] args) {
        int numero = leerNumero(); // Llamamos al método para leer el número
        verificarParImpar(numero); // Llamamos al método para verificar si es par o impar
    }
}
