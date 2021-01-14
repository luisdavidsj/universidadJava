
import java.util.Scanner;

//Mi clase en Java
public class HolaMundo {

    public static void main(String args[]) {
        /*
        **Sección 1
        **Fundamentos Java: Instalación Java 15 y Apache NetBeans
         */

        System.out.println("Hola mundo");

        /*
        **Sección 2
        **Fundamentos Java: Variables en Java
         */
        //Definimos la variable tipo: int
        int miVariableEntera = 10;
        System.out.println(miVariableEntera);
        //Modificamos el valor de la variable
        miVariableEntera = 5;
        System.out.println(miVariableEntera);

        //Definimos la variable tipo: String
        String miVariableCadena = "Hola";
        System.out.println(miVariableCadena);
        //Modificamos el valor de la variable
        miVariableCadena = "Adiós";
        System.out.println(miVariableCadena);

        //var - Inferencia de tipos en Java
        var miVariableEntera2 = 15;
        System.out.println(miVariableEntera2);
        var miVariableCadena2 = "Nueva Cadena";
        System.out.println("miVariableCadena2 = " + miVariableCadena2);

        //Valores permitidos en el nombre de variables
        var miVariable = 1;//La regla más recomendada
        var _miVariable = 2;
        var $miVariable = 3;
        //var áVariable = 10; No se recomienda utilizar
        //var #miVariable = 2; No se permite utilizar caracteres especiales

        //Concatenacion
        var usuario = "Juan";
        var titulo = "Ingeniero";

        var union = titulo + " " + usuario;
        System.out.println("union = " + union);

        var i = 3;
        var j = 4;

        System.out.println(i + j);//Se realiza la suma de números
        System.out.println(i + j + usuario);//Evaluacion de izq a der, se realiza suma
        System.out.println(usuario + i + j);//Contexto cadena, todo es una cadena
        System.out.println(usuario + (i + j));//Uso de parentesis modifican la prioridad en la evaluación

        //Caracteres especiales en Java
        var nombre = "karla";

        System.out.println("Nueva linea: \n" + nombre);
        System.out.println("Tabulador: \t" + nombre);
        System.out.println("Retroceso: \b" + nombre);
        System.out.println("Comilla simple: \'" + nombre + "\'");
        System.out.println("Comilla doble: \"" + nombre + "\"");

        //Clase Scanner en Java
        System.out.println("Escribe tu nombre: ");
        Scanner consola = new Scanner(System.in);
        var usuario2 = consola.nextLine();
        System.out.println("usuario = " + usuario2);
        System.out.println("Escribe el titulo: ");
        var titulo2 = consola.nextLine();
        System.out.println("Resultado: " + titulo2 + " " + usuario2);

        //Ejercicio clase scanner
        Scanner consola2 = new Scanner(System.in);//Se coloca primero
        System.out.println("Proporciona el titulo: ");
        var titulo3 = consola2.nextLine();
        System.out.println("Proporciona el autor: ");
        var autor = consola2.nextLine();
        System.out.println(titulo3 + " fue escrito por " + autor);

        /*
        **Sección 3
        **Fundamentos Java: Tipos Primitivos en Java
         */
        /*
            Tipos primitivos enteros: byte, short, int, long
         */
        byte numeroByte = (byte) 129;
        System.out.println("Valor byte: " + numeroByte);
        System.out.println("Valor minimo byte: " + Byte.MIN_VALUE);
        System.out.println("Valor maximo byte: " + Byte.MAX_VALUE);

        short numeroShort = (short) 32768;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("Valor minimo short: " + Short.MIN_VALUE);
        System.out.println("Valor maximo short: " + Short.MAX_VALUE);
        
        int numeroInt = (int)2147483648L;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("Valor minimo: " + Integer.MIN_VALUE);
        System.out.println("Valor maximo: " + Integer.MAX_VALUE);
        
        long numeroLong = 9223372036854775807L;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("Valor minimo long: " + Long.MIN_VALUE);
        System.out.println("Valor maximo long: " + Long.MAX_VALUE);
        

    }
}
