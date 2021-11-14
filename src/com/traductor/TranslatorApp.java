package com.traductor;

import java.io.FileNotFoundException;

public class TranslatorApp {
    public static void main(String[] args) throws FileNotFoundException {
        TranslatorFunctionality functionality = new TranslatorFunctionality();
        functionality.run();
    }
}
