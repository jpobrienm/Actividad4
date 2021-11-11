package com.traductor;

interface MyDictionary {
    public void readDict(String file);
    public void editDict(String file, String key, String definition);
    public void addToDict(String file, String key, String definition);
    public void removeFromDict(String file, String key);
}
