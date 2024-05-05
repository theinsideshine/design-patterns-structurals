package com.insideshine.structurals.patterns.bridge.churros.concrete.implementor;

import com.insideshine.structurals.patterns.bridge.churros.implementor.ChurroMachine;

public class ChurroMachineStrawberry implements ChurroMachine {

    @Override
    public void startChurroMachine() {
        System.out.println("Starting Machine");

    }

    @Override
    public String getChurro() {
        return "Strawberry Churro";
    }
}
