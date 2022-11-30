package org.example;

import java.util.HashMap;
import java.util.ResourceBundle;

public class I18NManager {

    private static I18NManager instance;

    private HashMap<String, ResourceBundle> data;
    public static I18NManager getInstance() {
        if(instance == null){
            instance = new I18NManager();
        }
        return instance;
    }

    private I18NManager() {
        data = new HashMap<String, ResourceBundle>();
    }


    public void clear() {
    }

    public String getText(String key, String lenguage) {
        ResourceBundle rb = data.get(lenguage);
        if(rb==null){
            rb= ResourceBundle.getBundle("I18N" + lenguage);
            data.put(lenguage, rb);
        }
        return rb.getString(key);
    }
}
