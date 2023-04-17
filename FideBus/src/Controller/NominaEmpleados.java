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
    
  
}
