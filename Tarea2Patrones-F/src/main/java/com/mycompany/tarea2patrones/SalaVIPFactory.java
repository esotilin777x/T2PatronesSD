/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea2patrones;

/**
 *
 * @author LENOVO
 */
public class SalaVIPFactory extends SalaFactory {
    @Override
    public Sala crearSala() {
        return new Sala(2, "Sala VIP");
    }
}
