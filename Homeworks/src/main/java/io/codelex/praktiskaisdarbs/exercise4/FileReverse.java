package io.codelex.praktiskaisdarbs.exercise4;

import java.io.*;


public class FileReverse {
    public static void main(String[] args) {

        String filePath = "C:/Users/vairi/Desktop/PSALTĒRIJS  FRAGMENTS.txt";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            BufferedWriter writer = new BufferedWriter(new FileWriter());


            String line;

            while ((line = reader.readLine()) != null) {
                writer.append(line).append(" \n");
            }

            reader.close();
            writer.close();



        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


