package model.agent;

import model.cell.OfficeCell;

/**
 * Created by makyungjae on 2014. 11. 6..
 */
public class AirConditioner extends Agent {


    public AirConditioner(OfficeCell cellInstance) {
        super(cellInstance);
    }

    @Override
    protected double getCost() {
        return 0;
    }
}
