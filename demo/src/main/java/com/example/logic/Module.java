package com.example.logic;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.swing.text.DateFormatter;

import com.example.logic.Enumarations.Status;

public class Module extends ContentItem {
    private String versie;
    private String naamContact;
    private String emailAdres;
    private int volgNummer;

    public Module(String titel, String beschrijving, String dag, String maand, String jaar, Status status, String versie, String naamContact,
            String emailAdres, int volgNummer) {
        super(titel, beschrijving, date, status);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            try {
                Date date = (Date) dateFormat.parse(dag + "-" + maand + "-" + jaar);
                super.setDate(date);
            } catch (ParseException e) {
                throw new IllegalArgumentException("Ongeldige datum ingevoerd");
            }
        if (!emailAdres.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
            throw new IllegalArgumentException("Ongeldig email adres");
        } else {this.emailAdres = emailAdres; }
        this.versie = versie;
        this.naamContact = naamContact;
        this.volgNummer = volgNummer;
    }

    public static class ModuleArrays {

        private ArrayList<Module> modules;
        private ArrayList<Module> selectedModules;
        private ArrayList<Module> unselectedModules;

        public ArrayList<Module> getModules() {
            return modules;
        }

        public ArrayList<Module> getUnselectedModules() {
            return unselectedModules;
        }

        public ArrayList<Module> getSelectedModules() {
            return selectedModules;
        }

        public ModuleArrays() {
            modules = new ArrayList<>();
            selectedModules = new ArrayList<>();
            unselectedModules = new ArrayList<>();
            unselectedModules
                    .add(new Module("Module", "Test1", "13-01-2023", Status.Concept, "1.1", "Naam1", "a@z.a", 1));
            unselectedModules
                    .add(new Module("Module", "Test2", "13-01-2023", Status.Archief, "1.2", "Naam2", "a@a.a", 2));
            unselectedModules
                    .add(new Module("Module", "Test3", "13-01-2023", Status.Archief, "1.3", "Naam3", "a@a.a", 3));
            unselectedModules
                    .add(new Module("Module", "Test4", "13-01-2023", Status.Archief, "1.4", "Naam4", "a@a.a", 4));
            unselectedModules
                    .add(new Module("Module", "Test5", "13-01-2023", Status.Archief, "1.5", "Naam5", "a@a.a", 5));
            unselectedModules
                    .add(new Module("Module", "Test6", "13-01-2023", Status.Archief, "1.6", "Naam6", "a@a.a", 6));
            unselectedModules
                    .add(new Module("Module", "Test7", "13-01-2023", Status.Archief, "1.7", "Naam7", "a@a.a", 7));
        }

        public void addModuleToCourse(Module module) {
            unselectedModules.remove(module);
            selectedModules.add(module);
            modules.add(module);
        }
    }

    public String getVersie() {
        return this.versie;
    }

    public void setVersie(String versie) {
        this.versie = versie;
    }

    public String getNaamContact() {
        return this.naamContact;
    }

    public void setNaamContact(String naamContact) {
        this.naamContact = naamContact;
    }

    public String getEmailAdres() {
        return this.emailAdres;
    }

    public void setEmailAdres(String emailAdres) {
        this.emailAdres = emailAdres;
    }

    public int getVolgNummer() {
        return this.volgNummer;
    }

    public void setVolgNummer(int volgNummer) {
        this.volgNummer = volgNummer;
    }

    @Override
    public String toString() {
        return "Module " + volgNummer + ": " + getTitel();
    }

}
