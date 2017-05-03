package com.company.transport;

/**
 * Created by darkfree on 26.04.17.
 */
abstract public class Machine implements Run {
    protected final int MAX_SPEED = 1000;
    protected final int MIN_SPEED = 0;
    protected final int MIN_COUNT_PASSENGERS = 1;
    final int MAX_COUNT_PASSENGERS = 20;
    private String transportName;
    private int currentSpeed;
    private String manufacturer;

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

    @Override
    public String toString() {
        return  "transportName='" + transportName + '\'' +
                ", currentSpeed=" + currentSpeed +
                ", manufacturer='" + manufacturer+ "'";
    }

    @Override
    public int compareTo(Run o) {
        return this.getTransportName().compareTo(o.getTransportName());
    }
}
