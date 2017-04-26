package com.company.transport.bicycle;

/**
 * Created by darkfree on 26.04.17.
 */
public class SimpleBicycle extends Bicycle {
    private EBrakes brakes;

    public SimpleBicycle() {
    }

    public SimpleBicycle(int currentSpeed, double mass, double wheelDiametr, boolean bell, boolean headlights, boolean amortization, boolean electricDrive, int countMotionTransmissionMeans, EBrakes brakes) {
        super("Simple bicycle",currentSpeed, mass, wheelDiametr, bell, headlights, amortization, electricDrive, countMotionTransmissionMeans);
        this.brakes = brakes;
    }

    @Override
    public String toString() {
        return "SimpleBicycle{" +super.toString()+
                ", brakes=" + brakes +
                '}';
    }
}
