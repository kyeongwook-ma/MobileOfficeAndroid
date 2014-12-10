package dev.se.mobileoffice.simulator;

import java.util.List;

import dev.se.mobileoffice.model.cell.CellEnvironment;
import dev.se.mobileoffice.model.cell.CellManager;
import dev.se.mobileoffice.model.cell.OfficeCell;
import dev.se.mobileoffice.model.cell.agent.Agent;

/**
 * Created by se on 2014-12-10.
 */
public class Simulator {

    public void operateAgent(int cellId, int agentId) {
        List<Agent> agents = CellManager.getInstance().get(cellId).getAgents();

        assert agents != null;

        agents.get(agentId).operate();
    }

    public void changeEnvironment(int cellId, CellEnvironment env) {
        OfficeCell cell = CellManager.getInstance().get(cellId);

        assert cell != null;

        cell.setEnvironment(env);
    }


}
