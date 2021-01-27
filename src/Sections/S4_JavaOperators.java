////////////////////////////////////////////////////////////////////////////////
//Sección 4: Fundamentos Java: Operadoress en Java
////////////////////////////////////////////////////////////////////////////////

package Sections;

public class S4_JavaOperators {
    public static void main(String[] args) {
        //23. Ejercicio: Operadores Aritméticos en Java
        int a = 3, b =2;
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
        
        if(b % 2 == 0)
            System.out.println("Es numero par");//Al tener una linea en el if, se pueden omitir las llaves "{}"
        else
            System.out.println("Es numero impar");//Al tener una linea en el else, se pueden omitir las llaves "{}"
        
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
        
    }
}
