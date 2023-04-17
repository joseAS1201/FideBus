/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.util.ArrayList;

/**
 *
 * @author jose.siles
 */
public class NominaEmpleados {
    
     private ArrayList<Empleado> empleados;
    
    public NominaEmpleados() {
        empleados = new ArrayList<>();
    }
    
    public void agregarEmpleado(Empleado e) {
        empleados.add(e);
    }
    
    public void eliminarEmpleado(Empleado e) {
        empleados.remove(e);
    }
    
    public void listarEmpleados() {
        for (Empleado e : empleados) {
            System.out.println(e);
        }
    }
    
    public static class Empleado {
        
        private String nombre;
        private int numeroEmpleado;
        private ArrayList<String> rutasAsignadas;
        private ArrayList<String> horariosTrabajo;
        
        public Empleado(String nombre, int numeroEmpleado, ArrayList<String> rutasAsignadas, ArrayList<String> horariosTrabajo) {
            this.nombre = nombre;
            this.numeroEmpleado = numeroEmpleado;
            this.rutasAsignadas = rutasAsignadas;
            this.horariosTrabajo = horariosTrabajo;
        }
        
        public String getNombre() {
            return nombre;
        }
        
        public int getNumeroEmpleado() {
            return numeroEmpleado;
        }
        
        public ArrayList<String> getRutasAsignadas() {
            return rutasAsignadas;
        }
        
        public ArrayList<String> getHorariosTrabajo() {
            return horariosTrabajo;
        }
        
        @Override
        public String toString() {
            return "Empleado{" +
                    "nombre='" + nombre + '\'' +
                    ", numeroEmpleado=" + numeroEmpleado +
                    ", rutasAsignadas=" + rutasAsignadas +
                    ", horariosTrabajo=" + horariosTrabajo +
                    '}';
        }
    }
    
}
