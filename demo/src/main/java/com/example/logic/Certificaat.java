package com.example.logic;

public class Certificaat {
    private Cursist cursist;
    private double cijfer;
    private String naamMedewerker;
    private Cursus cursus;

    public Certificaat(Cursist cursist, double cijfer, String naamMedewerker, Cursus cursus) {
        this.cursist = cursist;
        if (cijfer < 1 || cijfer > 10) {
            throw new IllegalArgumentException("Cijfer moet tussen 1 en 10 liggen");
        } else{
            this.cijfer = cijfer;
        }
        this.naamMedewerker = naamMedewerker;
        this.cursus = cursus;
    }

    public Cursist getCursist() {
        return this.cursist;
    }

    public void setCursist(Cursist cursist) {
        this.cursist = cursist;
    }

    public double getCijfer() {
        return this.cijfer;
    }

    public void setCijfer(double cijfer) {
        this.cijfer = cijfer;
    }

    public String getNaamMedewerker() {
        return this.naamMedewerker;
    }

    public void setNaamMedewerker(String naamMedewerker) {
        this.naamMedewerker = naamMedewerker;
    }

    public Cursus getCursus() {
        return this.cursus;
    }

    public void setCursus(Cursus cursus) {
        this.cursus = cursus;
    }

    public static Certificaat create(Cursist cursist, double cijfer, String naamMedewerker, Cursus cursus) {

        Certificaat newCertificaat = new Certificaat(cursist, cijfer, naamMedewerker, cursus);
    
        return newCertificaat;
    }
    
}
