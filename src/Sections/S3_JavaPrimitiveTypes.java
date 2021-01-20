/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sections;

/**
 *
 * @author SpiderWolf
 */
public class S3_JavaPrimitiveTypes {

    public static void main(String[] args) {
        /*
        **Sección 3
        **Fundamentos Java: Tipos Primitivos en Java
         */
        /*
            Tipos primitivos del tipo entero: byte, short, int, long
         */
        byte numeroByte = (byte) 129;
        System.out.println("Valor byte: " + numeroByte);
        System.out.println("Valor minimo byte: " + Byte.MIN_VALUE);
        System.out.println("Valor maximo byte: " + Byte.MAX_VALUE);

        short numeroShort = (short) 32768;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("Valor minimo short: " + Short.MIN_VALUE);
        System.out.println("Valor maximo short: " + Short.MAX_VALUE);

        int numeroInt = (int) 2147483648L;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("Valor minimo: " + Integer.MIN_VALUE);
        System.out.println("Valor maximo: " + Integer.MAX_VALUE);

        long numeroLong = 9223372036854775807L;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("Valor minimo long: " + Long.MIN_VALUE);
        System.out.println("Valor maximo long: " + Long.MAX_VALUE);

        /*
            Tipos primitivos del tipo flotante: float y double
         */
        float numeroFloat = (float) 3.4028235E38D;
        System.out.println("numeroFloat = " + numeroFloat);
        System.out.println("Valor minimo tipo float: " + Float.MIN_VALUE);
        System.out.println("Valor maximo tipo float " + Float.MAX_VALUE);

        double numeroDouble = 1.7976931348623157E308D; //La D es opcional
        System.out.println("numeroDouble = " + numeroDouble);
        System.out.println("Valor minimo tipo double: " + Double.MIN_VALUE);
        System.out.println("Valor maximo tipo double " + Double.MAX_VALUE);

        /*
            Inferencia de tipos con var y tipos primitivos
         */
        var numeroEntero = 10;
        System.out.println("numeroEntero = " + numeroEntero);
        
        var numeroDouble2 = 10.0;
        System.out.println("numeroDouble2 = " + numeroDouble2);
        
        var numeroFloat2 = 10.0F;
        System.out.println("numeroFloat2 = " + numeroFloat2);
        
        /*
            Tipos primitivos del tipo char
         */
        char miCaracter = 'a';
        System.out.println("miCaracter = " + miCaracter);
        
        char varChar = '\u0021';
        System.out.println("varChar = " + varChar);
        
        char varCharDecimal =  33;
        System.out.println("varCharDecimal = " + varCharDecimal);
        
        char varCharSimbolo = '!';
        System.out.println("varCharSimbolo = " + varCharSimbolo);
        
        var varChar1 = '\u0021';
        System.out.println("varChar1 = " + varChar1);
        
        var varCharDecimal2 =  33;
        System.out.println("varCharDecimal2 = " + varCharDecimal2);
        var varCharDecimal3 = (char)33; //int convertido a char
        System.out.println("varCharDecimal3 = " + varCharDecimal3);
        
        var varCharSimbolo3 = '!';
        System.out.println("varCharSimbolo3 = " + varCharSimbolo3);
        
        int letra = 'A';
        System.out.println("letra = " + letra);
    }
}
