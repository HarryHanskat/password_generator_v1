package com.generator;

/*
Class that is going to be responsible for generating passwords.
It will take in several parameters from the user like number of
*/

import javax.sound.midi.Soundbank;

public class passwordGenerator {
    private int numOfChars;
    private boolean symbols;
    private boolean nums;

    public passwordGenerator(int numOfChars, boolean symbols, boolean nums){
        this.numOfChars = numOfChars;
        this.symbols = symbols;
        this.nums = nums;
    }

    /*
    Steps to generate random password
    1. For loop that iterates for as many times as 'numOfChars' is long
    2. Depending on what is turned on, randomly select to use a symbol, number, or letter
    3.
     */
    public String generatePassword(){
        String password = "testPassword";
        for (int i = 0; i < numOfChars; i++){

        }
        System.out.println("generatePassword(): called " + password);
        return password;
    }

}
