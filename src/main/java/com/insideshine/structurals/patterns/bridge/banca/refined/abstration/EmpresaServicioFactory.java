package com.insideshine.structurals.patterns.bridge.banca.refined.abstration;

import com.insideshine.structurals.patterns.bridge.banca.abstraction.ServicioFactory;
import com.insideshine.structurals.patterns.bridge.banca.implementor.Servicio;

public class EmpresaServicioFactory extends ServicioFactory {

    public EmpresaServicioFactory(Servicio ser ){
        super (ser);
    }

    @Override
    public void prepararServicio() {
        System.out.println("Servicios clientes Empresariales");
        servicio.crearServicios();
        System.out.println(servicio.getServicio());
        System.out.println("_________________");

    }


}
