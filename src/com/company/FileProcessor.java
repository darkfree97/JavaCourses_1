package com.company;

import com.company.transport.Run;
import com.company.transport.bicycle.ChildBicycle;
import com.company.transport.bicycle.SimpleBicycle;
import com.google.gson.Gson;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by darkfree on 03.05.17.
 */
public class FileProcessor {
    public FileProcessor() {
    }

    public boolean writeSerializeObjectIntoFile(Object object,String fileName){
        boolean successFlag = true;
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(fileName);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(object);
            objectOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            successFlag = false;
        } catch (IOException e) {
            e.printStackTrace();
            successFlag = false;
        }
        return successFlag;
    }

    public Object readSerializeObjectFromFile(String fileName){
        Object object = null;
        FileInputStream fileInputStream;
        try {
            fileInputStream = new FileInputStream(fileName);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            object = objectInputStream.readObject();
            objectInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return object;
    }

    public boolean writeObjectToJSON(Object object,String fileName){
        boolean successFlag = true;
        String json = new Gson().toJson(object);
        FileWriter fileWriter;
        try {
            fileWriter = new FileWriter(fileName+".json");
            fileWriter.write(json);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return successFlag;
    }

    public Object readObjectFromJSON(String fileName){
        List<Run> runs = new ArrayList<>();
        Object object = null;
        FileReader fileReader;

        String buffer = "";
        try {
            fileReader = new FileReader(fileName+".json");
            while (fileReader.ready()){
                buffer += (char)fileReader.read();
            }
            JSONParser parser = new JSONParser();
            JSONArray jsonArray = (JSONArray)parser.parse(buffer);
            jsonArray.forEach(p-> {
                JSONObject o = ((JSONObject)p);
                if(o.containsKey("childsAge")){
                    runs.add(new ChildBicycle());
                    //runs.add(new ChildBicycle((int)o.get("currentSpeed"),(double)o.get("mass"),(double)o.get("wheelDiametr"),(boolean)o.get("bell"),(boolean)o.get("headlights"),(boolean)o.get("amortization"),(boolean)o.get("electricDrive"),(int)o.get("countMotionTransmissionMeans"),(int)o.get("childsAge"),(boolean)o.get("parentalControlCnob")));
                }
                if(o.containsKey("brakes")){
                    runs.add(new SimpleBicycle());
                }
                if(o.containsKey("")){

                }
                if(o.containsKey("")){

                }
            });
//            object = runs;
            object = (List<Run>) jsonArray;
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }catch (ClassCastException e){
            System.err.println("Casting exception in FileProcessor.readObjectFromJSON");
        }
        return object;
    }

    public void writeToFile(String stringForWrite, String fileName){
        writeToFile(stringForWrite,fileName,false);
    }

    public void writeToFile(String stringForWrite, String fileName, boolean append){
        try {
            FileWriter fileWriter = new FileWriter(fileName,true);
            fileWriter.write(stringForWrite);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readFile(String fileName){
        String buffer = "";
        try {
            FileReader fileReader = new FileReader(fileName);
            while (fileReader.ready()){
                buffer += (char) fileReader.read();
            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(buffer);
    }
}
