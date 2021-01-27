////////////////////////////////////////////////////////////////////////////////
//Sección 4, trabajo 4: Fundamentos Java: Operadoress en Java
////////////////////////////////////////////////////////////////////////////////

package Sections;

import java.util.Scanner;

public class S4_A4_RectangleAreaPerimeter {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("Proporciona el alto:");
        int alto = Integer.parseInt(consola.nextLine());
        System.out.println("Proporciona el ancho:");
        int ancho = Integer.parseInt(consola.nextLine());
        int area = alto * ancho;
        int perimetro = (alto + ancho) * 2;
        System.out.println("Area: " + area);
        System.out.println("Perimetro: " + perimetro);
    }
}
