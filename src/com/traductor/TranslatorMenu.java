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
        System.out.println("Tecla 2: Añadir una palabra al diccionario");
        System.out.println("Tecla 3: Editar una palabra o su traducción del diccionario");
        System.out.println("Tecla 4: Remover una palabra del diccionario");
        System.out.print(answerMessage);
        return  scanner.nextLine();
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

    public String AddMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(separator);
        System.out.println("Introduzca la palabra en español cuya traduccion desea introducir");
        System.out.println("Para volver al menu principal, escriba 0");
        System.out.println(separator);
        System.out.print(answerMessage);
        return scanner.nextLine();
    }

    public String Editmenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(separator);
        System.out.println("¿Desea editar una palabra, o la traduccion de una palabra?");
        System.out.println("Tecla 1: Editar una palabra");
        System.out.println("Tecla 2: Editar la traducción de una palabra");
        System.out.println("Para volver al menu principal, escriba 0");
        System.out.println(separator);
        System.out.print(answerMessage);
        return scanner.nextLine();

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
