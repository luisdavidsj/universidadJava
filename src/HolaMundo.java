//Mi clase en Java
public class HolaMundo {
    public static void main(String args[]){
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
        
    }
}
