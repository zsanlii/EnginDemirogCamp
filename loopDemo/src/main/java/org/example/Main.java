package org.example;
public class Main {
    public static void main(String[] args) {
        //For
        for (int i = 2; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("For Döngüsü Bitti");

        System.out.println("-------------------------------------");

        //While
        int i = 1;
        while (i < 10) {
            System.out.println(i);
            i++;
        }
        System.out.println("While Döngüsü Bitti");

        System.out.println("-------------------------------------");

        //Do-While
        int j = 1;
        do {
            System.out.println(j);
            j += 2;
        } while (j < 10);
        System.out.println("Do-While Döngüsü Bitti");

    }
}