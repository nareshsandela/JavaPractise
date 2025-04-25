package org.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;

public class CheckedExceptionExample extends Exception {

    public static void main(String [] args){
        try{
            BufferedReader reader = new BufferedReader(new FileReader("data.txt"));
             reader.readLine();
        }
        catch (IOException e){
            System.out.println("IOException");
            e.printStackTrace();
        }
    }
}
