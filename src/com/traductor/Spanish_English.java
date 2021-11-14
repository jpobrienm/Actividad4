package com.traductor;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Spanish_English implements MyDictionary{

    private final String file = "src/com/traductor/spanish-english";
    private HashMap<String, String> dictionary = new HashMap<String, String>();

    Spanish_English(){
    }

    @Override
    public void readDict() throws FileNotFoundException {
        File dictFile = new File(file);
        Scanner reader = new Scanner(dictFile);
        while(reader.hasNextLine()) {
            String[] line = reader.nextLine().split(",");
            dictionary.put(line[0], line[1]);
        }
    }

    @Override
    public void editDict(String key, String definition) {

    }

    @Override
    public void addToDict(String key, String definition) {

    }

    @Override
    public void removeFromDict(String key) {

    }

    @Override
    public void saveDictionary(){

    }

}
