package com.insideshine.structurals.patterns.bridge.churros.redefined.abstration;

import com.insideshine.structurals.patterns.bridge.churros.abstraction.ChurroFactory;
import com.insideshine.structurals.patterns.bridge.churros.implementor.ChurroMachine;

public class SmallChurroFactory extends ChurroFactory {

    public SmallChurroFactory( ChurroMachine cm ){
        super (cm);
    }

    @Override
    public void prepareChurro() {
        System.out.println("Small churros");
        churroMachine.startChurroMachine();
        System.out.println(churroMachine.getChurro());
        System.out.println("_________________");

    }


}
