package com.traductor;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Dictionary;

public class TranslatorFunctionality {
    private String mode;
    private String query;
    private boolean isRunning;
    private final TranslatorMenu Menu = new TranslatorMenu();
    private Spanish_English dictionary = new Spanish_English();

    TranslatorFunctionality() throws IOException {
        this.mode = "0";
        this.isRunning = true;
        dictionary.readDict();
    }

    public void run() throws IOException {
        while(this.isRunning){
            switch (this.mode){
                case "0":
                    this.mode = Menu.MainMenu();
                    break;
                case "1":
                    query = Menu.QueryMenu();
                    mode = dictionary.query(query);
                    break;
                case "2":
                    String [] pairToAdd = Menu.AddMenu();
                    mode = dictionary.addToDict(pairToAdd[0], pairToAdd[1]);
                    break;
                case "3":
                    query = Menu.RemoveMenu();
                    mode = dictionary.removeFromDict(query);
                    break;
                default:
                    System.out.println("saliendo del programa");
                    this.isRunning = false;
            }
        }
    }

}
