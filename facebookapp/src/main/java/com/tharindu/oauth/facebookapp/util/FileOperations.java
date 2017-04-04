package com.tharindu.oauth.facebookapp.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileOperations {

    private final String FILENAME = "applogs.txt";


    public void writeToFile(String data){

        File file = new File(FILENAME);
        BufferedWriter bw = null;
        FileWriter fw = null;

        try {

            // if file doesnt exists, then create it
            if (!file.exists()) {
                file.createNewFile();
                System.out.println("File not found. Created new log file");
            } else {
                System.out.println("File is already existing");
            }

            // true = append file
            fw = new FileWriter(file.getAbsoluteFile(), true);
            bw = new BufferedWriter(fw);

            data = data + "\n---------------------------------------------------------------------------------------\n";

            bw.write(data);

        } catch (Exception e){

            System.out.println("Error: " + e.getMessage());

        } finally {

            try {
                bw.close();
            } catch (IOException e) {
                //Do nothing
            }
            try {
                fw.close();
            } catch (IOException e) {
                //Do nothing
            }
        }

    }


}
