/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea2patrones;

/**
 *
 * @author LENOVO
 */
public class Sala3DFactory extends SalaFactory {
    
    @Override
    public Sala crearSala() {
        return new Sala(1, "Sala 3D");
    }
}