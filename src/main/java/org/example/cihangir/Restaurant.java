package org.example.cihangir;

import java.util.ArrayList;

public class Restaurant {
    private String naam;
    private ArrayList reserveringsTijden;
    final private int maxiumumAantalPersonen = 30;



    // Constructor
    public Restaurant(String naam, ArrayList reserveringsTijden, int maxiumumAantalPersonen) {
        this.naam = naam;
        this.reserveringsTijden = reserveringsTijden;
    }



    // Getters en Setters

    public String getNaam() {
        return naam;
    }
    public void setNaam(String naam) {
        this.naam = naam;
    }


    public ArrayList getReserveringsTijden() {
        return reserveringsTijden;
    }
    public void setReserveringsTijden(ArrayList reserveringsTijden) {
        this.reserveringsTijden = reserveringsTijden;
    }


    public int getMaxiumumAantalPersonen() {
        return maxiumumAantalPersonen;
    }

    //    LocalTime localtime
//            = LocalTime.of(6, 5, 40);
    }
