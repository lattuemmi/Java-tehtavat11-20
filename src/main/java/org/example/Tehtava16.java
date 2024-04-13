package org.example;


// 16

//- Tee algoritmi, joka etsii kokonaislukujen joukosta puuttuvan luvun ja palauttaa sen.
//- Tehtävän rajoituksena on, että joukko alkaa aina luvusta 1 ja päättyy johonkin kokonaislukuun n.
//  - Tästä joukosta poistetaan satunnaisesti jokin luku.
//- Paluutyyppi on `int`
//- Esimerkiksi
//  - `{1, 2, 3, 5}` joukosta puuttuu 4
//  - `{1, 2, 3, 4, 5, 6, 8, 9, 10, 11}` joukosta puuttuu 7
public class Tehtava16 {
    public static int etsiPuuttuvaLuku(int [] joukko){
        int n = joukko.length + 1;

        int kaikkienLukujenSumma = n * (n + 1) / 2;

        int annetunJoukonSumma = 0;
        for (int luku : joukko) {
            annetunJoukonSumma += luku;
        }

        return kaikkienLukujenSumma - annetunJoukonSumma;
    }
}
