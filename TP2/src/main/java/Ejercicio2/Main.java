/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Lenovo
 */
public class Main {
    public static void main(String[] args){
        Movimiento movimiento1 = new Movimiento(1,LocalDate.of(2023,8,6));
        Movimiento movimiento2 = new Movimiento(1,LocalDate.of(2023,8,6));
        List <Movimiento> moves = new ArrayList<>();
        moves.add(movimiento1);
        moves.add(movimiento2);
        Expediente expediente1 = new Expediente(1,2023,"G","C",LocalDate.of(2023,1,9),5,moves);
        Expediente expediente2 = new Expediente(2,2022,"F","D",LocalDate.of(2022,2,6),8,moves);
        Nota nota1 = new Nota(1,LocalDate.of(2022, 3, 15),5,2022,"Asunto1",moves);
        Nota nota2 = new Nota(2,LocalDate.of(2021, 3, 15),6,2021,"Asunto2",moves);
        Correspondencia correspondencia1 = new Correspondencia(1,LocalDate.of(2023,5,6),"Remitente1","Direccion1",moves);
        Correspondencia correspondencia2 = new Correspondencia(2,LocalDate.of(2022,5,6),"Remitente2","Direccion2",moves);
        List<Documento> docus = new ArrayList<>();
        docus.add(expediente1);
        docus.add(expediente2);
        Area area1 = new Area(1,"Área1","376471401",docus);
        Area area2 = new Area(2,"Area2","3764589121",docus);
        System.out.println("Ingrese una fecha");
        Scanner teclado = new Scanner(System.in);
        String fecha_ingresada = teclado.nextLine();
        DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fecha = LocalDate.parse(fecha_ingresada, formateador);
        area1.listar_documentos(fecha);
        area2.listar_documentos(fecha);
    }
}
