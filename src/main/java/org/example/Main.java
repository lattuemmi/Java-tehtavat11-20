package org.example;

import java.util.Random;
import java.io.File;
public class Main {
    public static void main(String[] args) {

        Tehtavaerotin.tulostaErotin();

        //Tehtava11

        int[] suurinSumma = {9,8,32,-2,1};
        int[] suurinSumma2 = {2,5,1,3,2};

        int maxSumma = Tehtava11.etsiKolmePerakkaista(suurinSumma);
        int maxSumma2 = Tehtava11.etsiKolmePerakkaista(suurinSumma2);

        System.out.println("Suurin kolmen peräkkäisen luvun summa: " + maxSumma);
        System.out.println("Suurin kolmen peräkkäisen luvun summa: " + maxSumma2);

        Tehtavaerotin.tulostaErotin();

        //Tehtava12

        String[] etunimet = {"Emmi", "Laura", "Kikke", "Kati", "Janne", "Tobi"};
        String[] sukunimet = {"Korhonen", "Virtanen", "Mäkinen", "Nieminen", "Mäkelä", "Hämäläinen"};

        Tehtava12 generaattori = new Tehtava12(etunimet, sukunimet);

        for (int i = 0; i < 10; i++) { // Korjattu ehto i < 10
            String nimi = generaattori.generoiNimi();
            System.out.println(nimi);
        }

        Tehtavaerotin.tulostaErotin();

        //Tehtävä 13

        File hakemisto = new File("/polku/hakemistoon");
        long koko = Tehtava13.laskeHakemisto(hakemisto);
        System.out.println("Hakemiston koko: " + koko + " tavua.");

        Tehtavaerotin.tulostaErotin();

        //Tehtävä 14

        Tehtavaerotin.tulostaErotin();

        //Tehtävä15

        Tehtava15 soitin1 = Tehtava15.getInstance();

        soitin1.asetaKappale("High hopes - Panic At The Disco");


        Tehtava15 soitin2 = Tehtava15.getInstance();

        soitin1.soitaKappale();

        if ( soitin1 == soitin2 ){
            System.out.println("Olemassa on vain yksi instanssi.");
        } else {
            System.out.println("Virhe: Olemassa on useampi instanssi!");
        }

        Tehtavaerotin.tulostaErotin();

        //Tehtävä 16

        int[] joukko1 = {1, 2, 3, 5};
        int puuttuva1 = Tehtava16.etsiPuuttuvaLuku(joukko1);
        System.out.println("Puuttuva luku joukossa: " + puuttuva1);

        int[] joukko2 = {1, 2, 3, 4, 5, 6, 8, 9, 10, 11};
        int puuttuva2 = Tehtava16.etsiPuuttuvaLuku(joukko2);
        System.out.println("Puuttuva luku joukossa: " + puuttuva2);

        Tehtavaerotin.tulostaErotin();

        //Tehtävä17

        
    }
}