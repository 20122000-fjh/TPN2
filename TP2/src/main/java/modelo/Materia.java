/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Lenovo
 */
public class Materia {
    private int idMat;
    private String nomMat;
    private int anioCursado;
    public Materia(int idMat, String nomMat, int anioCursado){
        this.idMat = idMat;
        this.anioCursado = anioCursado;
        this.nomMat = nomMat;
    }
    
    public String imprimir_materia(){
        return nomMat;
    }
    
    public String imprimir_anio(){
        return String.valueOf(anioCursado);
    }
}
