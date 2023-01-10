package com.example.wrkspot.wrkspottask;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class UsingStreams {
    static String input="Can I block your calendar from 5:30 to 6pm today to "
            + "review/discuss on test case scenarios for HK dashboard cards ";
    public static void main(String[] args)
    {
        String[] arr=input.split("\\s");
        List<String> inputs= Arrays.asList(arr);
        Comparator<String> result=(s1, s2)->(s2.length() - s1.length());
        inputs.stream().sorted(result).forEach(System.out::println);
    }
}
