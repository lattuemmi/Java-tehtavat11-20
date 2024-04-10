package org.example;

// 11
//- Tee algoritmi, joka etsii `int[]` -tyyppisestä muuttujasta suurimman kolmen peräkkäisen muuttujan summan.
//- Esimerkki
//- `[9,8,32,-2,1]` arrayn vastaus on 49 (9,8,32)
//- `[2,5,1,3,2]` arrayn vastaus on 9 (5, 1, 3)

public class Tehtava11 {
    public static int etsiKolmePerakkaista(int[] luku){
        int maxSumma = Integer.MIN_VALUE;

        for (int i = 0; i <= luku.length - 3; i++){
            int summa = luku[i] + luku[i + 1] + luku[i + 2];
            if ( summa > maxSumma){
                maxSumma = summa;
            }
        }
        return maxSumma;
    }
}
