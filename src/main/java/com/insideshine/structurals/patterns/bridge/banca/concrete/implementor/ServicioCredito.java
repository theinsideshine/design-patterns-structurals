package com.insideshine.structurals.patterns.bridge.banca.concrete.implementor;

import com.insideshine.structurals.patterns.bridge.banca.implementor.Servicio;

public class ServicioCredito implements Servicio {

       @Override
    public void crearServicios() {
        System.out.println("Crear Servicio");
    }

    @Override
    public String getServicio() {
        return "Servicio Credito";
    }
}
