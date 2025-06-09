package org.example;

public class Lemonade {
    // Static field examples
    public static int defaultSugar = 2;
    public static int defaultIce = 3;
    public static int defaultLemons = 4;

    private int lemons;
    private int sugar;
    private int ice;

    public Lemonade() {
        this.lemons = defaultLemons;
        this.sugar = defaultSugar;
        this.ice = defaultIce;
    }

    public Lemonade(int lemons, int sugar, int ice) {
        this.lemons = lemons;
        this.sugar = sugar;
        this.ice = ice;
    }

    public int getLemons() {
        return lemons;
    }

    public void setLemons(int lemons) {
        this.lemons = lemons;
    }

    public int getSugar() {
        return sugar;
    }

    public void setSugar(int sugar) {
        this.sugar = sugar;
    }

    public int getIce() {
        return ice;
    }

    public void setIce(int ice) {
        this.ice = ice;
    }

    // Create a method called mix that takes two Lemonade objects and returns a new Lemonade object with
    // the sum of the lemons, sugar, and ice from the two Lemonade objects.

    public static Lemonade mix(Lemonade lemonade1, Lemonade lemonade2) {
        int newLemonadeLemons = lemonade1.getLemons() + lemonade2.getLemons();
        int newLemonadeSugar = lemonade1.getSugar() + lemonade2.getSugar();
        int newLemonadeIce = lemonade1.getIce() + lemonade2.getIce();
        return new Lemonade(newLemonadeLemons, newLemonadeSugar, newLemonadeIce);
    }
}
