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
public class Empleado {
    
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

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumeroEmpleado(int numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

    public void setRutasAsignadas(ArrayList<String> rutasAsignadas) {
        this.rutasAsignadas = rutasAsignadas;
    }

    public void setHorariosTrabajo(ArrayList<String> horariosTrabajo) {
        this.horariosTrabajo = horariosTrabajo;
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
