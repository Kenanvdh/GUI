package com.example.logic;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.example.logic.Enumarations.Status;

 public class ContentItem {
    protected static String titel;
    protected static String beschrijving;
    protected static String pubDatum;
    protected static Status status;
    protected static Date date;

    public ContentItem(String titel, String beschrijving, Date date, Status status) {
        this.titel = titel;
        this.beschrijving = beschrijving;
        this.date = date;
        this.status = status;
    }

    public String getTitel() {
        return this.titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getBeschrijving() {
        return this.beschrijving;
    }

    public void setBeschrijving(String beschrijving) {
        this.beschrijving = beschrijving;
    }

    public String getPubDatum() {
        return this.pubDatum;
    }

    public void setPubDatum(String pubDatum) {
        this.pubDatum = pubDatum;
        DateFormat formatter = new SimpleDateFormat("E MMM dd HH:mm:ss Z yyyy");
        DateFormat moduleDatum = new SimpleDateFormat("dd-MM-yyyy");
        try {
            moduleDatum.format(formatter.parse(
                    pubDatum.toString()));
        } catch (ParseException e) {
            System.out.println("Het format moet als het volgende worden ingevoerd: dd-mm-yyyy");
        }
    }

    public Status getStatus() {
        return this.status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}
