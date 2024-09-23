package com.project;

public class Person {

    private static Person instance;

    private String nom;
    private String cognom;
    private int edat;

    private Person(String nom, String cognom, int edat) {
        this.nom = nom;
        this.cognom = cognom;
        this.edat = edat;
    }

    public static Person getInstance(String nom, String cognom, int edat) {
        if (instance == null) {
            instance = new Person(nom, cognom, edat);
        }
        return instance;
    }

    public static Person newInstance(String nom, String cognom, int edat) {
        return new Person(nom, cognom, edat);
    }

    @Override
    public String toString() {
        return "Nom: " + nom + ", Cognom: " + cognom + ", Edat: " + edat;
    }
}