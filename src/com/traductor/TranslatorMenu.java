package com.traductor;

import javax.xml.transform.Source;
import java.util.Scanner;

public class TranslatorMenu {
    private final String separator = "--------------------------------------------------------------------------------";
    private final String answerMessage = "Respuesta: ";
    TranslatorMenu(){
    }
    public String MainMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(separator);
        System.out.println("Bienvenido al traductor español-inglés, seleccione la opción que desea");
        System.out.println(separator);
        System.out.println("Tecla 1: realizar una consulta");
        System.out.println("Tecla 2: Añadir/Editar una palabra al diccionario");
        System.out.println("Tecla 3: Remover una palabra del diccionario");
        System.out.println("Para salir del programa, presione cualquier otra tecla");
        System.out.print(answerMessage);
        String answer = scanner.nextLine();
        if(answer.equals("0")){answer = "a";
        }
        return  answer;
    }

    public String QueryMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(separator);
        System.out.println("Introduzca la palabra cuya traduccion desea conocer");
        System.out.println("Para volver al menu principal, escriba 0");
        System.out.println(separator);
        System.out.print(answerMessage);
        return scanner.nextLine();
    }

    public String [] AddMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(separator);
        System.out.println("Para volver al menu principal, ingrese 0 en alguna de las siguientes entradas");
        System.out.println("Ingrese la palabra en español que desea añadir o editar al diccionario");
        System.out.println(separator);
        System.out.print("Respuesta: ");
        String spanish_word = scanner.nextLine();
        System.out.println("Ingrese su traducción al inglés");
        System.out.println(separator);
        System.out.print("Respuesta: ");
        String english_word = scanner.nextLine();
        return new String[]{spanish_word, english_word};
    }

    public String RemoveMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(separator);
        System.out.println("Introduzca la palabra que desea retirar del diccionario");
        System.out.println("Para volver al menu principal, escriba 0");
        System.out.println(separator);
        System.out.print(answerMessage);
        return scanner.nextLine();
    }
}
