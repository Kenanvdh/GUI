package com.example.logic;

import java.sql.Date;

public class Inschrijvingen {
    private Date datum;
    private Cursist cursist;

    public Inschrijvingen(Date datum, Cursist cursist) {
        this.datum = datum;
        this.cursist = cursist;
    }

    public Date getDatum() {
        return this.datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public Cursist getCursist() {
        return this.cursist;
    }

    public void setCursist(Cursist cursist) {
        this.cursist = cursist;
    }
    
    public static Inschrijvingen create(Date datum, Cursist cursist) {

        Inschrijvingen newInschrijving = new Inschrijvingen(datum, cursist);
    
        return newInschrijving;
    }
    
}
