package com.example;

public class Main {
    public static void main(String[] args) {
        Corridore listaThread[] = new Corridore[4];
        for (int i = 0; i < 4; i++) {
            listaThread[i] = new Corridore("Corridore " + (i+1));
            listaThread[i].start();
        }
        for (int i = 0; i < 4; i++) {
            try {
                listaThread[i].join();
            } catch (InterruptedException e) {}
        }
        System.out.println("Gara finita");
    }
}