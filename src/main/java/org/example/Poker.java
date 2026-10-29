package org.example;

public class Poker {
    public int calculPoints(Carte[] main) {
        for (int i = 0; i < main.length; i++) {
            int compt = 0;

            for (int j = 0; j < main.length; j++) {
                if (main[i].getValeur() == main[j].getValeur()) {
                    compt++;
                }
            }

            if (compt == 5) {
                return 40;
            }
        }

        for (int i = 0; i < main.length; i++) {
            int compt = 0;

            for (int j = 0; j < main.length; j++) {
                if (main[i].getValeur() == main[j].getValeur()) {
                    compt++;
                }
            }

            if (compt == 3) {
                return 30;
            }
        }

        int max = 0;

        for (Carte carte : main) {
            if (carte.getValeur() > max) {
                max = carte.getValeur();
            }
        }

        return max;
        //return 11;

    }

}
