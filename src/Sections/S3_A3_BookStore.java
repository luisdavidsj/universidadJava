////////////////////////////////////////////////////////////////////////////////
//Sección 3, trabajo 3: Fundamentos Java: Tipos Primitivos en Java
////////////////////////////////////////////////////////////////////////////////

package Sections;

import java.util.Scanner;

public class S3_A3_BookStore {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("Proporciona el nombre:");
        String nombre = consola.nextLine();
        System.out.println("Proporciona el id:");
        int id = Integer.parseInt(consola.nextLine());
        System.out.println("Proporciona el precio:");
        double precio = Double.parseDouble(consola.nextLine());
        System.out.println("Proporciona el envío gratuito:");
        boolean envio = Boolean.parseBoolean(consola.nextLine());
        
        System.out.println(nombre + " #" + id);
        System.out.println("Precio: $" + precio);
        System.out.println("Envio gratuito: " + envio);
    }
}
