package com.traductor;

public class TranslatorFunctionality {
    private int mode;
    private boolean isRunning;
    private TranslatorMenu Menu = new TranslatorMenu();

    TranslatorFunctionality(){
        this.mode = 0;
        this.isRunning = true;
    }

    public void run(){
        while(this.isRunning){
            switch (this.mode){
                case 0:
                    this.mode = Menu.MainMenu();
                    break;
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
            }
        }
    }

}
