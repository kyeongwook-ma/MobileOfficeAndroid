package model.cell;

/**
 * Created by makyungjae on 2014. 11. 5..
 */
public class OfficeCell {

    protected int cellId;

    protected double noise;
    protected double temperature;
    protected double humidity;
    protected double computingPower;
    protected double networkBandwidth;
    protected boolean hasWindow;

    public int getCellId() {
        return cellId;
    }

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

    public boolean isHasWindow() {
        return hasWindow;
    }

    public void setHasWindow(boolean hasWindow) {
        this.hasWindow = hasWindow;
    }

    public OfficeCell(int cellId, double noise, double temperature,
                      double humidity, double computingPower,
                      double networkBandwidth, boolean hasWindow) {
        this.cellId = cellId;
        this.noise = noise;
        this.temperature = temperature;
        this.humidity = humidity;
        this.computingPower = computingPower;
        this.networkBandwidth = networkBandwidth;
        this.hasWindow = hasWindow;
    }


    public double getCost() {
        return 0;
    }

    public static class OfficeCellBuilder {
        private int cellId;
        private double noise;
        private double temperature;
        private double humidity;
        private double computingPower;
        private double networkBandwidth;
        private boolean hasWindow;

        public OfficeCellBuilder(int id) {
            this.cellId = id;
        }

        public OfficeCellBuilder noise(double noise) {
            this.noise = noise;
            return this;
        }

        public OfficeCellBuilder temperature(double temperature) {
            this.temperature = temperature;
            return this;
        }

        public OfficeCellBuilder humidity(double humidity) {
            this.humidity = humidity;
            return this;
        }

        public OfficeCellBuilder computingPower(double computingPower) {
            this.computingPower = computingPower;
            return this;
        }

        public OfficeCellBuilder networkBandwidth(double networkBandwidth) {
            this.networkBandwidth = networkBandwidth;
            return this;
        }

        public OfficeCellBuilder hasWindow(boolean hasWindow) {
            this.hasWindow = hasWindow;
            return this;
        }

        public OfficeCell createOfficeCell() {
            return new OfficeCell(this.cellId, this.noise, this.temperature,
                    this.humidity, this.computingPower,
                    this.networkBandwidth, this.hasWindow);
        }



    }

}
