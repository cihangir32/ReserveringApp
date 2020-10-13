package org.example.cihangir;

public class Klant {
    private int id;
    private String naam;
    private String Telefoonnummer;

    // Constructor
    public Klant(int id, String naam, String telefoonnummer) {
        this.id = id;
        this.naam = naam;
        this.Telefoonnummer = telefoonnummer;
    }


    // Getters en Setters

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }


    public String getNaam() {
        return naam;
    }
    public void setNaam(String naam) {
        this.naam = naam;
    }


    public String getTelefoonnummer() {
        return Telefoonnummer;
    }
    public void setTelefoonnummer(String telefoonnummer) {
        Telefoonnummer = telefoonnummer;
    }

}
