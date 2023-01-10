package com.example.wrkspot.wrkspottask;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UsingCollections {
    static String inputText="Can I block your calendar from 5:30 to 6pm today to "+
            "review/discuss on test case scenarios for HK dashboard cards ";
    public static void main(String[] args)
    {
        String[] arr=inputText.split("\u0020");
        List<String> words = Arrays.asList(arr);
        Collections.sort(words, Comparator.comparingInt(String::length).reversed());
        for(String word:words)
        {
            System.out.print(word+" ");
        }
    }
}
