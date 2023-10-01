/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;
import java.time.LocalDate;
/**
 *
 * @author Lenovo
 */
public class Movimiento {
    private int id;
    private LocalDate fechamov;
    
    public Movimiento(int id, LocalDate fechamov){
        this.id = id;
        this.fechamov = fechamov;
    }
}
