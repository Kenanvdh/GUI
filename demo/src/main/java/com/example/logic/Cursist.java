package com.example.logic;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import com.example.logic.Enumarations.Geslacht;

public class Cursist {
    private String emailAdres;
    private String naam;
    private Date geboorteDatum;
    private String adres;
    private String postcode;
    private String woonplaats;
    private String land;
    private int studentNummer;
    private Geslacht geslacht;
    private ArrayList<Cursus> cursussen;
    private String webcastNaam;
    private double webcastVooruitgang;

    public Cursist(String emailAdres, String naam, String dag, String maand, String jaar, String adres, String postcode, String woonplaats, String land,
            int studentNummer, Geslacht geslacht, ArrayList<Cursus> cursussen) {
        if (!emailAdres.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
            throw new IllegalArgumentException("Ongeldig email adres");
        } else {this.emailAdres = emailAdres; }
        this.naam = naam;
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            try {
                Date geboortDatum = (Date) dateFormat.parse(dag + "-" + maand + "-" + jaar);
            } catch (ParseException e) {
                throw new IllegalArgumentException("Ongeldige datum ingevoerd");
            }
        this.naam = naam;
        this.adres = adres;
        if (!postcode.matches("^[1-9][0-9]{3} [A-Z]{2}$")) {
            throw new IllegalArgumentException("Ongeldige postcode ingevoerd");
            } else {
            this.postcode = postcode;
            }
        this.woonplaats = woonplaats;
        this.land = land;
        this.studentNummer = studentNummer;
        this.geslacht = geslacht;
        this.cursussen =  new ArrayList<>();
    }

    public double Voortgang(double percentage) {
        return 0;
    }

    public String getEmailAdres() {
        return this.emailAdres;
    }

    public void setEmailAdres(String emailAdres) {
        this.emailAdres = emailAdres;
    }

    public String getNaam() {
        return this.naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public Date getGeboorteDatum() {
        return this.geboorteDatum;
    }

    public void setGeboorteDatum(Date geboorteDatum) {
        this.geboorteDatum = geboorteDatum;
    }

    public String getAdres() {
        return this.adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getWoonplaats() {
        return this.woonplaats;
    }

    public void setWoonplaats(String woonplaats) {
        this.woonplaats = woonplaats;
    }

    public String getLand() {
        return this.land;
    }

    public void setLand(String land) {
        this.land = land;
    }

    public int getStudentNummer() {
        return this.studentNummer;
    }

    public void setStudentNummer(int studentNummer) {
        this.studentNummer = studentNummer;
    }

    public Geslacht getGeslacht() {
        return this.geslacht;
    }

    public void setGeslacht(Geslacht geslacht) {
        this.geslacht = geslacht;
    }

    public static Cursist create(String emailAdres, String naam, Date geboorteDatum, String adres, String woonplaats, String land,
        int studentNummer, Geslacht geslacht, ArrayList<Cursus> cursussen) {

    Cursist newCursist = new Cursist(emailAdres, naam, geboorteDatum, adres, woonplaats, land, studentNummer, geslacht, cursussen);

    return newCursist;
    }

    public double WebcastVoortgang(int studentNummer, String webcastNaam, double webcastVooruitgang){
        this.studentNummer = studentNummer;
        return webcastVooruitgang;
    }
}

