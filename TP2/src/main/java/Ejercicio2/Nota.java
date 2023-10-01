/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public class Nota extends Documento{
    private String asunto;
    private int numero;
    private int anio;
    public Nota(int id, LocalDate fechacreacion, int numero, int anio, String asunto,List <Movimiento> movimiento) {
        super(id, fechacreacion,movimiento);
        this.asunto = asunto;
        this.numero = numero;
        this.anio = anio;
    }
    
}
