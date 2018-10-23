package com.alevel;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class StringReader {
    public static String read(String path){
        StringBuilder result = new StringBuilder();
        try (BufferedReader reader  = new BufferedReader(new FileReader(path))){
            while (reader.readLine() != null)
                result.append(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(read("D:\\test.txt"));
    }
}
