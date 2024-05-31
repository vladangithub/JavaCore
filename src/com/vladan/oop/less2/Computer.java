package com.vladan.oop.less2;

public class Computer {

    int ssd = 500;
    int ram;

    Computer(){
        System.out.println("Я был создан");

    }

    Computer(int newSsd) {
        ssd = newSsd;
    }


    void load() {
        System.out.println("Loading computer...");
    }

    void printState() {
        System.out.println("SSD: " + ssd);
        System.out.println("RAM: " + ram);
    }
}
