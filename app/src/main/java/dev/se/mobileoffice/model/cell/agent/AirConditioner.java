package dev.se.mobileoffice.model.cell.agent;


import dev.se.mobileoffice.model.cell.CellEnvironment;

/**
 * Created by makyungjae on 2014. 11. 6..
 */
public class AirConditioner extends Agent {


    public AirConditioner(int cellId, int imgId, CellEnvironment env) {
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
