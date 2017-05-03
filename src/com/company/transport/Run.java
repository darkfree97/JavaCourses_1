package com.company.transport;

import java.io.Serializable;

/**
 * Created by darkfree on 25.04.17.
 */
public interface Run extends Serializable, Comparable<Run> {
    String getTransportName();
    int getSpeed();
    double getMass(); // Вага
    int getCountPassengers(); // К-ть пасажирів
    int getCountMotionTransmissionMeans();// Засоби передачі руху
}
