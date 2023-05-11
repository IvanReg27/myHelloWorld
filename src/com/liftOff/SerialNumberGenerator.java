package com.liftOff;

public class SerialNumberGenerator {
    private static volatile int serialNumber = 0;
    public static int nextSerialNumber() {
        return serialNumber++;
    }
    public static void main(String[] args) {
        System.out.println(serialNumber);
    }
}