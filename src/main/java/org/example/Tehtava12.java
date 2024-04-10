package org.example;

import java.util.Random;

// 12

//- Tee luokka, jolla voit luoda satunnaisia nimiä.
//- Luokassa on valitsemasi määrä ennalta asetettuja etu- ja sukunimiä ja metodi, joka palauttaa Stringin muotoa `etunimi + " " sukunimi`
//- Satunnaislukugeneraattori löytyy paketista `java.util.Random`
public class Tehtava12 {
    private String[] etunimet;
    private String[] sukunimet;
    private Random random;

    // Konstruktorin nimi tulee olla saman niminen kuin luokka
    public Tehtava12(String[] etunimet, String[] sukunimet){
        this.etunimet = etunimet;
        this.sukunimet = sukunimet;
        this.random = new Random();
    }

    public String generoiNimi(){
        String etunimi = etunimet[random.nextInt(etunimet.length)];
        String sukunimi = sukunimet[random.nextInt(sukunimet.length)];
        return etunimi + " " + sukunimi;
    }
}
