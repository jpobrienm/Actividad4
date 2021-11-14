package com.traductor;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Spanish_English implements MyDictionary{

    private String path = "src/com/traductor/spanish-english";
    private File file = new File(path);
    private HashMap<String, String> dictionary = new HashMap<String, String>();

    Spanish_English() throws IOException {
    }

    @Override
    public void readDict() throws FileNotFoundException {
        Scanner reader = new Scanner(file);
        while(reader.hasNextLine()) {
            String[] line = reader.nextLine().split(",");
            dictionary.put(line[0], line[1]);
        }
    }

    @Override
    public String addToDict(String key, String definition) throws IOException {
        BufferedReader fileReader = new BufferedReader(new FileReader(path));
        String line;
        String input = "";

        if (key.equals("0") || definition.equals("0")){
            return "0";
        }

        while ((line = fileReader.readLine()) != null){
            if (line.equals(key.toLowerCase(Locale.ROOT) + "," + dictionary.get(key.toLowerCase(Locale.ROOT)))){
                continue;
            }
            input += line + '\n';
        }
        dictionary.put(key, definition);
        input += key + "," + definition + '\n';
        FileOutputStream outputFile = new FileOutputStream(path);
        outputFile.write(input.getBytes(StandardCharsets.UTF_8));
        return "2";

    }

    @Override
    public String removeFromDict(String key) throws IOException {
        BufferedReader fileReader = new BufferedReader(new FileReader(path));
        String line;
        String input = "";

        if (key.equals("0")){
            return "0";
        }

        while ((line = fileReader.readLine()) != null){
            if (line.equals(key.toLowerCase(Locale.ROOT) + "," + dictionary.get(key.toLowerCase(Locale.ROOT)))){
                continue;
            }
            input += line + '\n';
        }
        FileOutputStream outputFile = new FileOutputStream(path);
        outputFile.write(input.getBytes(StandardCharsets.UTF_8));
        return "3";
    }

    public String query(String key){
        if (key.equals("0")){
            return "0";
        }
        else if (dictionary.get(key) == null){
            System.out.println("La palabra no posee traduccion en este diccionario");
            return "1";
        }
        System.out.println("En inglés, esta palabra se escribe " + dictionary.get(key));
        return "1";
    }

}
