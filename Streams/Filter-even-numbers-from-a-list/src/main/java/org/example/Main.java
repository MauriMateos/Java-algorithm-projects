package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        //Filter even numbers from a list

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);


        List<Integer> evenNums = numbers.stream()
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(evenNums);


    }
}