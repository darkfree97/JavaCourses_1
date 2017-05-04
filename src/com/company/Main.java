package com.company;

import com.company.transport.Run;
import com.company.transport.bicycle.ChildBicycle;
import com.company.transport.bicycle.EBrakes;
import com.company.transport.bicycle.SimpleBicycle;
import com.company.transport.rocket.CosmicProbe;
import com.company.transport.rocket.Satellite;
import org.json.simple.JSONObject;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        FileProcessor fileProcessor = new FileProcessor();
        List<Run> runs = new ArrayList<>();

//        // Створення та ініціалізація списків об'єктів
//        List<SimpleBicycle> simpleBicycles = new ArrayList<>();
//        List<ChildBicycle> childBicycles = new ArrayList<>();
//        List<CosmicProbe> cosmicProbes = new ArrayList<>();
//        List<Satellite> satellites = new ArrayList<>();
//
//        // Створення обєктів та занесення їх до відповідних масивів
//        simpleBicycles.add(new SimpleBicycle(15,20.0,76,true,false,true,false,2, EBrakes.HydraulicDisc));
//        simpleBicycles.add(new SimpleBicycle(20,15.0,80,true,true,true,true,2, EBrakes.MechanicDisk));
//        childBicycles.add(new ChildBicycle(5,5.0,20,true,true,true,false,3,4,true));
//        childBicycles.add(new ChildBicycle(12,10.0,50,true,false,true,false,2,8,false));
//        cosmicProbes.add(new CosmicProbe(10000,30000,"Plutonium","Platinum","Reactive",5,true));
//        cosmicProbes.add(new CosmicProbe(12683,23464,"Solar Wind","Gold","Reactive",15,true));
//        satellites.add(new Satellite(3000,50000,"Solar","Gold Titanium","Reactive",12,0,"Communication",true));
//        satellites.add(new Satellite(6483,23842,"Hydrogen Oxygen","Titanium","Reactive",12,5,"Since",true));
//
//        // Запис масивів об'єктів у файли
//        fileProcessor.writeSerializeObjectIntoFile(simpleBicycles,"simple_bicycles.dat");
//        fileProcessor.writeSerializeObjectIntoFile(childBicycles,"child_bicycles.dat");
//        fileProcessor.writeSerializeObjectIntoFile(cosmicProbes,"cosmic_probes.dat");
//        fileProcessor.writeSerializeObjectIntoFile(satellites,"satellites.dat");

        // Читання об'єктів з файлів
        runs.addAll((List<Run>)fileProcessor.readSerializeObjectFromFile("simple_bicycles.dat"));
        runs.addAll((List<Run>)fileProcessor.readSerializeObjectFromFile("child_bicycles.dat"));
        runs.addAll((List<Run>)fileProcessor.readSerializeObjectFromFile("cosmic_probes.dat"));
        runs.addAll((List<Run>)fileProcessor.readSerializeObjectFromFile("satellites.dat"));

        // Виведення об'єктів в консоль
        List<Run> finalRuns = runs;
        runs.forEach(item->{
            System.out.println("Виведення об'єкта: "+item);
            System.out.println("Ім'я транспорту: "+item.getTransportName());
            System.out.println("Кількість засобів пересування: "+item.getCountMotionTransmissionMeans());
            System.out.println("Швидкість пересування: "+item.getSpeed());
            System.out.println("Маса транспорту: "+item.getMass());
            System.out.println("Кількість пасажирів: "+item.getCountPassengers());
            System.out.println("Хеш код: "+item.hashCode());
            System.out.print(item.getTransportName()+".equals(): | ");
            finalRuns.forEach(run -> System.out.print("With "+run.getTransportName()+" = "+item.equals(run)+" | "));
            System.out.println("\n____________________________________________________________\n");
        });

        // Сортування об'єктів
        System.out.println("\n_-_-_-_-_-_ Не відсортований список _-_-_-_-_-_\n");
        runs.forEach(p-> System.out.println(p.getTransportName()));
        System.out.println("\n-_-_-_-_-_- Відсортований  список -_-_-_-_-_-_-\n");
        Collections.sort(runs);
        runs.forEach(p-> System.out.println(p.getTransportName()));


//        // Читання чапис обєктів способом серіалізації десеріалізації
//        fileProcessor.writeSerializeObjectIntoFile(runs,"runs.dat");
//        runs = (List<Run>) fileProcessor.readSerializeObjectFromFile("runs.dat");
//
//        // Читання запис текстового файлу
//        fileProcessor.writeToFile("Hello World","Hello_World.txt");
//        fileProcessor.readFile("Hello_World.txt");
//
//        // Читання запис JSON
//        fileProcessor.writeObjectToJSON(runs,"runs");
//        ((List<JSONObject>)fileProcessor.readObjectFromJSON("runs")).forEach(p-> System.out.println(p));
    }

}
