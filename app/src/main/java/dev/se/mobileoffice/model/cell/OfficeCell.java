package dev.se.mobileoffice.model.cell;

import android.view.View;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

import dev.se.mobileoffice.MobileOfficeApp;
import dev.se.mobileoffice.IDrawService;
import dev.se.mobileoffice.model.cell.agent.Agent;

/**
 * Created by makyungjae on 2014. 11. 5..
 */
public class OfficeCell implements IDrawService {

    protected int cellId;
    protected CellEnvironment env;
    private List<Agent> agents;


    public List<Agent> getAgents() {
        assert agents != null;
        return agents;
    }

    public OfficeCell(int cellId, CellEnvironment env) {
        this.cellId = cellId;
        this.env = env;
        this.agents = new ArrayList<Agent>();
    }


    @Override
    public View drawView() {

        LinearLayout ll = new LinearLayout(MobileOfficeApp.getContext());

        if(agents.size() > 0) {
            for(Agent agent : agents) {
                ll.addView(agent.drawView());
            }
        }

        return ll;
    }

    public void addAgent(Agent agent) {
        agents.add(agent);
    }

    public CellEnvironment getEnvironment() {
        return env;
    }

    public void setEnvironment(CellEnvironment env) {
        this.env = env;
    }

    public static class OfficeCellBuilder {

        CellEnvironment env;
        protected int cellId;

        public OfficeCellBuilder(int id) {
            this.cellId = id;
            this.env = new CellEnvironment();
        }

        public OfficeCellBuilder noise(double noise) {
            env.setNoise(noise);
            return this;
        }

        public OfficeCellBuilder temperature(double temperature) {
            env.setTemperature(temperature);
            return this;
        }

        public OfficeCellBuilder humidity(double humidity) {
            env.setHumidity(humidity);
            return this;
        }

        public OfficeCellBuilder computingPower(double computingPower) {
            env.setComputingPower(computingPower);
            return this;
        }

        public OfficeCellBuilder networkBandwidth(double networkBandwidth) {
            env.setNetworkBandwidth(networkBandwidth);
            return this;
        }

        public OfficeCellBuilder hasWindow(boolean hasWindow) {
            env.setHasWindow(hasWindow);
            return this;
        }

        public OfficeCell createOfficeCell() {
            return new OfficeCell(this.cellId, this.env);
        }



    }

}
