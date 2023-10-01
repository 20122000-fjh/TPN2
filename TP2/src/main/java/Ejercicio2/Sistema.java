/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;
import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author Lenovo
 */
public class Sistema {
    String nombre;
    List<Documento> documento;
    List<Movimiento> movimiento;
    List<Area> area;
    
    public Sistema(String nombre){
        this.nombre = nombre;
        movimiento = new ArrayList<>();
        area = new ArrayList<>();
        documento = new ArrayList<>();
    }
    
    public void crear_expediente(int id,int anio, String letra, String anexo, LocalDate fechacreacion, int numero,List<Movimiento> movimiento){
        Expediente exp = new Expediente (id,anio,letra,anexo,fechacreacion,numero,movimiento);
        this.documento.add(exp);
    }
    
    public void crear_nota(int id, LocalDate fechacreacion, int numero, int anio, String asunto,List <Movimiento> movimiento){
        Nota note = new Nota(id,fechacreacion,numero, anio,asunto,movimiento);
        this.documento.add(note);
    }
    
    public void crea_correspondencia(int id, LocalDate fechacreacion, String remitente, String direccion,List<Movimiento>movimiento){
        Correspondencia corres = new Correspondencia(id,fechacreacion,remitente,direccion,movimiento);
        this.documento.add(corres);
    }
    
    public void crear_movimiento(int id, LocalDate fechamov){
        Movimiento move = new Movimiento(id,fechamov);
        this.movimiento.add(move);
    }
    
    public void crear_area(int id, String nomArea, String telefono,List <Documento> documento){
        Area are = new Area(id,nomArea,telefono,documento);
        this.area.add(are);
    }
    
    public void buscar_documento(int ID){
        for(Area ar:area){
            ar.encontrar_documento(ID);
        }
    }
}
