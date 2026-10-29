import org.example.Carte;
import org.example.Poker;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CombinationPokerTest {
    @Test
    void shouldReturnMaxValorBecause0Combination() {
        Poker poker = new Poker();

        Carte[] main = {
                new Carte(2, "Cœur"),
                new Carte(5, "Carreau"),
                new Carte(7, "Trèfle"),
                new Carte(9, "Pique"),
                new Carte(11, "Cœur")
        };

        assertEquals(11, poker.calculPoints(main));
    }

    @Test
    void shouldReturn30BecauseBrelanCombination() {
        Poker poker = new Poker();

        Carte[] main = {
                new Carte(5, "Cœur"),
                new Carte(5, "Carreau"),
                new Carte(5, "Trèfle"),
                new Carte(9, "Pique"),
                new Carte(11, "Cœur")
        };

        assertEquals(30, poker.calculPoints(main));
    }

    @Test
    void shouldReturn40BecauseSuiteCombination() {
        Poker poker = new Poker();

        Carte[] main = {
                new Carte(5, "Cœur"),
                new Carte(5, "Carreau"),
                new Carte(5, "Trèfle"),
                new Carte(5, "Pique"),
                new Carte(5, "Cœur")
        };

        assertEquals(40, poker.calculPoints(main));
    }

    @Test
    void shouldReturn45BecauseCouleurCombination() {
        Poker poker = new Poker();

        Carte[] main = {
                new Carte(5, "Trèfle"),
                new Carte(5, "Trèfle"),
                new Carte(5, "Trèfle"),
                new Carte(5, "Trèfle"),
                new Carte(4, "Trèfle")
        };

        assertEquals(45, poker.calculPoints(main));
    }

}
