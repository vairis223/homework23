package io.codelex.exceptions.practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Exercise3 {
    public static void cat(File file) throws IOException {

        //TODO - fix this method so it compiles

            RandomAccessFile input = null;
            String line = null;

            try {
                input = new RandomAccessFile(file, "r");
                while ((line = input.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                System.out.println("Error");

            } finally {
                if (input != null) {
                    input.close();

                    }
                }
            }
            public static void main(String[] args) throws IOException {
            File file = new File("Your path file here .txt");
            cat(file);
        }
    }

