package dev.se.mobileoffice.model.cell.agent.sensor;

import dev.se.mobileoffice.model.cell.CellEnvironment;

/**
 * Created by makyungjae on 2014. 11. 9..
 */
public interface ISensor {
    boolean notifySensor(CellEnvironment env);
}
