////////////////////////////////////////////////////////////////////////////////
//Sección 4, trabajo 5: Fundamentos Java: Operadores en Java
////////////////////////////////////////////////////////////////////////////////

package Sections;

import java.util.Scanner;

public class S4_A5_HighestNumber {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("Proporciona el numero1:");
        int numero1 = Integer.parseInt(consola.nextLine());
        System.out.println("Proporciona el numero2:");
        int numero2 = Integer.parseInt(consola.nextLine());
        System.out.println("El numero mayor es:");
        System.out.println(numero1 > numero2 ? numero1 : numero2);
    }
}
