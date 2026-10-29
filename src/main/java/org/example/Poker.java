package org.example;

public class Poker {
    public int calculPoints(Carte[] main) {
        for (int i = 0; i < main.length; i++) {
            int comptValor = 0;
            int comptEnseigne = 0;

            for (int j = 0; j < main.length; j++) {
                if (main[i].getValeur() == main[j].getValeur()) {
                    comptValor++;
                }
                if (main[i].getEnseigne() == main[j].getEnseigne()) {
                    comptEnseigne++;
                }
            }
            if (comptEnseigne == 5) {
                return 45;
            }

            if (comptValor == 5) {
                return 40;
            }

            if (comptValor == 3) {
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
