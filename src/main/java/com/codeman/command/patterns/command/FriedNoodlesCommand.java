package com.codeman.command.patterns.command;

import com.codeman.command.patterns.cookreceiver.Cook;

/**
 * @author hdgaadd
 * Created on 2022/04/25
 */
public class FriedNoodlesCommand extends Command{

    public FriedNoodlesCommand(Cook cook) {
        super(cook);
    }

    @Override
    public void execute() {
        cook.friedNoodles();
    }
}
