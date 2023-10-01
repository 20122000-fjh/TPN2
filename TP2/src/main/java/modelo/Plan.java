/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.List;

/**
 *
 * @author Lenovo
 */
public class Plan {
    private int idPlan;
    private String nomPlan;
    private int anioInicio;
    private List<Materia> materia;
    
    public Plan(int idPlan, String nomPlan, int anioInicio,List<Materia> materia){
        this.idPlan = idPlan;
        this.nomPlan = nomPlan;
        this.anioInicio = anioInicio;
        this.materia = materia;
    }
    
    public String imprimir_nombre(){
        return nomPlan;
    }
    
    public void imprimir_materias(){
        for(Materia materias:materia){
            System.out.println(materias.imprimir_materia());
            System.out.println(materias.imprimir_anio());
        }
    }
    
    
}
