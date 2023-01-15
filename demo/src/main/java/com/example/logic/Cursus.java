package com.example.logic;

import java.util.ArrayList;
import com.example.logic.Enumarations.Niveau;

public class Cursus {
    private String naam;
    private String onderwerp;
    private String introTekst;
    private ArrayList<Cursus> aanbevelingen;
    private Niveau niveau;
    private ArrayList<Cursist> cursisten;
    private static ArrayList<Module> selectedModules;
    private static ArrayList<Module> unselectedModules;

    

    public Cursus(String naam, String onderwerp, String introTekst, ArrayList<Cursus> aanbevelingen, Niveau niveau,
            ArrayList<Cursist> cursisten, ArrayList<Module> selectedModules) {
        this.naam = naam;
        this.onderwerp = onderwerp;
        this.introTekst = introTekst;
        this.aanbevelingen = aanbevelingen;
        this.niveau = niveau;
        this.cursisten = new ArrayList<>();
        this.selectedModules = new ArrayList<>();
    }

   public ArrayList<Cursist> getCursisten() {
        return this.cursisten;
    }

    public void setCursisten(ArrayList<Cursist> cursisten) {
        this.cursisten = cursisten;
    }

    public ArrayList<Module> getSelectedModules() {
        return this.selectedModules;
    }

    public void setSelectedModules(ArrayList<Module> selectedModules) {
        this.selectedModules = selectedModules;
    }

    public ArrayList<Module> getUnselectedModules() {
        return this.unselectedModules;
    }

    public void setUnselectedModules(ArrayList<Module> unselectedModules) {
        this.unselectedModules = unselectedModules;
    }

    public String getNaam() {
        return this.naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getOnderwerp() {
        return this.onderwerp;
    }

    public void setOnderwerp(String onderwerp) {
        this.onderwerp = onderwerp;
    }

    public String getIntroTekst() {
        return this.introTekst;
    }

    public void setIntroTekst(String introTekst) {
        this.introTekst = introTekst;
    }

    public ArrayList<Cursus> getAanbevelingen() {
        return this.aanbevelingen;
    }

    public void setAanbevelingen(ArrayList<Cursus> aanbevelingen) {
        this.aanbevelingen = aanbevelingen;
    }

    public Niveau getNiveau() {
        return this.niveau;
    }

    public void setNiveau(Niveau niveau) {
        this.niveau = niveau;
    }

    public static Cursus create(String naam, String onderwerp, String introTekst, ArrayList<Cursus> aanbevelingen, Niveau niveau,
        ArrayList<Cursist> cursisten) {

    Cursus newCursus = new Cursus(naam, onderwerp, introTekst, aanbevelingen, niveau, cursisten, selectedModules);

    return newCursus;

}

}
