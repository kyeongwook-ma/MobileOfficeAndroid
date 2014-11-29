package dev.se.mobileoffice.model.cell.agent.sensor;

import dev.se.mobileoffice.model.cell.CellEnvironment;

/**
 * Created by makyungjae on 2014. 11. 9..
 */
public class Sensor implements ISensor {

    @Override
    public boolean notifySensor(CellEnvironment env) {
        if (env.getComputingPower() > 1)
            return true;

        return false;
    }
}
