package org.example;

public class Main {
    public static void main(String[] args) throws Exception {
        String text1 = "Hello, World!";
        String text2 = "Heiio, Burld!";

        int distance = 0;

        if (text1.length() != text2.length()){
            throw new Exception("length differing!!"); //little check
        }


        for (int i = 0; i < text1.length(); i++) {
            if (text1.charAt(i) != text2.charAt(i)){
                distance++;
            }
        }
        System.out.println(distance);

    }
}