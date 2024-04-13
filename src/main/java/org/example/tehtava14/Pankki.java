package org.example.tehtava14;

import java.util.HashMap;
import java.util.Map;
public class Pankki {
    private final Map<String, Pankkitili> pankkitilit;

    public Pankki() {
        this.pankkitilit = new HashMap<>();
    }

    public void lisaaTili(Pankkitili tili) {
        pankkitilit.put(tili.haeTilinumero(), tili);
        System.out.println("Pankkitili lisätty: " + tili.haeTilinumero());
    }

    public void poistaTili(String tilinumero) {
        pankkitilit.remove(tilinumero);
        System.out.println("Pankkitili poistettu: " + tilinumero);
    }

    public void tulostaTilinTiedot(String tilinumero) {
        if (pankkitilit.containsKey(tilinumero)) {
            Pankkitili tili = pankkitilit.get(tilinumero);
            tili.tulostaTilinTiedot();
        } else {
            System.out.println("Tiliä " + tilinumero + " ei löydy");
        }
    }
}
