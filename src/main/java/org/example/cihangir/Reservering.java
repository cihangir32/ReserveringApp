package org.example.cihangir;

public class Reservering {
    private int id;
    private String naamReserveerder;
    private int aantalPersonen;
    private int tafelNummer;
    private boolean gezondheidscheck;
    private boolean zelfdeHuishouden;


    public Reservering() {

    }

    // Constructor
    public Reservering(int id, String naamReserveerder, int aantalPersonen, int tafelNummer, boolean gezondheidscheck, boolean zelfdeHuishouden) {
        this.id = id;
        this.naamReserveerder = naamReserveerder;
        this.aantalPersonen = aantalPersonen;
        this.tafelNummer = tafelNummer;
        this.gezondheidscheck = gezondheidscheck;
        this.zelfdeHuishouden = zelfdeHuishouden;
    }



    // Getters en Setters

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }


    public String getNaamReserveerder() {
        return naamReserveerder;
    }
    public void setNaamReserveerder(String naamReserveerder) {
        this.naamReserveerder = naamReserveerder;
    }


    public int getAantalPersonen() {
        return aantalPersonen;
    }
    public void setAantalPersonen(int aantalPersonen) {
        this.aantalPersonen = aantalPersonen;
    }

    public int getTafelNummer() { return tafelNummer; }
    public void setTafelNummer(int tafelNummer) { this.tafelNummer = tafelNummer; }

    public boolean isGezondheidscheck() {
        return gezondheidscheck;
    }
    public void setGezondheidscheck(boolean gezondheidscheck) {
        this.gezondheidscheck = gezondheidscheck;
    }


    public boolean isZelfdeHuishouden() {
        return zelfdeHuishouden;
    }
    public void setZelfdeHuishouden(boolean zelfdeHuishouden) {
        this.zelfdeHuishouden = zelfdeHuishouden;
    }
}
