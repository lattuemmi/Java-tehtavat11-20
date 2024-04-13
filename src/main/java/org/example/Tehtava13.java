package org.example;

import java.io.File;
// 13

//- Tee algoritmi, joka laskee annetun hakemiston ja sen alihakemistojen tiedostojen koon.
//  - Hakemiston polkua ei tarvitse lukea käyttäjän syötteestä, kunhan se toimii syötteenä metodille.
//  - Syötteen tyyppi on `File` joka löytyy paketista `java.io.File`
//- Paluutyyppi on `long`

public class Tehtava13 {
    public static long laskeHakemisto(File hakemisto){
        long koko = 0;

        if (hakemisto.isDirectory()) {
            File[] tiedostot = hakemisto.listFiles();
            if (tiedostot != null){
                for (File tiedosto : tiedostot){
                    if(tiedosto.isFile()){
                        koko += tiedosto.length();
                    } else if ( tiedosto.isDirectory()) {
                        koko += laskeHakemisto(tiedosto);
                    }
                }
            }
        } else if (hakemisto.isFile()){
            koko += hakemisto.length();
        }

        return koko;
    }
}
