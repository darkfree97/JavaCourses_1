package com.company.transport.bicycle;

/**
 * Created by darkfree on 26.04.17.
 */
public class ChildBicycle extends Bicycle{
    private int childsAge;
    private boolean parentalControlCnob;

    public ChildBicycle() {
    }

    public ChildBicycle(int currentSpeed, double mass, double wheelDiametr, boolean bell, boolean headlights, boolean amortization, boolean electricDrive, int countMotionTransmissionMeans, int childsAge, boolean parentalControlCnob) {
        super("Child bicycle",currentSpeed, mass, wheelDiametr, bell, headlights, amortization, electricDrive, countMotionTransmissionMeans);
        this.childsAge = childsAge;
        this.parentalControlCnob = parentalControlCnob;
    }

    public int getChildsAge() {

        return childsAge;
    }

    public void setChildsAge(int childsAge) {
        this.childsAge = childsAge;
    }

    public boolean isParentalControlCnob() {
        return parentalControlCnob;
    }

    public void setParentalControlCnob(boolean parentalControlCnob) {
        this.parentalControlCnob = parentalControlCnob;
    }
}
