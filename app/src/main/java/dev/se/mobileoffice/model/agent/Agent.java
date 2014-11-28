package model.agent;

import model.OfficeTimer;
import model.cell.OfficeCell;

/**
 * Created by makyungjae on 2014. 11. 5..
 */
public abstract class Agent {

    protected OfficeCell cellInstance;
    private int currTime;


    public Agent(OfficeCell cellInstance) {
        this.cellInstance = cellInstance;

        currTime = OfficeTimer.getInstance().getTime();

        while(OfficeTimer.getInstance().getTime() - currTime > 10)
            getCost();
    }

    protected abstract double getCost();
}
