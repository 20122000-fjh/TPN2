/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;

import java.util.ArrayList;
import java.util.List;
import modelo.Carrera;
import modelo.Materia;
import modelo.Plan;

/**
 *
 * @author Lenovo
 */
public class Mavenproject2 {

    public static void main(String[] args) {
        Materia Prog_avanzada = new Materia(1,"Programación Avanzada I",2023);
        Materia Fisica = new Materia(2,"Fisica I",2023);
        Materia Construccion = new Materia(3,"Construccion I",2023);
        Materia Estructuras = new Materia(4,"Estructuras I",2023);
        List<Materia> listaMateriasIng = new ArrayList<>();
        listaMateriasIng.add(Fisica);
        listaMateriasIng.add(Prog_avanzada);
        Plan plan1 = new Plan(1,"Plan 1",2015,listaMateriasIng);
        Plan plan2 = new Plan(2,"Plan 2",2016,listaMateriasIng);
        Plan plan3 = new Plan(3,"Plan 3",2017,listaMateriasIng);
        List<Materia> listaMateriasArq = new ArrayList<>();
        listaMateriasArq.add(Construccion);
        listaMateriasArq.add(Estructuras);
        Plan plan4 = new Plan(4,"Plan 4",2015,listaMateriasArq);
        List<Plan> listaPlanesIng = new ArrayList<>();
        listaPlanesIng.add(plan1);
        listaPlanesIng.add(plan2);
        listaPlanesIng.add(plan3);
        Carrera IngInformatica = new Carrera(1,"Ingeniería en Informática",listaPlanesIng);
        List<Plan> listaPlanesArq = new ArrayList<>();
        listaPlanesArq.add(plan4);
        Carrera Arquitectura = new Carrera(2,"Arquitectura",listaPlanesArq);
        IngInformatica.imprimir_nombre();
        IngInformatica.imprimir_planes();
    }
}
