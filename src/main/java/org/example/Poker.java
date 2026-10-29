package org.example;

public class Poker {
    public int calculPoints(Carte[] main) {
        int max = 0;

        for (Carte carte : main) {
            if (carte.getValeur() > max) {
                max = carte.getValeur();
            }
        }

        return max;
    }
}
