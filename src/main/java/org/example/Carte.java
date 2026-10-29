package org.example;

public class Carte {
    private final int valeur;
    private final String enseigne;

    public Carte(int valeur, String enseigne) {
        this.valeur = valeur;
        this.enseigne = enseigne;
    }

    public int getValeur() {
        return valeur;
    }
    public String getEnseigne() {
        return enseigne;
    }
}
