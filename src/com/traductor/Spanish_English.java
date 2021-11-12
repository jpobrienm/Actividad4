package com.traductor;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Spanish_English implements MyDictionary{

    private  String dictFile;
    private Map<String, List<String>> dictionary = new HashMap<String, List<String>>();

    Spanish_English(String file){
        this.dictFile = file;
    }

    @Override
    public void readDict() {

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
