package com.vladan.oop.less2;

public class Computer {

    int ssd = 500;
    int ram = 1024;


    void load() {
        System.out.println("Loading computer...");
    }

    void printState() {
        System.out.println("SSD: " + ssd);
        System.out.println("RAM: " + ram);
    }
}
