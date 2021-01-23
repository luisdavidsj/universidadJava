////////////////////////////////////////////////////////////////////////////////
//Sección 2, trabajo 2: Fundamentos Java: Variables en Java
////////////////////////////////////////////////////////////////////////////////

package Sections;

import java.util.Scanner;

/**
 *
 * @author SpiderWolf
 */
public class S2_A2_BookDetails {
    public static void main(String[] args) {
        //Ejercicio clase scanner
        Scanner consola2 = new Scanner(System.in);//Se coloca primero
        System.out.println("Proporciona el titulo: ");
        var titulo3 = consola2.nextLine();
        System.out.println("Proporciona el autor: ");
        var autor = consola2.nextLine();
        System.out.println(titulo3 + " fue escrito por " + autor);
    }
}
