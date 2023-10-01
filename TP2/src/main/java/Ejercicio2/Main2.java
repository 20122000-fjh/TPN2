/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;
import java.util.List;
import java.time.LocalDate;

/**
 *
 * @author Lenovo
 */
public class Main2 {
    public static void main(String[] args){
        Sistema sist = new Sistema("SISTEMA");
        sist.crear_movimiento(1, LocalDate.of(2023,1,9));
        sist.crear_expediente(1, 2023, "L", "C",LocalDate.of(2023,1,9), 1,sist.movimiento);
        sist.crear_area(1, "Area1", "3764", sist.documento);
        sist.buscar_documento(1);
    }
}
