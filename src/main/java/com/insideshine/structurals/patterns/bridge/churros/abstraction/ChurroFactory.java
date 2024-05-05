package com.insideshine.structurals.patterns.bridge.churros.abstraction;

import com.insideshine.structurals.patterns.bridge.churros.implementor.ChurroMachine;

public abstract class ChurroFactory {
    protected ChurroMachine churroMachine;

    public ChurroFactory (ChurroMachine cm){
        churroMachine = cm ;
    }

    public abstract void prepareChurro();

}
