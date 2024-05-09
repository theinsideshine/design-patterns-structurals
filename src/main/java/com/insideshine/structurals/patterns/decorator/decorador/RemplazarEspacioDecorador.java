package com.insideshine.structurals.patterns.decorator.decorador;

import com.insideshine.structurals.patterns.decorator.Formateable;

public class RemplazarEspacioDecorador extends TextoDecorador{
    public RemplazarEspacioDecorador(Formateable texto) {
        super(texto);
    }

    @Override
    public String darFormato() {
        return texto.darFormato().replace(" ","_");
    }
}
