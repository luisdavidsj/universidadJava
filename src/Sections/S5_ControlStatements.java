////////////////////////////////////////////////////////////////////////////////
//Sección 5: Fundamentos Java: Operadores en Java
////////////////////////////////////////////////////////////////////////////////
package Sections;

public class S5_ControlStatements {

    public static void main(String[] args) {
        //33. Sentencia de control if - else en Java
        var condicion = true;
        if (condicion) {
            System.out.println("Condicion verdadera");
        } else {
            System.out.println("Condicion falsa");
        }
        
        //34. Ejercicio If - else en Java
        var numero = 4;
        var numeroTexto = "Numero desconocido";
        
        if (numero == 1) {
            numeroTexto = "Numero Uno";
        }
        else if (numero == 2) {
            numeroTexto = "Numero Dos";
        }
        else if (numero == 3) {
            numeroTexto = "Numero Tres";
        }
        else if (numero == 4) {
            numeroTexto = "Numero Cuatro";
        }
        else{
            numeroTexto = "Numero no encontrado";
        }
        
        System.out.println("numeroTexto = " + numeroTexto);
    }
}
