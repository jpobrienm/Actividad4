package com.traductor;

import java.io.FileNotFoundException;
import java.io.IOException;

interface MyDictionary {
    public void readDict() throws FileNotFoundException;
    public String addToDict(String key, String definition) throws IOException;
    public String removeFromDict(String key) throws IOException;
}
