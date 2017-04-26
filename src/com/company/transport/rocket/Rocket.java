package com.company.transport.rocket;

import com.company.transport.Machine;

/**
 * Created by darkfree on 26.04.17.
 */
public class Rocket extends Machine {
    private String fuel;
    private String materials;
    private double mass;
    private String jetPropulsionSystem;
    private int countMotionTransmissionMeans;
    private int countOfPassengers;

    public Rocket() {
    }

    public Rocket(String transportName, int currentSpeed ,int mass, String fuel, String materials, String jetPropulsionSystem, int countMotionTransmissionMeans, int countOfPassengers) {
        super(transportName, currentSpeed);
        this.fuel = fuel;
        this.materials = materials;
        this.mass = mass;
        this.jetPropulsionSystem = jetPropulsionSystem;
        this.countMotionTransmissionMeans = countMotionTransmissionMeans;
        this.countOfPassengers = countOfPassengers;
    }

    public int getCountOfPassengers() {
        return countOfPassengers;
    }

    public void setCountOfPassengers(int countOfPassengers) {
        this.countOfPassengers = countOfPassengers;
    }

    public String getFuel() {

        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getMaterials() {
        return materials;
    }

    public void setMaterials(String materials) {
        this.materials = materials;
    }

    public String getJetPropulsionSystem() {
        return jetPropulsionSystem;
    }

    public void setJetPropulsionSystem(String jetPropulsionSystem) {
        this.jetPropulsionSystem = jetPropulsionSystem;
    }

    @Override
    public int getSpeed() {
        return getCurrentSpeed();
    }

    @Override
    public double getMass() {
        return mass;
    }

    @Override
    public int getCountPassengers() {
        return countOfPassengers;
    }

    @Override
    public int getCountMotionTransmissionMeans() {
        return countMotionTransmissionMeans;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rocket rocket = (Rocket) o;

        if (countOfPassengers != rocket.countOfPassengers) return false;
        if (fuel != null ? !fuel.equals(rocket.fuel) : rocket.fuel != null) return false;
        if (materials != null ? !materials.equals(rocket.materials) : rocket.materials != null) return false;
        return jetPropulsionSystem != null ? jetPropulsionSystem.equals(rocket.jetPropulsionSystem) : rocket.jetPropulsionSystem == null;
    }

    @Override
    public int hashCode() {
        int result = fuel != null ? fuel.hashCode() : 0;
        result = 31 * result + (materials != null ? materials.hashCode() : 0);
        result = 31 * result + (jetPropulsionSystem != null ? jetPropulsionSystem.hashCode() : 0);
        result = 31 * result + countOfPassengers;
        return result;
    }

    @Override
    public String toString() {
        return "Rocket{" +
                "fuel='" + fuel + '\'' +
                ", materials='" + materials + '\'' +
                ", jetPropulsionSystem='" + jetPropulsionSystem + '\'' +
                ", countOfPassengers=" + countOfPassengers +
                '}';
    }
}
