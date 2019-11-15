package org.nocoder.game.guessnumber;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuessNumberTest {

    private GuessNumber gn;

    @Before
    public void before() {
        gn = new GuessNumber();
        gn.setNumber(49);
    }

    @Test
    public void whenGuessNumberEqualsTargetNumberThenYes() {
        assertEquals("Yes, the number is " + gn.getNumber(), gn.guess(49));
    }

    @Test
    public void whenGuessNumberHigherThanTargetNumberThenReturnTooHigh() {
        assertEquals("Your guess is too high", gn.guess(50));
    }

    @Test
    public void whenGuessNumberLowerThanTargetNumberThenReturnTooLow() {
        assertEquals("Your guess is too low", gn.guess(25));
    }

}
