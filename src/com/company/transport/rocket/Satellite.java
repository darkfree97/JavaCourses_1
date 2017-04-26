package com.company.transport.rocket;

/**
 * Created by darkfree on 26.04.17.
 */
public class Satellite extends Rocket {
    private String appointment;
    private boolean solarPanel;

    public Satellite() {
    }

    public Satellite(int currentSpeed, int mass, String fuel, String materials, String jetPropulsionSystem, int countMotionTransmissionMeans, int countOfPassengers, String appointment, boolean solarPanel) {
        super("Satellite", currentSpeed, mass, fuel, materials, jetPropulsionSystem, countMotionTransmissionMeans, countOfPassengers);
        this.appointment = appointment;
        this.solarPanel = solarPanel;
    }

    public String getAppointment() {

        return appointment;
    }

    public void setAppointment(String appointment) {
        this.appointment = appointment;
    }

    public boolean isSolarPanel() {
        return solarPanel;
    }

    public void setSolarPanel(boolean solarPanel) {
        this.solarPanel = solarPanel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Satellite satellite = (Satellite) o;

        if (solarPanel != satellite.solarPanel) return false;
        return appointment != null ? appointment.equals(satellite.appointment) : satellite.appointment == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (appointment != null ? appointment.hashCode() : 0);
        result = 31 * result + (solarPanel ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Satellite{" +super.toString()+
                ", appointment='" + appointment + '\'' +
                ", solarPanel=" + solarPanel +
                '}';
    }
}
