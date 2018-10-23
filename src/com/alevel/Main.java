package com.alevel;

import java.io.FileInputStream;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        try{
        a = scanner.nextInt();}
        catch (IllegalArgumentException | NoSuchElementException e){
            System.out.println(e.getStackTrace());
            a = 10;
        }
        finally {
            a = 100;
        }
        System.out.println(a);

    }
}
