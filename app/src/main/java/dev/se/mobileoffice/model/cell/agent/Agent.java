package dev.se.mobileoffice.model.cell.agent;

import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

import dev.se.mobileoffice.MobileOfficeApp;
import dev.se.mobileoffice.model.OfficeTimer;
import dev.se.mobileoffice.model.cell.CellEnvironment;
import dev.se.mobileoffice.model.cell.agent.sensor.ISensor;
import dev.se.mobileoffice.IDrawService;

/**
 * Created by makyungjae on 2014. 11. 5..
 */
public abstract class Agent implements IDrawService {

    private int operatingTime;

    private int id;
    protected boolean isRunning;
    private List<ISensor> sensors;
    private int imgId;
    private CellEnvironment env;

    public Agent(int imgId, CellEnvironment env) {

        this.imgId = imgId;
        this.env = env;
        this.sensors = new ArrayList<ISensor>();

        operatingTime = OfficeTimer.getInstance().getTime();

        while(OfficeTimer.getInstance().getTime() -  operatingTime > 10) {
            operate();
        }

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        ImageView iv = new ImageView(MobileOfficeApp.getContext());
        iv.setImageResource(imgId);
        iv.setScaleX(0.2f);
        iv.setScaleY(0.2f);
        return iv;
    }

    protected abstract double getCost();
}
