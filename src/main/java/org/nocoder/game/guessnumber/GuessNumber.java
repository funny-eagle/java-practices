package org.nocoder.game.guessnumber;

public class GuessNumber {
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }


    public String guess(int guessNumber) {

        if (guessNumber > this.number) {
            return "Your guess is too high";
        }

        if (guessNumber < this.number) {
            return "Your guess is too low";
        }

        return "Yes, the number is " + this.getNumber();
    }
}
