package com.janih.junitmultitest;

/**
 * A class that keeps an integer instance variable that can be added to.
 */
public class Luokka {
    private int value;

    /**
     * Constructor.
     * @param value initial value for the instance variable
     */
    public Luokka(int value) {
        this.value = value;
    }

    /**
     * Adds the supplied value to the instance variable
     * @param in value to be added (the decimal part is discarded)
     * @return the value of the instance variable after addition
     */
    public int metodi(float in) {
        value += in;
        return value;
    }
}
