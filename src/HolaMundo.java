//Mi clase en Java
public class HolaMundo {
    public static void main(String args[]){
        /********************************
        ***********Sección 1*************
        ********************************/
        System.out.println("Hola mundo");
        
        //Definimos la variable
        int miVariableEntera = 10;
        System.out.println(miVariableEntera);
        
        //Modificamos el valor de la variable
        miVariableEntera = 5;
        System.out.println(miVariableEntera);
        
        String miVariableCadena = "Hola";
        System.out.println(miVariableCadena);
        
        miVariableCadena = "Adiós";
        System.out.println(miVariableCadena);
        
        //test, BORRAR
        String myString = "qwerty123456";
        if (myString.matches("[A-Za-z0-9]+")){
            System.out.println("alfanumerico OK");
        }

        //otro test
        int i = 10;

        if (i == 10) {
            System.out.println("Nombre medicamento verificado");
            if (i < 15) {
                System.out.println("Tipo medicamento verificado");
                if (i < 14){
                    System.out.println("Cantidad del producto verificado");
                    if (i < 13){
                        System.out.println("Distrivuidor OK");
                        if (i < 12){
                            System.out.println("Sucursal OK");
                        }
                    }
                }
            }
        } else {
            System.out.println("MENSAJE DE ERROR");
        }
    }
}
