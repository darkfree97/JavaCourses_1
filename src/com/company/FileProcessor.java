package com.company;

import com.company.transport.Run;
import com.google.gson.Gson;

import java.io.*;
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
}
