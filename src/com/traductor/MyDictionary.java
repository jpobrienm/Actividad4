package com.traductor;

import java.io.FileNotFoundException;

interface MyDictionary {
    public void readDict() throws FileNotFoundException;
    public void editDict(String key, String definition);
    public void addToDict(String key, String definition);
    public void removeFromDict(String key);
    public void saveDictionary();
}
