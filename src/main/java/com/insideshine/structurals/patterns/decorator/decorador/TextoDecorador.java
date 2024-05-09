package com.insideshine.structurals.patterns.decorator.decorador;

import com.insideshine.structurals.patterns.decorator.Formateable;

import java.text.Format;

abstract  public class TextoDecorador implements Formateable {

    protected Formateable texto;

    public TextoDecorador(Formateable texto) {
        this.texto = texto;
    }


}
