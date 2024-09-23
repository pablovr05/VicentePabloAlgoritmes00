package com.project;

public class Person {

    private static Person instance;

    private String nom;
    private String cognom;
    private int edat;

    // Private constructor for Singleton
    private Person(String nom, String cognom, int edat) {
        this.nom = nom;
        this.cognom = cognom;
        this.edat = edat;
    }

    // Normal Singleton instance getter
    public static Person getInstance(String nom, String cognom, int edat) {
        if (instance == null) {
            instance = new Person(nom, cognom, edat);
        }
        return instance;
    }

    // Method to 'hack' the Singleton and get a new instance
    public static Person getNewDestroyedInstance(String nom, String cognom, int edat) {
        instance = null; // Destroy the previous instance
        return new Person(nom, cognom, edat); // Create a new one
    }

    @Override
    public String toString() {
        return "Nom: " + nom + ", Cognom: " + cognom + ", Edat: " + edat;
    }
}
