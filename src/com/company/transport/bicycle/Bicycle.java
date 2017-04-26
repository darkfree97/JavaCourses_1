package com.company.transport.bicycle;

import com.company.transport.Machine;

import java.util.Objects;

/**
 * Created by darkfree on 26.04.17.
 */
public class Bicycle extends Machine {
    private double mass;
    private double wheelDiametr;
    private boolean bell;
    private boolean headlights;
    private boolean amortization;
    private boolean electricDrive;
    private int passangersCount;
    private int countMotionTransmissionMeans;

    public Bicycle() {
    }

    public Bicycle(String transportName, int currentSpeed, double mass, double wheelDiametr, boolean bell, boolean headlights, boolean amortization, boolean electricDrive, int countMotionTransmissionMeans) {
        super(transportName, currentSpeed);
        this.mass = mass;
        this.passangersCount = MIN_COUNT_PASSENGERS;
        this.wheelDiametr = wheelDiametr;
        this.bell = bell;
        this.headlights = headlights;
        this.amortization = amortization;
        this.electricDrive = electricDrive;
        this.countMotionTransmissionMeans = countMotionTransmissionMeans;
    }



    public boolean isBell() {

        return bell;
    }

    public void setBell(boolean bell) {
        this.bell = bell;
    }

    public boolean isHeadlights() {
        return headlights;
    }

    public void setHeadlights(boolean headlights) {
        this.headlights = headlights;
    }

    public boolean isElectricDrive() {
        return electricDrive;
    }

    public void setElectricDrive(boolean electricDrive) {
        this.electricDrive = electricDrive;
    }

    public double getWheelDiametr() {
        return wheelDiametr;
    }

    public void setWheelDiametr(double wheelDiametr) {
        this.wheelDiametr = wheelDiametr;
    }

    public boolean isAmortization() {
        return amortization;
    }

    public void setAmortization(boolean amortization) {
        this.amortization = amortization;
    }

    public void setCountMotionTransmissionMeans(int countMotionTransmissionMeans) {
        this.countMotionTransmissionMeans = countMotionTransmissionMeans;
    }

    @Override
    public int getSpeed() {
        return this.getCurrentSpeed();
    }

    @Override
    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    @Override
    public int getCountPassengers() {
        return MIN_COUNT_PASSENGERS;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (Objects.equals(obj.toString().intern(), this.toString().intern()))
            return true;
        return false;
    }

    @Override
    public String toString() {
        return "Bicycle{" +super.toString()+
                ", passangersCount=" + passangersCount +
                ", mass=" + mass +
                ", wheelDiametr=" + wheelDiametr +
                ", bell=" + bell +
                ", headlights=" + headlights +
                ", amortization=" + amortization +
                ", electricDrive=" + electricDrive +
                ", countMotionTransmissionMeans=" + countMotionTransmissionMeans +
                '}';
    }

    @Override
    public int getCountMotionTransmissionMeans() {
        return countMotionTransmissionMeans;
    }
}
