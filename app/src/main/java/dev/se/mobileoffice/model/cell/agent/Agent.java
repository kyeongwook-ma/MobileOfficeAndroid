package dev.se.mobileoffice.model.cell.agent;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

import java.util.ArrayList;
import java.util.List;

import dev.se.mobileoffice.MobileOfficeApp;
import dev.se.mobileoffice.model.OfficeTimer;
import dev.se.mobileoffice.model.cell.CellEnvironment;
import dev.se.mobileoffice.model.cell.agent.sensor.ISensor;
import dev.se.mobileoffice.view.IDrawService;

/**
 * Created by makyungjae on 2014. 11. 5..
 */
public abstract class Agent implements IDrawService {

    private int currTime;
    protected boolean isRunning;
    private List<ISensor> sensors;
    private int imgId;
    private CellEnvironment env;

    public Agent(int imgId, CellEnvironment env) {

        this.imgId = imgId;
        this.env = env;
        this.sensors = new ArrayList<ISensor>();

        currTime = OfficeTimer.getInstance().getTime();

        while(OfficeTimer.getInstance().getTime() - currTime > 10) {
            operate();
        }

    }

    public void addSensor(ISensor sensor) {

        assert sensors != null;

        sensors.add(sensor);
    }

    public void notifySensors() {

        assert sensors != null;

        for(int i = 0; i < sensors.size(); ++i) {
            ISensor sensor = sensors.get(i);
            isRunning = sensor.notifySensor(env);
        }
    }

    public abstract void operate();

    @Override
    public View drawView() {
        assert imgId != 0;
        return new View(MobileOfficeApp.getContext()).findViewById(imgId);
    }

    protected abstract double getCost();
}
