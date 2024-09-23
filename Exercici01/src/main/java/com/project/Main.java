package com.project;

public class Main {

    public static void main(String[] args) {
        // Loop to create 3 instances with a 3-second interval
        for (int i = 0; i <= 2; i++) {
            System.out.println("Iniciant " + i);
            try {
                Thread.sleep(3000); // 3-second pause
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        Person person = Person.getNewDestroyedInstance("Manel", "Gelar", 18);
        Person person1 = Person.getNewDestroyedInstance("Laura", "Polada", 19);
        Person person2 = Person.getNewDestroyedInstance("Pingu", "Ice", 22);

        System.out.println(person);  // All will print the same instance
        System.out.println(person1);   // Singleton pattern ensures one instance
        System.out.println(person2); // Singleton pattern ensures one instance
    }
}
