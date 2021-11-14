package com.traductor;

import java.io.FileNotFoundException;
import java.io.IOException;

public class TranslatorApp {
    public static void main(String[] args) throws IOException {
        TranslatorFunctionality functionality = new TranslatorFunctionality();
        functionality.run();
    }
}
