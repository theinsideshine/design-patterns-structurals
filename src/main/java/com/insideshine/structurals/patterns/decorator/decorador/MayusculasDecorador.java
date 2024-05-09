package com.insideshine.structurals.patterns.decorator.decorador;

import com.insideshine.structurals.patterns.decorator.Formateable;

public class MayusculasDecorador extends TextoDecorador{
    public MayusculasDecorador(Formateable texto) {
        super(texto);
    }

    @Override
    public String darFormato() {
        return texto.darFormato().toUpperCase();
    }
}
