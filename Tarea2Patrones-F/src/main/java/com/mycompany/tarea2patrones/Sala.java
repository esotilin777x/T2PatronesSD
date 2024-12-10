/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea2patrones;
import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author LENOVO
 */

public class Sala {
    private int idSala;
    private String nombre;
    private LinkedList<Asiento> asientos;

    // Constructor
    public Sala(int idSala, String nombre) {
        this.idSala = idSala;
        this.nombre = nombre;
        this.asientos = new LinkedList<>(); // Inicialización de la lista de asientos
    }

    // Método para obtener un iterador de los asientos
    public Iterator<Asiento> getIterator() {
        return new SalaAsientoIterator(this);
    }

    // Método para agregar un asiento a la sala
    public void agregarAsiento(Asiento asiento) {
        this.asientos.add(asiento);
    }

    // Getter para obtener los asientos
    public LinkedList<Asiento> getAsientos() {
        return asientos;
    }

    // Getter y setter para idSala
    public int getIdSala() {
        return idSala;
    }

    public void setIdSala(int idSala) {
        this.idSala = idSala;
    }

    // Getter y setter para nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

