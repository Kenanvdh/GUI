package com.example.logic;

public class Vooruitgang {
    private int studentNummer;
    private int webcastVooruitgang;
    private int moduleVooruitgang;
    private String webcastNaam;
    private String moduleNaam;

    public Vooruitgang(int studentNummer, int webcastVooruitgang, String webcastNaam, int moduleVooruitgang, String moduleNaam) {
        this.studentNummer = studentNummer;
        this.webcastVooruitgang = webcastVooruitgang;
        this.webcastNaam = webcastNaam;
        this.moduleVooruitgang = moduleVooruitgang;
        this.moduleNaam = moduleNaam;
    }

    public String getWebcastNaam() {
        return webcastNaam;
    }

    public int getWebcastVooruitgang() {
        return webcastVooruitgang;
    }

    public void setWebcastVooruitgang(int webcastVooruitgang) {
        if (webcastVooruitgang < 0 || webcastVooruitgang > 100) {
            throw new IllegalArgumentException("Progress percentage must be between 0 and 100 (inclusive)");
        }
        this.webcastVooruitgang = webcastVooruitgang;
    }

    public String getModuleNaam() {
        return moduleNaam;
    }

    public int getModuleVooruitgang() {
        return moduleVooruitgang;
    }

    public void setModuleVooruitgang(int moduleVooruitgang) {
        if (moduleVooruitgang < 0 || moduleVooruitgang > 100) {
            throw new IllegalArgumentException("Progress percentage must be between 0 and 100 (inclusive)");
        }
        this.moduleVooruitgang = moduleVooruitgang;
    }
}
