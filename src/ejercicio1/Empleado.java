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
import java.text.NumberFormat;

public class Empleado {

    private String nombre;
    private String departamento;
    private float sueldo;

    public Empleado(String nombre, String departamento, float sueldo) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public boolean equals(Object o) {
        boolean result = false;
        if ((o != null) && (o instanceof Empleado)) {
            Empleado e = (Empleado) o;
            if (getNombre().equals(e.getNombre())
                    && getDepartamento().equals(e.getDepartamento())) {
                result = true;
            }
        }
        return result;
    }

    @Override
    public int hashCode() {
        return (getNombre().hashCode()
                ^ getDepartamento().hashCode()
                ^ Float.hashCode(sueldo));
    }

    @Override
    public String toString() {
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        return "El empleado " + this.nombre
                + " trabaja en el departamento de " + this.departamento
                + " y gana " + nf.format(sueldo);
    }
}