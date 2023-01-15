package com.example.logic;

import java.sql.Date;

import com.example.logic.Enumarations.Status;

public class Webcast extends ContentItem{
    private double duur;
    private String URL;
    private String sprekerNaam;
    private String sprekerOrganisatie;

    public Webcast(String titel, String beschrijving, Date pubDatum, Status status, double duur, String URL, String sprekerNaam, String sprekerOrganisatie) {
        super(titel, beschrijving, pubDatum, status);
        this.duur = duur;
        this.URL = URL;
        this.sprekerNaam = sprekerNaam;
        this.sprekerOrganisatie = sprekerOrganisatie;
    }

    public double getDuur() {
        return this.duur;
    }

    public void setDuur(double duur) {
        this.duur = duur;
    }

    public String getURL() {
        return this.URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public String getSprekerNaam() {
        return this.sprekerNaam;
    }

    public void setSprekerNaam(String sprekerNaam) {
        this.sprekerNaam = sprekerNaam;
    }

    public String getSprekerOrganisatie() {
        return this.sprekerOrganisatie;
    }

    public void setSprekerOrganisatie(String sprekerOrganisatie) {
        this.sprekerOrganisatie = sprekerOrganisatie;
    }

}
