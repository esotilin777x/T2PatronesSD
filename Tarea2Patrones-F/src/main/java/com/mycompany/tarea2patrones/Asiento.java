/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea2patrones;

/**
 *
 * @author LENOVO
 */
public class Asiento {
    private int idAsiento;
    private TipoAsiento tipoAsiento;
    private EstadoAsiento estadoAsiento;
    public Asiento(int idAsiento, TipoAsiento tipoAsiento, EstadoAsiento estadoAsiento) {
        this.idAsiento = idAsiento;
        this.tipoAsiento = tipoAsiento;
        this.estadoAsiento = estadoAsiento;
    }
    // Getters y setters
    public int getIdAsiento() {
        return idAsiento;
    }
    public void setIdAsiento(int idAsiento) {
        this.idAsiento = idAsiento;
    }
    public TipoAsiento getTipoAsiento() {
        return tipoAsiento;
    }
    public void setTipoAsiento(TipoAsiento tipoAsiento) {
        this.tipoAsiento = tipoAsiento;
    }
    public EstadoAsiento getEstadoAsiento() {
        return estadoAsiento;
    }
    public void setEstadoAsiento(EstadoAsiento estadoAsiento) {
        this.estadoAsiento = estadoAsiento;
    }
    public void cambiarEstado() {
        // Cambiar estado del asiento
    }
}
