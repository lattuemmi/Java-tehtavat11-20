package org.example;

import java.util.Random;
public class Main {
    public static void main(String[] args) {

        //Tehtava11

        int[] suurinSumma = {9,8,32,-2,1};
        int[] suurinSumma2 = {2,5,1,3,2};

        int maxSumma = Tehtava11.etsiKolmePerakkaista(suurinSumma);
        int maxSumma2 = Tehtava11.etsiKolmePerakkaista(suurinSumma2);

        System.out.println("Suurin kolmen peräkkäisen luvun summa: " + maxSumma);
        System.out.println("Suurin kolmen peräkkäisen luvun summa: " + maxSumma2);

        //Tehtävien tulostuksen erottelua varten
        System.out.println("");
        System.out.println("________");
        System.out.println("");

        //Tehtava12

        String[] etunimet = {"Emmi", "Laura", "Kikke", "Kati", "Janne", "Tobi"};
        String[] sukunimet = {"Korhonen", "Virtanen", "Mäkinen", "Nieminen", "Mäkelä", "Hämäläinen"};

        Tehtava12 generaattori = new Tehtava12(etunimet, sukunimet);

        for (int i = 0; i < 10; i++) { // Korjattu ehto i < 10
            String nimi = generaattori.generoiNimi();
            System.out.println(nimi);
        }

        //Tehtävien tulostuksen erottelua varten
        System.out.println("");
        System.out.println("________");
        System.out.println("");

        //Tehtävä 13
        
    }
}