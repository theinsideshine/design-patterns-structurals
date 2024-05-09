package com.insideshine.structurals.patterns.decorator.decorador.example;

import com.insideshine.structurals.patterns.decorator.Formateable;
import com.insideshine.structurals.patterns.decorator.Texto;
import com.insideshine.structurals.patterns.decorator.decorador.MayusculasDecorador;
import com.insideshine.structurals.patterns.decorator.decorador.ReversaDecorador;
import com.insideshine.structurals.patterns.decorator.decorador.SubrayadoDecorador;

public class DecoradorApp {

    public static void main(String[] args) {

        Formateable texto = new Texto("Hola que tal , Pablo");

        MayusculasDecorador mayusculasDecorador = new MayusculasDecorador(texto);
        //ReversaDecorador reversaDecorador = new ReversaDecorador(mayusculasDecorador);
        SubrayadoDecorador subrayadoDecorador =new SubrayadoDecorador(mayusculasDecorador);

        System.out.println(subrayadoDecorador.darFormato());


        ReversaDecorador reversaDecorador = new ReversaDecorador(subrayadoDecorador);

        System.out.println(reversaDecorador.darFormato());
    }


}
