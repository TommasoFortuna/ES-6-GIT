package com.example;

public class Corridore extends Thread{
    private String nome;
    
    public Corridore(String nomeC) {
        this.nome = nomeC;
    }

    public String getNome() {
        return nome;
    }

    public void run() {
        for (int i = 1; i <= 100; i++) {
            try {
                Thread.sleep((int)(Math.random() * 300));
            } catch (Exception e) {}
            System.out.println(this.getNome() + " metri: " + i);

            if (i == 100) {
                System.out.println(this.getNome() + " ha raggiunto il traguardo");
                
            }
        }
    }
}
