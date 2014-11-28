package dev.se.mobileoffice.model;

/**
 * Created by makyungjae on 2014. 11. 5..
 */
public class OfficeTimer {

    private int time;
    private boolean isStart;

    private static OfficeTimer instance;

    static {
        instance = new OfficeTimer();
    }

    public static OfficeTimer getInstance() {
        if(instance != null) {
            return instance;
        } else {
            return new OfficeTimer();
        }
    }

    private OfficeTimer() {

        new Thread() {
            @Override
            public void run() {
                while(isStart) {
                    ++time;
                }
            }
        }.start();

    }

    public void start() {
        isStart = true;
    }

    public void stop() {
        isStart = false;
    }

    public int getTime() {
        return time;
    }

}
