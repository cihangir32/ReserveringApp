package org.example.cihangir;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String naamReserveerder;
        String hoeveelheidPersonen;

        // Vraagt je naam op
        System.out.println("Wat is je naam?");
        naamReserveerder = scanner.nextLine();

        // Vraagt hoeveelheid personen
        System.out.println("Voor hoeveel personen wil je reserveren?");
        hoeveelheidPersonen = scanner.nextLine();

        // Zet de hoeveelheidPersonen om in een Integer
        int hoeveelheidPersonenInt=Integer.parseInt(hoeveelheidPersonen);


        // If else statement om te checken of iedereen uit de zelfde huishouden komt
        if (hoeveelheidPersonenInt > 4) {

            String zelfdeHuishouden;
            System.out.println("Je geeft aan dat je wilt reserveren voor meer dan 4 personen. " +
                            "Dit is alleen mogelijk als iedereen uit hetzelfde huishouden komt. Is dit het geval? Typ Ja of Nee."
                    );
            zelfdeHuishouden = scanner.nextLine();



            // Als er meer dan 4 mensen zijn en niet iedereen uit hetzelfde huishouden komt, kan het proces niet verder gaan
            if (zelfdeHuishouden.equals("Ja")) {
                ReserverenDatumEnTijd();


            } else if(zelfdeHuishouden.equals("Nee")) {
                System.out.println("Vanwege de Coronamaatregelen is het dan niet mogelijk om te reserveren in uw situatie, we zien u graag een andere keer!"
                );
            }



        // Als er gelijk of minder dan 4 personen reserveren
        } else {
            ReserverenDatumEnTijd();

        }
















        // Klant klant = new Klant(1, "C", "0612345678");
        //  System.out.println("Username is: " + klant.getNaam());
    }



    static void ReserverenDatumEnTijd() {
        System.out.println("Op welke dag zou je willen reserveren?");



    }
}
