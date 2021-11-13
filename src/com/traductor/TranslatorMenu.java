package com.traductor;

import javax.xml.transform.Source;
import java.util.Scanner;

public class TranslatorMenu {
    private final String separator = "--------------------------------------------------------------------------------";
    private final String answerMessage = "Respuesta: ";
    TranslatorMenu(){
    }
    public int MainMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(separator);
        System.out.println("Bienvenido al traductor español-inglés, seleccione la opción que desea");
        System.out.println(separator);
        System.out.println("1) realizar una consulta");
        System.out.println("2) Añadir una palabra al diccionario");
        System.out.println("3) Remover una palabra del diccionario");
        System.out.print(answerMessage);
        int answer = scanner.nextInt();
        return  answer;
    }

    public int QueryMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(separator);
        System.out.println("Introduzca la palabra cuya traduccion desea conocer");
        System.out.println(separator);
        System.out.print(answerMessage);
        int answer = scanner.nextInt();
        return answer;
    }

    public void AddMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(separator);
        System.out.println("Introduzca la palabra en español cuya traduccion desea introducir");
        System.out.println(separator);
        System.out.print(answerMessage);
        String answer = scanner.nextLine();
    }

    public void RemoveMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(separator);
        System.out.println("Introduzca la palabra que desea retirar del diccionario");
        System.out.println(separator);
        System.out.print(answerMessage);
        String answer = scanner.nextLine();
    }
}
