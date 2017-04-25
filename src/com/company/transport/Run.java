package com.company.transport;

/**
 * Created by darkfree on 25.04.17.
 */
public interface Run {
    String getTransportName();
    int getSpeed();
    int getMass(); // Вага
    int getCountPassangers(); // К-ть пасажирів
    int getCountMotionTransmissionMeans();// Засоби передачі руху
}
