package com.insideshine.structurals.patterns.bridge.banca.refined.abstration;

import com.insideshine.structurals.patterns.bridge.banca.abstraction.ServicioFactory;

import com.insideshine.structurals.patterns.bridge.banca.implementor.Servicio;

public class ParticularServicioFactory extends ServicioFactory {

    public ParticularServicioFactory(Servicio ser ){
        super (ser);
    }

    @Override
    public void prepararServicio() {
        System.out.println("Servicios clientes Particular");
        servicio.crearServicios();
        System.out.println(servicio.getServicio());
        System.out.println("_________________");

    }


}
