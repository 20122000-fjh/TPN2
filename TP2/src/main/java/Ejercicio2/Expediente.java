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
public class Expediente extends Documento{
    private int numero;
    private int anio;
    private String letra;
    private String anexo;
    public Expediente(int id, int anio, String letra, String anexo, LocalDate fechacreacion, int numero,List<Movimiento> movimiento) {
        super(id, fechacreacion,movimiento);
        this.numero = numero;
        this.anio = anio;
        this.letra = letra;
        this.anexo = anexo;
    }
    
}
