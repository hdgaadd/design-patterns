package com.codeman.command.patterns.command;

import com.codeman.command.patterns.cookreceiver.Cook;

/**
 * @author hdgaadd
 * Created on 2022/04/25
 */
public class FriedRiceCommand extends Command{

    public FriedRiceCommand(Cook cook) {
        super(cook);
    }

    @Override
    public void execute() {
        cook.friedRice();
    }
}
