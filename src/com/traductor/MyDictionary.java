package com.traductor;

interface MyDictionary {
    public void readDict();
    public void editDict(String key, String definition);
    public void addToDict(String key, String definition);
    public void removeFromDict(String key);
    public void saveDictionary();
}
