package com.traductor;

import java.io.FileNotFoundException;

public class TranslatorFunctionality {
    private String mode;
    private String query;
    private boolean isRunning;
    private final TranslatorMenu Menu = new TranslatorMenu();
    private Spanish_English dictionary = new Spanish_English();

    TranslatorFunctionality(){
        this.mode = "0";
        this.isRunning = true;
    }

    public void run() throws FileNotFoundException {
        while(this.isRunning){
            switch (this.mode){
                case "0":
                    dictionary.readDict();
                    this.mode = Menu.MainMenu();
                    break;
                case "1":
                    query = Menu.QueryMenu();
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                default:
                    System.out.println("saliendo del programa");
                    this.isRunning = false;
            }
        }
    }

}
