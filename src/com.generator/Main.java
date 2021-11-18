package com.generator;

public class Main {
    public static void main(String[] args) {
        passwordGenerator pass = new passwordGenerator(8, false, false);
        pass.generatePassword();
    }
}
