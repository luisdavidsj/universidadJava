////////////////////////////////////////////////////////////////////////////////
//Sección 4: Fundamentos Java: Operadoress en Java
////////////////////////////////////////////////////////////////////////////////
package Sections;

public class S4_JavaOperators {

    public static void main(String[] args) {
        //23. Ejercicio: Operadores Aritméticos en Java
        int a = 3, b = 2;
        var resultado = a + b;
        System.out.println("resultado suma = " + resultado);

        resultado = a - b;
        System.out.println("resultado resta= " + resultado);

        resultado = a * b;
        System.out.println("resultado multiplicación = " + resultado);

        var resultado2 = 3D / b;
        System.out.println("resultado división = " + resultado2);

        resultado = a % b;
        System.out.println("resultado modulo= " + resultado);

        if (b % 2 == 0) {
            System.out.println("Es numero par");//Al tener una linea en el if, se pueden omitir las llaves "{}"
        } else {
            System.out.println("Es numero impar");//Al tener una linea en el else, se pueden omitir las llaves "{}"
        }
        //25. Ejercicio: Operadores de Asignación en Java
        int a2 = 3, b2 = 2;
        int c = a2 + 5 - b2;
        System.out.println("c = " + c);

        a2 += 1;//a2 = a2 + 1
        System.out.println("a2 = " + a2);//Suma

        a2 += 3;//a2 = a2 + 3
        System.out.println("a2 = " + a2);//Suma

        a2 -= 2;//a2 = a2 - 2
        System.out.println("a2 = " + a2);//Resta

        a2 *= 2;//a2 = a2 * 2
        System.out.println("a2 = " + a2);//Multiplicacion

        a2 /= 2;//a2 = a2 / 2
        System.out.println("a2 = " + a2);//Division

        a2 %= 2;//a2 = a2 % 2
        System.out.println("a2 = " + a2);//Residuo

        //26. Ejercicio: Operadores Unarios en Java
        var a3 = 3;
        var b3 = -a3;
        System.out.println("a3 = " + a3);
        System.out.println("b3 = " + b3);

        var c2 = true;
        var d = !c2;
        System.out.println("c2 = " + c2);
        System.out.println("d = " + d);

        //incremento
        //l.preincremento (símbolo antes de la variable)
        var e = 3;
        var f = ++e;//primero se incrementa la variable y desspués de usa su valor
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        //2.postincremento (simbolo despues de la variable)
        var g = 5;
        var h = g++;//primero se utiliza el valor y después se incrementa
        System.out.println("g = " + g);//teniamos pendiente un incremento
        System.out.println("h = " + h);

        //decremento
        //1.predecremento
        var i = 2;
        var j = --i;
        System.out.println("i = " + i);//ya esta decrementada
        System.out.println("j = " + j);
        //2.postdecremento
        var k = 4;
        var l = k--;//primero se usa el valor de la variable y queda pendiente el decremento
        System.out.println("k = " + k);//tenia pendiente un decremento
        System.out.println("l = " + l);

        //27. Ejercicio: Operadores de Igualdad y Relacionales en Java
        //Operadores de igualdad
        var a4 = 3;
        var b4 = 2;

        var c3 = (a4 == b4);//Con parentesiss
        System.out.println("c3 = " + c3);

        var d2 = a4 != b4;//Sin parentesis
        System.out.println("d2 = " + d2);

        var cadena = "Hola";
        var cadena2 = "Hola";
        var e2 = cadena == cadena2;//Compara referencia de objetos
        System.out.println("e2 = " + e2);

        var f2 = cadena.equals(cadena2);//Comparamos contenido de cadenas
        System.out.println("f2 = " + f2);
        
        //28. Ejercicio: Operadores Relacionales
        //Operadores relacionales
        var g2 = a4 >= b4;//mayor que > o el mayor o igual >=, usar parentesis es opcional
        System.out.println("g2 = " + g2);

        if (a4 % 2 == 0) {//si es numero par, es multiplo de 2
            System.out.println("Es numero par");//Debido a que el if tiene solamente una linea de codigo de manera interna, entonces no es necesario poner llaves
        } else {
            System.out.println("Es numero impar");
        }
        
        var edad = 10;
        var adulto = 18;
        if (edad >= adulto) {
            System.out.println("Es un adulto");
        }
        else{
            System.out.println("Es menor de edad");
        }
        
        //29. Ejercicio: Operadores Condicionales en Java
        var a5 = 10;
        var valorMinimo = 0;
        var valorMaximo = 10;
        //Operador AND: &&
        var resultado3 = a5 >= valorMinimo && a5 <= valorMaximo;//Se pueden usar parentesis en la expresion
        if (resultado3) {//Tambien puede ser: if (resultado3 == true) {...}
            System.out.println("Dentro de rango");
        }
        else {
            System.out.println("Fuera de rango");
        }
        //Operador OR: ||
        var vacaciones = true;
        var diaDescanso = false;
        if (vacaciones || diaDescanso) {
            System.out.println("Padre puede asistir al juego de su hijo");
        }
        else{
            System.out.println("El padre esta ocupado");
        }
    }
}
