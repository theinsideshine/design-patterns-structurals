package com.insideshine.structurals.patterns.bridge.banca.abstraction;


import com.insideshine.structurals.patterns.bridge.banca.implementor.Servicio;

public abstract class ServicioFactory {
    protected Servicio servicio;

    public ServicioFactory(Servicio ser){
        servicio = ser ;
    }

    public abstract void prepararServicio();

}
