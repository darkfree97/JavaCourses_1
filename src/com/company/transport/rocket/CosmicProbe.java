package com.company.transport.rocket;

/**
 * Created by darkfree on 26.04.17.
 */
public class CosmicProbe extends Rocket{
    private boolean satellite; // As antenna

    public CosmicProbe() {
    }

    public CosmicProbe( int currentSpeed, int mass, String fuel, String materials, String jetPropulsionSystem, int countMotionTransmissionMeans, boolean satellite) {
        super("Cosmic Probe Cassiny", currentSpeed, mass, fuel, materials, jetPropulsionSystem, countMotionTransmissionMeans, 0);
        this.satellite = satellite;
    }

    public boolean isSatellite() {
        return satellite;
    }

    public void setSatellite(boolean satellite) {
        this.satellite = satellite;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        CosmicProbe that = (CosmicProbe) o;

        return satellite == that.satellite;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (satellite ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "CosmicProbe{" +super.toString()+
                ", satellite=" + satellite +
                '}';
    }
}
