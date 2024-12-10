/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea2patrones;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public class Funcion {
    private int idFuncion;
    private String horario;
    private List<Observer> observers = new ArrayList<>();

    public void suscribir(Observer observer) {
        observers.add(observer);
    }

    public void notificar() {
        for (Observer observer : observers) {
            observer.recibirNotificacion();
        }
    }

    public void cambiarHorario() {
        // Cambiar horario y notificar
        notificar();
    }

    public int getIdFuncion() {
        return idFuncion;
    }

    public void setIdFuncion(int idFuncion) {
        this.idFuncion = idFuncion;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public void setObservers(List<Observer> observers) {
        this.observers = observers;
    }


}
