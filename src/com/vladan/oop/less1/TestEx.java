package com.vladan.oop.less1;

public class TestEx {
    public static void main(String[] args) {
        int value = 10;
        int [] values = {value, 100, 199, 25};
        printArray(values);
    }

    private static void printArray(int[] values) {
        for (int value : values) {
            System.out.println(value);

        }
    }
}
