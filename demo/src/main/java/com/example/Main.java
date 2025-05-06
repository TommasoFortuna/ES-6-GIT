package com.example;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            new Corridore("Corridore " + i).start();
        }
    }
}