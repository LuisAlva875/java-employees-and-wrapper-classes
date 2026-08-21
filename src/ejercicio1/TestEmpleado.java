/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author Luis Alva
 */
public class TestEmpleado {

    public static void main(String[] args) {
        
        Empleado emp1 = new Empleado("Juan Velasco", "Sistemas", 10000);
        Empleado emp2 = new Empleado("Pedro Meneses", "Ventas", 4000);
        
        System.out.println(emp1);
        System.out.println(emp2);
        
        System.out.println("¿emp1 = emp2? " + emp1.equals(emp2));
        
        Empleado emp3 = new Empleado("Juan Velasco", "Sistemas", 10000);
        
        System.out.println("¿emp1 = emp3? " + emp1.equals(emp3));
        System.out.println("emp1 hashcode es: " + emp1.hashCode());
        System.out.println("emp2 hashcode es: " + emp2.hashCode());
        System.out.println("emp3 hashcode es: " + emp3.hashCode());
    }
}
