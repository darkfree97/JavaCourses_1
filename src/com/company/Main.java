package com.company;

import com.company.transport.Run;
import com.company.transport.bicycle.ChildBicycle;
import com.company.transport.bicycle.EBrakes;
import com.company.transport.bicycle.SimpleBicycle;
import com.company.transport.rocket.CosmicProbe;
import com.company.transport.rocket.Satellite;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Run> runs = new ArrayList<>();
        Run runSimpleBicycle = new SimpleBicycle(15,20.0,76,true,false,true,false,2, EBrakes.HydraulicDisc);
        runs.add(runSimpleBicycle);
        Run runChildBicycle = new ChildBicycle(5,5.0,20,true,true,true,false,3,4,true);
        runs.add(runChildBicycle);
        Run runSatellite = new Satellite(3000,50000,"Solar","Gold Titanium","Reactive",12,0,"Communication",true);
        runs.add(runSatellite);
        Run runCosmicProbe = new CosmicProbe(10000,30000,"Plutonium","Platinum","Reactive",5,true);
        runs.add(runCosmicProbe);
        runs.forEach(item->{
            System.out.println("Виведення об'єкта: "+item);
            System.out.println("Ім'я транспорту: "+item.getTransportName());
            System.out.println("Кількість засобів пересування: "+item.getCountMotionTransmissionMeans());
            System.out.println("Швидкість пересування: "+item.getSpeed());
            System.out.println("Маса транспорту: "+item.getMass());
            System.out.println("Кількість пасажирів: "+item.getCountPassengers());
            System.out.println("Хеш код: "+item.hashCode());
            System.out.print(item.getTransportName()+".equals(): | ");
            runs.forEach(run -> System.out.print("With "+run.getTransportName()+" = "+item.equals(run)+" | "));
            System.out.println("\n____________________________________________________________\n");
        });

    }
}
