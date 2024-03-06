package org.Mateos;

public class Main {
    public static void main(String[] args) {


        // String inversion with loop
        String text = "algorithm practice";
        String textResult = "";

        for (int i = text.length()-1; i>=0; i--){
            textResult += text.charAt(i);
        }

        System.out.println("FOR LOOP->");
        System.out.println("original: " + text);
        System.out.println("reversed: " + textResult);

        //
        System.out.println();
        //

        //String inversion with StringBuilder
        String newText = "Hello, World!";

        StringBuilder stringBuilder = new StringBuilder(newText);

        String inversedString = stringBuilder.reverse().toString();

        System.out.println("STRING BUILDER->");
        System.out.println("original: " + newText);
        System.out.println("reversed: " + inversedString);

    }
}