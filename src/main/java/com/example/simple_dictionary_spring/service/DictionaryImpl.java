package com.example.simple_dictionary_spring.service;

import java.util.HashMap;
import java.util.Map;

public class DictionaryImpl {
    private static Map<String,String> words;

    static {
        words = new HashMap<String,String>();
        words.put("Hello", "Xin chào");
        words.put("Hi", "Xin chào");
        words.put("I", "Tôi");
        words.put("You", "Bạn");
        words.put("he", "Anh ta");
    }

    public String findVietnameseWord(String EnglishWord) {
        String result = words.get(EnglishWord);
        return result;
    }

}
