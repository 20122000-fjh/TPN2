/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;
import java.time.LocalDate;
import java.util.List;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author Lenovo
 */
public class Documento {
    private int id;
    private LocalDate fechacreacion;
    public List<Movimiento> movimiento;
    
    public Documento(int id,LocalDate fechacreacion, List<Movimiento> movimiento){
        this.id = id;
        this.fechacreacion = fechacreacion;
        this.movimiento = movimiento;
    }
    
    public LocalDate get_fecha(){
        return fechacreacion;
    }
    
    public int get_id(){
        return id;
    }
    
    public void imprimir_id(){
        System.out.println("ID: "+ id);
    }
    
    public void imprimir_fecha(){
        DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fechaFormateada = fechacreacion.format(formateador);
        System.out.println("Fecha de creación: " + fechaFormateada);
    }
}
