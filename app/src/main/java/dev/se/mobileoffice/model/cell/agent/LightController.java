package dev.se.mobileoffice.model.cell.agent;

import dev.se.mobileoffice.model.cell.CellEnvironment;

/**
 * Created by se on 2014-12-01.
 */
public class LightController extends Agent{

    public LightController(int cellId, int imgId, CellEnvironment env) {
        super(cellId, imgId, env);
    }

    @Override
    public void operate() {

    }

    @Override
    protected double getCost() {
        return 0;
    }
}
