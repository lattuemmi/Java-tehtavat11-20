package org.example;

// 15

//- Luo singleton-luokka, joka kuvaa musiikkisoitinta.
//- Lisäksi luokassa täytyy olla `String` tyyppinen muuttuja, johon voidaan tallentaa tiedoston nimi.
//- Metodeiksi tulee
//  - setTrack(), joka ottaa parametrina sisään String-tyyppisenä tiedostonimen ja tallentaa sen objektiin.
//  - playTrack(), joka tulostaa käyttäjälle tallennetun tiedoston nimen (esim. "Playing track ...")
//- Todista Mainissa, että luokka todella on singleton.

public class Tehtava15 {
    private static Tehtava15 instance;
    private String kappaleNimi;
    private Tehtava15(){};
    public static Tehtava15 getInstance(){
        if (instance == null) {
            instance = new Tehtava15();
        }
        return instance;
    }

    public void asetaKappale(String kappaleNimi){
        this.kappaleNimi = kappaleNimi;
    }

    public void soitaKappale(){
        System.out.println("Soitetaan kappale: " + kappaleNimi);
        System.out.println(" ");
    }
}
