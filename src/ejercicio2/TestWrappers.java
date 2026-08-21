/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author Luis Alva
 */
public class TestWrappers {
    
    public static void main(String[] args) {
        
        int num1 = 12428;
        float num2 = 3.1416f;
        double num3 = 2.728E05;
        char c1 = 'c';
        Integer objNum1;
        Float objNum2;
        Double objNum3;
        Character objC1;
        
        // boxing
        objNum1 = new Integer(num1);
        objNum2 = new Float(num2);
        objNum3 = new Double(num3);
        objC1 = new Character(c1);
        
        // autoboxing
        objC1 = c1;
        
        // desplegar los objetos
        objNum1 = num1;
        objNum2 = num2;
        objNum3 = num3;
        System.out.println("objNum1: " + objNum1);
        System.out.println("objNum2: " + objNum2);
        System.out.println("objNum3: " + objNum3);
        System.out.println("objC1: " + objC1);

        //Imprimir los números en diferentes formatos
        System.out.println("num1 binario: " + Integer.toBinaryString(num1));
        System.out.println("num2 hexadecimal: " + Float.toHexString(num2));
        System.out.println("num3 como string : " + Double.toString(num3));

        // Determina si el char dado es mayúscula
        System.out.println("¿c1 es mayuscula?: " + Character.isUpperCase(c1));

    }
}
