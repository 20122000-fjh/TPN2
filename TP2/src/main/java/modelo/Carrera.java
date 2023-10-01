/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import static java.sql.DriverManager.println;
import java.util.Iterator;
import java.util.List;
import modelo.Plan;

/**
 *
 * @author Lenovo
 */
public class Carrera {
    private int idCarrera;
    public String nomCarrera;
    public List<Plan> plan;
    
    public Carrera(int idCarrera, String nomCarrera, List<Plan> plan){
        this.idCarrera = idCarrera;
        this.nomCarrera = nomCarrera;
        this.plan = plan;
    }
    
    public void imprimir_nombre(){
        System.out.println(nomCarrera);
    }
    
    public void imprimir_planes(){
        for(Plan planes:plan){
            System.out.println(planes.imprimir_nombre());
            planes.imprimir_materias();
        }
    }
}
