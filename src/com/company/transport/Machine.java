package com.company.transport;

/**
 * Created by darkfree on 26.04.17.
 */
abstract public class Machine implements Run {
    final int MAX_SPEED = 1000;
    final int MIN_SPEED = 0;
    final int MIN_COUNT_PASSANGERS = 1;
    final int MAX_COUNT_PASSANGERS = 20;
    private String transportName;
    private int currentSpeed;

    public Machine() {
    }

    public Machine(String transportName, int currentSpeed) {
        this.transportName = transportName;
        this.currentSpeed = currentSpeed;
    }

    @Override
    public String getTransportName() {
        return transportName;
    }

    public void setTransportName(String transportName) {
        this.transportName = transportName;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }
}
