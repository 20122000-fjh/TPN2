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
public class Correspondencia extends Documento{
    private String remitente;
    private String direccion;
    public Correspondencia(int id, LocalDate fechacreacion, String remitente, String direccion,List<Movimiento>movimiento) {
        super(id, fechacreacion,movimiento);
        this.remitente = remitente;
        this.direccion = direccion;
    }
}
