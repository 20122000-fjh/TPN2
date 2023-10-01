/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;
import java.util.List;
import java.time.LocalDate;
import java.lang.reflect.Field;

/**
 *
 * @author Lenovo
 */
public class Area {
    private int id;
    private String nomArea;
    private String telefono;
    private List<Documento> documento; 
    
    public Area(int id, String nomArea, String telefono,List <Documento> documento){
        this.id = id;
        this.nomArea = nomArea;
        this.telefono = telefono;
        this.documento = documento;
    }
    
    public void listar_documentos(LocalDate fecha){
        for(Documento docu:documento){
            if(docu.get_fecha().equals(fecha)){
                docu.imprimir_id();
                docu.imprimir_fecha();
            }
        }
    }
    
    public void encontrar_documento(int id_buscado){
        for(Documento docu:documento){
            int id_encontrado = docu.get_id();
            if(id_buscado == id_encontrado){
                System.out.println("El documento con ID " + id_encontrado + " está en el área " + nomArea);
            }
        }
    }
}
