package org.example;

// 17

//- Tee algoritmi, joka kääntää merkkijonon toisinpäin.
//- Tehtävässä ei saa käyttää Javan sisäänrakennettuja mekanismeja kuten `StringBuilder`-objektin `reverse` metodia.
//- Metodi ottaa syötteenä `String`-tyyppisen muuttujan,
//  - muunna se `char[]` tyyppiseksi,
//  - käännä merkit
//  - ja lopuksi muunna `char[]` takaisin `String`-tyyppiseksi ja palauta se.

public class Tehtava17 {
    public static String kaannaMerkkijono(String s){
        char[] merkit = s.toCharArray();

        for (int i = 0; i < merkit.length / 2; i++){
            char temp = merkit[i];
            merkit[i] = merkit[merkit.length - i - 1];
            merkit[merkit.length - i - 1] = temp;
        }

        return new String(merkit);
    }
}
