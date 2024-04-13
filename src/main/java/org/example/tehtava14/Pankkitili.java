package org.example.tehtava14;

public class Pankkitili {
    private final String tilinumero;
    private final String omistaja;
    private double saldo;

    public Pankkitili(String tilinumero, String omistaja, double saldo ){
        this.tilinumero = tilinumero;
        this.omistaja = omistaja;
        this.saldo = saldo;
    }

    public String haeTilinumero(){
        return tilinumero;
    }


    public void Talleta(double maara){
        saldo += maara;
        System.out.println(maara + "€ tallennettu tilille " + tilinumero);
    }

    public void Nosta(double maara){
        if( maara > saldo) {
            System.out.println("Nosto ei mahdollista tililtä " + tilinumero);
        } else {
            saldo -= maara;
            System.out.println(maara + "€ nostettu tililtä " + tilinumero);
        }
    }

    public void tulostaSaldo(){
        System.out.println("Tilin saldo: " + saldo + " €");
    }

    protected void tulostaTilinTiedot(){
        System.out.println("Tilinumero: " + tilinumero);
        System.out.println("Omistaja: " + omistaja);
        System.out.println("Saldo: " + saldo + " €");
    }
}
