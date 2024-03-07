package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        //Repeated Char using charArray->
        String text = "i love doing my job, it is like i never work a single day!";
        char[] textString = text.toCharArray();
        char letter = 'r';
        int found = 0;

        for (int i = 0; i < text.length(); i++) {
            if (textString[i] == letter) {
                found++;
            }
        }
        System.out.println("Char 'r' found: " + found + " times");

        System.out.println();
        //All repeated Char using hashMap->

        Map<Character,Integer> counter = new HashMap<>();
        for (char c : textString){
            if (counter.containsKey(c)){
                counter.put(c,counter.get(c)+1);
            } else{
                counter.put(c,1);
            }

        }
        for (Map.Entry<Character,Integer> entry: counter.entrySet()){
            System.out.println("Char: " + entry.getKey() + " repeated " + entry.getValue() + " times");
        }

    }
}