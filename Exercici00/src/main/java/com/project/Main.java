package com.project;

public class Main {

    public static void main(String[] args) {

        for (int i = 0; i <= 2; i++) {
            System.out.println("Iniciant " + i);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    Person manel = Person.getInstance("Manel", "Polar", 18);
    Person pako = Person.getInstance("Pako", "Piedras", 18);
    Person daniel = Person.getInstance("Daniel", "Hirsch", 29);

    System.out.println(manel);
    System.out.println(pako);
    System.out.println(daniel);     
    }
}