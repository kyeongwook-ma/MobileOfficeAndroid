package dev.se.mobileoffice.model.cell;

/**
 * Created by Dev on 2014-11-29.
 */
public class CellEnvironment {


    protected double noise;
    protected double temperature;
    protected double humidity;
    protected double computingPower;
    protected double networkBandwidth;

    public boolean isHasWindow() {
        return hasWindow;
    }

    public void setHasWindow(boolean hasWindow) {
        this.hasWindow = hasWindow;
    }

    protected boolean hasWindow;

    public double getNoise() {
        return noise;
    }

    public void setNoise(double noise) {
        this.noise = noise;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public double getComputingPower() {
        return computingPower;
    }

    public void setComputingPower(double computingPower) {
        this.computingPower = computingPower;
    }

    public double getNetworkBandwidth() {
        return networkBandwidth;
    }

    public void setNetworkBandwidth(double networkBandwidth) {
        this.networkBandwidth = networkBandwidth;
    }


}
